package vn.edu.usth.usthweather;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Objects;


public class WeatherFragment extends Fragment {
    private String city_name;
    private int weather_icon;

    public WeatherFragment() {
        // Required empty public constructor
    }


    public static WeatherFragment newInstance(String cityName, int weather_icon) {
        WeatherFragment fragment = new WeatherFragment();
        Bundle args = new Bundle();
        args.putString("city", cityName);
        args.putInt("weather_icon", weather_icon);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            city_name = getArguments().getString("city");
            weather_icon = getArguments().getInt("weather_icon");
        }
    }

    @SuppressLint({"MissingInflatedId", "LocalSuppress", "DiscouragedApi"})
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_weather, container, false);

        TextView cityTextView = view.findViewById(R.id.city_name);
        ImageView weatherImageView = view.findViewById(R.id.weather_icon);

        cityTextView.setText(city_name);
        weatherImageView.setImageResource(weather_icon);

        return view;

    }
}
