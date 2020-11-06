package com.example.asuandroid.outfitAdapters;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

import com.example.asuandroid.R;
import com.example.asuandroid.outfitfragments.AwardItem;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
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
    int selectedPosition=-1;

    public AwardAdapter(ArrayList<AwardItem> awardList) {
        mAwardList = awardList;
    }

    public interface OnItemClickListener {
        void onAddRibbonClick(int ribbon, int position, boolean isRibbonOn);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;
    }

    @Override
    public AwardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.award_item, parent, false);
        AwardViewHolder evh = new AwardViewHolder(v, mListener);
        return evh;
    }

    @Override
    public void onBindViewHolder(AwardViewHolder holder, int position) {
        final AwardItem currentItem = (AwardItem) mAwardList.get(position);
        holder.setIsRecyclable(false);
        holder.mImageView.setImageResource(currentItem.getImageResource());
        holder.mTextView1.setText(currentItem.getText1());
        holder.mTextView2.setText(currentItem.getText2());
        //holder.itemView.setBackgroundColor(AwardItem.isSelected() ? Color.YELLOW: Color.WHITE);
        //holder.mRibbonAnim.setImageResource(currentItem.getmRibbonAddResource());
        holder.mTextView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentItem.setSelected(!currentItem.isSelected());
                holder.itemView.setBackgroundColor(currentItem.isSelected() ? Color.YELLOW : Color.WHITE);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mAwardList.size();
    }

        public class AwardViewHolder extends RecyclerView.ViewHolder {
            public boolean isRibbonOn = false;
            public ImageView mImageView;
            public int ribbonPath;
            public TextView mTextView1;
            public TextView mTextView2;
            //public ImageView mRibbonAdd;
            public ImageView mRibbonAnim;
            public int mAnimate;



            @SuppressLint("ClickableViewAccessibility")
            public AwardViewHolder(View itemView, OnItemClickListener listener) {
                super(itemView);
                mImageView = itemView.findViewById(R.id.imageView);
                mTextView1 = itemView.findViewById(R.id.textView);
                mTextView2 = itemView.findViewById(R.id.textView2);
                mRibbonAnim = itemView.findViewById(R.id.img_addRibbon);
                mAnimate = R.drawable.ribbon_anim;
                }
            }



}