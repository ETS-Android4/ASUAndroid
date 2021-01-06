
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

public class RibbonAdapter18 extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
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

    public ArrayList<RibbonItem> RibbonAdapter18(ArrayList<RibbonItem> mRibbonList) {
        return mRibbonList;
    }
    public interface OnItemClickListener { void onEditRibbonClick(int ribbon, int position);}
    public void setOnItemClickListener(RibbonAdapter18.OnItemClickListener listener) { mListener = listener; }

    public static class Ribbon18Holder extends RecyclerView.ViewHolder {

        public Ribbon18Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images, ArrayList<List<ImageView>> oaks) {
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

            RibbonAdapter18.mImageView1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 0);
                }
            });

            RibbonAdapter18.mImageView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 1);
                }
            });

            RibbonAdapter18.mImageView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 2);
                }
            });

            RibbonAdapter18.mImageView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 3);
                }
            });

            RibbonAdapter18.mImageView5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 4);
                }
            });

            RibbonAdapter18.mImageView6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 5);
                }
            });

            RibbonAdapter18.mImageView7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 6);
                }
            });

            RibbonAdapter18.mImageView8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 7);
                }
            });

            RibbonAdapter18.mImageView9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 8);
                }
            });

            RibbonAdapter18.mImageView10.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 9);
                }
            });

            RibbonAdapter18.mImageView11.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 10);
                }
            });

            RibbonAdapter18.mImageView12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 11);
                }
            });

            RibbonAdapter18.mImageView13.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 12);
                }
            });

            RibbonAdapter18.mImageView14.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 13);
                }
            });

            RibbonAdapter18.mImageView15.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 14);
                }
            });

            RibbonAdapter18.mImageView16.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 15);
                }
            });

            RibbonAdapter18.mImageView17.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 16);
                }
            });

            RibbonAdapter18.mImageView18.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 17);
                }
            });

        }
    }

    public RibbonAdapter18(ArrayList<RibbonItem> ribbonList) {
        mRibbonList = ribbonList;
    }
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof RibbonAdapter18.Ribbon18Holder) {
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

        }
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int ViewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item18, parent, false);
        return new RibbonAdapter18.Ribbon18Holder(view, mListener, images, oaks);
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
        if (currentItem instanceof RibbonItem.RibbonItem18) {return 18;}
        return 0;
    }
    @Override
    public int getItemCount() {
        return mRibbonList.size();
    }
}

