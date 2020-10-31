package com.example.asuandroid.outfitAdapters;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import com.example.asuandroid.R;
import com.example.asuandroid.outfitfragments.RibbonItem;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RibbonAdapter extends RecyclerView.Adapter<RibbonAdapter.RibbonViewHolder> {
    private ArrayList<RibbonItem> mRibbonList;
    //private CompoundButton.OnCheckedChangeListener;
    private OnItemClickListener mListener;

    public interface OnItemClickListener {
        void onAddRibbonClick(String ribbon);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;
    }

    public static class RibbonViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageView1;
        public ImageView mImageView2;
        public ImageView mImageView3;
        public ImageView mImageView4;
        public ImageView mImageView5;
        public ImageView mImageView6;
        public ImageView mImageView7;
        public ImageView mImageView8;
        public ImageView mImageView9;
        public ImageView mImageView10;
        public ImageView mImageView11;
        public ImageView mImageView12;

        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public RibbonViewHolder(View itemView, OnItemClickListener listener) {
            super(itemView);
            mImageView1 = itemView.findViewById(R.id.ribbon1);
            mImageView2 = itemView.findViewById(R.id.ribbon2);
            mImageView3 = itemView.findViewById(R.id.ribbon3);
            mImageView4 = itemView.findViewById(R.id.ribbon4);
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            mImageView8 = itemView.findViewById(R.id.ribbon8);
            mImageView9 = itemView.findViewById(R.id.ribbon9);
            mImageView10 = itemView.findViewById(R.id.ribbon10);
            mImageView11 = itemView.findViewById(R.id.ribbon11);
            mImageView12 = itemView.findViewById(R.id.ribbon12);
        }
    }
    public RibbonAdapter(ArrayList<RibbonItem> ribbonList) {
        mRibbonList = ribbonList;
    }

    @Override
    public RibbonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item, parent, false);
        RibbonViewHolder evh = new RibbonViewHolder(v, mListener);
        return evh;
    }

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
    }
    @Override
    public int getItemCount() {
        return mRibbonList.size();
    }
}