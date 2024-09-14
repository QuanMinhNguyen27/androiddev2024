package vn.edu.usth.usthweather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.Objects;

public class HomeFragmentPagerAdapter extends FragmentStateAdapter {
    private final int PAGE_COUNT = 3;
    private String titles[] = new String[] { "Hanoi", "Paris", "Toulouse" };
    public HomeFragmentPagerAdapter(AppCompatActivity activity) {
        super(activity);
    }
    @Override
    public int getItemCount() {
        return PAGE_COUNT; // number of pages for a ViewPager
    }
    @Override
    public Fragment createFragment(int page) {

        switch (page) {
            case 0: return WeatherAndForecastFragment.newInstance("Hanoi", R.drawable.sunny);
            case 1: return WeatherAndForecastFragment.newInstance("London", R.drawable.sunny );
            case 2: return WeatherAndForecastFragment.newInstance("Beijing", R.drawable.sunny);
        }
        return new WeatherAndForecastFragment(); // failsafe
    }


    public CharSequence getPageTitle(int page) {
        return titles[page];
    }

}
