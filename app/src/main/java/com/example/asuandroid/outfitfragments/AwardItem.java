package com.example.asuandroid.outfitfragments;

import android.graphics.drawable.AnimationDrawable;
import android.media.Image;
import android.view.View;
import android.widget.ImageView;

import com.example.asuandroid.R;

import static com.stanko.tools.ResHelper.getDrawable;

public class AwardItem {
    public static AnimationDrawable rocketAnimation;
    private int mImageResource;
    private String mText1;
    private String mText2;
    private int mImageAnim;


    public AwardItem(int imageResource, String text1, String text2, int ribbonAnimResource) {
        mImageResource = imageResource;
        mText1 = text1;
        mText2 = text2;
        mImageAnim = ribbonAnimResource;
    }
    public void changeImage(ImageView rocketImage){

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
    public int getImageAnim() { return mImageAnim; }
}
