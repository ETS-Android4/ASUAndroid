package com.example.asuandroid.cycleViewerAdapters;

import android.content.Context;

import android.graphics.drawable.Drawable;
import com.example.asuandroid.R;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.PagerAdapter;

import com.example.asuandroid.dialogs.Award2Dialog;
import com.example.asuandroid.screens.UniformPresentationFragment;
import com.example.asuandroid.utils.Utils;

import java.util.ArrayList;


import static com.example.asuandroid.utils.Utils.setupItem;
import static com.stanko.tools.ResHelper.getDrawable;

/**
 * Created by Sean on 10/1/2020.
 */
public class HorizontalPagerAdapter extends PagerAdapter {
    public static ArrayList<Drawable> fromRibbonBuilds = new ArrayList<Drawable>();
    public static Utils.LibraryObject[] TWO_WAY_LIBRARIES;
    public static Drawable emptyCloset = getDrawable(R.drawable.ic_wardrobe);
    public void createLibrary() {
        fromRibbonBuilds.add(emptyCloset);
        System.out.println(fromRibbonBuilds);
        int tatters = fromRibbonBuilds.size();
        if(tatters > 0) {
            switch (tatters) {
                case 1:
                    TWO_WAY_LIBRARIES = new Utils.LibraryObject[]{new Utils.LibraryObject(fromRibbonBuilds.get(0), "")};
                    break;
                case 2:
                    TWO_WAY_LIBRARIES = new Utils.LibraryObject[]{new Utils.LibraryObject(fromRibbonBuilds.get(0), ""), new Utils.LibraryObject(fromRibbonBuilds.get(1), "")};
                    break;
                case 3:
                    TWO_WAY_LIBRARIES = new Utils.LibraryObject[]{new Utils.LibraryObject(fromRibbonBuilds.get(0), ""), new Utils.LibraryObject(fromRibbonBuilds.get(1), ""), new Utils.LibraryObject(fromRibbonBuilds.get(2), "")};
                    break;
                case 4:
                    TWO_WAY_LIBRARIES = new Utils.LibraryObject[]{new Utils.LibraryObject(fromRibbonBuilds.get(0), ""), new Utils.LibraryObject(fromRibbonBuilds.get(1), ""), new Utils.LibraryObject(fromRibbonBuilds.get(2), ""), new Utils.LibraryObject(fromRibbonBuilds.get(3), "")};
                    break;
                case 5:
                    TWO_WAY_LIBRARIES = new Utils.LibraryObject[]{new Utils.LibraryObject(fromRibbonBuilds.get(0), ""), new Utils.LibraryObject(fromRibbonBuilds.get(1), ""), new Utils.LibraryObject(fromRibbonBuilds.get(2), ""), new Utils.LibraryObject(fromRibbonBuilds.get(3), ""), new Utils.LibraryObject(fromRibbonBuilds.get(4), "")};
                    break;
            }
            }else if (tatters == 0){

            }
        }

    private LayoutInflater mLayoutInflater;

    public HorizontalPagerAdapter(final Context context) {
        createLibrary();
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return TWO_WAY_LIBRARIES.length;
    }

    @Override
    public int getItemPosition(final Object object) {
        return POSITION_NONE;
    }

    @Override
    public Object instantiateItem(final ViewGroup container, final int position) {
        final View view = mLayoutInflater.inflate(R.layout.item, container, false);

        setupItem(view, TWO_WAY_LIBRARIES[position]);

        container.addView(view);
        return view;
    }

    @Override
    public boolean isViewFromObject(final View view, final Object object) {
        return view.equals(object);
    }

    @Override
    public void destroyItem(final ViewGroup container, final int position, final Object object) {
        container.removeView((View) object);
    }
}