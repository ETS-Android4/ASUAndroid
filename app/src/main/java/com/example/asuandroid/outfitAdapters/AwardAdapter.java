package com.example.asuandroid.outfitAdapters;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import com.example.asuandroid.R;
import com.example.asuandroid.outfitfragments.AwardItem;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.net.CookieHandler;
import java.util.ArrayList;

public class AwardAdapter extends RecyclerView.Adapter<AwardAdapter.AwardViewHolder> {
    //private ImageView mRibbonAdd;
    public ArrayList<AwardItem> mAwardList;
    private boolean isRibbonOn = false;
    public static ArrayList<Integer> awardImageList = new ArrayList<>();
    //private CompoundButton.OnCheckedChangeListener;
    private OnItemClickListener mListener;

    public interface OnItemClickListener {
        void onAddRibbonClick(int ribbon, int position, boolean isRibbonOn, ImageView mRibbonAdd);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;
    }

    public class AwardViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageView;
        public int ribbonPath;
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
            mRibbonAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    {
                        if ((listener != null)) {
                            if(!isRibbonOn){
                                isRibbonOn = true;

                            } else if( isRibbonOn){
                                isRibbonOn = false;
                            }
                            int position = getAdapterPosition();
                            int ribbon = mAwardList.get(position).getImageResource();
                            if (position != RecyclerView.NO_POSITION) {
                                listener.onAddRibbonClick(ribbon, position, isRibbonOn, mRibbonAdd);
                            }
                            System.out.println("youclickedme" + ribbon);
                        }
                    }
                }
            });
        }
    }


    public AwardAdapter(ArrayList<AwardItem> awardList) {
        mAwardList = awardList;
    }
    @Override
    public AwardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.award_item, parent, false);
        AwardViewHolder evh = new AwardViewHolder(v, mListener);
        evh.setIsRecyclable(false);
        return evh;
    }
    @Override
    public void onBindViewHolder(AwardViewHolder holder, int position) {
        AwardItem currentItem = (AwardItem) mAwardList.get(position);
        holder.mImageView.setImageResource(currentItem.getImageResource());
        holder.mTextView1.setText(currentItem.getText1());
        holder.mTextView2.setText(currentItem.getText2());

        holder.mRibbonAdd.setImageResource(currentItem.getmRibbonAddResource());

        //holder.mRibbonSwitch.setChecked(currentItem.getSwitch1(position).isChecked());



    }
    @Override
    public int getItemCount() {
        return mAwardList.size();
    }

}