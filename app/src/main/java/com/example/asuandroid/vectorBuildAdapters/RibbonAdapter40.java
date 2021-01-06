
package com.example.asuandroid.vectorBuildAdapters;
import android.annotation.SuppressLint;
import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.view.View;
import android.widget.Toast;
import com.example.asuandroid.vectorItems.RibbonItem;
import com.example.asuandroid.R;
import com.example.asuandroid.threads.MultithreadingDemo;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.PopupMenu;
import androidx.collection.ArraySet;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import static com.example.asuandroid.outfitfragments.Award2Fragment.context;

import static com.example.asuandroid.outfitfragments.Award2Fragment.context;

public class RibbonAdapter40 extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    public static ArrayList<RibbonItem> mRibbonList;
    public static ArraySet<ImageView> images = new ArraySet<ImageView>();
    public static ArrayList<List<ImageView>> oaks = new ArrayList<>();
    public static List toPopup = new ArrayList<>();
    public static ArraySet<ImageView> currentOaks = new ArraySet<>();
    //private CompoundButton.OnCheckedChangeListener;
    private OnItemClickListener mListener;
    private static Context mContext = context;
    private final ArraySet<ImageView> oaks1 = new ArraySet<>();
    public static ImageView mImageView1;
    public static ImageView mImageView1_2;
    public static ImageView mImageView1_3;
    public static ImageView mImageView1_4;
    public static ImageView mImageView1_5;
    public static ImageView mImageView1_6;
    public static ImageView mImageView1_7;
    public static ImageView mImageView1_8;
    private final ArraySet<ImageView> oaks2 = new ArraySet<>();
    public static ImageView mImageView2;
    public static ImageView mImageView2_2;
    public static ImageView mImageView2_3;
    public static ImageView mImageView2_4;
    public static ImageView mImageView2_5;
    public static ImageView mImageView2_6;
    public static ImageView mImageView2_7;
    public static ImageView mImageView2_8;
    private final ArraySet<ImageView> oaks3 = new ArraySet<>();
    public static ImageView mImageView3;
    public static ImageView mImageView3_2;
    public static ImageView mImageView3_3;
    public static ImageView mImageView3_4;
    public static ImageView mImageView3_5;
    public static ImageView mImageView3_6;
    public static ImageView mImageView3_7;
    public static ImageView mImageView3_8;
    private final ArraySet<ImageView> oaks4 = new ArraySet<>();
    public static ImageView mImageView4;
    public static ImageView mImageView4_2;
    public static ImageView mImageView4_3;
    public static ImageView mImageView4_4;
    public static ImageView mImageView4_5;
    public static ImageView mImageView4_6;
    public static ImageView mImageView4_7;
    public static ImageView mImageView4_8;
    private final ArraySet<ImageView> oaks5 = new ArraySet<>();
    public static ImageView mImageView5;
    public static ImageView mImageView5_2;
    public static ImageView mImageView5_3;
    public static ImageView mImageView5_4;
    public static ImageView mImageView5_5;
    public static ImageView mImageView5_6;
    public static ImageView mImageView5_7;
    public static ImageView mImageView5_8;
    private final ArraySet<ImageView> oaks6 = new ArraySet<>();
    public static ImageView mImageView6;
    public static ImageView mImageView6_2;
    public static ImageView mImageView6_3;
    public static ImageView mImageView6_4;
    public static ImageView mImageView6_5;
    public static ImageView mImageView6_6;
    public static ImageView mImageView6_7;
    public static ImageView mImageView6_8;
    private final ArraySet<ImageView> oaks7 = new ArraySet<>();
    public static ImageView mImageView7;
    public static ImageView mImageView7_2;
    public static ImageView mImageView7_3;
    public static ImageView mImageView7_4;
    public static ImageView mImageView7_5;
    public static ImageView mImageView7_6;
    public static ImageView mImageView7_7;
    public static ImageView mImageView7_8;
    private final ArraySet<ImageView> oaks8 = new ArraySet<>();
    public static ImageView mImageView8;
    public static ImageView mImageView8_2;
    public static ImageView mImageView8_3;
    public static ImageView mImageView8_4;
    public static ImageView mImageView8_5;
    public static ImageView mImageView8_6;
    public static ImageView mImageView8_7;
    public static ImageView mImageView8_8;
    private final ArraySet<ImageView> oaks9 = new ArraySet<>();
    public static ImageView mImageView9;
    public static ImageView mImageView9_2;
    public static ImageView mImageView9_3;
    public static ImageView mImageView9_4;
    public static ImageView mImageView9_5;
    public static ImageView mImageView9_6;
    public static ImageView mImageView9_7;
    public static ImageView mImageView9_8;
    private final ArraySet<ImageView> oaks10 = new ArraySet<>();
    public static ImageView mImageView10;
    public static ImageView mImageView10_2;
    public static ImageView mImageView10_3;
    public static ImageView mImageView10_4;
    public static ImageView mImageView10_5;
    public static ImageView mImageView10_6;
    public static ImageView mImageView10_7;
    public static ImageView mImageView10_8;
    private final ArraySet<ImageView> oaks11 = new ArraySet<>();
    public static ImageView mImageView11;
    public static ImageView mImageView11_2;
    public static ImageView mImageView11_3;
    public static ImageView mImageView11_4;
    public static ImageView mImageView11_5;
    public static ImageView mImageView11_6;
    public static ImageView mImageView11_7;
    public static ImageView mImageView11_8;
    private final ArraySet<ImageView> oaks12 = new ArraySet<>();
    public static ImageView mImageView12;
    public static ImageView mImageView12_2;
    public static ImageView mImageView12_3;
    public static ImageView mImageView12_4;
    public static ImageView mImageView12_5;
    public static ImageView mImageView12_6;
    public static ImageView mImageView12_7;
    public static ImageView mImageView12_8;
    private final ArraySet<ImageView> oaks13 = new ArraySet<>();
    public static ImageView mImageView13;
    public static ImageView mImageView13_2;
    public static ImageView mImageView13_3;
    public static ImageView mImageView13_4;
    public static ImageView mImageView13_5;
    public static ImageView mImageView13_6;
    public static ImageView mImageView13_7;
    public static ImageView mImageView13_8;
    private final ArraySet<ImageView> oaks14 = new ArraySet<>();
    public static ImageView mImageView14;
    public static ImageView mImageView14_2;
    public static ImageView mImageView14_3;
    public static ImageView mImageView14_4;
    public static ImageView mImageView14_5;
    public static ImageView mImageView14_6;
    public static ImageView mImageView14_7;
    public static ImageView mImageView14_8;
    private final ArraySet<ImageView> oaks15 = new ArraySet<>();
    public static ImageView mImageView15;
    public static ImageView mImageView15_2;
    public static ImageView mImageView15_3;
    public static ImageView mImageView15_4;
    public static ImageView mImageView15_5;
    public static ImageView mImageView15_6;
    public static ImageView mImageView15_7;
    public static ImageView mImageView15_8;
    private final ArraySet<ImageView> oaks16 = new ArraySet<>();
    public static ImageView mImageView16;
    public static ImageView mImageView16_2;
    public static ImageView mImageView16_3;
    public static ImageView mImageView16_4;
    public static ImageView mImageView16_5;
    public static ImageView mImageView16_6;
    public static ImageView mImageView16_7;
    public static ImageView mImageView16_8;
    private final ArraySet<ImageView> oaks17 = new ArraySet<>();
    public static ImageView mImageView17;
    public static ImageView mImageView17_2;
    public static ImageView mImageView17_3;
    public static ImageView mImageView17_4;
    public static ImageView mImageView17_5;
    public static ImageView mImageView17_6;
    public static ImageView mImageView17_7;
    public static ImageView mImageView17_8;
    private final ArraySet<ImageView> oaks18 = new ArraySet<>();
    public static ImageView mImageView18;
    public static ImageView mImageView18_2;
    public static ImageView mImageView18_3;
    public static ImageView mImageView18_4;
    public static ImageView mImageView18_5;
    public static ImageView mImageView18_6;
    public static ImageView mImageView18_7;
    public static ImageView mImageView18_8;
    private final ArraySet<ImageView> oaks19 = new ArraySet<>();
    public static ImageView mImageView19;
    public static ImageView mImageView19_2;
    public static ImageView mImageView19_3;
    public static ImageView mImageView19_4;
    public static ImageView mImageView19_5;
    public static ImageView mImageView19_6;
    public static ImageView mImageView19_7;
    public static ImageView mImageView19_8;
    private final ArraySet<ImageView> oaks20 = new ArraySet<>();
    public static ImageView mImageView20;
    public static ImageView mImageView20_2;
    public static ImageView mImageView20_3;
    public static ImageView mImageView20_4;
    public static ImageView mImageView20_5;
    public static ImageView mImageView20_6;
    public static ImageView mImageView20_7;
    public static ImageView mImageView20_8;
    private final ArraySet<ImageView> oaks21 = new ArraySet<>();
    public static ImageView mImageView21;
    public static ImageView mImageView21_2;
    public static ImageView mImageView21_3;
    public static ImageView mImageView21_4;
    public static ImageView mImageView21_5;
    public static ImageView mImageView21_6;
    public static ImageView mImageView21_7;
    public static ImageView mImageView21_8;
    private final ArraySet<ImageView> oaks22 = new ArraySet<>();
    public static ImageView mImageView22;
    public static ImageView mImageView22_2;
    public static ImageView mImageView22_3;
    public static ImageView mImageView22_4;
    public static ImageView mImageView22_5;
    public static ImageView mImageView22_6;
    public static ImageView mImageView22_7;
    public static ImageView mImageView22_8;
    private final ArraySet<ImageView> oaks23 = new ArraySet<>();
    public static ImageView mImageView23;
    public static ImageView mImageView23_2;
    public static ImageView mImageView23_3;
    public static ImageView mImageView23_4;
    public static ImageView mImageView23_5;
    public static ImageView mImageView23_6;
    public static ImageView mImageView23_7;
    public static ImageView mImageView23_8;
    private final ArraySet<ImageView> oaks24 = new ArraySet<>();
    public static ImageView mImageView24;
    public static ImageView mImageView24_2;
    public static ImageView mImageView24_3;
    public static ImageView mImageView24_4;
    public static ImageView mImageView24_5;
    public static ImageView mImageView24_6;
    public static ImageView mImageView24_7;
    public static ImageView mImageView24_8;
    private final ArraySet<ImageView> oaks25 = new ArraySet<>();
    public static ImageView mImageView25;
    public static ImageView mImageView25_2;
    public static ImageView mImageView25_3;
    public static ImageView mImageView25_4;
    public static ImageView mImageView25_5;
    public static ImageView mImageView25_6;
    public static ImageView mImageView25_7;
    public static ImageView mImageView25_8;
    private final ArraySet<ImageView> oaks26 = new ArraySet<>();
    public static ImageView mImageView26;
    public static ImageView mImageView26_2;
    public static ImageView mImageView26_3;
    public static ImageView mImageView26_4;
    public static ImageView mImageView26_5;
    public static ImageView mImageView26_6;
    public static ImageView mImageView26_7;
    public static ImageView mImageView26_8;
    private final ArraySet<ImageView> oaks27 = new ArraySet<>();
    public static ImageView mImageView27;
    public static ImageView mImageView27_2;
    public static ImageView mImageView27_3;
    public static ImageView mImageView27_4;
    public static ImageView mImageView27_5;
    public static ImageView mImageView27_6;
    public static ImageView mImageView27_7;
    public static ImageView mImageView27_8;
    private final ArraySet<ImageView> oaks28 = new ArraySet<>();
    public static ImageView mImageView28;
    public static ImageView mImageView28_2;
    public static ImageView mImageView28_3;
    public static ImageView mImageView28_4;
    public static ImageView mImageView28_5;
    public static ImageView mImageView28_6;
    public static ImageView mImageView28_7;
    public static ImageView mImageView28_8;
    private final ArraySet<ImageView> oaks29 = new ArraySet<>();
    public static ImageView mImageView29;
    public static ImageView mImageView29_2;
    public static ImageView mImageView29_3;
    public static ImageView mImageView29_4;
    public static ImageView mImageView29_5;
    public static ImageView mImageView29_6;
    public static ImageView mImageView29_7;
    public static ImageView mImageView29_8;
    private final ArraySet<ImageView> oaks30 = new ArraySet<>();
    public static ImageView mImageView30;
    public static ImageView mImageView30_2;
    public static ImageView mImageView30_3;
    public static ImageView mImageView30_4;
    public static ImageView mImageView30_5;
    public static ImageView mImageView30_6;
    public static ImageView mImageView30_7;
    public static ImageView mImageView30_8;
    private final ArraySet<ImageView> oaks31 = new ArraySet<>();
    public static ImageView mImageView31;
    public static ImageView mImageView31_2;
    public static ImageView mImageView31_3;
    public static ImageView mImageView31_4;
    public static ImageView mImageView31_5;
    public static ImageView mImageView31_6;
    public static ImageView mImageView31_7;
    public static ImageView mImageView31_8;
    private final ArraySet<ImageView> oaks32 = new ArraySet<>();
    public static ImageView mImageView32;
    public static ImageView mImageView32_2;
    public static ImageView mImageView32_3;
    public static ImageView mImageView32_4;
    public static ImageView mImageView32_5;
    public static ImageView mImageView32_6;
    public static ImageView mImageView32_7;
    public static ImageView mImageView32_8;
    private final ArraySet<ImageView> oaks33 = new ArraySet<>();
    public static ImageView mImageView33;
    public static ImageView mImageView33_2;
    public static ImageView mImageView33_3;
    public static ImageView mImageView33_4;
    public static ImageView mImageView33_5;
    public static ImageView mImageView33_6;
    public static ImageView mImageView33_7;
    public static ImageView mImageView33_8;
    private final ArraySet<ImageView> oaks34 = new ArraySet<>();
    public static ImageView mImageView34;
    public static ImageView mImageView34_2;
    public static ImageView mImageView34_3;
    public static ImageView mImageView34_4;
    public static ImageView mImageView34_5;
    public static ImageView mImageView34_6;
    public static ImageView mImageView34_7;
    public static ImageView mImageView34_8;
    private final ArraySet<ImageView> oaks35 = new ArraySet<>();
    public static ImageView mImageView35;
    public static ImageView mImageView35_2;
    public static ImageView mImageView35_3;
    public static ImageView mImageView35_4;
    public static ImageView mImageView35_5;
    public static ImageView mImageView35_6;
    public static ImageView mImageView35_7;
    public static ImageView mImageView35_8;
    private final ArraySet<ImageView> oaks36 = new ArraySet<>();
    public static ImageView mImageView36;
    public static ImageView mImageView36_2;
    public static ImageView mImageView36_3;
    public static ImageView mImageView36_4;
    public static ImageView mImageView36_5;
    public static ImageView mImageView36_6;
    public static ImageView mImageView36_7;
    public static ImageView mImageView36_8;
    private final ArraySet<ImageView> oaks37 = new ArraySet<>();
    public static ImageView mImageView37;
    public static ImageView mImageView37_2;
    public static ImageView mImageView37_3;
    public static ImageView mImageView37_4;
    public static ImageView mImageView37_5;
    public static ImageView mImageView37_6;
    public static ImageView mImageView37_7;
    public static ImageView mImageView37_8;
    private final ArraySet<ImageView> oaks38 = new ArraySet<>();
    public static ImageView mImageView38;
    public static ImageView mImageView38_2;
    public static ImageView mImageView38_3;
    public static ImageView mImageView38_4;
    public static ImageView mImageView38_5;
    public static ImageView mImageView38_6;
    public static ImageView mImageView38_7;
    public static ImageView mImageView38_8;
    private final ArraySet<ImageView> oaks39 = new ArraySet<>();
    public static ImageView mImageView39;
    public static ImageView mImageView39_2;
    public static ImageView mImageView39_3;
    public static ImageView mImageView39_4;
    public static ImageView mImageView39_5;
    public static ImageView mImageView39_6;
    public static ImageView mImageView39_7;
    public static ImageView mImageView39_8;
    private final ArraySet<ImageView> oaks40 = new ArraySet<>();
    public static ImageView mImageView40;
    public static ImageView mImageView40_2;
    public static ImageView mImageView40_3;
    public static ImageView mImageView40_4;
    public static ImageView mImageView40_5;
    public static ImageView mImageView40_6;
    public static ImageView mImageView40_7;
    public static ImageView mImageView40_8;

    public ArrayList<RibbonItem> RibbonAdapter40(ArrayList<RibbonItem> mRibbonList) {
        return mRibbonList;
    }
    public interface OnItemClickListener { void onEditRibbonClick(int ribbon, int position);}
    public void setOnItemClickListener(RibbonAdapter40.OnItemClickListener listener) { mListener = listener; }

    public static class Ribbon40Holder extends RecyclerView.ViewHolder {

        public Ribbon40Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images, ArrayList<List<ImageView>> oaks) {
            super(itemView);
            List<ImageView> oaks1 = new ArrayList<>();
            mImageView1 = itemView.findViewById(R.id.ribbon1);
            images.add(mImageView1);
            oaks1.add(mImageView1_2 = itemView.findViewById(R.id.ribbon1_2));
            oaks1.add(mImageView1_3 = itemView.findViewById(R.id.ribbon1_3));
            oaks1.add(mImageView1_4 = itemView.findViewById(R.id.ribbon1_4));
            oaks1.add(mImageView1_5 = itemView.findViewById(R.id.ribbon1_5));
            oaks1.add(mImageView1_6 = itemView.findViewById(R.id.ribbon1_6));
            oaks1.add(mImageView1_7 = itemView.findViewById(R.id.ribbon1_7));
            oaks1.add(mImageView1_8 = itemView.findViewById(R.id.ribbon1_8));
            List<ImageView> oaks2 = new ArrayList<>();
            mImageView2 = itemView.findViewById(R.id.ribbon2);
            images.add(mImageView2);
            oaks2.add(mImageView2_2 = itemView.findViewById(R.id.ribbon2_2));
            oaks2.add(mImageView2_3 = itemView.findViewById(R.id.ribbon2_3));
            oaks2.add(mImageView2_4 = itemView.findViewById(R.id.ribbon2_4));
            oaks2.add(mImageView2_5 = itemView.findViewById(R.id.ribbon2_5));
            oaks2.add(mImageView2_6 = itemView.findViewById(R.id.ribbon2_6));
            oaks2.add(mImageView2_7 = itemView.findViewById(R.id.ribbon2_7));
            oaks2.add(mImageView2_8 = itemView.findViewById(R.id.ribbon2_8));
            List<ImageView> oaks3 = new ArrayList<>();
            mImageView3 = itemView.findViewById(R.id.ribbon3);
            images.add(mImageView3);
            oaks3.add(mImageView3_2 = itemView.findViewById(R.id.ribbon3_2));
            oaks3.add(mImageView3_3 = itemView.findViewById(R.id.ribbon3_3));
            oaks3.add(mImageView3_4 = itemView.findViewById(R.id.ribbon3_4));
            oaks3.add(mImageView3_5 = itemView.findViewById(R.id.ribbon3_5));
            oaks3.add(mImageView3_6 = itemView.findViewById(R.id.ribbon3_6));
            oaks3.add(mImageView3_7 = itemView.findViewById(R.id.ribbon3_7));
            oaks3.add(mImageView3_8 = itemView.findViewById(R.id.ribbon3_8));
            List<ImageView> oaks4 = new ArrayList<>();
            mImageView4 = itemView.findViewById(R.id.ribbon4);
            images.add(mImageView4);
            oaks4.add(mImageView4_2 = itemView.findViewById(R.id.ribbon4_2));
            oaks4.add(mImageView4_3 = itemView.findViewById(R.id.ribbon4_3));
            oaks4.add(mImageView4_4 = itemView.findViewById(R.id.ribbon4_4));
            oaks4.add(mImageView4_5 = itemView.findViewById(R.id.ribbon4_5));
            oaks4.add(mImageView4_6 = itemView.findViewById(R.id.ribbon4_6));
            oaks4.add(mImageView4_7 = itemView.findViewById(R.id.ribbon4_7));
            oaks4.add(mImageView4_8 = itemView.findViewById(R.id.ribbon4_8));
            List<ImageView> oaks5 = new ArrayList<>();
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            images.add(mImageView5);
            oaks5.add(mImageView5_2 = itemView.findViewById(R.id.ribbon5_2));
            oaks5.add(mImageView5_3 = itemView.findViewById(R.id.ribbon5_3));
            oaks5.add(mImageView5_4 = itemView.findViewById(R.id.ribbon5_4));
            oaks5.add(mImageView5_5 = itemView.findViewById(R.id.ribbon5_5));
            oaks5.add(mImageView5_6 = itemView.findViewById(R.id.ribbon5_6));
            oaks5.add(mImageView5_7 = itemView.findViewById(R.id.ribbon5_7));
            oaks5.add(mImageView5_8 = itemView.findViewById(R.id.ribbon5_8));
            List<ImageView> oaks6 = new ArrayList<>();
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            images.add(mImageView6);
            oaks6.add(mImageView6_2 = itemView.findViewById(R.id.ribbon6_2));
            oaks6.add(mImageView6_3 = itemView.findViewById(R.id.ribbon6_3));
            oaks6.add(mImageView6_4 = itemView.findViewById(R.id.ribbon6_4));
            oaks6.add(mImageView6_5 = itemView.findViewById(R.id.ribbon6_5));
            oaks6.add(mImageView6_6 = itemView.findViewById(R.id.ribbon6_6));
            oaks6.add(mImageView6_7 = itemView.findViewById(R.id.ribbon6_7));
            oaks6.add(mImageView6_8 = itemView.findViewById(R.id.ribbon6_8));
            List<ImageView> oaks7 = new ArrayList<>();
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            images.add(mImageView7);
            oaks7.add(mImageView7_2 = itemView.findViewById(R.id.ribbon7_2));
            oaks7.add(mImageView7_3 = itemView.findViewById(R.id.ribbon7_3));
            oaks7.add(mImageView7_4 = itemView.findViewById(R.id.ribbon7_4));
            oaks7.add(mImageView7_5 = itemView.findViewById(R.id.ribbon7_5));
            oaks7.add(mImageView7_6 = itemView.findViewById(R.id.ribbon7_6));
            oaks7.add(mImageView7_7 = itemView.findViewById(R.id.ribbon7_7));
            oaks7.add(mImageView7_8 = itemView.findViewById(R.id.ribbon7_8));
            List<ImageView> oaks8 = new ArrayList<>();
            mImageView8 = itemView.findViewById(R.id.ribbon8);
            images.add(mImageView8);
            oaks8.add(mImageView8_2 = itemView.findViewById(R.id.ribbon8_2));
            oaks8.add(mImageView8_3 = itemView.findViewById(R.id.ribbon8_3));
            oaks8.add(mImageView8_4 = itemView.findViewById(R.id.ribbon8_4));
            oaks8.add(mImageView8_5 = itemView.findViewById(R.id.ribbon8_5));
            oaks8.add(mImageView8_6 = itemView.findViewById(R.id.ribbon8_6));
            oaks8.add(mImageView8_7 = itemView.findViewById(R.id.ribbon8_7));
            oaks8.add(mImageView8_8 = itemView.findViewById(R.id.ribbon8_8));
            List<ImageView> oaks9 = new ArrayList<>();
            mImageView9 = itemView.findViewById(R.id.ribbon9);
            images.add(mImageView9);
            oaks9.add(mImageView9_2 = itemView.findViewById(R.id.ribbon9_2));
            oaks9.add(mImageView9_3 = itemView.findViewById(R.id.ribbon9_3));
            oaks9.add(mImageView9_4 = itemView.findViewById(R.id.ribbon9_4));
            oaks9.add(mImageView9_5 = itemView.findViewById(R.id.ribbon9_5));
            oaks9.add(mImageView9_6 = itemView.findViewById(R.id.ribbon9_6));
            oaks9.add(mImageView9_7 = itemView.findViewById(R.id.ribbon9_7));
            oaks9.add(mImageView9_8 = itemView.findViewById(R.id.ribbon9_8));
            List<ImageView> oaks10 = new ArrayList<>();
            mImageView10 = itemView.findViewById(R.id.ribbon10);
            images.add(mImageView10);
            oaks10.add(mImageView10_2 = itemView.findViewById(R.id.ribbon10_2));
            oaks10.add(mImageView10_3 = itemView.findViewById(R.id.ribbon10_3));
            oaks10.add(mImageView10_4 = itemView.findViewById(R.id.ribbon10_4));
            oaks10.add(mImageView10_5 = itemView.findViewById(R.id.ribbon10_5));
            oaks10.add(mImageView10_6 = itemView.findViewById(R.id.ribbon10_6));
            oaks10.add(mImageView10_7 = itemView.findViewById(R.id.ribbon10_7));
            oaks10.add(mImageView10_8 = itemView.findViewById(R.id.ribbon10_8));
            List<ImageView> oaks11 = new ArrayList<>();
            mImageView11 = itemView.findViewById(R.id.ribbon11);
            images.add(mImageView11);
            oaks11.add(mImageView11_2 = itemView.findViewById(R.id.ribbon11_2));
            oaks11.add(mImageView11_3 = itemView.findViewById(R.id.ribbon11_3));
            oaks11.add(mImageView11_4 = itemView.findViewById(R.id.ribbon11_4));
            oaks11.add(mImageView11_5 = itemView.findViewById(R.id.ribbon11_5));
            oaks11.add(mImageView11_6 = itemView.findViewById(R.id.ribbon11_6));
            oaks11.add(mImageView11_7 = itemView.findViewById(R.id.ribbon11_7));
            oaks11.add(mImageView11_8 = itemView.findViewById(R.id.ribbon11_8));
            List<ImageView> oaks12 = new ArrayList<>();
            mImageView12 = itemView.findViewById(R.id.ribbon12);
            images.add(mImageView12);
            oaks12.add(mImageView12_2 = itemView.findViewById(R.id.ribbon12_2));
            oaks12.add(mImageView12_3 = itemView.findViewById(R.id.ribbon12_3));
            oaks12.add(mImageView12_4 = itemView.findViewById(R.id.ribbon12_4));
            oaks12.add(mImageView12_5 = itemView.findViewById(R.id.ribbon12_5));
            oaks12.add(mImageView12_6 = itemView.findViewById(R.id.ribbon12_6));
            oaks12.add(mImageView12_7 = itemView.findViewById(R.id.ribbon12_7));
            oaks12.add(mImageView12_8 = itemView.findViewById(R.id.ribbon12_8));
            List<ImageView> oaks13 = new ArrayList<>();
            mImageView13 = itemView.findViewById(R.id.ribbon13);
            images.add(mImageView13);
            oaks13.add(mImageView13_2 = itemView.findViewById(R.id.ribbon13_2));
            oaks13.add(mImageView13_3 = itemView.findViewById(R.id.ribbon13_3));
            oaks13.add(mImageView13_4 = itemView.findViewById(R.id.ribbon13_4));
            oaks13.add(mImageView13_5 = itemView.findViewById(R.id.ribbon13_5));
            oaks13.add(mImageView13_6 = itemView.findViewById(R.id.ribbon13_6));
            oaks13.add(mImageView13_7 = itemView.findViewById(R.id.ribbon13_7));
            oaks13.add(mImageView13_8 = itemView.findViewById(R.id.ribbon13_8));
            List<ImageView> oaks14 = new ArrayList<>();
            mImageView14 = itemView.findViewById(R.id.ribbon14);
            images.add(mImageView14);
            oaks14.add(mImageView14_2 = itemView.findViewById(R.id.ribbon14_2));
            oaks14.add(mImageView14_3 = itemView.findViewById(R.id.ribbon14_3));
            oaks14.add(mImageView14_4 = itemView.findViewById(R.id.ribbon14_4));
            oaks14.add(mImageView14_5 = itemView.findViewById(R.id.ribbon14_5));
            oaks14.add(mImageView14_6 = itemView.findViewById(R.id.ribbon14_6));
            oaks14.add(mImageView14_7 = itemView.findViewById(R.id.ribbon14_7));
            oaks14.add(mImageView14_8 = itemView.findViewById(R.id.ribbon14_8));
            List<ImageView> oaks15 = new ArrayList<>();
            mImageView15 = itemView.findViewById(R.id.ribbon15);
            images.add(mImageView15);
            oaks15.add(mImageView15_2 = itemView.findViewById(R.id.ribbon15_2));
            oaks15.add(mImageView15_3 = itemView.findViewById(R.id.ribbon15_3));
            oaks15.add(mImageView15_4 = itemView.findViewById(R.id.ribbon15_4));
            oaks15.add(mImageView15_5 = itemView.findViewById(R.id.ribbon15_5));
            oaks15.add(mImageView15_6 = itemView.findViewById(R.id.ribbon15_6));
            oaks15.add(mImageView15_7 = itemView.findViewById(R.id.ribbon15_7));
            oaks15.add(mImageView15_8 = itemView.findViewById(R.id.ribbon15_8));
            List<ImageView> oaks16 = new ArrayList<>();
            mImageView16 = itemView.findViewById(R.id.ribbon16);
            images.add(mImageView16);
            oaks16.add(mImageView16_2 = itemView.findViewById(R.id.ribbon16_2));
            oaks16.add(mImageView16_3 = itemView.findViewById(R.id.ribbon16_3));
            oaks16.add(mImageView16_4 = itemView.findViewById(R.id.ribbon16_4));
            oaks16.add(mImageView16_5 = itemView.findViewById(R.id.ribbon16_5));
            oaks16.add(mImageView16_6 = itemView.findViewById(R.id.ribbon16_6));
            oaks16.add(mImageView16_7 = itemView.findViewById(R.id.ribbon16_7));
            oaks16.add(mImageView16_8 = itemView.findViewById(R.id.ribbon16_8));
            List<ImageView> oaks17 = new ArrayList<>();
            mImageView17 = itemView.findViewById(R.id.ribbon17);
            images.add(mImageView17);
            oaks17.add(mImageView17_2 = itemView.findViewById(R.id.ribbon17_2));
            oaks17.add(mImageView17_3 = itemView.findViewById(R.id.ribbon17_3));
            oaks17.add(mImageView17_4 = itemView.findViewById(R.id.ribbon17_4));
            oaks17.add(mImageView17_5 = itemView.findViewById(R.id.ribbon17_5));
            oaks17.add(mImageView17_6 = itemView.findViewById(R.id.ribbon17_6));
            oaks17.add(mImageView17_7 = itemView.findViewById(R.id.ribbon17_7));
            oaks17.add(mImageView17_8 = itemView.findViewById(R.id.ribbon17_8));
            List<ImageView> oaks18 = new ArrayList<>();
            mImageView18 = itemView.findViewById(R.id.ribbon18);
            images.add(mImageView18);
            oaks18.add(mImageView18_2 = itemView.findViewById(R.id.ribbon18_2));
            oaks18.add(mImageView18_3 = itemView.findViewById(R.id.ribbon18_3));
            oaks18.add(mImageView18_4 = itemView.findViewById(R.id.ribbon18_4));
            oaks18.add(mImageView18_5 = itemView.findViewById(R.id.ribbon18_5));
            oaks18.add(mImageView18_6 = itemView.findViewById(R.id.ribbon18_6));
            oaks18.add(mImageView18_7 = itemView.findViewById(R.id.ribbon18_7));
            oaks18.add(mImageView18_8 = itemView.findViewById(R.id.ribbon18_8));
            List<ImageView> oaks19 = new ArrayList<>();
            mImageView19 = itemView.findViewById(R.id.ribbon19);
            images.add(mImageView19);
            oaks19.add(mImageView19_2 = itemView.findViewById(R.id.ribbon19_2));
            oaks19.add(mImageView19_3 = itemView.findViewById(R.id.ribbon19_3));
            oaks19.add(mImageView19_4 = itemView.findViewById(R.id.ribbon19_4));
            oaks19.add(mImageView19_5 = itemView.findViewById(R.id.ribbon19_5));
            oaks19.add(mImageView19_6 = itemView.findViewById(R.id.ribbon19_6));
            oaks19.add(mImageView19_7 = itemView.findViewById(R.id.ribbon19_7));
            oaks19.add(mImageView19_8 = itemView.findViewById(R.id.ribbon19_8));
            List<ImageView> oaks20 = new ArrayList<>();
            mImageView20 = itemView.findViewById(R.id.ribbon20);
            images.add(mImageView20);
            oaks20.add(mImageView20_2 = itemView.findViewById(R.id.ribbon20_2));
            oaks20.add(mImageView20_3 = itemView.findViewById(R.id.ribbon20_3));
            oaks20.add(mImageView20_4 = itemView.findViewById(R.id.ribbon20_4));
            oaks20.add(mImageView20_5 = itemView.findViewById(R.id.ribbon20_5));
            oaks20.add(mImageView20_6 = itemView.findViewById(R.id.ribbon20_6));
            oaks20.add(mImageView20_7 = itemView.findViewById(R.id.ribbon20_7));
            oaks20.add(mImageView20_8 = itemView.findViewById(R.id.ribbon20_8));
            List<ImageView> oaks21 = new ArrayList<>();
            mImageView21 = itemView.findViewById(R.id.ribbon21);
            images.add(mImageView21);
            oaks21.add(mImageView21_2 = itemView.findViewById(R.id.ribbon21_2));
            oaks21.add(mImageView21_3 = itemView.findViewById(R.id.ribbon21_3));
            oaks21.add(mImageView21_4 = itemView.findViewById(R.id.ribbon21_4));
            oaks21.add(mImageView21_5 = itemView.findViewById(R.id.ribbon21_5));
            oaks21.add(mImageView21_6 = itemView.findViewById(R.id.ribbon21_6));
            oaks21.add(mImageView21_7 = itemView.findViewById(R.id.ribbon21_7));
            oaks21.add(mImageView21_8 = itemView.findViewById(R.id.ribbon21_8));
            List<ImageView> oaks22 = new ArrayList<>();
            mImageView22 = itemView.findViewById(R.id.ribbon22);
            images.add(mImageView22);
            oaks22.add(mImageView22_2 = itemView.findViewById(R.id.ribbon22_2));
            oaks22.add(mImageView22_3 = itemView.findViewById(R.id.ribbon22_3));
            oaks22.add(mImageView22_4 = itemView.findViewById(R.id.ribbon22_4));
            oaks22.add(mImageView22_5 = itemView.findViewById(R.id.ribbon22_5));
            oaks22.add(mImageView22_6 = itemView.findViewById(R.id.ribbon22_6));
            oaks22.add(mImageView22_7 = itemView.findViewById(R.id.ribbon22_7));
            oaks22.add(mImageView22_8 = itemView.findViewById(R.id.ribbon22_8));
            List<ImageView> oaks23 = new ArrayList<>();
            mImageView23 = itemView.findViewById(R.id.ribbon23);
            images.add(mImageView23);
            oaks23.add(mImageView23_2 = itemView.findViewById(R.id.ribbon23_2));
            oaks23.add(mImageView23_3 = itemView.findViewById(R.id.ribbon23_3));
            oaks23.add(mImageView23_4 = itemView.findViewById(R.id.ribbon23_4));
            oaks23.add(mImageView23_5 = itemView.findViewById(R.id.ribbon23_5));
            oaks23.add(mImageView23_6 = itemView.findViewById(R.id.ribbon23_6));
            oaks23.add(mImageView23_7 = itemView.findViewById(R.id.ribbon23_7));
            oaks23.add(mImageView23_8 = itemView.findViewById(R.id.ribbon23_8));
            List<ImageView> oaks24 = new ArrayList<>();
            mImageView24 = itemView.findViewById(R.id.ribbon24);
            images.add(mImageView24);
            oaks24.add(mImageView24_2 = itemView.findViewById(R.id.ribbon24_2));
            oaks24.add(mImageView24_3 = itemView.findViewById(R.id.ribbon24_3));
            oaks24.add(mImageView24_4 = itemView.findViewById(R.id.ribbon24_4));
            oaks24.add(mImageView24_5 = itemView.findViewById(R.id.ribbon24_5));
            oaks24.add(mImageView24_6 = itemView.findViewById(R.id.ribbon24_6));
            oaks24.add(mImageView24_7 = itemView.findViewById(R.id.ribbon24_7));
            oaks24.add(mImageView24_8 = itemView.findViewById(R.id.ribbon24_8));
            List<ImageView> oaks25 = new ArrayList<>();
            mImageView25 = itemView.findViewById(R.id.ribbon25);
            images.add(mImageView25);
            oaks25.add(mImageView25_2 = itemView.findViewById(R.id.ribbon25_2));
            oaks25.add(mImageView25_3 = itemView.findViewById(R.id.ribbon25_3));
            oaks25.add(mImageView25_4 = itemView.findViewById(R.id.ribbon25_4));
            oaks25.add(mImageView25_5 = itemView.findViewById(R.id.ribbon25_5));
            oaks25.add(mImageView25_6 = itemView.findViewById(R.id.ribbon25_6));
            oaks25.add(mImageView25_7 = itemView.findViewById(R.id.ribbon25_7));
            oaks25.add(mImageView25_8 = itemView.findViewById(R.id.ribbon25_8));
            List<ImageView> oaks26 = new ArrayList<>();
            mImageView26 = itemView.findViewById(R.id.ribbon26);
            images.add(mImageView26);
            oaks26.add(mImageView26_2 = itemView.findViewById(R.id.ribbon26_2));
            oaks26.add(mImageView26_3 = itemView.findViewById(R.id.ribbon26_3));
            oaks26.add(mImageView26_4 = itemView.findViewById(R.id.ribbon26_4));
            oaks26.add(mImageView26_5 = itemView.findViewById(R.id.ribbon26_5));
            oaks26.add(mImageView26_6 = itemView.findViewById(R.id.ribbon26_6));
            oaks26.add(mImageView26_7 = itemView.findViewById(R.id.ribbon26_7));
            oaks26.add(mImageView26_8 = itemView.findViewById(R.id.ribbon26_8));
            List<ImageView> oaks27 = new ArrayList<>();
            mImageView27 = itemView.findViewById(R.id.ribbon27);
            images.add(mImageView27);
            oaks27.add(mImageView27_2 = itemView.findViewById(R.id.ribbon27_2));
            oaks27.add(mImageView27_3 = itemView.findViewById(R.id.ribbon27_3));
            oaks27.add(mImageView27_4 = itemView.findViewById(R.id.ribbon27_4));
            oaks27.add(mImageView27_5 = itemView.findViewById(R.id.ribbon27_5));
            oaks27.add(mImageView27_6 = itemView.findViewById(R.id.ribbon27_6));
            oaks27.add(mImageView27_7 = itemView.findViewById(R.id.ribbon27_7));
            oaks27.add(mImageView27_8 = itemView.findViewById(R.id.ribbon27_8));
            List<ImageView> oaks28 = new ArrayList<>();
            mImageView28 = itemView.findViewById(R.id.ribbon28);
            images.add(mImageView28);
            oaks28.add(mImageView28_2 = itemView.findViewById(R.id.ribbon28_2));
            oaks28.add(mImageView28_3 = itemView.findViewById(R.id.ribbon28_3));
            oaks28.add(mImageView28_4 = itemView.findViewById(R.id.ribbon28_4));
            oaks28.add(mImageView28_5 = itemView.findViewById(R.id.ribbon28_5));
            oaks28.add(mImageView28_6 = itemView.findViewById(R.id.ribbon28_6));
            oaks28.add(mImageView28_7 = itemView.findViewById(R.id.ribbon28_7));
            oaks28.add(mImageView28_8 = itemView.findViewById(R.id.ribbon28_8));
            List<ImageView> oaks29 = new ArrayList<>();
            mImageView29 = itemView.findViewById(R.id.ribbon29);
            images.add(mImageView29);
            oaks29.add(mImageView29_2 = itemView.findViewById(R.id.ribbon29_2));
            oaks29.add(mImageView29_3 = itemView.findViewById(R.id.ribbon29_3));
            oaks29.add(mImageView29_4 = itemView.findViewById(R.id.ribbon29_4));
            oaks29.add(mImageView29_5 = itemView.findViewById(R.id.ribbon29_5));
            oaks29.add(mImageView29_6 = itemView.findViewById(R.id.ribbon29_6));
            oaks29.add(mImageView29_7 = itemView.findViewById(R.id.ribbon29_7));
            oaks29.add(mImageView29_8 = itemView.findViewById(R.id.ribbon29_8));
            List<ImageView> oaks30 = new ArrayList<>();
            mImageView30 = itemView.findViewById(R.id.ribbon30);
            images.add(mImageView30);
            oaks30.add(mImageView30_2 = itemView.findViewById(R.id.ribbon30_2));
            oaks30.add(mImageView30_3 = itemView.findViewById(R.id.ribbon30_3));
            oaks30.add(mImageView30_4 = itemView.findViewById(R.id.ribbon30_4));
            oaks30.add(mImageView30_5 = itemView.findViewById(R.id.ribbon30_5));
            oaks30.add(mImageView30_6 = itemView.findViewById(R.id.ribbon30_6));
            oaks30.add(mImageView30_7 = itemView.findViewById(R.id.ribbon30_7));
            oaks30.add(mImageView30_8 = itemView.findViewById(R.id.ribbon30_8));
            List<ImageView> oaks31 = new ArrayList<>();
            mImageView31 = itemView.findViewById(R.id.ribbon31);
            images.add(mImageView31);
            oaks31.add(mImageView31_2 = itemView.findViewById(R.id.ribbon31_2));
            oaks31.add(mImageView31_3 = itemView.findViewById(R.id.ribbon31_3));
            oaks31.add(mImageView31_4 = itemView.findViewById(R.id.ribbon31_4));
            oaks31.add(mImageView31_5 = itemView.findViewById(R.id.ribbon31_5));
            oaks31.add(mImageView31_6 = itemView.findViewById(R.id.ribbon31_6));
            oaks31.add(mImageView31_7 = itemView.findViewById(R.id.ribbon31_7));
            oaks31.add(mImageView31_8 = itemView.findViewById(R.id.ribbon31_8));
            List<ImageView> oaks32 = new ArrayList<>();
            mImageView32 = itemView.findViewById(R.id.ribbon32);
            images.add(mImageView32);
            oaks32.add(mImageView32_2 = itemView.findViewById(R.id.ribbon32_2));
            oaks32.add(mImageView32_3 = itemView.findViewById(R.id.ribbon32_3));
            oaks32.add(mImageView32_4 = itemView.findViewById(R.id.ribbon32_4));
            oaks32.add(mImageView32_5 = itemView.findViewById(R.id.ribbon32_5));
            oaks32.add(mImageView32_6 = itemView.findViewById(R.id.ribbon32_6));
            oaks32.add(mImageView32_7 = itemView.findViewById(R.id.ribbon32_7));
            oaks32.add(mImageView32_8 = itemView.findViewById(R.id.ribbon32_8));
            List<ImageView> oaks33 = new ArrayList<>();
            mImageView33 = itemView.findViewById(R.id.ribbon33);
            images.add(mImageView33);
            oaks33.add(mImageView33_2 = itemView.findViewById(R.id.ribbon33_2));
            oaks33.add(mImageView33_3 = itemView.findViewById(R.id.ribbon33_3));
            oaks33.add(mImageView33_4 = itemView.findViewById(R.id.ribbon33_4));
            oaks33.add(mImageView33_5 = itemView.findViewById(R.id.ribbon33_5));
            oaks33.add(mImageView33_6 = itemView.findViewById(R.id.ribbon33_6));
            oaks33.add(mImageView33_7 = itemView.findViewById(R.id.ribbon33_7));
            oaks33.add(mImageView33_8 = itemView.findViewById(R.id.ribbon33_8));
            List<ImageView> oaks34 = new ArrayList<>();
            mImageView34 = itemView.findViewById(R.id.ribbon34);
            images.add(mImageView34);
            oaks34.add(mImageView34_2 = itemView.findViewById(R.id.ribbon34_2));
            oaks34.add(mImageView34_3 = itemView.findViewById(R.id.ribbon34_3));
            oaks34.add(mImageView34_4 = itemView.findViewById(R.id.ribbon34_4));
            oaks34.add(mImageView34_5 = itemView.findViewById(R.id.ribbon34_5));
            oaks34.add(mImageView34_6 = itemView.findViewById(R.id.ribbon34_6));
            oaks34.add(mImageView34_7 = itemView.findViewById(R.id.ribbon34_7));
            oaks34.add(mImageView34_8 = itemView.findViewById(R.id.ribbon34_8));
            List<ImageView> oaks35 = new ArrayList<>();
            mImageView35 = itemView.findViewById(R.id.ribbon35);
            images.add(mImageView35);
            oaks35.add(mImageView35_2 = itemView.findViewById(R.id.ribbon35_2));
            oaks35.add(mImageView35_3 = itemView.findViewById(R.id.ribbon35_3));
            oaks35.add(mImageView35_4 = itemView.findViewById(R.id.ribbon35_4));
            oaks35.add(mImageView35_5 = itemView.findViewById(R.id.ribbon35_5));
            oaks35.add(mImageView35_6 = itemView.findViewById(R.id.ribbon35_6));
            oaks35.add(mImageView35_7 = itemView.findViewById(R.id.ribbon35_7));
            oaks35.add(mImageView35_8 = itemView.findViewById(R.id.ribbon35_8));
            List<ImageView> oaks36 = new ArrayList<>();
            mImageView36 = itemView.findViewById(R.id.ribbon36);
            images.add(mImageView36);
            oaks36.add(mImageView36_2 = itemView.findViewById(R.id.ribbon36_2));
            oaks36.add(mImageView36_3 = itemView.findViewById(R.id.ribbon36_3));
            oaks36.add(mImageView36_4 = itemView.findViewById(R.id.ribbon36_4));
            oaks36.add(mImageView36_5 = itemView.findViewById(R.id.ribbon36_5));
            oaks36.add(mImageView36_6 = itemView.findViewById(R.id.ribbon36_6));
            oaks36.add(mImageView36_7 = itemView.findViewById(R.id.ribbon36_7));
            oaks36.add(mImageView36_8 = itemView.findViewById(R.id.ribbon36_8));
            List<ImageView> oaks37 = new ArrayList<>();
            mImageView37 = itemView.findViewById(R.id.ribbon37);
            images.add(mImageView37);
            oaks37.add(mImageView37_2 = itemView.findViewById(R.id.ribbon37_2));
            oaks37.add(mImageView37_3 = itemView.findViewById(R.id.ribbon37_3));
            oaks37.add(mImageView37_4 = itemView.findViewById(R.id.ribbon37_4));
            oaks37.add(mImageView37_5 = itemView.findViewById(R.id.ribbon37_5));
            oaks37.add(mImageView37_6 = itemView.findViewById(R.id.ribbon37_6));
            oaks37.add(mImageView37_7 = itemView.findViewById(R.id.ribbon37_7));
            oaks37.add(mImageView37_8 = itemView.findViewById(R.id.ribbon37_8));
            List<ImageView> oaks38 = new ArrayList<>();
            mImageView38 = itemView.findViewById(R.id.ribbon38);
            images.add(mImageView38);
            oaks38.add(mImageView38_2 = itemView.findViewById(R.id.ribbon38_2));
            oaks38.add(mImageView38_3 = itemView.findViewById(R.id.ribbon38_3));
            oaks38.add(mImageView38_4 = itemView.findViewById(R.id.ribbon38_4));
            oaks38.add(mImageView38_5 = itemView.findViewById(R.id.ribbon38_5));
            oaks38.add(mImageView38_6 = itemView.findViewById(R.id.ribbon38_6));
            oaks38.add(mImageView38_7 = itemView.findViewById(R.id.ribbon38_7));
            oaks38.add(mImageView38_8 = itemView.findViewById(R.id.ribbon38_8));
            List<ImageView> oaks39 = new ArrayList<>();
            mImageView39 = itemView.findViewById(R.id.ribbon39);
            images.add(mImageView39);
            oaks39.add(mImageView39_2 = itemView.findViewById(R.id.ribbon39_2));
            oaks39.add(mImageView39_3 = itemView.findViewById(R.id.ribbon39_3));
            oaks39.add(mImageView39_4 = itemView.findViewById(R.id.ribbon39_4));
            oaks39.add(mImageView39_5 = itemView.findViewById(R.id.ribbon39_5));
            oaks39.add(mImageView39_6 = itemView.findViewById(R.id.ribbon39_6));
            oaks39.add(mImageView39_7 = itemView.findViewById(R.id.ribbon39_7));
            oaks39.add(mImageView39_8 = itemView.findViewById(R.id.ribbon39_8));
            List<ImageView> oaks40 = new ArrayList<>();
            mImageView40 = itemView.findViewById(R.id.ribbon40);
            images.add(mImageView40);
            oaks40.add(mImageView40_2 = itemView.findViewById(R.id.ribbon40_2));
            oaks40.add(mImageView40_3 = itemView.findViewById(R.id.ribbon40_3));
            oaks40.add(mImageView40_4 = itemView.findViewById(R.id.ribbon40_4));
            oaks40.add(mImageView40_5 = itemView.findViewById(R.id.ribbon40_5));
            oaks40.add(mImageView40_6 = itemView.findViewById(R.id.ribbon40_6));
            oaks40.add(mImageView40_7 = itemView.findViewById(R.id.ribbon40_7));
            oaks40.add(mImageView40_8 = itemView.findViewById(R.id.ribbon40_8));
            oaks.add(oaks1);
            oaks.add(oaks2);
            oaks.add(oaks3);
            oaks.add(oaks4);
            oaks.add(oaks5);
            oaks.add(oaks6);
            oaks.add(oaks7);
            oaks.add(oaks8);
            oaks.add(oaks9);
            oaks.add(oaks10);
            oaks.add(oaks11);
            oaks.add(oaks12);
            oaks.add(oaks13);
            oaks.add(oaks14);
            oaks.add(oaks15);
            oaks.add(oaks16);
            oaks.add(oaks17);
            oaks.add(oaks18);
            oaks.add(oaks19);
            oaks.add(oaks20);
            oaks.add(oaks21);
            oaks.add(oaks22);
            oaks.add(oaks23);
            oaks.add(oaks24);
            oaks.add(oaks25);
            oaks.add(oaks26);
            oaks.add(oaks27);
            oaks.add(oaks28);
            oaks.add(oaks29);
            oaks.add(oaks30);
            oaks.add(oaks31);
            oaks.add(oaks32);
            oaks.add(oaks33);
            oaks.add(oaks34);
            oaks.add(oaks35);
            oaks.add(oaks36);
            oaks.add(oaks37);
            oaks.add(oaks38);
            oaks.add(oaks39);
            oaks.add(oaks40);

            RibbonAdapter40.mImageView1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 0);
                }
            });

            RibbonAdapter40.mImageView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 1);
                }
            });

            RibbonAdapter40.mImageView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 2);
                }
            });

            RibbonAdapter40.mImageView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 3);
                }
            });

            RibbonAdapter40.mImageView5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 4);
                }
            });

            RibbonAdapter40.mImageView6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 5);
                }
            });

            RibbonAdapter40.mImageView7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 6);
                }
            });

            RibbonAdapter40.mImageView8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 7);
                }
            });

            RibbonAdapter40.mImageView9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 8);
                }
            });

            RibbonAdapter40.mImageView10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 9);
                }
            });

            RibbonAdapter40.mImageView11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 10);
                }
            });

            RibbonAdapter40.mImageView12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 11);
                }
            });

            RibbonAdapter40.mImageView13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 12);
                }
            });

            RibbonAdapter40.mImageView14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 13);
                }
            });

            RibbonAdapter40.mImageView15.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 14);
                }
            });

            RibbonAdapter40.mImageView16.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 15);
                }
            });

            RibbonAdapter40.mImageView17.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 16);
                }
            });

            RibbonAdapter40.mImageView18.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 17);
                }
            });

            RibbonAdapter40.mImageView19.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 18);
                }
            });

            RibbonAdapter40.mImageView20.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 19);
                }
            });

            RibbonAdapter40.mImageView21.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 20);
                }
            });

            RibbonAdapter40.mImageView22.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 21);
                }
            });

            RibbonAdapter40.mImageView23.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 22);
                }
            });

            RibbonAdapter40.mImageView24.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 23);
                }
            });

            RibbonAdapter40.mImageView25.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 24);
                }
            });

            RibbonAdapter40.mImageView26.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 25);
                }
            });

            RibbonAdapter40.mImageView27.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 26);
                }
            });

            RibbonAdapter40.mImageView28.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 27);
                }
            });

            RibbonAdapter40.mImageView29.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 28);
                }
            });

            RibbonAdapter40.mImageView30.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 29);
                }
            });

            RibbonAdapter40.mImageView31.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 30);
                }
            });

            RibbonAdapter40.mImageView32.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 31);
                }
            });

            RibbonAdapter40.mImageView33.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 32);
                }
            });

            RibbonAdapter40.mImageView34.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 33);
                }
            });

            RibbonAdapter40.mImageView35.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 34);
                }
            });

            RibbonAdapter40.mImageView36.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 35);
                }
            });

            RibbonAdapter40.mImageView37.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 36);
                }
            });

            RibbonAdapter40.mImageView38.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 37);
                }
            });

            RibbonAdapter40.mImageView39.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 38);
                }
            });

            RibbonAdapter40.mImageView40.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 39);
                }
            });

        }
    }

    public RibbonAdapter40(ArrayList<RibbonItem> ribbonList) {
        mRibbonList = ribbonList;
    }
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof RibbonAdapter40.Ribbon40Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position); mImageView1.setImageResource(currentItem.getImageResource1());
            mImageView2.setImageResource(currentItem.getImageResource2());
            mImageView3.setImageResource(currentItem.getImageResource3());
            mImageView4.setImageResource(currentItem.getImageResource4());
            mImageView5.setImageResource(currentItem.getImageResource5());
            mImageView6.setImageResource(currentItem.getImageResource6());
            mImageView7.setImageResource(currentItem.getImageResource7());
            mImageView8.setImageResource(currentItem.getImageResource8());
            mImageView9.setImageResource(currentItem.getImageResource9());
            mImageView10.setImageResource(currentItem.getImageResource10());
            mImageView11.setImageResource(currentItem.getImageResource11());
            mImageView12.setImageResource(currentItem.getImageResource12());
            mImageView13.setImageResource(currentItem.getImageResource13());
            mImageView14.setImageResource(currentItem.getImageResource14());
            mImageView15.setImageResource(currentItem.getImageResource15());
            mImageView16.setImageResource(currentItem.getImageResource16());
            mImageView17.setImageResource(currentItem.getImageResource17());
            mImageView18.setImageResource(currentItem.getImageResource18());
            mImageView19.setImageResource(currentItem.getImageResource19());
            mImageView20.setImageResource(currentItem.getImageResource20());
            mImageView21.setImageResource(currentItem.getImageResource21());
            mImageView22.setImageResource(currentItem.getImageResource22());
            mImageView23.setImageResource(currentItem.getImageResource23());
            mImageView24.setImageResource(currentItem.getImageResource24());
            mImageView25.setImageResource(currentItem.getImageResource25());
            mImageView26.setImageResource(currentItem.getImageResource26());
            mImageView27.setImageResource(currentItem.getImageResource27());
            mImageView28.setImageResource(currentItem.getImageResource28());
            mImageView29.setImageResource(currentItem.getImageResource29());
            mImageView30.setImageResource(currentItem.getImageResource30());
            mImageView31.setImageResource(currentItem.getImageResource31());
            mImageView32.setImageResource(currentItem.getImageResource32());
            mImageView33.setImageResource(currentItem.getImageResource33());
            mImageView34.setImageResource(currentItem.getImageResource34());
            mImageView35.setImageResource(currentItem.getImageResource35());
            mImageView36.setImageResource(currentItem.getImageResource36());
            mImageView37.setImageResource(currentItem.getImageResource37());
            mImageView38.setImageResource(currentItem.getImageResource38());
            mImageView39.setImageResource(currentItem.getImageResource39());
            mImageView40.setImageResource(currentItem.getImageResource40());

        }
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int ViewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item40, parent, false);
        return new RibbonAdapter40.Ribbon40Holder(view, mListener, images, oaks);
    }

    public static void showPopup(View v, ArrayList<List<ImageView>> oaks, int ribbonIndex){
        System.out.println();
        for(int i = 0; i < oaks.get(ribbonIndex).size() ; i++) {
            oaks.get(ribbonIndex).get(i).setImageResource(android.R.color.transparent);
        }
        System.out.println("oaks"+oaks);
        PopupMenu oakMenu = new PopupMenu(mContext, v);
        oakMenu.getMenuInflater().inflate(R.menu.oak_leaf_menu, oakMenu.getMenu());
        oakMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item){
                switch (item.getItemId()) {
                    case R.id.item1:
                        Toast.makeText(context, "Item 1 clicked", Toast.LENGTH_SHORT).show();
                        oaks.get(ribbonIndex).get(0).setImageResource(R.drawable.ic_bronze_oakleaf_3d);
                        return true;
                    case R.id.item2:
                        Toast.makeText(context, "Item 2 clicked", Toast.LENGTH_SHORT).show();
                        oaks.get(ribbonIndex).get(1).setImageResource(R.drawable.ic_bronze_oakleaf_3d);
                        oaks.get(ribbonIndex).get(2).setImageResource(R.drawable.ic_bronze_oakleaf_3d);
                        return true;
                    case R.id.item3:
                        Toast.makeText(context, "Item 3 clicked", Toast.LENGTH_SHORT).show();
                        oaks.get(ribbonIndex).get(0).setImageResource(R.drawable.ic_bronze_oakleaf_3d);
                        oaks.get(ribbonIndex).get(3).setImageResource(R.drawable.ic_bronze_oakleaf_3d);
                        oaks.get(ribbonIndex).get(4).setImageResource(R.drawable.ic_bronze_oakleaf_3d);
                        return true;
                    case R.id.item4:
                        Toast.makeText(context, "Item 4 clicked", Toast.LENGTH_SHORT).show();
                        oaks.get(ribbonIndex).get(1).setImageResource(R.drawable.ic_bronze_oakleaf_3d);
                        oaks.get(ribbonIndex).get(2).setImageResource(R.drawable.ic_bronze_oakleaf_3d);
                        oaks.get(ribbonIndex).get(5).setImageResource(R.drawable.ic_bronze_oakleaf_3d);
                        oaks.get(ribbonIndex).get(6).setImageResource(R.drawable.ic_bronze_oakleaf_3d);
                        return true;
                    default:
                        return false;
                }
            };
        });
        oakMenu.show();
    }
    @Override
    public int getItemViewType(int position) {
        RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
        if (currentItem instanceof RibbonItem.RibbonItem40) {return 40;}
        return 0;
    }
    @Override
    public int getItemCount() {
        return mRibbonList.size();
    }
}

