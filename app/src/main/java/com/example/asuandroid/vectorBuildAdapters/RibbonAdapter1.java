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

public class RibbonAdapter1 extends RecyclerView.Adapter<RecyclerView.ViewHolder>  {

    public static ArrayList<RibbonItem> mRibbonList;
    public static ArraySet<ImageView> images = new ArraySet<ImageView>();
    public static ArrayList<List<ImageView>> oaks = new ArrayList<>();
    public static List toPopup = new ArrayList<>();
    public static ArraySet<ImageView> currentOaks = new ArraySet<>();
    //private CompoundButton.OnCheckedChangeListener;
    private OnItemClickListener mListener;
    private static Context mContext = context;



    public ArrayList<RibbonItem> RibbonAdapter1(ArrayList<RibbonItem> mRibbonList) {
        return mRibbonList;
    }
    public interface OnItemClickListener { void onEditRibbonClick(int ribbon, int position);}
    public void setOnItemClickListener(RibbonAdapter1.OnItemClickListener listener) {
        mListener = listener;
    }

    //first ViewHolder
    public static class Ribbon1Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
        private final ArrayList<List<ImageView>> oaks;
        public static ImageView mImageView1;
        public static ImageView mImageView1_2;
        public static ImageView mImageView1_3;
        public static ImageView mImageView1_4;
        public static ImageView mImageView1_5;
        public static ImageView mImageView1_6;
        public static ImageView mImageView1_7;
        public static ImageView mImageView1_8;

        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon1Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images, ArrayList<List<ImageView>> oaks) {
            super(itemView);
            List<ImageView> oaks1 = new ArrayList<>();
            List<ImageView> oaks2 = new ArrayList<>();
            this.images = images;
            this.oaks = oaks;
            mImageView1 = itemView.findViewById(R.id.ribbon1);
            mImageView1_2 = itemView.findViewById(R.id.ribbon1_2);
            mImageView1_3 = itemView.findViewById(R.id.ribbon1_3);
            mImageView1_4 = itemView.findViewById(R.id.ribbon1_4);
            mImageView1_5 = itemView.findViewById(R.id.ribbon1_5);
            mImageView1_6 = itemView.findViewById(R.id.ribbon1_6);
            mImageView1_7 = itemView.findViewById(R.id.ribbon1_7);
            mImageView1_8 = itemView.findViewById(R.id.ribbon1_8);
            this.images.add(mImageView1);
            oaks1.add(mImageView1_2);
            oaks1.add(mImageView1_3);
            oaks1.add(mImageView1_4);
            oaks1.add(mImageView1_5);
            oaks1.add(mImageView1_6);
            oaks1.add(mImageView1_7);
            oaks1.add(mImageView1_8);
            oaks.add(oaks1);
            System.out.println(""+oaks1);
            System.out.println(""+oaks);
            mImageView1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if ((listener != null)) {
                        int position = getAdapterPosition();
                        int ribbon = mRibbonList.get(position).getImageResource1();
                        if (position != RecyclerView.NO_POSITION) {
                            listener.onEditRibbonClick(ribbon, position);
                        }
                        System.out.println("youclickedme" + ribbon);
                    }
                }
            });
        }
    }
    public RibbonAdapter1(ArrayList<RibbonItem> ribbonList) {
        mRibbonList = ribbonList;
    }
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int ViewType) {
        View view = null;
        System.out.println("Here is the viewType" + ViewType);
        if (ViewType == 1) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item1, parent, false);
            return new RibbonAdapter1.Ribbon1Holder(view, mListener, images, oaks);
        }
        return null;
    }
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof RibbonAdapter1.Ribbon1Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((RibbonAdapter1.Ribbon1Holder) holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((RibbonAdapter1.Ribbon1Holder) holder).mImageView1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    System.out.println("Oaks before" + oaks);
                    showPopup(view, oaks, 0);
                }
            });
        }
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
                    public boolean onMenuItemClick(MenuItem item) {
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
                    }
                });
                oakMenu.show();
            }
        @Override
        public int getItemViewType(int position) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            if (currentItem instanceof RibbonItem.RibbonItem1) {return 1;}
            return 0;
        }

        @Override
        public int getItemCount() {
            return mRibbonList.size();
        }
    }