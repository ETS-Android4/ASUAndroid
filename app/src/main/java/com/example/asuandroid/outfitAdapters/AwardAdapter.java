package com.example.asuandroid.outfitAdapters;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.graphics.drawable.AnimationDrawable;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import com.example.asuandroid.R;
import com.example.asuandroid.outfitfragments.AwardItem;

import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import static com.stanko.tools.ResHelper.getDrawable;

public class AwardAdapter extends RecyclerView.Adapter<AwardAdapter.AwardViewHolder> {
    //private ImageView mRibbonAdd;
    private ArrayList<AwardItem> mAwardList;
    public static ArrayList<Integer> awardImageList = new ArrayList<>();
    //private CompoundButton.OnCheckedChangeListener;
    private OnItemClickListener mListener;

    public interface OnItemClickListener {
        void onAddRibbonClick(String ribbon, int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        mListener = listener;
    }

        public static class AwardViewHolder extends RecyclerView.ViewHolder {
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

                mRibbonAdd.setOnClickListener(new View.OnClickListener() {
                    public boolean isChecked;
                    @Override
                    public void onClick(View v) {
                        if (listener != null) {
                            int position = getAdapterPosition();
                            String ribbon = mTextView1.getText().toString();
                            String reference = "R.drawable.";
                            ImageView rocketImage = (ImageView) v.findViewById(R.id.img_addRibbon);
                            rocketImage.setBackgroundResource(R.drawable.ribbon_anim);
                            AnimationDrawable rocketAnimation = (AnimationDrawable) rocketImage.getBackground();
                            rocketAnimation.start();
                            try{
                                awardImageList.add(Integer.parseInt(reference + ribbon));
                            } catch(NumberFormatException e) {
                                System.out.println("It doesnt like your string");
                            }
                            if (position != RecyclerView.NO_POSITION) {
                                listener.onAddRibbonClick(ribbon, position);
                            }
                            System.out.println("youclickedme" + ribbon);
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
        return evh;
    }
    @Override
    public void onBindViewHolder(AwardViewHolder holder, int position) {
        AwardItem currentItem = (AwardItem) mAwardList.get(position);
        holder.mImageView.setImageResource(currentItem.getImageResource());
        holder.mTextView1.setText(currentItem.getText1());
        holder.mTextView2.setText(currentItem.getText2());
        //holder.mRibbonSwitch.setChecked(currentItem.getSwitch1(position).isChecked());
    }
    @Override
    public int getItemCount() {
        return mAwardList.size();
    }

}