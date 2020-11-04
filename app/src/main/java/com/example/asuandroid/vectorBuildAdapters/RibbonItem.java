package com.example.asuandroid.vectorBuildAdapters;

public class RibbonItem {

    public int mRibbon1Resource;
    public int mRibbon2Resource;
    public int mRibbon3Resource;
    public int mRibbon4Resource;
    public int mRibbon5Resource;
    private int mRibbon6Resource;
    private int mRibbon7Resource;
    private int mRibbon8Resource;
    private int mRibbon9Resource;
    private int mRibbon10Resource;
    private int mRibbon11Resource;
    private int mRibbon12Resource;

    public static class RibbonItem1 extends RibbonItem {
        public RibbonItem1(int Ribbon1Resource) {
            super();
            mRibbon1Resource = Ribbon1Resource;
        }
    }
    public static class RibbonItem2 extends RibbonItem {
        public RibbonItem2(int Ribbon1Resource, int Ribbon2Resource) {
            super();
            mRibbon1Resource = Ribbon1Resource;
            mRibbon2Resource = Ribbon2Resource;
        }
    }
    public static class RibbonItem3 extends RibbonItem {
        public RibbonItem3(int Ribbon1Resource, int Ribbon2Resource, int Ribbon3Resource) {
            super();
            mRibbon1Resource = Ribbon1Resource;
            mRibbon2Resource = Ribbon2Resource;
            mRibbon3Resource = Ribbon3Resource;
        }
    }
    public static class RibbonItem4 extends RibbonItem {

        public RibbonItem4(int Ribbon1Resource, int Ribbon2Resource, int Ribbon3Resource, int Ribbon4Resource) {
            super();
            mRibbon1Resource = Ribbon1Resource;
            mRibbon2Resource = Ribbon2Resource;
            mRibbon3Resource = Ribbon3Resource;
            mRibbon4Resource = Ribbon4Resource;
        }
    }
    public static class RibbonItem5 extends RibbonItem {

        public RibbonItem5(int Ribbon1Resource, int Ribbon2Resource, int Ribbon3Resource, int Ribbon4Resource, int Ribbon5Resource) {
            super();
            mRibbon1Resource = Ribbon1Resource;
            mRibbon2Resource = Ribbon2Resource;
            mRibbon3Resource = Ribbon3Resource;
            mRibbon4Resource = Ribbon4Resource;
            mRibbon5Resource = Ribbon5Resource;

        }
    }

    public int getImageResource1() { return mRibbon1Resource; }

    public int getImageResource2() {return mRibbon2Resource; }

    public int getImageResource3() {return mRibbon3Resource; }

    public int getImageResource4() {return mRibbon4Resource; }

    public int getImageResource5() {return mRibbon5Resource; }
}


