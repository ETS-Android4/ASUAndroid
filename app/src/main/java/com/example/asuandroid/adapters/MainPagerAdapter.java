package com.example.asuandroid.adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.asuandroid.screens.wardrobeScreen;


/**
 * Created by GIGAMOLE on 8/18/16.
 */
public class MainPagerAdapter extends FragmentStatePagerAdapter {

    private final static int COUNT = 3;

    private final static int HORIZONTAL = 0;;

    public MainPagerAdapter(final FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(final int position) {
        switch (position) {
            case HORIZONTAL:
            default:
                return new wardrobeScreen();
        }
    }

    @Override
    public int getCount() {
        return COUNT;
    }
}
