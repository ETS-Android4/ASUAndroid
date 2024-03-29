package com.example.asuandroid.outfitAdapters;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import com.example.asuandroid.R;
import com.example.asuandroid.vectorItems.RibbonCardItem;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RibbonCardAdapter extends RecyclerView.Adapter<RibbonCardAdapter.AwardViewHolder> {
    public ArrayList<RibbonCardItem> mAwardList;
    private OnItemClickListener mListener;

    public interface OnItemClickListener { void onAddRibbonClick(int ribbon, int position, boolean isRibbonOn);}
    public void setOnItemClickListener(OnItemClickListener listener) { mListener = listener; }

    public class AwardViewHolder extends RecyclerView.ViewHolder {
        public boolean isRibbonOn = false;
        public ImageView mImageView;
        public TextView mTextView1;
        public TextView mTextView2;
        public ImageView mRibbonAdd;
        @SuppressLint("ClickableViewAccessibility")
        public AwardViewHolder(View itemView, OnItemClickListener listener) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imageView);
            mTextView1 = itemView.findViewById(R.id.textView);
            mTextView2 = itemView.findViewById(R.id.textView2);
            mRibbonAdd = itemView.findViewById(R.id.img_addRibbon);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (!isRibbonOn) {
                        isRibbonOn = true;

                        itemView.setBackgroundColor(Color.CYAN);
                        ImageView checkyImage = (ImageView) v.findViewById(R.id.img_addRibbon);
                        checkyImage.setBackgroundResource(R.drawable.ribbon_anim);
                        AnimationDrawable checkyAnimation = (AnimationDrawable) checkyImage.getBackground();
                        checkyAnimation.start();
                    } else if (isRibbonOn = true) {
                        isRibbonOn = false;

                        itemView.setBackgroundColor(Color.WHITE);
                        ImageView checkyImage = (ImageView) v.findViewById(R.id.img_addRibbon);
                        checkyImage.setBackgroundResource(R.drawable.ribbon_anim_return);
                        AnimationDrawable checkyAnimation = (AnimationDrawable) checkyImage.getBackground();
                        checkyAnimation.start();
                    }
                    {
                        if ((listener != null)) {
                            int position = getAdapterPosition();
                            int ribbon = mAwardList.get(position).getImageResource();
                            if (position != RecyclerView.NO_POSITION) {
                                listener.onAddRibbonClick(ribbon, position, isRibbonOn);
                            }
                            System.out.println("ribbon:" + ribbon);
                        }
                    }
                }
            });
        }
    }
    public RibbonCardAdapter(ArrayList<RibbonCardItem> awardList) {
        mAwardList = awardList;
    }
    @Override
    public AwardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.award_item, parent, false);
        AwardViewHolder evh = new AwardViewHolder(v, mListener);
        //evh.setIsRecyclable(false); BAD
        return evh;
    }
    @Override
    public void onBindViewHolder(AwardViewHolder holder, int position) {
        RibbonCardItem currentItem = (RibbonCardItem) mAwardList.get(position);
        holder.mImageView.setImageResource(currentItem.getImageResource());
        holder.mTextView1.setText(currentItem.getText1());
        holder.mTextView2.setText(currentItem.getText2());
        //holder.mRibbonSwitch.setChecked(currentItem.getSwitch1(position).isChecked());
    }
    @Override
    public int getItemCount() {
        return mAwardList.size();
    }
    @Override
    public int getItemViewType(int position) {
        return position;
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
}