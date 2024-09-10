package vn.edu.usth.usthweather;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;


public class ForecastFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public ForecastFragment() {
        // Required empty public constructor
    }

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
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Create the root LinearLayout
//        LinearLayout linearLayout = new LinearLayout(getContext());
//        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(
//                LinearLayout.LayoutParams.MATCH_PARENT,
//                LinearLayout.LayoutParams.MATCH_PARENT));
//        linearLayout.setOrientation(LinearLayout.VERTICAL);
//        linearLayout.setBackgroundColor(Color.parseColor("#20FF0000"));
//        linearLayout.setGravity(Gravity.CENTER);
//
//        // Create a TextView for the day (e.g., Thursday)
//        TextView dayTextView = new TextView(getContext());
//        dayTextView.setText("Thursday");
//        dayTextView.setTextSize(24);
//        dayTextView.setGravity(Gravity.CENTER);
//        dayTextView.setPadding(16, 16, 16, 16);
//
//        // Create an ImageView for the weather icon
//        ImageView weatherIcon = new ImageView(getContext());
//        weatherIcon.setImageResource(R.drawable.cloudset); // Ensure this resource exists
//        weatherIcon.setPadding(16, 16, 16, 16);
//
//        // Add the TextView and ImageView to the LinearLayout
//        linearLayout.addView(dayTextView);
//        linearLayout.addView(weatherIcon);
//
//        // Return the LinearLayout as the root view
//        return linearLayout;
        return inflater.inflate(R.layout.fragment_forecast, container, false);
    }
}
