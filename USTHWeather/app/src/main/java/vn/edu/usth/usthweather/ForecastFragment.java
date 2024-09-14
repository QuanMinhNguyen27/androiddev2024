package vn.edu.usth.usthweather;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class ForecastFragment extends Fragment {


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    private String mParam1;
    private String mParam2;

    public ForecastFragment() {
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

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
//        View view = new View(getContext());
//        view.setBackgroundColor(Color.parseColor("#20FF0000"));
//
//        LinearLayout layout = new LinearLayout(getContext());
//        layout.setOrientation(LinearLayout.VERTICAL);
//
//        ImageView imageview = new ImageView(getContext());
//        TextView textview = new TextView(getContext());
//
//        textview.setText("Thursday");
//        textview.setTextColor(Color.BLACK);
//
//        imageview.setImageResource(R.drawable.image_set);
////        imageview.setImageResource(R.drawable.sun);
////        imageview.setImageResource(R.drawable.snowflake);
////        imageview.setImageResource(R.drawable.cloudy);
//
//        layout.addView(textview);
//        layout.addView(imageview);
//        return layout;
        return inflater.inflate(R.layout.fragment_forecast, container, false);
    }
}