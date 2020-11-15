package com.example.asuandroid.cycleViewerAdapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.viewpager.widget.PagerAdapter;

import com.example.asuandroid.R;
import com.example.asuandroid.dialogs.Award2Dialog;
import com.example.asuandroid.utils.Utils;

import java.util.ArrayList;

import static androidx.viewpager.widget.PagerAdapter.POSITION_NONE;
import static com.example.asuandroid.utils.Utils.setupItem;
import static com.stanko.tools.ResHelper.getDrawable;

public class UniformPagerAdapter extends PagerAdapter {
    public static ArrayList<Drawable> ribbonSave = Award2Dialog.toCloset;
    public static Utils.LibraryObject[] TWO_WAY_LIBRARIES =new Utils.LibraryObject[]{new Utils.LibraryObject(R.drawable.ic_uniform, ""), new Utils.LibraryObject(R.drawable.ic_uniform, "")};
    private LayoutInflater mLayoutInflater;

    public UniformPagerAdapter(final Context context) { mLayoutInflater = LayoutInflater.from(context); }
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

