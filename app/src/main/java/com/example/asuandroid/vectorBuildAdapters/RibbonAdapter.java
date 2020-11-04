package com.example.asuandroid.vectorBuildAdapters;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.view.View;
import com.example.asuandroid.R;
import com.example.asuandroid.outfitfragments.AwardItem;

import androidx.annotation.NonNull;
import androidx.collection.ArraySet;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RibbonAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public ArrayList<RibbonItem> mRibbonList;
    public static ArraySet<ImageView> images = new ArraySet<>();
    //private CompoundButton.OnCheckedChangeListener;
    private OnItemClickListener mListener;


    public ArrayList<RibbonItem> RibbonAdapter(ArrayList<RibbonItem> mRibbonList) {
        return mRibbonList;
    }


    public interface OnItemClickListener {
        void onAddRibbonClick(String ribbon);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;
    }
    //first ViewHolder
    public static class RibbonFirstHolder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
        public ImageView mImageView1;


        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public RibbonFirstHolder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
            super(itemView);
            this.images = images;
            mImageView1 = itemView.findViewById(R.id.ribbon1);
            this.images.add(mImageView1);
        }
    }
    public static class RibbonSecondHolder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
        public ImageView mImageView1;
        public ImageView mImageView2;

        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public RibbonSecondHolder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
            super(itemView);
            this.images = images;
            mImageView1 = itemView.findViewById(R.id.ribbon1);
            this.images.add(mImageView1);
            mImageView2 = itemView.findViewById(R.id.ribbon2);
            this.images.add(mImageView2);
        }
    }
        public static class RibbonThirdHolder extends RecyclerView.ViewHolder {
            private final ArraySet<ImageView> images;
            public ImageView mImageView1;
            public ImageView mImageView2;
            public ImageView mImageView3;

            @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
            public RibbonThirdHolder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
                super(itemView);
                this.images = images;
                mImageView1 = itemView.findViewById(R.id.ribbon1);
                this.images.add(mImageView1);
                mImageView2 = itemView.findViewById(R.id.ribbon2);
                this.images.add(mImageView2);
                mImageView3 = itemView.findViewById(R.id.ribbon3);
                this.images.add(mImageView3);
            }
        }
        public static class RibbonFourthHolder extends RecyclerView.ViewHolder {
            private final ArraySet<ImageView> images;
            public ImageView mImageView1;
            public ImageView mImageView2;
            public ImageView mImageView3;
            public ImageView mImageView4;

            @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
            public RibbonFourthHolder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
                super(itemView);
                this.images = images;
                mImageView1 = itemView.findViewById(R.id.ribbon1);
                this.images.add(mImageView1);
                mImageView2 = itemView.findViewById(R.id.ribbon2);
                this.images.add(mImageView2);
                mImageView3 = itemView.findViewById(R.id.ribbon3);
                this.images.add(mImageView4);
                mImageView4 = itemView.findViewById(R.id.ribbon4);
                this.images.add(mImageView4);

            }
        }
        public static class RibbonFifthHolder extends RecyclerView.ViewHolder {
            private final ArraySet<ImageView> images;
            public ImageView mImageView1;
            public ImageView mImageView2;
            public ImageView mImageView3;
            public ImageView mImageView4;
            public ImageView mImageView5;

            @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
            public RibbonFifthHolder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
                super(itemView);
                this.images = images;
                mImageView1 = itemView.findViewById(R.id.ribbon1);
                this.images.add(mImageView1);
                mImageView2 = itemView.findViewById(R.id.ribbon2);
                this.images.add(mImageView2);
                mImageView3 = itemView.findViewById(R.id.ribbon3);
                this.images.add(mImageView3);
                mImageView4 = itemView.findViewById(R.id.ribbon4);
                this.images.add(mImageView4);
                mImageView5 = itemView.findViewById(R.id.ribbon3);
                this.images.add(mImageView5);

            }
        }

    public RibbonAdapter(ArrayList<RibbonItem> ribbonList) {
        mRibbonList = ribbonList;
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int ViewType) {
        View view = null;
        System.out.println("Here is the viewType" + ViewType);
        if (ViewType == 1) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item1, parent, false);
            return new RibbonFirstHolder(view, mListener, images);
        } if (ViewType == 2) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item2, parent, false);
            return new RibbonSecondHolder(view, mListener, images);
        } if (ViewType == 3) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item3, parent, false);
            return new RibbonThirdHolder(view, mListener, images);
        } if (ViewType == 4) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item4, parent, false);
            return new RibbonFourthHolder(view, mListener, images);
        } if (ViewType == 5) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item5, parent, false);
            return new RibbonFifthHolder(view, mListener, images);
        }
        return null;


    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof RibbonFirstHolder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((RibbonFirstHolder) holder).mImageView1.setImageResource(currentItem.getImageResource1());
        }
        else if (holder instanceof RibbonSecondHolder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((RibbonSecondHolder) holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((RibbonSecondHolder) holder).mImageView2.setImageResource(currentItem.getImageResource2());
        }
        else if (holder instanceof RibbonThirdHolder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((RibbonThirdHolder) holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((RibbonThirdHolder) holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((RibbonThirdHolder) holder).mImageView2.setImageResource(currentItem.getImageResource3());
        }
        else if (holder instanceof RibbonFourthHolder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((RibbonFourthHolder) holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((RibbonFourthHolder) holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((RibbonFourthHolder) holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((RibbonFourthHolder) holder).mImageView4.setImageResource(currentItem.getImageResource4());
        }
        else if (holder instanceof RibbonFifthHolder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((RibbonFifthHolder) holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((RibbonFifthHolder) holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((RibbonFifthHolder) holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((RibbonFifthHolder) holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((RibbonFifthHolder) holder).mImageView5.setImageResource(currentItem.getImageResource5());
        }
    }
/*
    @Override
    public void onBindViewHolder(RibbonViewHolder holder, int position) {
        RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
        holder.mImageView1.setImageResource(currentItem.getImageResource1());
        holder.mImageView2.setImageResource(currentItem.getImageResource2());
        holder.mImageView3.setImageResource(currentItem.getImageResource3());
        holder.mImageView4.setImageResource(currentItem.getImageResource4());
        holder.mImageView5.setImageResource(currentItem.getImageResource5());
        holder.mImageView6.setImageResource(currentItem.getImageResource6());
        holder.mImageView7.setImageResource(currentItem.getImageResource7());
        holder.mImageView8.setImageResource(currentItem.getImageResource8());
        holder.mImageView9.setImageResource(currentItem.getImageResource9());
        holder.mImageView10.setImageResource(currentItem.getImageResource10());
        holder.mImageView11.setImageResource(currentItem.getImageResource11());
        holder.mImageView12.setImageResource(currentItem.getImageResource12());
        //holder.mRibbonSwitch.setChecked(currentItem.getSwitch1(position).isChecked());
    }*/

    @Override
    public int getItemViewType(int position) {
        RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
        if (currentItem instanceof RibbonItem.RibbonItem1) {
            return 1;
        }
        if (currentItem instanceof RibbonItem.RibbonItem2) {
            return 2;
        }
        if (currentItem instanceof RibbonItem.RibbonItem3) {
            return 3;
        }
        if (currentItem instanceof RibbonItem.RibbonItem4) {
            return 4;
        }
        if (currentItem instanceof RibbonItem.RibbonItem5) {
            return 5;
        }
        return 0;
    }

    @Override
    public int getItemCount() {
        return mRibbonList.size();
    }
}