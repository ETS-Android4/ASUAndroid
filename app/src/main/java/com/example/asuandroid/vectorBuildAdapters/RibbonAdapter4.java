
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

import com.example.asuandroid.R;
import com.example.asuandroid.threads.MultithreadingDemo;
import com.example.asuandroid.vectorItems.RibbonItem;

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

public class RibbonAdapter4 extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
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

    public ArrayList<RibbonItem> RibbonAdapter4(ArrayList<RibbonItem> mRibbonList) {
        return mRibbonList;
    }
    public interface OnItemClickListener { void onEditRibbonClick(int ribbon, int position);}
    public void setOnItemClickListener(RibbonAdapter4.OnItemClickListener listener) { mListener = listener; }

    public static class Ribbon4Holder extends RecyclerView.ViewHolder {

        public Ribbon4Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images, ArrayList<List<ImageView>> oaks) {
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
            oaks.add(oaks1);
            oaks.add(oaks2);
            oaks.add(oaks3);
            oaks.add(oaks4);

            RibbonAdapter4.mImageView1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 0);
                }
            });

            RibbonAdapter4.mImageView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 1);
                }
            });

            RibbonAdapter4.mImageView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 2);
                }
            });

            RibbonAdapter4.mImageView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 3);
                }
            });

        }
    }

    public RibbonAdapter4(ArrayList<RibbonItem> ribbonList) {
        mRibbonList = ribbonList;
    }
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof RibbonAdapter4.Ribbon4Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position); mImageView1.setImageResource(currentItem.getImageResource1());
            mImageView2.setImageResource(currentItem.getImageResource2());
            mImageView3.setImageResource(currentItem.getImageResource3());
            mImageView4.setImageResource(currentItem.getImageResource4());

        }
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int ViewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item4, parent, false);
        return new RibbonAdapter4.Ribbon4Holder(view, mListener, images, oaks);
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
        if (currentItem instanceof RibbonItem.RibbonItem4) {return 4;}
        return 0;
    }
    @Override
    public int getItemCount() {
        return mRibbonList.size();
    }
}
