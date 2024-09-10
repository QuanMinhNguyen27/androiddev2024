package vn.edu.usth.usthweather;


import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class WeatherAndForecastFragment extends Fragment {

    private String city_name;
    private int weather_icon;

    public WeatherAndForecastFragment() {
    }

    public static WeatherAndForecastFragment newInstance(String city, int weather_icon) {
        WeatherAndForecastFragment fragment = new WeatherAndForecastFragment();
        Bundle args = new Bundle();
        args.putString("city", city);
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_weather_and_forecast, container, false);
        FragmentManager fragmentManager = getChildFragmentManager();

        WeatherFragment weatherFragment = new WeatherFragment();

        Bundle bundle = new Bundle();
        bundle.putString("city", city_name);
        bundle.putInt("weather_icon", weather_icon);
        weatherFragment.setArguments(bundle);

        fragmentManager.beginTransaction()
                .replace(R.id.fragment_weather, weatherFragment)
                .commit();
        return view;
    }
}