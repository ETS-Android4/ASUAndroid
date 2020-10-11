package com.example.asuandroid.cycleViewerAdapters;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;

import com.example.asuandroid.R;
import com.example.asuandroid.utils.Utils;

import static com.example.asuandroid.utils.Utils.setupItem;

/**
 * Created by Sean on 10/1/2020.
 */
public class HorizontalPagerAdapter extends PagerAdapter {

    private final Utils.LibraryObject[] TWO_WAY_LIBRARIES = new Utils.LibraryObject[]{
            new Utils.LibraryObject(
                    R.mipmap.ic_airforce_foreground,
                    ""
            ),
            new Utils.LibraryObject(
                    R.mipmap.ic_army1_foreground,
                    ""
            ),
            new Utils.LibraryObject(
                    R.mipmap.ic_army2_foreground,
                    ""
            ),
            new Utils.LibraryObject(
                    R.mipmap.ic_army3_foreground,
                    ""
            ),
            new Utils.LibraryObject(
                    R.mipmap.ic_army4_foreground,
                    ""
            )
    };

    private LayoutInflater mLayoutInflater;

    public HorizontalPagerAdapter(final Context context) {
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