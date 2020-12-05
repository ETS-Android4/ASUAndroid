package com.example.asuandroid.vectorItems;

import com.example.asuandroid.screens.UniformPresentationFragment;

import java.util.ArrayList;

public class BadgeItem {
    public int mBadge1Resource;
    public int mBadge2Resource;

    public static class BadgeItem1 extends BadgeItem {
        public BadgeItem1(ArrayList<Integer> images) {
            super();
            mBadge1Resource = images.get(0);
        }
    }
    public static class BadgeItem2 extends BadgeItem {
        public BadgeItem2(ArrayList<Integer> images) {
            super();
            mBadge1Resource = images.get(0);
            mBadge2Resource = images.get(1);
        }
    }

    public int getBadgeImageResource1() {return mBadge1Resource; }
    public int getBadgeImageResource2() {return mBadge2Resource; }
}
