package vn.edu.usth.usthweather;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ForecastFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Forecast_Fragment2 extends Fragment {
    private RecyclerView recyclerView;
    private ForecastAdapter adapter;
    private List<ForecastItem> forecastItemList;

    // Arguments for fragment initialization parameters
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String param1;
    private String param2;

    public Forecast_Fragment2() {
        // Required empty public constructor
    }

    /**
     * Factory method to create a new instance of this fragment.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ForecastFragment.
     */
    public static ForecastFragment newInstance(String param1, String param2) {
        ForecastFragment fragment = new ForecastFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            param1 = getArguments().getString(ARG_PARAM1);
            param2 = getArguments().getString(ARG_PARAM2);
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_forecast2, container, false);
        recyclerView = view.findViewById(R.id.recycler_view);

        // Set up the RecyclerView with a LinearLayoutManager
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Initialize the forecast data
        initializeForecastData();

        // Set up the adapter
        adapter = new ForecastAdapter(getContext(), forecastItemList);
        recyclerView.setAdapter(adapter);

        return view;
    }

    // Method to initialize the forecast items
    private void initializeForecastData() {
        forecastItemList = new ArrayList<>();
        forecastItemList.add(new ForecastItem(R.string.monday, R.drawable.cloudy, R.string.cloud_temp, R.string.cloudy));
        forecastItemList.add(new ForecastItem(R.string.tuesday, R.drawable.snowflake, R.string.snowy_temp, R.string.snowy));
        forecastItemList.add(new ForecastItem(R.string.wednesday, R.drawable.sunny, R.string.sunny_temp, R.string.sunny));
        forecastItemList.add(new ForecastItem(R.string.thursday, R.drawable.rainy, R.string.rain_temp, R.string.rainy));
        forecastItemList.add(new ForecastItem(R.string.friday, R.drawable.thunder, R.string.thunder_temp, R.string.thunder));
        forecastItemList.add(new ForecastItem(R.string.saturday, R.drawable.typhoon, R.string.typhoon_temp, R.string.typhoon));
        forecastItemList.add(new ForecastItem(R.string.sunday, R.drawable.sun, R.string.sunny_temp, R.string.sunny));
    }
}
