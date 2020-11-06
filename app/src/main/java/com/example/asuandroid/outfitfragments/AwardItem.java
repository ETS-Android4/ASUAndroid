package com.example.asuandroid.outfitfragments;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.example.asuandroid.R;

public class AwardItem {
    private static boolean isSelected = false;
    private int mRibbonAddResource;
    private int mImageResource;
    private String mText1;
    private String mText2;
    private int mImageAnim;



    public AwardItem(int imageResource, String text1, String text2) {
        mImageResource = imageResource;
        mText1 = text1;
        mText2 = text2;


    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public static boolean isSelected() {
        return isSelected;
    }

    public int getImageResource() {
        return mImageResource;
    }
    public String getText1() {
        return mText1;
    }
    public String getText2() {
        return mText2;
    }
    public int getmRibbonAddResource() { return mRibbonAddResource; };
}
