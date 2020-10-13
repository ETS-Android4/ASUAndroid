package com.example.asuandroid.outfitAdapters;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import com.example.asuandroid.R;
import com.example.asuandroid.outfitfragments.AwardItem;

import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AwardAdapter extends RecyclerView.Adapter<AwardAdapter.AwardViewHolder> {
    private ArrayList<AwardItem> mAwardList;
    private CompoundButton.OnCheckedChangeListener mListener;
    public interface OnCheckChangeListener {
        void onRibbonClick(int position);
    }

        public static class AwardViewHolder extends RecyclerView.ViewHolder {
        public ImageView mImageView;
        public TextView mTextView1;
        public TextView mTextView2;
        public SwitchCompat mRibbonSwitch;
        Boolean isTouched = false;

        @SuppressLint("ClickableViewAccessibility")
        public AwardViewHolder(View itemView) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imageView);
            mTextView1 = itemView.findViewById(R.id.textView);
            mTextView2 = itemView.findViewById(R.id.textView2);
            mRibbonSwitch = itemView.findViewById(R.id.switchRibbon);

            mRibbonSwitch.setOnTouchListener(new View.OnTouchListener() {
                @SuppressLint("ClickableViewAccessibility")
                @Override
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    isTouched = true;
                    return false;
                }
            });

            mRibbonSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                ArrayList<String> mRibbonList = new ArrayList<String>();
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    if (isTouched) {
                        isTouched = false;
                        if(isChecked){
                            mRibbonList.add((String) mTextView1.getText());
                            System.out.println(mRibbonList);
                        } else {
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
        AwardViewHolder evh = new AwardViewHolder(v);
        return evh;
    }
    @Override
    public void onBindViewHolder(AwardViewHolder holder, int position) {
        AwardItem currentItem = (AwardItem) mAwardList.get(position);
        holder.mImageView.setImageResource(currentItem.getImageResource());
        holder.mTextView1.setText(currentItem.getText1());
        holder.mTextView2.setText(currentItem.getText2());
    }
    @Override
    public int getItemCount() {
        return mAwardList.size();
    }
}