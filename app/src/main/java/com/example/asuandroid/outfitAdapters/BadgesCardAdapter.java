package com.example.asuandroid.outfitAdapters;

import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;
import com.example.asuandroid.R;
import com.example.asuandroid.vectorItems.BadgeCardItem;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;


public class BadgesCardAdapter extends RecyclerView.Adapter<BadgesCardAdapter.BadgeViewHolder> {
    public ArrayList<BadgeCardItem> mBadgeList;
    private OnItemClickListener mListener;
    public static ArrayList<Integer> badgeImageList = new ArrayList<>();


    public interface OnItemClickListener { void onAddBadgesClick(int badge, int position, boolean isBadgeOn);}
    public void setOnItemClickListener(BadgesCardAdapter.OnItemClickListener listener) { mListener = listener; }

    public class BadgeViewHolder extends RecyclerView.ViewHolder {
        public boolean isBadgeOn = false;
        public ImageView mImageView;
        public TextView mTextView1;
        public TextView mTextView2;
        public BadgeViewHolder(View itemView, BadgesCardAdapter.OnItemClickListener listener) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imageView);
            mTextView1 = itemView.findViewById(R.id.textView);
            mTextView2 = itemView.findViewById(R.id.textView2);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (!isBadgeOn) {
                        System.out.println(isBadgeOn);
                        isBadgeOn = true;
                        System.out.println(isBadgeOn);
                        itemView.setBackgroundColor(Color.CYAN);
                        ImageView rocketImage = (ImageView) v.findViewById(R.id.img_addBadge);
                        rocketImage.setBackgroundResource(R.drawable.ribbon_anim);
                        AnimationDrawable rocketAnimation = (AnimationDrawable) rocketImage.getBackground();
                        rocketAnimation.start();
                    } else if (isBadgeOn = true) {
                        System.out.println(isBadgeOn);
                        isBadgeOn = false;
                        System.out.println(isBadgeOn);
                        itemView.setBackgroundColor(Color.WHITE);
                        ImageView rocketImage = (ImageView) v.findViewById(R.id.img_addBadge);
                        rocketImage.setBackgroundResource(R.drawable.ribbon_anim_return);
                        AnimationDrawable rocketAnimation = (AnimationDrawable) rocketImage.getBackground();
                        rocketAnimation.start();
                    }
                    {
                        if ((listener != null)) {
                            int position = getAdapterPosition();
                            int badge = mBadgeList.get(position).getImageResource();
                            if (position != RecyclerView.NO_POSITION) {
                                listener.onAddBadgesClick(badge, position, isBadgeOn);
                            }
                            //testing
                            System.out.println("youclickedme" + badge);
                        }
                    }
                }
            });
        }
    }
    public BadgesCardAdapter(ArrayList<BadgeCardItem> badgeList) {
        mBadgeList = badgeList;
    }
    @Override
    public BadgeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.badge_item, parent, false);
        BadgeViewHolder evh = new BadgeViewHolder(v, mListener);
        return evh;
    }
    @Override
    public void onBindViewHolder(BadgeViewHolder holder, int position) {
        BadgeCardItem currentItem = (BadgeCardItem) mBadgeList.get(position);
        holder.mImageView.setImageResource(currentItem.getImageResource());
        holder.mTextView1.setText(currentItem.getText1());
        holder.mTextView2.setText(currentItem.getText2());
    }
    @Override
    public int getItemCount() {
        return mBadgeList.size();
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