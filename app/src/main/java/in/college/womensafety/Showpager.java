package in.college.womensafety;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import in.college.womensafety.R;


public class Showpager extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pager);
        ViewPager viewPager = (ViewPager) findViewById(R.id.my_pager);
        viewPager.setAdapter(new PagerAdapter(getSupportFragmentManager()));
    }
}
