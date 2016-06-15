package com.speedsumm.bu.aboutmegb;

import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{
    private ViewPager mPager;
    private PagerAdapter mPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPager = (ViewPager)findViewById(R.id.pager);
        mPagerAdapter = new ScreenSlidePageAdapter (getSupportFragmentManager());
        mPager.setPageTransformer(true,new ZoomOutPageTransformer());
        mPager.setAdapter(mPagerAdapter);

    }
}
