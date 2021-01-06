package com.example.asuandroid.vectorItems;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.example.asuandroid.R;

public class BadgeCardItem {
    private static boolean isSelected = false;
    private int mBadgeAddResource;
    private int mImageResource;
    private String mText1;
    private String mText2;
    private int mImageAnim;

    public BadgeCardItem(int imageResource, String text1, String text2, int mBadgeAddResource) {
        mImageResource = imageResource;
        mText1 = text1;
        mText2 = text2;
    }

    public static void setSelected(boolean selected) {
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
    public int getmBadgeAddResource() { return mBadgeAddResource; }
    public int getmImageAnim() {return mImageAnim;}
}
