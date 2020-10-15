package com.example.asuandroid.outfitfragments;

public class AwardItem {

    private int mImageResource;
    private String mText1;
    private String mText2;

    public AwardItem(int imageResource, String text1, String text2) {
        mImageResource = imageResource;
        mText1 = text1;
        mText2 = text2;
    }
    public void storeText1(String text){

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
}
