package com.speedsumm.bu.aboutmegb;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by bu on 15.06.2016.
 */
public class ScreenSlidePageAdapter extends FragmentStatePagerAdapter {

    public static final int NUM_PAGES = 2;

    public ScreenSlidePageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment = new Fragment1();
                break;
            case 1:
                fragment = new Fragment2();
            default:
        }
        return fragment;

//        return new ScreenSlidePageFragment();
    }

    @Override
    public int getCount() {
        return NUM_PAGES;
    }
}
