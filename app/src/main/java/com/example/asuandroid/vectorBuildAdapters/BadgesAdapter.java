package com.example.asuandroid.vectorBuildAdapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.collection.ArraySet;
import androidx.recyclerview.widget.RecyclerView;

import com.example.asuandroid.R;
import com.example.asuandroid.outfitfragments.Award2Fragment;
import com.example.asuandroid.vectorItems.BadgeItem;
import com.example.asuandroid.vectorItems.RibbonItem;

import java.util.ArrayList;
import java.util.List;

import static com.example.asuandroid.outfitfragments.Award2Fragment.context;

public class BadgesAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>  {
    public static ArrayList<BadgeItem> mBadgesList;
    public static ArraySet<ImageView> images = new ArraySet<ImageView>();
    public static ArrayList<List<ImageView>> badges = new ArrayList<>();
    public static List toPopup = new ArrayList<>();
    public static ArraySet<ImageView> currentOaks = new ArraySet<>();
    //private CompoundButton.OnCheckedChangeListener;
    private BadgesAdapter.OnItemClickListener mListener;
    private static Context mContext = context;

    public ArrayList<BadgeItem> BadgeAdapter(ArrayList<BadgeItem> mBadgesList) { return mBadgesList; }
    public interface OnItemClickListener { void onEditBadgesClick(int badges, int position);}
    public void setOnItemClickListener(BadgesAdapter.OnItemClickListener listener) { mListener = listener; }

    public static class Badge1Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
        public static ImageView mImageView1;

        public Badge1Holder(View itemView, BadgesAdapter.OnItemClickListener listener, ArraySet<ImageView> images) {
            super(itemView);
            this.images = images;
            mImageView1 = itemView.findViewById(R.id.badge1);
            this.images.add(mImageView1);
            mImageView1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if ((listener != null)) {
                        int position = getAdapterPosition();
                        int badge = mBadgesList.get(position).getBadgeImageResource1();
                        if (position != RecyclerView.NO_POSITION) {
                            listener.onEditBadgesClick(badge, position);
                        }
                        System.out.println("youclickedme" + badge);
                    }
                }
            });
        }
    }

    public static class Badge2Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
        public ImageView mImageViewRack;
        public ImageView mImageView1;
        public ImageView mImageView2;

        public Badge2Holder(View itemView, BadgesAdapter.OnItemClickListener listener, ArraySet<ImageView> images) {
            super(itemView);
            this.images = images;
            mImageViewRack = itemView.findViewById(R.id.ribbonRackB);
            mImageViewRack.setImageDrawable(Award2Fragment.bitmapDrawableArray.get(0));
            mImageView1 = itemView.findViewById(R.id.badge1);
            this.images.add(mImageView1);
            mImageView2 = itemView.findViewById(R.id.badge2);
            this.images.add(mImageView2);
            mImageView1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if ((listener != null)) {
                        int position = getAdapterPosition();
                        int badge = mBadgesList.get(position).getBadgeImageResource1();
                        if (position != RecyclerView.NO_POSITION) {
                            listener.onEditBadgesClick(badge, position);
                        }
                        System.out.println("youclickedme" + badge);
                    }
                }
            });

            mImageView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if ((listener != null)) {
                        int position = getAdapterPosition();
                        int badge = mBadgesList.get(position).getBadgeImageResource2();
                        if (position != RecyclerView.NO_POSITION) {
                            listener.onEditBadgesClick(badge, position);
                        }
                        System.out.println("youclickedme" + badge);
                    }
                }
            });

        }
    }
    public BadgesAdapter(ArrayList<BadgeItem> badgeList) {
        mBadgesList = badgeList;
    }

    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int ViewType) {
        View view = null;
        System.out.println("Here is the viewType" + ViewType);
        if (ViewType == 1) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.badge_item1, parent, false);
            return new BadgesAdapter.Badge1Holder(view, mListener, images);
        }
        if (ViewType == 2) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.badge_item2, parent, false);
            return new BadgesAdapter.Badge2Holder(view, mListener, images);
        }
        return null;
    }
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof BadgesAdapter.Badge1Holder) {
            BadgeItem currentItem = (BadgeItem) mBadgesList.get(position);
            ((BadgesAdapter.Badge1Holder) holder).mImageView1.setImageResource(currentItem.getBadgeImageResource1());
            ((BadgesAdapter.Badge1Holder) holder).mImageView1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    System.out.println("Clicked the icon@" + position);
                }
            });
        } else if (holder instanceof BadgesAdapter.Badge2Holder){
            BadgeItem currentItem = (BadgeItem) mBadgesList.get(position);
            ((BadgesAdapter.Badge2Holder) holder).mImageView1.setImageResource(currentItem.getBadgeImageResource1());
            ((BadgesAdapter.Badge2Holder) holder).mImageView1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    System.out.println("Clicked the icon@" + position);
                }
            });
            ((BadgesAdapter.Badge2Holder) holder).mImageView2.setImageResource(currentItem.getBadgeImageResource2());
            ((BadgesAdapter.Badge2Holder) holder).mImageView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    System.out.println("Clicked the icon@" + position);
                }
            });
        }
    }
    @Override
    public int getItemViewType(int position) {
        BadgeItem currentItem = (BadgeItem) mBadgesList.get(position);
        if (currentItem instanceof BadgeItem.BadgeItem1) {
            return 1;
        }
        if (currentItem instanceof BadgeItem.BadgeItem2) {
            return 2;
        }
        return 0;
    }
    @Override
    public int getItemCount() {
        return mBadgesList.size();
    }
}
