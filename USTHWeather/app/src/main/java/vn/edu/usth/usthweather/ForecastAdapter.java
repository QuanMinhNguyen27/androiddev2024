package vn.edu.usth.usthweather;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ForecastAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private final Context context;
    private final List<ForecastItem> items;

    public ForecastAdapter(Context context, List<ForecastItem> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        return new MyViewHolder(inflater.inflate(R.layout.forecast_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ForecastItem item = items.get(position);
        holder.day.setText(item.getDay());
        holder.weather_icon.setImageResource(item.getWeather_icon());
        holder.weather.setText(item.getWeather());
        holder.temperature.setText(item.getTemperature());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
