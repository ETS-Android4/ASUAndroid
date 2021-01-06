
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

public class RibbonAdapter2 extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
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

    public ArrayList<RibbonItem> RibbonAdapter2(ArrayList<RibbonItem> mRibbonList) {
        return mRibbonList;
    }
    public interface OnItemClickListener { void onEditRibbonClick(int ribbon, int position);}
    public void setOnItemClickListener(RibbonAdapter2.OnItemClickListener listener) { mListener = listener; }

    public static class Ribbon2Holder extends RecyclerView.ViewHolder {

        public Ribbon2Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images, ArrayList<List<ImageView>> oaks) {
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
            oaks.add(oaks1);
            oaks.add(oaks2);

            RibbonAdapter2.mImageView1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 0);
                }
            });

            RibbonAdapter2.mImageView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    showPopup(view, oaks, 1);
                }
            });

        }
    }

    public RibbonAdapter2(ArrayList<RibbonItem> ribbonList) {
        mRibbonList = ribbonList;
    }
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof RibbonAdapter2.Ribbon2Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position); mImageView1.setImageResource(currentItem.getImageResource1());
            mImageView2.setImageResource(currentItem.getImageResource2());

        }
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int ViewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item2, parent, false);
        return new RibbonAdapter2.Ribbon2Holder(view, mListener, images, oaks);
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
        if (currentItem instanceof RibbonItem.RibbonItem2) {return 2;}
        return 0;
    }
    @Override
    public int getItemCount() {
        return mRibbonList.size();
    }
}
