package com.example.asuandroid.vectorBuildAdapters;

import android.widget.ImageView;

import androidx.collection.ArraySet;

import com.example.asuandroid.screens.UniformPresentationFragment;

import java.util.ArrayList;

public class RibbonItem {
    public ArrayList<Integer> fromAward = UniformPresentationFragment.fromAward;
    public int mRibbon1Resource;
    public int mRibbon2Resource;
    public int mRibbon3Resource;
    public int mRibbon4Resource;
    public int mRibbon5Resource;
    public int mRibbon6Resource;
    public int mRibbon7Resource;
    public int mRibbon8Resource;
    public int mRibbon9Resource;
    public int mRibbon10Resource;
    public int mRibbon11Resource;
    public int mRibbon12Resource;

    public static class RibbonItem1 extends RibbonItem {
        public RibbonItem1(ArrayList<Integer> images) {
            super();
            mRibbon1Resource = images.get(0);
        }
    }
    public static class RibbonItem2 extends RibbonItem {
        public RibbonItem2(ArrayList<Integer> images) {
            super();
            mRibbon1Resource = images.get(0);
            mRibbon2Resource = images.get(1);
        }
    }
    public static class RibbonItem3 extends RibbonItem {
        public RibbonItem3(ArrayList<Integer> images) {
            super();
            //wRibbon1Resource = fromAward.valueAt(0);
            mRibbon1Resource = images.get(0);
            mRibbon2Resource = images.get(1);
            mRibbon3Resource = images.get(2);
        }
    }
    public static class RibbonItem4 extends RibbonItem {
        public RibbonItem4(ArrayList<Integer> images) {
            super();
            //wRibbon1Resource = fromAward.valueAt(0);
            mRibbon1Resource = images.get(0);
            mRibbon2Resource = images.get(1);
            mRibbon3Resource = images.get(2);
            mRibbon4Resource = images.get(3);
        }
    }
    public static class RibbonItem5 extends RibbonItem {
        public RibbonItem5(ArrayList<Integer> images) {
            super();
            //wRibbon1Resource = fromAward.valueAt(0);
            mRibbon1Resource = images.get(0);
            mRibbon2Resource = images.get(1);
            mRibbon3Resource = images.get(2);
            mRibbon4Resource = images.get(3);
            mRibbon5Resource = images.get(4);
        }
    }

    public int getImageResource1() { return mRibbon1Resource; }

    public int getImageResource2() {return mRibbon2Resource; }

    public int getImageResource3() {return mRibbon3Resource; }

    public int getImageResource4() {return mRibbon4Resource; }

    public int getImageResource5() {return mRibbon5Resource; }

    }


