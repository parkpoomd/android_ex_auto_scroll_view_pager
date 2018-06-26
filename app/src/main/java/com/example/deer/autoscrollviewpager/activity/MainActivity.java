package com.example.deer.autoscrollviewpager.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.deer.autoscrollviewpager.R;
import com.example.deer.autoscrollviewpager.adapter.SliderImageAdapter;
import com.github.demono.AutoScrollViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<String> mImageUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mImageUrl = new ArrayList<>();

        for (int i = 1; i <= 4; i++) {
            mImageUrl.add("http://bondy.fitmeup.io:2010/static/img/location/00015_" + i + ".jpg");
        }

        AutoScrollViewPager viewPager = (AutoScrollViewPager) findViewById(R.id.viewPager);
        SliderImageAdapter sliderImageAdapter = new SliderImageAdapter(mImageUrl);
        viewPager.setAdapter(sliderImageAdapter);
        // optional start auto scroll
        viewPager.startAutoScroll();
    }
}
