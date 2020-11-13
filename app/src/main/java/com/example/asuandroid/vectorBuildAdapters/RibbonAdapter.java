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

public class RibbonAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    public static ArrayList<RibbonItem> mRibbonList;
    public static ArraySet<ImageView> images = new ArraySet<ImageView>();
    public static ArrayList<List<ImageView>> oaks = new ArrayList<>();
    public static List toPopup = new ArrayList<>();
    public static ArraySet<ImageView> currentOaks = new ArraySet<>();
    //private CompoundButton.OnCheckedChangeListener;
    private OnItemClickListener mListener;
    private static Context mContext = context;


    public ArrayList<RibbonItem> RibbonAdapter(ArrayList<RibbonItem> mRibbonList) {
        return mRibbonList;
    }
    public interface OnItemClickListener {
        void onEditRibbonClick(int ribbon, int position);
    }
    public void setOnItemClickListener(OnItemClickListener listener) {
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
                            showPopup(view, oaks, 0);
                        }
                        System.out.println("youclickedme" + ribbon);
                    }
                }
            });
        }
    }

    public static class Ribbon2Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
        private static ArrayList<List<ImageView>> oaks = new ArrayList<>();
        private final ArraySet<ImageView> oaks1 = new ArraySet<>();
        private final ArraySet<ImageView> oaks2 = new ArraySet<>();
        public ImageView mImageView1;
        public ImageView mImageView1_2;
        public ImageView mImageView1_3;
        public ImageView mImageView1_4;
        public ImageView mImageView1_5;
        public ImageView mImageView1_6;
        public ImageView mImageView1_7;
        public ImageView mImageView1_8;
        public ImageView mImageView2;
        public ImageView mImageView2_2;
        public ImageView mImageView2_3;
        public ImageView mImageView2_4;
        public ImageView mImageView2_5;
        public ImageView mImageView2_6;
        public ImageView mImageView2_7;
        public ImageView mImageView2_8;

        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon2Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images, ArrayList<List<ImageView>> oaks) {
            super(itemView);
            List<ImageView> oaks1 = new ArrayList<>();
            List<ImageView> oaks2 = new ArrayList<>();
            this.images = images;
            this.oaks = oaks;
            mImageView1 = itemView.findViewById(R.id.ribbon1);
            this.images.add(mImageView1);
            oaks1.add(mImageView1_2 = itemView.findViewById(R.id.ribbon1_2));
            oaks1.add(mImageView1_3 = itemView.findViewById(R.id.ribbon1_3));
            oaks1.add(mImageView1_4 = itemView.findViewById(R.id.ribbon1_4));
            oaks1.add(mImageView1_5 = itemView.findViewById(R.id.ribbon1_5));
            oaks1.add(mImageView1_6 = itemView.findViewById(R.id.ribbon1_6));
            oaks1.add(mImageView1_7 = itemView.findViewById(R.id.ribbon1_7));
            oaks1.add(mImageView1_8 = itemView.findViewById(R.id.ribbon1_8));
            oaks.add(oaks1);
            System.out.println("Inserted in 'order' oaks1: " + oaks1);
            mImageView2 = itemView.findViewById(R.id.ribbon2);
            this.images.add(mImageView2);
            oaks2.add(mImageView2_2 = itemView.findViewById(R.id.ribbon2_2));
            oaks2.add(mImageView2_3 = itemView.findViewById(R.id.ribbon2_3));
            oaks2.add(mImageView2_4 = itemView.findViewById(R.id.ribbon2_4));
            oaks2.add(mImageView2_5 = itemView.findViewById(R.id.ribbon2_5));
            oaks2.add(mImageView2_6 = itemView.findViewById(R.id.ribbon2_6));
            oaks2.add(mImageView2_7 = itemView.findViewById(R.id.ribbon2_7));
            oaks2.add(mImageView2_8 = itemView.findViewById(R.id.ribbon2_8));
            oaks.add(oaks2);
            toPopup = Collections.unmodifiableList(Arrays.asList(oaks));
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
            mImageView2.setOnClickListener(new View.OnClickListener() {
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

    public static class Ribbon3Holder extends RecyclerView.ViewHolder {
        public final ArraySet<ImageView> images;
        public ImageView mImageView1;
        public ImageView mImageView2;
        public ImageView mImageView3;

        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon3Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
    public static class Ribbon4Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
        public ImageView mImageView1;
        public ImageView mImageView2;
        public ImageView mImageView3;
        public ImageView mImageView4;

        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon4Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
        }
    }

    public static class Ribbon5Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
        public ImageView mImageView1;
        public ImageView mImageView2;
        public ImageView mImageView3;
        public ImageView mImageView4;
        public ImageView mImageView5;

        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon5Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);

        }
    }

    public static class Ribbon6Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
        public ImageView mImageView1;
        public ImageView mImageView2;
        public ImageView mImageView3;
        public ImageView mImageView4;
        public ImageView mImageView5;
        public ImageView mImageView6;


        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon6Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            this.images.add(mImageView6);

        }
    }

    public static class Ribbon7Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
        public ImageView mImageView1;
        public ImageView mImageView2;
        public ImageView mImageView3;
        public ImageView mImageView4;
        public ImageView mImageView5;
        public ImageView mImageView6;
        public ImageView mImageView7;


        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon7Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            this.images.add(mImageView6);
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            this.images.add(mImageView7);

        }
    }

    public static class Ribbon8Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
        public ImageView mImageView1;
        public ImageView mImageView2;
        public ImageView mImageView3;
        public ImageView mImageView4;
        public ImageView mImageView5;
        public ImageView mImageView6;
        public ImageView mImageView7;
        public ImageView mImageView8;


        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon8Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            this.images.add(mImageView6);
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            this.images.add(mImageView7);
            mImageView8 = itemView.findViewById(R.id.ribbon8);
            this.images.add(mImageView8);
        }
    }

    public static class Ribbon9Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
        public ImageView mImageView1;
        public ImageView mImageView2;
        public ImageView mImageView3;
        public ImageView mImageView4;
        public ImageView mImageView5;
        public ImageView mImageView6;
        public ImageView mImageView7;
        public ImageView mImageView8;
        public ImageView mImageView9;


        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon9Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            this.images.add(mImageView6);
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            this.images.add(mImageView7);
            mImageView8 = itemView.findViewById(R.id.ribbon8);
            this.images.add(mImageView8);
            mImageView9 = itemView.findViewById(R.id.ribbon9);
            this.images.add(mImageView9);

        }
    }

    public static class Ribbon10Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
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


        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon10Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            this.images.add(mImageView6);
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            this.images.add(mImageView7);
            mImageView8 = itemView.findViewById(R.id.ribbon8);
            this.images.add(mImageView8);
            mImageView9 = itemView.findViewById(R.id.ribbon9);
            this.images.add(mImageView9);
            mImageView10 = itemView.findViewById(R.id.ribbon10);
            this.images.add(mImageView10);

        }
    }

    public static class Ribbon11Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
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


        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon11Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            this.images.add(mImageView6);
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            this.images.add(mImageView7);
            mImageView8 = itemView.findViewById(R.id.ribbon8);
            this.images.add(mImageView8);
            mImageView9 = itemView.findViewById(R.id.ribbon9);
            this.images.add(mImageView9);
            mImageView10 = itemView.findViewById(R.id.ribbon10);
            this.images.add(mImageView10);
            mImageView11 = itemView.findViewById(R.id.ribbon11);
            this.images.add(mImageView11);

        }
    }

    public static class Ribbon12Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
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
        public Ribbon12Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            this.images.add(mImageView6);
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            this.images.add(mImageView7);
            mImageView8 = itemView.findViewById(R.id.ribbon8);
            this.images.add(mImageView8);
            mImageView9 = itemView.findViewById(R.id.ribbon9);
            this.images.add(mImageView9);
            mImageView10 = itemView.findViewById(R.id.ribbon10);
            this.images.add(mImageView10);
            mImageView11 = itemView.findViewById(R.id.ribbon11);
            this.images.add(mImageView11);
            mImageView12 = itemView.findViewById(R.id.ribbon12);
            this.images.add(mImageView12);

        }
    }

    public static class Ribbon13Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
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
        public ImageView mImageView13;


        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon13Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            this.images.add(mImageView6);
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            this.images.add(mImageView7);
            mImageView8 = itemView.findViewById(R.id.ribbon8);
            this.images.add(mImageView8);
            mImageView9 = itemView.findViewById(R.id.ribbon9);
            this.images.add(mImageView9);
            mImageView10 = itemView.findViewById(R.id.ribbon10);
            this.images.add(mImageView10);
            mImageView11 = itemView.findViewById(R.id.ribbon11);
            this.images.add(mImageView11);
            mImageView12 = itemView.findViewById(R.id.ribbon12);
            this.images.add(mImageView12);
            mImageView13 = itemView.findViewById(R.id.ribbon13);
            this.images.add(mImageView13);

        }
    }

    public static class Ribbon14Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
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
        public ImageView mImageView13;
        public ImageView mImageView14;


        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon14Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            this.images.add(mImageView6);
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            this.images.add(mImageView7);
            mImageView8 = itemView.findViewById(R.id.ribbon8);
            this.images.add(mImageView8);
            mImageView9 = itemView.findViewById(R.id.ribbon9);
            this.images.add(mImageView9);
            mImageView10 = itemView.findViewById(R.id.ribbon10);
            this.images.add(mImageView10);
            mImageView11 = itemView.findViewById(R.id.ribbon11);
            this.images.add(mImageView11);
            mImageView12 = itemView.findViewById(R.id.ribbon12);
            this.images.add(mImageView12);
            mImageView13 = itemView.findViewById(R.id.ribbon13);
            this.images.add(mImageView13);
            mImageView14 = itemView.findViewById(R.id.ribbon14);
            this.images.add(mImageView14);

        }
    }

    public static class Ribbon15Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
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
        public ImageView mImageView13;
        public ImageView mImageView14;
        public ImageView mImageView15;


        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon15Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            this.images.add(mImageView6);
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            this.images.add(mImageView7);
            mImageView8 = itemView.findViewById(R.id.ribbon8);
            this.images.add(mImageView8);
            mImageView9 = itemView.findViewById(R.id.ribbon9);
            this.images.add(mImageView9);
            mImageView10 = itemView.findViewById(R.id.ribbon10);
            this.images.add(mImageView10);
            mImageView11 = itemView.findViewById(R.id.ribbon11);
            this.images.add(mImageView11);
            mImageView12 = itemView.findViewById(R.id.ribbon12);
            this.images.add(mImageView12);
            mImageView13 = itemView.findViewById(R.id.ribbon13);
            this.images.add(mImageView13);
            mImageView14 = itemView.findViewById(R.id.ribbon14);
            this.images.add(mImageView14);
            mImageView15 = itemView.findViewById(R.id.ribbon15);
            this.images.add(mImageView15);

        }
    }

    public static class Ribbon16Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
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
        public ImageView mImageView13;
        public ImageView mImageView14;
        public ImageView mImageView15;
        public ImageView mImageView16;


        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon16Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            this.images.add(mImageView6);
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            this.images.add(mImageView7);
            mImageView8 = itemView.findViewById(R.id.ribbon8);
            this.images.add(mImageView8);
            mImageView9 = itemView.findViewById(R.id.ribbon9);
            this.images.add(mImageView9);
            mImageView10 = itemView.findViewById(R.id.ribbon10);
            this.images.add(mImageView10);
            mImageView11 = itemView.findViewById(R.id.ribbon11);
            this.images.add(mImageView11);
            mImageView12 = itemView.findViewById(R.id.ribbon12);
            this.images.add(mImageView12);
            mImageView13 = itemView.findViewById(R.id.ribbon13);
            this.images.add(mImageView13);
            mImageView14 = itemView.findViewById(R.id.ribbon14);
            this.images.add(mImageView14);
            mImageView15 = itemView.findViewById(R.id.ribbon15);
            this.images.add(mImageView15);
            mImageView16 = itemView.findViewById(R.id.ribbon16);
            this.images.add(mImageView16);

        }
    }

    public static class Ribbon17Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
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
        public ImageView mImageView13;
        public ImageView mImageView14;
        public ImageView mImageView15;
        public ImageView mImageView16;
        public ImageView mImageView17;


        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon17Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            this.images.add(mImageView6);
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            this.images.add(mImageView7);
            mImageView8 = itemView.findViewById(R.id.ribbon8);
            this.images.add(mImageView8);
            mImageView9 = itemView.findViewById(R.id.ribbon9);
            this.images.add(mImageView9);
            mImageView10 = itemView.findViewById(R.id.ribbon10);
            this.images.add(mImageView10);
            mImageView11 = itemView.findViewById(R.id.ribbon11);
            this.images.add(mImageView11);
            mImageView12 = itemView.findViewById(R.id.ribbon12);
            this.images.add(mImageView12);
            mImageView13 = itemView.findViewById(R.id.ribbon13);
            this.images.add(mImageView13);
            mImageView14 = itemView.findViewById(R.id.ribbon14);
            this.images.add(mImageView14);
            mImageView15 = itemView.findViewById(R.id.ribbon15);
            this.images.add(mImageView15);
            mImageView16 = itemView.findViewById(R.id.ribbon16);
            this.images.add(mImageView16);
            mImageView17 = itemView.findViewById(R.id.ribbon17);
            this.images.add(mImageView17);

        }
    }

    public static class Ribbon18Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
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
        public ImageView mImageView13;
        public ImageView mImageView14;
        public ImageView mImageView15;
        public ImageView mImageView16;
        public ImageView mImageView17;
        public ImageView mImageView18;


        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon18Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            this.images.add(mImageView6);
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            this.images.add(mImageView7);
            mImageView8 = itemView.findViewById(R.id.ribbon8);
            this.images.add(mImageView8);
            mImageView9 = itemView.findViewById(R.id.ribbon9);
            this.images.add(mImageView9);
            mImageView10 = itemView.findViewById(R.id.ribbon10);
            this.images.add(mImageView10);
            mImageView11 = itemView.findViewById(R.id.ribbon11);
            this.images.add(mImageView11);
            mImageView12 = itemView.findViewById(R.id.ribbon12);
            this.images.add(mImageView12);
            mImageView13 = itemView.findViewById(R.id.ribbon13);
            this.images.add(mImageView13);
            mImageView14 = itemView.findViewById(R.id.ribbon14);
            this.images.add(mImageView14);
            mImageView15 = itemView.findViewById(R.id.ribbon15);
            this.images.add(mImageView15);
            mImageView16 = itemView.findViewById(R.id.ribbon16);
            this.images.add(mImageView16);
            mImageView17 = itemView.findViewById(R.id.ribbon17);
            this.images.add(mImageView17);
            mImageView18 = itemView.findViewById(R.id.ribbon18);
            this.images.add(mImageView18);


        }
    }

    public static class Ribbon19Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
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
        public ImageView mImageView13;
        public ImageView mImageView14;
        public ImageView mImageView15;
        public ImageView mImageView16;
        public ImageView mImageView17;
        public ImageView mImageView18;
        public ImageView mImageView19;


        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon19Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            this.images.add(mImageView6);
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            this.images.add(mImageView7);
            mImageView8 = itemView.findViewById(R.id.ribbon8);
            this.images.add(mImageView8);
            mImageView9 = itemView.findViewById(R.id.ribbon9);
            this.images.add(mImageView9);
            mImageView10 = itemView.findViewById(R.id.ribbon10);
            this.images.add(mImageView10);
            mImageView11 = itemView.findViewById(R.id.ribbon11);
            this.images.add(mImageView11);
            mImageView12 = itemView.findViewById(R.id.ribbon12);
            this.images.add(mImageView12);
            mImageView13 = itemView.findViewById(R.id.ribbon13);
            this.images.add(mImageView13);
            mImageView14 = itemView.findViewById(R.id.ribbon14);
            this.images.add(mImageView14);
            mImageView15 = itemView.findViewById(R.id.ribbon15);
            this.images.add(mImageView15);
            mImageView16 = itemView.findViewById(R.id.ribbon16);
            this.images.add(mImageView16);
            mImageView17 = itemView.findViewById(R.id.ribbon17);
            this.images.add(mImageView17);
            mImageView18 = itemView.findViewById(R.id.ribbon18);
            this.images.add(mImageView18);
            mImageView19 = itemView.findViewById(R.id.ribbon19);
            this.images.add(mImageView19);

        }
    }

    public static class Ribbon20Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
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
        public ImageView mImageView13;
        public ImageView mImageView14;
        public ImageView mImageView15;
        public ImageView mImageView16;
        public ImageView mImageView17;
        public ImageView mImageView18;
        public ImageView mImageView19;
        public ImageView mImageView20;


        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon20Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            this.images.add(mImageView6);
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            this.images.add(mImageView7);
            mImageView8 = itemView.findViewById(R.id.ribbon8);
            this.images.add(mImageView8);
            mImageView9 = itemView.findViewById(R.id.ribbon9);
            this.images.add(mImageView9);
            mImageView10 = itemView.findViewById(R.id.ribbon10);
            this.images.add(mImageView10);
            mImageView11 = itemView.findViewById(R.id.ribbon11);
            this.images.add(mImageView11);
            mImageView12 = itemView.findViewById(R.id.ribbon12);
            this.images.add(mImageView12);
            mImageView13 = itemView.findViewById(R.id.ribbon13);
            this.images.add(mImageView13);
            mImageView14 = itemView.findViewById(R.id.ribbon14);
            this.images.add(mImageView14);
            mImageView15 = itemView.findViewById(R.id.ribbon15);
            this.images.add(mImageView15);
            mImageView16 = itemView.findViewById(R.id.ribbon16);
            this.images.add(mImageView16);
            mImageView17 = itemView.findViewById(R.id.ribbon17);
            this.images.add(mImageView17);
            mImageView18 = itemView.findViewById(R.id.ribbon18);
            this.images.add(mImageView18);
            mImageView19 = itemView.findViewById(R.id.ribbon19);
            this.images.add(mImageView19);
            mImageView20 = itemView.findViewById(R.id.ribbon20);
            this.images.add(mImageView20);

        }
    }

    public static class Ribbon21Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
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
        public ImageView mImageView13;
        public ImageView mImageView14;
        public ImageView mImageView15;
        public ImageView mImageView16;
        public ImageView mImageView17;
        public ImageView mImageView18;
        public ImageView mImageView19;
        public ImageView mImageView20;
        public ImageView mImageView21;


        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon21Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            this.images.add(mImageView6);
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            this.images.add(mImageView7);
            mImageView8 = itemView.findViewById(R.id.ribbon8);
            this.images.add(mImageView8);
            mImageView9 = itemView.findViewById(R.id.ribbon9);
            this.images.add(mImageView9);
            mImageView10 = itemView.findViewById(R.id.ribbon10);
            this.images.add(mImageView10);
            mImageView11 = itemView.findViewById(R.id.ribbon11);
            this.images.add(mImageView11);
            mImageView12 = itemView.findViewById(R.id.ribbon12);
            this.images.add(mImageView12);
            mImageView13 = itemView.findViewById(R.id.ribbon13);
            this.images.add(mImageView13);
            mImageView14 = itemView.findViewById(R.id.ribbon14);
            this.images.add(mImageView14);
            mImageView15 = itemView.findViewById(R.id.ribbon15);
            this.images.add(mImageView15);
            mImageView16 = itemView.findViewById(R.id.ribbon16);
            this.images.add(mImageView16);
            mImageView17 = itemView.findViewById(R.id.ribbon17);
            this.images.add(mImageView17);
            mImageView18 = itemView.findViewById(R.id.ribbon18);
            this.images.add(mImageView18);
            mImageView19 = itemView.findViewById(R.id.ribbon19);
            this.images.add(mImageView19);
            mImageView20 = itemView.findViewById(R.id.ribbon20);
            this.images.add(mImageView20);
            mImageView21 = itemView.findViewById(R.id.ribbon21);
            this.images.add(mImageView21);

        }
    }

    public static class Ribbon22Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
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
        public ImageView mImageView13;
        public ImageView mImageView14;
        public ImageView mImageView15;
        public ImageView mImageView16;
        public ImageView mImageView17;
        public ImageView mImageView18;
        public ImageView mImageView19;
        public ImageView mImageView20;
        public ImageView mImageView21;
        public ImageView mImageView22;


        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon22Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            this.images.add(mImageView6);
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            this.images.add(mImageView7);
            mImageView8 = itemView.findViewById(R.id.ribbon8);
            this.images.add(mImageView8);
            mImageView9 = itemView.findViewById(R.id.ribbon9);
            this.images.add(mImageView9);
            mImageView10 = itemView.findViewById(R.id.ribbon10);
            this.images.add(mImageView10);
            mImageView11 = itemView.findViewById(R.id.ribbon11);
            this.images.add(mImageView11);
            mImageView12 = itemView.findViewById(R.id.ribbon12);
            this.images.add(mImageView12);
            mImageView13 = itemView.findViewById(R.id.ribbon13);
            this.images.add(mImageView13);
            mImageView14 = itemView.findViewById(R.id.ribbon14);
            this.images.add(mImageView14);
            mImageView15 = itemView.findViewById(R.id.ribbon15);
            this.images.add(mImageView15);
            mImageView16 = itemView.findViewById(R.id.ribbon16);
            this.images.add(mImageView16);
            mImageView17 = itemView.findViewById(R.id.ribbon17);
            this.images.add(mImageView17);
            mImageView18 = itemView.findViewById(R.id.ribbon18);
            this.images.add(mImageView18);
            mImageView19 = itemView.findViewById(R.id.ribbon19);
            this.images.add(mImageView19);
            mImageView20 = itemView.findViewById(R.id.ribbon20);
            this.images.add(mImageView20);
            mImageView21 = itemView.findViewById(R.id.ribbon21);
            this.images.add(mImageView21);
            mImageView22 = itemView.findViewById(R.id.ribbon22);
            this.images.add(mImageView22);

        }
    }

    public static class Ribbon23Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
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
        public ImageView mImageView13;
        public ImageView mImageView14;
        public ImageView mImageView15;
        public ImageView mImageView16;
        public ImageView mImageView17;
        public ImageView mImageView18;
        public ImageView mImageView19;
        public ImageView mImageView20;
        public ImageView mImageView21;
        public ImageView mImageView22;
        public ImageView mImageView23;


        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon23Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            this.images.add(mImageView6);
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            this.images.add(mImageView7);
            mImageView8 = itemView.findViewById(R.id.ribbon8);
            this.images.add(mImageView8);
            mImageView9 = itemView.findViewById(R.id.ribbon9);
            this.images.add(mImageView9);
            mImageView10 = itemView.findViewById(R.id.ribbon10);
            this.images.add(mImageView10);
            mImageView11 = itemView.findViewById(R.id.ribbon11);
            this.images.add(mImageView11);
            mImageView12 = itemView.findViewById(R.id.ribbon12);
            this.images.add(mImageView12);
            mImageView13 = itemView.findViewById(R.id.ribbon13);
            this.images.add(mImageView13);
            mImageView14 = itemView.findViewById(R.id.ribbon14);
            this.images.add(mImageView14);
            mImageView15 = itemView.findViewById(R.id.ribbon15);
            this.images.add(mImageView15);
            mImageView16 = itemView.findViewById(R.id.ribbon16);
            this.images.add(mImageView16);
            mImageView17 = itemView.findViewById(R.id.ribbon17);
            this.images.add(mImageView17);
            mImageView18 = itemView.findViewById(R.id.ribbon18);
            this.images.add(mImageView18);
            mImageView19 = itemView.findViewById(R.id.ribbon19);
            this.images.add(mImageView19);
            mImageView20 = itemView.findViewById(R.id.ribbon20);
            this.images.add(mImageView20);
            mImageView21 = itemView.findViewById(R.id.ribbon21);
            this.images.add(mImageView21);
            mImageView22 = itemView.findViewById(R.id.ribbon22);
            this.images.add(mImageView22);
            mImageView23 = itemView.findViewById(R.id.ribbon23);
            this.images.add(mImageView23);

        }
    }

    public static class Ribbon24Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
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
        public ImageView mImageView13;
        public ImageView mImageView14;
        public ImageView mImageView15;
        public ImageView mImageView16;
        public ImageView mImageView17;
        public ImageView mImageView18;
        public ImageView mImageView19;
        public ImageView mImageView20;
        public ImageView mImageView21;
        public ImageView mImageView22;
        public ImageView mImageView23;
        public ImageView mImageView24;


        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon24Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            this.images.add(mImageView6);
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            this.images.add(mImageView7);
            mImageView8 = itemView.findViewById(R.id.ribbon8);
            this.images.add(mImageView8);
            mImageView9 = itemView.findViewById(R.id.ribbon9);
            this.images.add(mImageView9);
            mImageView10 = itemView.findViewById(R.id.ribbon10);
            this.images.add(mImageView10);
            mImageView11 = itemView.findViewById(R.id.ribbon11);
            this.images.add(mImageView11);
            mImageView12 = itemView.findViewById(R.id.ribbon12);
            this.images.add(mImageView12);
            mImageView13 = itemView.findViewById(R.id.ribbon13);
            this.images.add(mImageView13);
            mImageView14 = itemView.findViewById(R.id.ribbon14);
            this.images.add(mImageView14);
            mImageView15 = itemView.findViewById(R.id.ribbon15);
            this.images.add(mImageView15);
            mImageView16 = itemView.findViewById(R.id.ribbon16);
            this.images.add(mImageView16);
            mImageView17 = itemView.findViewById(R.id.ribbon17);
            this.images.add(mImageView17);
            mImageView18 = itemView.findViewById(R.id.ribbon18);
            this.images.add(mImageView18);
            mImageView19 = itemView.findViewById(R.id.ribbon19);
            this.images.add(mImageView19);
            mImageView20 = itemView.findViewById(R.id.ribbon20);
            this.images.add(mImageView20);
            mImageView21 = itemView.findViewById(R.id.ribbon21);
            this.images.add(mImageView21);
            mImageView22 = itemView.findViewById(R.id.ribbon22);
            this.images.add(mImageView22);
            mImageView23 = itemView.findViewById(R.id.ribbon23);
            this.images.add(mImageView23);
            mImageView24 = itemView.findViewById(R.id.ribbon24);
            this.images.add(mImageView24);

        }
    }

    public static class Ribbon25Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
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
        public ImageView mImageView13;
        public ImageView mImageView14;
        public ImageView mImageView15;
        public ImageView mImageView16;
        public ImageView mImageView17;
        public ImageView mImageView18;
        public ImageView mImageView19;
        public ImageView mImageView20;
        public ImageView mImageView21;
        public ImageView mImageView22;
        public ImageView mImageView23;
        public ImageView mImageView24;
        public ImageView mImageView25;


        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon25Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            this.images.add(mImageView6);
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            this.images.add(mImageView7);
            mImageView8 = itemView.findViewById(R.id.ribbon8);
            this.images.add(mImageView8);
            mImageView9 = itemView.findViewById(R.id.ribbon9);
            this.images.add(mImageView9);
            mImageView10 = itemView.findViewById(R.id.ribbon10);
            this.images.add(mImageView10);
            mImageView11 = itemView.findViewById(R.id.ribbon11);
            this.images.add(mImageView11);
            mImageView12 = itemView.findViewById(R.id.ribbon12);
            this.images.add(mImageView12);
            mImageView13 = itemView.findViewById(R.id.ribbon13);
            this.images.add(mImageView13);
            mImageView14 = itemView.findViewById(R.id.ribbon14);
            this.images.add(mImageView14);
            mImageView15 = itemView.findViewById(R.id.ribbon15);
            this.images.add(mImageView15);
            mImageView16 = itemView.findViewById(R.id.ribbon16);
            this.images.add(mImageView16);
            mImageView17 = itemView.findViewById(R.id.ribbon17);
            this.images.add(mImageView17);
            mImageView18 = itemView.findViewById(R.id.ribbon18);
            this.images.add(mImageView18);
            mImageView19 = itemView.findViewById(R.id.ribbon19);
            this.images.add(mImageView19);
            mImageView20 = itemView.findViewById(R.id.ribbon20);
            this.images.add(mImageView20);
            mImageView21 = itemView.findViewById(R.id.ribbon21);
            this.images.add(mImageView21);
            mImageView22 = itemView.findViewById(R.id.ribbon22);
            this.images.add(mImageView22);
            mImageView23 = itemView.findViewById(R.id.ribbon23);
            this.images.add(mImageView23);
            mImageView24 = itemView.findViewById(R.id.ribbon24);
            this.images.add(mImageView24);
            mImageView25 = itemView.findViewById(R.id.ribbon25);
            this.images.add(mImageView25);

        }
    }

    public static class Ribbon26Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
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
        public ImageView mImageView13;
        public ImageView mImageView14;
        public ImageView mImageView15;
        public ImageView mImageView16;
        public ImageView mImageView17;
        public ImageView mImageView18;
        public ImageView mImageView19;
        public ImageView mImageView20;
        public ImageView mImageView21;
        public ImageView mImageView22;
        public ImageView mImageView23;
        public ImageView mImageView24;
        public ImageView mImageView25;
        public ImageView mImageView26;


        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon26Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            this.images.add(mImageView6);
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            this.images.add(mImageView7);
            mImageView8 = itemView.findViewById(R.id.ribbon8);
            this.images.add(mImageView8);
            mImageView9 = itemView.findViewById(R.id.ribbon9);
            this.images.add(mImageView9);
            mImageView10 = itemView.findViewById(R.id.ribbon10);
            this.images.add(mImageView10);
            mImageView11 = itemView.findViewById(R.id.ribbon11);
            this.images.add(mImageView11);
            mImageView12 = itemView.findViewById(R.id.ribbon12);
            this.images.add(mImageView12);
            mImageView13 = itemView.findViewById(R.id.ribbon13);
            this.images.add(mImageView13);
            mImageView14 = itemView.findViewById(R.id.ribbon14);
            this.images.add(mImageView14);
            mImageView15 = itemView.findViewById(R.id.ribbon15);
            this.images.add(mImageView15);
            mImageView16 = itemView.findViewById(R.id.ribbon16);
            this.images.add(mImageView16);
            mImageView17 = itemView.findViewById(R.id.ribbon17);
            this.images.add(mImageView17);
            mImageView18 = itemView.findViewById(R.id.ribbon18);
            this.images.add(mImageView18);
            mImageView19 = itemView.findViewById(R.id.ribbon19);
            this.images.add(mImageView19);
            mImageView20 = itemView.findViewById(R.id.ribbon20);
            this.images.add(mImageView20);
            mImageView21 = itemView.findViewById(R.id.ribbon21);
            this.images.add(mImageView21);
            mImageView22 = itemView.findViewById(R.id.ribbon22);
            this.images.add(mImageView22);
            mImageView23 = itemView.findViewById(R.id.ribbon23);
            this.images.add(mImageView23);
            mImageView24 = itemView.findViewById(R.id.ribbon24);
            this.images.add(mImageView24);
            mImageView25 = itemView.findViewById(R.id.ribbon25);
            this.images.add(mImageView25);
            mImageView26 = itemView.findViewById(R.id.ribbon26);
            this.images.add(mImageView26);

        }
    }

    public static class Ribbon27Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
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
        public ImageView mImageView13;
        public ImageView mImageView14;
        public ImageView mImageView15;
        public ImageView mImageView16;
        public ImageView mImageView17;
        public ImageView mImageView18;
        public ImageView mImageView19;
        public ImageView mImageView20;
        public ImageView mImageView21;
        public ImageView mImageView22;
        public ImageView mImageView23;
        public ImageView mImageView24;
        public ImageView mImageView25;
        public ImageView mImageView26;
        public ImageView mImageView27;


        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon27Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            this.images.add(mImageView6);
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            this.images.add(mImageView7);
            mImageView8 = itemView.findViewById(R.id.ribbon8);
            this.images.add(mImageView8);
            mImageView9 = itemView.findViewById(R.id.ribbon9);
            this.images.add(mImageView9);
            mImageView10 = itemView.findViewById(R.id.ribbon10);
            this.images.add(mImageView10);
            mImageView11 = itemView.findViewById(R.id.ribbon11);
            this.images.add(mImageView11);
            mImageView12 = itemView.findViewById(R.id.ribbon12);
            this.images.add(mImageView12);
            mImageView13 = itemView.findViewById(R.id.ribbon13);
            this.images.add(mImageView13);
            mImageView14 = itemView.findViewById(R.id.ribbon14);
            this.images.add(mImageView14);
            mImageView15 = itemView.findViewById(R.id.ribbon15);
            this.images.add(mImageView15);
            mImageView16 = itemView.findViewById(R.id.ribbon16);
            this.images.add(mImageView16);
            mImageView17 = itemView.findViewById(R.id.ribbon17);
            this.images.add(mImageView17);
            mImageView18 = itemView.findViewById(R.id.ribbon18);
            this.images.add(mImageView18);
            mImageView19 = itemView.findViewById(R.id.ribbon19);
            this.images.add(mImageView19);
            mImageView20 = itemView.findViewById(R.id.ribbon20);
            this.images.add(mImageView20);
            mImageView21 = itemView.findViewById(R.id.ribbon21);
            this.images.add(mImageView21);
            mImageView22 = itemView.findViewById(R.id.ribbon22);
            this.images.add(mImageView22);
            mImageView23 = itemView.findViewById(R.id.ribbon23);
            this.images.add(mImageView23);
            mImageView24 = itemView.findViewById(R.id.ribbon24);
            this.images.add(mImageView24);
            mImageView25 = itemView.findViewById(R.id.ribbon25);
            this.images.add(mImageView25);
            mImageView26 = itemView.findViewById(R.id.ribbon26);
            this.images.add(mImageView26);
            mImageView27 = itemView.findViewById(R.id.ribbon27);
            this.images.add(mImageView27);

        }
    }

    public static class Ribbon28Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
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
        public ImageView mImageView13;
        public ImageView mImageView14;
        public ImageView mImageView15;
        public ImageView mImageView16;
        public ImageView mImageView17;
        public ImageView mImageView18;
        public ImageView mImageView19;
        public ImageView mImageView20;
        public ImageView mImageView21;
        public ImageView mImageView22;
        public ImageView mImageView23;
        public ImageView mImageView24;
        public ImageView mImageView25;
        public ImageView mImageView26;
        public ImageView mImageView27;
        public ImageView mImageView28;


        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon28Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            this.images.add(mImageView6);
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            this.images.add(mImageView7);
            mImageView8 = itemView.findViewById(R.id.ribbon8);
            this.images.add(mImageView8);
            mImageView9 = itemView.findViewById(R.id.ribbon9);
            this.images.add(mImageView9);
            mImageView10 = itemView.findViewById(R.id.ribbon10);
            this.images.add(mImageView10);
            mImageView11 = itemView.findViewById(R.id.ribbon11);
            this.images.add(mImageView11);
            mImageView12 = itemView.findViewById(R.id.ribbon12);
            this.images.add(mImageView12);
            mImageView13 = itemView.findViewById(R.id.ribbon13);
            this.images.add(mImageView13);
            mImageView14 = itemView.findViewById(R.id.ribbon14);
            this.images.add(mImageView14);
            mImageView15 = itemView.findViewById(R.id.ribbon15);
            this.images.add(mImageView15);
            mImageView16 = itemView.findViewById(R.id.ribbon16);
            this.images.add(mImageView16);
            mImageView17 = itemView.findViewById(R.id.ribbon17);
            this.images.add(mImageView17);
            mImageView18 = itemView.findViewById(R.id.ribbon18);
            this.images.add(mImageView18);
            mImageView19 = itemView.findViewById(R.id.ribbon19);
            this.images.add(mImageView19);
            mImageView20 = itemView.findViewById(R.id.ribbon20);
            this.images.add(mImageView20);
            mImageView21 = itemView.findViewById(R.id.ribbon21);
            this.images.add(mImageView21);
            mImageView22 = itemView.findViewById(R.id.ribbon22);
            this.images.add(mImageView22);
            mImageView23 = itemView.findViewById(R.id.ribbon23);
            this.images.add(mImageView23);
            mImageView24 = itemView.findViewById(R.id.ribbon24);
            this.images.add(mImageView24);
            mImageView25 = itemView.findViewById(R.id.ribbon25);
            this.images.add(mImageView25);
            mImageView26 = itemView.findViewById(R.id.ribbon26);
            this.images.add(mImageView26);
            mImageView27 = itemView.findViewById(R.id.ribbon27);
            this.images.add(mImageView27);
            mImageView28 = itemView.findViewById(R.id.ribbon28);
            this.images.add(mImageView28);

        }
    }

    public static class Ribbon29Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
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
        public ImageView mImageView13;
        public ImageView mImageView14;
        public ImageView mImageView15;
        public ImageView mImageView16;
        public ImageView mImageView17;
        public ImageView mImageView18;
        public ImageView mImageView19;
        public ImageView mImageView20;
        public ImageView mImageView21;
        public ImageView mImageView22;
        public ImageView mImageView23;
        public ImageView mImageView24;
        public ImageView mImageView25;
        public ImageView mImageView26;
        public ImageView mImageView27;
        public ImageView mImageView28;
        public ImageView mImageView29;


        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon29Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            this.images.add(mImageView6);
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            this.images.add(mImageView7);
            mImageView8 = itemView.findViewById(R.id.ribbon8);
            this.images.add(mImageView8);
            mImageView9 = itemView.findViewById(R.id.ribbon9);
            this.images.add(mImageView9);
            mImageView10 = itemView.findViewById(R.id.ribbon10);
            this.images.add(mImageView10);
            mImageView11 = itemView.findViewById(R.id.ribbon11);
            this.images.add(mImageView11);
            mImageView12 = itemView.findViewById(R.id.ribbon12);
            this.images.add(mImageView12);
            mImageView13 = itemView.findViewById(R.id.ribbon13);
            this.images.add(mImageView13);
            mImageView14 = itemView.findViewById(R.id.ribbon14);
            this.images.add(mImageView14);
            mImageView15 = itemView.findViewById(R.id.ribbon15);
            this.images.add(mImageView15);
            mImageView16 = itemView.findViewById(R.id.ribbon16);
            this.images.add(mImageView16);
            mImageView17 = itemView.findViewById(R.id.ribbon17);
            this.images.add(mImageView17);
            mImageView18 = itemView.findViewById(R.id.ribbon18);
            this.images.add(mImageView18);
            mImageView19 = itemView.findViewById(R.id.ribbon19);
            this.images.add(mImageView19);
            mImageView20 = itemView.findViewById(R.id.ribbon20);
            this.images.add(mImageView20);
            mImageView21 = itemView.findViewById(R.id.ribbon21);
            this.images.add(mImageView21);
            mImageView22 = itemView.findViewById(R.id.ribbon22);
            this.images.add(mImageView22);
            mImageView23 = itemView.findViewById(R.id.ribbon23);
            this.images.add(mImageView23);
            mImageView24 = itemView.findViewById(R.id.ribbon24);
            this.images.add(mImageView24);
            mImageView25 = itemView.findViewById(R.id.ribbon25);
            this.images.add(mImageView25);
            mImageView26 = itemView.findViewById(R.id.ribbon26);
            this.images.add(mImageView26);
            mImageView27 = itemView.findViewById(R.id.ribbon27);
            this.images.add(mImageView27);
            mImageView28 = itemView.findViewById(R.id.ribbon28);
            this.images.add(mImageView28);
            mImageView29 = itemView.findViewById(R.id.ribbon29);
            this.images.add(mImageView29);

        }
    }

    public static class Ribbon30Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
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
        public ImageView mImageView13;
        public ImageView mImageView14;
        public ImageView mImageView15;
        public ImageView mImageView16;
        public ImageView mImageView17;
        public ImageView mImageView18;
        public ImageView mImageView19;
        public ImageView mImageView20;
        public ImageView mImageView21;
        public ImageView mImageView22;
        public ImageView mImageView23;
        public ImageView mImageView24;
        public ImageView mImageView25;
        public ImageView mImageView26;
        public ImageView mImageView27;
        public ImageView mImageView28;
        public ImageView mImageView29;
        public ImageView mImageView30;


        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon30Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            this.images.add(mImageView6);
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            this.images.add(mImageView7);
            mImageView8 = itemView.findViewById(R.id.ribbon8);
            this.images.add(mImageView8);
            mImageView9 = itemView.findViewById(R.id.ribbon9);
            this.images.add(mImageView9);
            mImageView10 = itemView.findViewById(R.id.ribbon10);
            this.images.add(mImageView10);
            mImageView11 = itemView.findViewById(R.id.ribbon11);
            this.images.add(mImageView11);
            mImageView12 = itemView.findViewById(R.id.ribbon12);
            this.images.add(mImageView12);
            mImageView13 = itemView.findViewById(R.id.ribbon13);
            this.images.add(mImageView13);
            mImageView14 = itemView.findViewById(R.id.ribbon14);
            this.images.add(mImageView14);
            mImageView15 = itemView.findViewById(R.id.ribbon15);
            this.images.add(mImageView15);
            mImageView16 = itemView.findViewById(R.id.ribbon16);
            this.images.add(mImageView16);
            mImageView17 = itemView.findViewById(R.id.ribbon17);
            this.images.add(mImageView17);
            mImageView18 = itemView.findViewById(R.id.ribbon18);
            this.images.add(mImageView18);
            mImageView19 = itemView.findViewById(R.id.ribbon19);
            this.images.add(mImageView19);
            mImageView20 = itemView.findViewById(R.id.ribbon20);
            this.images.add(mImageView20);
            mImageView21 = itemView.findViewById(R.id.ribbon21);
            this.images.add(mImageView21);
            mImageView22 = itemView.findViewById(R.id.ribbon22);
            this.images.add(mImageView22);
            mImageView23 = itemView.findViewById(R.id.ribbon23);
            this.images.add(mImageView23);
            mImageView24 = itemView.findViewById(R.id.ribbon24);
            this.images.add(mImageView24);
            mImageView25 = itemView.findViewById(R.id.ribbon25);
            this.images.add(mImageView25);
            mImageView26 = itemView.findViewById(R.id.ribbon26);
            this.images.add(mImageView26);
            mImageView27 = itemView.findViewById(R.id.ribbon27);
            this.images.add(mImageView27);
            mImageView28 = itemView.findViewById(R.id.ribbon28);
            this.images.add(mImageView28);
            mImageView29 = itemView.findViewById(R.id.ribbon29);
            this.images.add(mImageView29);
            mImageView30 = itemView.findViewById(R.id.ribbon30);
            this.images.add(mImageView30);

        }
    }

    public static class Ribbon31Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
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
        public ImageView mImageView13;
        public ImageView mImageView14;
        public ImageView mImageView15;
        public ImageView mImageView16;
        public ImageView mImageView17;
        public ImageView mImageView18;
        public ImageView mImageView19;
        public ImageView mImageView20;
        public ImageView mImageView21;
        public ImageView mImageView22;
        public ImageView mImageView23;
        public ImageView mImageView24;
        public ImageView mImageView25;
        public ImageView mImageView26;
        public ImageView mImageView27;
        public ImageView mImageView28;
        public ImageView mImageView29;
        public ImageView mImageView30;
        public ImageView mImageView31;


        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon31Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            this.images.add(mImageView6);
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            this.images.add(mImageView7);
            mImageView8 = itemView.findViewById(R.id.ribbon8);
            this.images.add(mImageView8);
            mImageView9 = itemView.findViewById(R.id.ribbon9);
            this.images.add(mImageView9);
            mImageView10 = itemView.findViewById(R.id.ribbon10);
            this.images.add(mImageView10);
            mImageView11 = itemView.findViewById(R.id.ribbon11);
            this.images.add(mImageView11);
            mImageView12 = itemView.findViewById(R.id.ribbon12);
            this.images.add(mImageView12);
            mImageView13 = itemView.findViewById(R.id.ribbon13);
            this.images.add(mImageView13);
            mImageView14 = itemView.findViewById(R.id.ribbon14);
            this.images.add(mImageView14);
            mImageView15 = itemView.findViewById(R.id.ribbon15);
            this.images.add(mImageView15);
            mImageView16 = itemView.findViewById(R.id.ribbon16);
            this.images.add(mImageView16);
            mImageView17 = itemView.findViewById(R.id.ribbon17);
            this.images.add(mImageView17);
            mImageView18 = itemView.findViewById(R.id.ribbon18);
            this.images.add(mImageView18);
            mImageView19 = itemView.findViewById(R.id.ribbon19);
            this.images.add(mImageView19);
            mImageView20 = itemView.findViewById(R.id.ribbon20);
            this.images.add(mImageView20);
            mImageView21 = itemView.findViewById(R.id.ribbon21);
            this.images.add(mImageView21);
            mImageView22 = itemView.findViewById(R.id.ribbon22);
            this.images.add(mImageView22);
            mImageView23 = itemView.findViewById(R.id.ribbon23);
            this.images.add(mImageView23);
            mImageView24 = itemView.findViewById(R.id.ribbon24);
            this.images.add(mImageView24);
            mImageView25 = itemView.findViewById(R.id.ribbon25);
            this.images.add(mImageView25);
            mImageView26 = itemView.findViewById(R.id.ribbon26);
            this.images.add(mImageView26);
            mImageView27 = itemView.findViewById(R.id.ribbon27);
            this.images.add(mImageView27);
            mImageView28 = itemView.findViewById(R.id.ribbon28);
            this.images.add(mImageView28);
            mImageView29 = itemView.findViewById(R.id.ribbon29);
            this.images.add(mImageView29);
            mImageView30 = itemView.findViewById(R.id.ribbon30);
            this.images.add(mImageView30);
            mImageView31 = itemView.findViewById(R.id.ribbon31);
            this.images.add(mImageView31);

        }
    }

    public static class Ribbon32Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
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
        public ImageView mImageView13;
        public ImageView mImageView14;
        public ImageView mImageView15;
        public ImageView mImageView16;
        public ImageView mImageView17;
        public ImageView mImageView18;
        public ImageView mImageView19;
        public ImageView mImageView20;
        public ImageView mImageView21;
        public ImageView mImageView22;
        public ImageView mImageView23;
        public ImageView mImageView24;
        public ImageView mImageView25;
        public ImageView mImageView26;
        public ImageView mImageView27;
        public ImageView mImageView28;
        public ImageView mImageView29;
        public ImageView mImageView30;
        public ImageView mImageView31;
        public ImageView mImageView32;


        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon32Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            this.images.add(mImageView6);
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            this.images.add(mImageView7);
            mImageView8 = itemView.findViewById(R.id.ribbon8);
            this.images.add(mImageView8);
            mImageView9 = itemView.findViewById(R.id.ribbon9);
            this.images.add(mImageView9);
            mImageView10 = itemView.findViewById(R.id.ribbon10);
            this.images.add(mImageView10);
            mImageView11 = itemView.findViewById(R.id.ribbon11);
            this.images.add(mImageView11);
            mImageView12 = itemView.findViewById(R.id.ribbon12);
            this.images.add(mImageView12);
            mImageView13 = itemView.findViewById(R.id.ribbon13);
            this.images.add(mImageView13);
            mImageView14 = itemView.findViewById(R.id.ribbon14);
            this.images.add(mImageView14);
            mImageView15 = itemView.findViewById(R.id.ribbon15);
            this.images.add(mImageView15);
            mImageView16 = itemView.findViewById(R.id.ribbon16);
            this.images.add(mImageView16);
            mImageView17 = itemView.findViewById(R.id.ribbon17);
            this.images.add(mImageView17);
            mImageView18 = itemView.findViewById(R.id.ribbon18);
            this.images.add(mImageView18);
            mImageView19 = itemView.findViewById(R.id.ribbon19);
            this.images.add(mImageView19);
            mImageView20 = itemView.findViewById(R.id.ribbon20);
            this.images.add(mImageView20);
            mImageView21 = itemView.findViewById(R.id.ribbon21);
            this.images.add(mImageView21);
            mImageView22 = itemView.findViewById(R.id.ribbon22);
            this.images.add(mImageView22);
            mImageView23 = itemView.findViewById(R.id.ribbon23);
            this.images.add(mImageView23);
            mImageView24 = itemView.findViewById(R.id.ribbon24);
            this.images.add(mImageView24);
            mImageView25 = itemView.findViewById(R.id.ribbon25);
            this.images.add(mImageView25);
            mImageView26 = itemView.findViewById(R.id.ribbon26);
            this.images.add(mImageView26);
            mImageView27 = itemView.findViewById(R.id.ribbon27);
            this.images.add(mImageView27);
            mImageView28 = itemView.findViewById(R.id.ribbon28);
            this.images.add(mImageView28);
            mImageView29 = itemView.findViewById(R.id.ribbon29);
            this.images.add(mImageView29);
            mImageView30 = itemView.findViewById(R.id.ribbon30);
            this.images.add(mImageView30);
            mImageView31 = itemView.findViewById(R.id.ribbon31);
            this.images.add(mImageView31);
            mImageView32 = itemView.findViewById(R.id.ribbon32);
            this.images.add(mImageView32);

        }
    }

    public static class Ribbon33Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
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
        public ImageView mImageView13;
        public ImageView mImageView14;
        public ImageView mImageView15;
        public ImageView mImageView16;
        public ImageView mImageView17;
        public ImageView mImageView18;
        public ImageView mImageView19;
        public ImageView mImageView20;
        public ImageView mImageView21;
        public ImageView mImageView22;
        public ImageView mImageView23;
        public ImageView mImageView24;
        public ImageView mImageView25;
        public ImageView mImageView26;
        public ImageView mImageView27;
        public ImageView mImageView28;
        public ImageView mImageView29;
        public ImageView mImageView30;
        public ImageView mImageView31;
        public ImageView mImageView32;
        public ImageView mImageView33;


        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon33Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            this.images.add(mImageView6);
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            this.images.add(mImageView7);
            mImageView8 = itemView.findViewById(R.id.ribbon8);
            this.images.add(mImageView8);
            mImageView9 = itemView.findViewById(R.id.ribbon9);
            this.images.add(mImageView9);
            mImageView10 = itemView.findViewById(R.id.ribbon10);
            this.images.add(mImageView10);
            mImageView11 = itemView.findViewById(R.id.ribbon11);
            this.images.add(mImageView11);
            mImageView12 = itemView.findViewById(R.id.ribbon12);
            this.images.add(mImageView12);
            mImageView13 = itemView.findViewById(R.id.ribbon13);
            this.images.add(mImageView13);
            mImageView14 = itemView.findViewById(R.id.ribbon14);
            this.images.add(mImageView14);
            mImageView15 = itemView.findViewById(R.id.ribbon15);
            this.images.add(mImageView15);
            mImageView16 = itemView.findViewById(R.id.ribbon16);
            this.images.add(mImageView16);
            mImageView17 = itemView.findViewById(R.id.ribbon17);
            this.images.add(mImageView17);
            mImageView18 = itemView.findViewById(R.id.ribbon18);
            this.images.add(mImageView18);
            mImageView19 = itemView.findViewById(R.id.ribbon19);
            this.images.add(mImageView19);
            mImageView20 = itemView.findViewById(R.id.ribbon20);
            this.images.add(mImageView20);
            mImageView21 = itemView.findViewById(R.id.ribbon21);
            this.images.add(mImageView21);
            mImageView22 = itemView.findViewById(R.id.ribbon22);
            this.images.add(mImageView22);
            mImageView23 = itemView.findViewById(R.id.ribbon23);
            this.images.add(mImageView23);
            mImageView24 = itemView.findViewById(R.id.ribbon24);
            this.images.add(mImageView24);
            mImageView25 = itemView.findViewById(R.id.ribbon25);
            this.images.add(mImageView25);
            mImageView26 = itemView.findViewById(R.id.ribbon26);
            this.images.add(mImageView26);
            mImageView27 = itemView.findViewById(R.id.ribbon27);
            this.images.add(mImageView27);
            mImageView28 = itemView.findViewById(R.id.ribbon28);
            this.images.add(mImageView28);
            mImageView29 = itemView.findViewById(R.id.ribbon29);
            this.images.add(mImageView29);
            mImageView30 = itemView.findViewById(R.id.ribbon30);
            this.images.add(mImageView30);
            mImageView31 = itemView.findViewById(R.id.ribbon31);
            this.images.add(mImageView31);
            mImageView32 = itemView.findViewById(R.id.ribbon32);
            this.images.add(mImageView32);
            mImageView33 = itemView.findViewById(R.id.ribbon33);
            this.images.add(mImageView33);

        }
    }

    public static class Ribbon34Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
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
        public ImageView mImageView13;
        public ImageView mImageView14;
        public ImageView mImageView15;
        public ImageView mImageView16;
        public ImageView mImageView17;
        public ImageView mImageView18;
        public ImageView mImageView19;
        public ImageView mImageView20;
        public ImageView mImageView21;
        public ImageView mImageView22;
        public ImageView mImageView23;
        public ImageView mImageView24;
        public ImageView mImageView25;
        public ImageView mImageView26;
        public ImageView mImageView27;
        public ImageView mImageView28;
        public ImageView mImageView29;
        public ImageView mImageView30;
        public ImageView mImageView31;
        public ImageView mImageView32;
        public ImageView mImageView33;
        public ImageView mImageView34;


        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon34Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            this.images.add(mImageView6);
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            this.images.add(mImageView7);
            mImageView8 = itemView.findViewById(R.id.ribbon8);
            this.images.add(mImageView8);
            mImageView9 = itemView.findViewById(R.id.ribbon9);
            this.images.add(mImageView9);
            mImageView10 = itemView.findViewById(R.id.ribbon10);
            this.images.add(mImageView10);
            mImageView11 = itemView.findViewById(R.id.ribbon11);
            this.images.add(mImageView11);
            mImageView12 = itemView.findViewById(R.id.ribbon12);
            this.images.add(mImageView12);
            mImageView13 = itemView.findViewById(R.id.ribbon13);
            this.images.add(mImageView13);
            mImageView14 = itemView.findViewById(R.id.ribbon14);
            this.images.add(mImageView14);
            mImageView15 = itemView.findViewById(R.id.ribbon15);
            this.images.add(mImageView15);
            mImageView16 = itemView.findViewById(R.id.ribbon16);
            this.images.add(mImageView16);
            mImageView17 = itemView.findViewById(R.id.ribbon17);
            this.images.add(mImageView17);
            mImageView18 = itemView.findViewById(R.id.ribbon18);
            this.images.add(mImageView18);
            mImageView19 = itemView.findViewById(R.id.ribbon19);
            this.images.add(mImageView19);
            mImageView20 = itemView.findViewById(R.id.ribbon20);
            this.images.add(mImageView20);
            mImageView21 = itemView.findViewById(R.id.ribbon21);
            this.images.add(mImageView21);
            mImageView22 = itemView.findViewById(R.id.ribbon22);
            this.images.add(mImageView22);
            mImageView23 = itemView.findViewById(R.id.ribbon23);
            this.images.add(mImageView23);
            mImageView24 = itemView.findViewById(R.id.ribbon24);
            this.images.add(mImageView24);
            mImageView25 = itemView.findViewById(R.id.ribbon25);
            this.images.add(mImageView25);
            mImageView26 = itemView.findViewById(R.id.ribbon26);
            this.images.add(mImageView26);
            mImageView27 = itemView.findViewById(R.id.ribbon27);
            this.images.add(mImageView27);
            mImageView28 = itemView.findViewById(R.id.ribbon28);
            this.images.add(mImageView28);
            mImageView29 = itemView.findViewById(R.id.ribbon29);
            this.images.add(mImageView29);
            mImageView30 = itemView.findViewById(R.id.ribbon30);
            this.images.add(mImageView30);
            mImageView31 = itemView.findViewById(R.id.ribbon31);
            this.images.add(mImageView31);
            mImageView32 = itemView.findViewById(R.id.ribbon32);
            this.images.add(mImageView32);
            mImageView33 = itemView.findViewById(R.id.ribbon33);
            this.images.add(mImageView33);
            mImageView34 = itemView.findViewById(R.id.ribbon34);
            this.images.add(mImageView34);

        }
    }

    public static class Ribbon35Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
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
        public ImageView mImageView13;
        public ImageView mImageView14;
        public ImageView mImageView15;
        public ImageView mImageView16;
        public ImageView mImageView17;
        public ImageView mImageView18;
        public ImageView mImageView19;
        public ImageView mImageView20;
        public ImageView mImageView21;
        public ImageView mImageView22;
        public ImageView mImageView23;
        public ImageView mImageView24;
        public ImageView mImageView25;
        public ImageView mImageView26;
        public ImageView mImageView27;
        public ImageView mImageView28;
        public ImageView mImageView29;
        public ImageView mImageView30;
        public ImageView mImageView31;
        public ImageView mImageView32;
        public ImageView mImageView33;
        public ImageView mImageView34;
        public ImageView mImageView35;


        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon35Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            this.images.add(mImageView6);
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            this.images.add(mImageView7);
            mImageView8 = itemView.findViewById(R.id.ribbon8);
            this.images.add(mImageView8);
            mImageView9 = itemView.findViewById(R.id.ribbon9);
            this.images.add(mImageView9);
            mImageView10 = itemView.findViewById(R.id.ribbon10);
            this.images.add(mImageView10);
            mImageView11 = itemView.findViewById(R.id.ribbon11);
            this.images.add(mImageView11);
            mImageView12 = itemView.findViewById(R.id.ribbon12);
            this.images.add(mImageView12);
            mImageView13 = itemView.findViewById(R.id.ribbon13);
            this.images.add(mImageView13);
            mImageView14 = itemView.findViewById(R.id.ribbon14);
            this.images.add(mImageView14);
            mImageView15 = itemView.findViewById(R.id.ribbon15);
            this.images.add(mImageView15);
            mImageView16 = itemView.findViewById(R.id.ribbon16);
            this.images.add(mImageView16);
            mImageView17 = itemView.findViewById(R.id.ribbon17);
            this.images.add(mImageView17);
            mImageView18 = itemView.findViewById(R.id.ribbon18);
            this.images.add(mImageView18);
            mImageView19 = itemView.findViewById(R.id.ribbon19);
            this.images.add(mImageView19);
            mImageView20 = itemView.findViewById(R.id.ribbon20);
            this.images.add(mImageView20);
            mImageView21 = itemView.findViewById(R.id.ribbon21);
            this.images.add(mImageView21);
            mImageView22 = itemView.findViewById(R.id.ribbon22);
            this.images.add(mImageView22);
            mImageView23 = itemView.findViewById(R.id.ribbon23);
            this.images.add(mImageView23);
            mImageView24 = itemView.findViewById(R.id.ribbon24);
            this.images.add(mImageView24);
            mImageView25 = itemView.findViewById(R.id.ribbon25);
            this.images.add(mImageView25);
            mImageView26 = itemView.findViewById(R.id.ribbon26);
            this.images.add(mImageView26);
            mImageView27 = itemView.findViewById(R.id.ribbon27);
            this.images.add(mImageView27);
            mImageView28 = itemView.findViewById(R.id.ribbon28);
            this.images.add(mImageView28);
            mImageView29 = itemView.findViewById(R.id.ribbon29);
            this.images.add(mImageView29);
            mImageView30 = itemView.findViewById(R.id.ribbon30);
            this.images.add(mImageView30);
            mImageView31 = itemView.findViewById(R.id.ribbon31);
            this.images.add(mImageView31);
            mImageView32 = itemView.findViewById(R.id.ribbon32);
            this.images.add(mImageView32);
            mImageView33 = itemView.findViewById(R.id.ribbon33);
            this.images.add(mImageView33);
            mImageView34 = itemView.findViewById(R.id.ribbon34);
            this.images.add(mImageView34);
            mImageView35 = itemView.findViewById(R.id.ribbon35);
            this.images.add(mImageView35);

        }
    }

    public static class Ribbon36Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
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
        public ImageView mImageView13;
        public ImageView mImageView14;
        public ImageView mImageView15;
        public ImageView mImageView16;
        public ImageView mImageView17;
        public ImageView mImageView18;
        public ImageView mImageView19;
        public ImageView mImageView20;
        public ImageView mImageView21;
        public ImageView mImageView22;
        public ImageView mImageView23;
        public ImageView mImageView24;
        public ImageView mImageView25;
        public ImageView mImageView26;
        public ImageView mImageView27;
        public ImageView mImageView28;
        public ImageView mImageView29;
        public ImageView mImageView30;
        public ImageView mImageView31;
        public ImageView mImageView32;
        public ImageView mImageView33;
        public ImageView mImageView34;
        public ImageView mImageView35;
        public ImageView mImageView36;


        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon36Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            this.images.add(mImageView6);
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            this.images.add(mImageView7);
            mImageView8 = itemView.findViewById(R.id.ribbon8);
            this.images.add(mImageView8);
            mImageView9 = itemView.findViewById(R.id.ribbon9);
            this.images.add(mImageView9);
            mImageView10 = itemView.findViewById(R.id.ribbon10);
            this.images.add(mImageView10);
            mImageView11 = itemView.findViewById(R.id.ribbon11);
            this.images.add(mImageView11);
            mImageView12 = itemView.findViewById(R.id.ribbon12);
            this.images.add(mImageView12);
            mImageView13 = itemView.findViewById(R.id.ribbon13);
            this.images.add(mImageView13);
            mImageView14 = itemView.findViewById(R.id.ribbon14);
            this.images.add(mImageView14);
            mImageView15 = itemView.findViewById(R.id.ribbon15);
            this.images.add(mImageView15);
            mImageView16 = itemView.findViewById(R.id.ribbon16);
            this.images.add(mImageView16);
            mImageView17 = itemView.findViewById(R.id.ribbon17);
            this.images.add(mImageView17);
            mImageView18 = itemView.findViewById(R.id.ribbon18);
            this.images.add(mImageView18);
            mImageView19 = itemView.findViewById(R.id.ribbon19);
            this.images.add(mImageView19);
            mImageView20 = itemView.findViewById(R.id.ribbon20);
            this.images.add(mImageView20);
            mImageView21 = itemView.findViewById(R.id.ribbon21);
            this.images.add(mImageView21);
            mImageView22 = itemView.findViewById(R.id.ribbon22);
            this.images.add(mImageView22);
            mImageView23 = itemView.findViewById(R.id.ribbon23);
            this.images.add(mImageView23);
            mImageView24 = itemView.findViewById(R.id.ribbon24);
            this.images.add(mImageView24);
            mImageView25 = itemView.findViewById(R.id.ribbon25);
            this.images.add(mImageView25);
            mImageView26 = itemView.findViewById(R.id.ribbon26);
            this.images.add(mImageView26);
            mImageView27 = itemView.findViewById(R.id.ribbon27);
            this.images.add(mImageView27);
            mImageView28 = itemView.findViewById(R.id.ribbon28);
            this.images.add(mImageView28);
            mImageView29 = itemView.findViewById(R.id.ribbon29);
            this.images.add(mImageView29);
            mImageView30 = itemView.findViewById(R.id.ribbon30);
            this.images.add(mImageView30);
            mImageView31 = itemView.findViewById(R.id.ribbon31);
            this.images.add(mImageView31);
            mImageView32 = itemView.findViewById(R.id.ribbon32);
            this.images.add(mImageView32);
            mImageView33 = itemView.findViewById(R.id.ribbon33);
            this.images.add(mImageView33);
            mImageView34 = itemView.findViewById(R.id.ribbon34);
            this.images.add(mImageView34);
            mImageView35 = itemView.findViewById(R.id.ribbon35);
            this.images.add(mImageView35);
            mImageView36 = itemView.findViewById(R.id.ribbon36);
            this.images.add(mImageView36);

        }
    }

    public static class Ribbon37Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
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
        public ImageView mImageView13;
        public ImageView mImageView14;
        public ImageView mImageView15;
        public ImageView mImageView16;
        public ImageView mImageView17;
        public ImageView mImageView18;
        public ImageView mImageView19;
        public ImageView mImageView20;
        public ImageView mImageView21;
        public ImageView mImageView22;
        public ImageView mImageView23;
        public ImageView mImageView24;
        public ImageView mImageView25;
        public ImageView mImageView26;
        public ImageView mImageView27;
        public ImageView mImageView28;
        public ImageView mImageView29;
        public ImageView mImageView30;
        public ImageView mImageView31;
        public ImageView mImageView32;
        public ImageView mImageView33;
        public ImageView mImageView34;
        public ImageView mImageView35;
        public ImageView mImageView36;
        public ImageView mImageView37;


        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon37Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            this.images.add(mImageView6);
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            this.images.add(mImageView7);
            mImageView8 = itemView.findViewById(R.id.ribbon8);
            this.images.add(mImageView8);
            mImageView9 = itemView.findViewById(R.id.ribbon9);
            this.images.add(mImageView9);
            mImageView10 = itemView.findViewById(R.id.ribbon10);
            this.images.add(mImageView10);
            mImageView11 = itemView.findViewById(R.id.ribbon11);
            this.images.add(mImageView11);
            mImageView12 = itemView.findViewById(R.id.ribbon12);
            this.images.add(mImageView12);
            mImageView13 = itemView.findViewById(R.id.ribbon13);
            this.images.add(mImageView13);
            mImageView14 = itemView.findViewById(R.id.ribbon14);
            this.images.add(mImageView14);
            mImageView15 = itemView.findViewById(R.id.ribbon15);
            this.images.add(mImageView15);
            mImageView16 = itemView.findViewById(R.id.ribbon16);
            this.images.add(mImageView16);
            mImageView17 = itemView.findViewById(R.id.ribbon17);
            this.images.add(mImageView17);
            mImageView18 = itemView.findViewById(R.id.ribbon18);
            this.images.add(mImageView18);
            mImageView19 = itemView.findViewById(R.id.ribbon19);
            this.images.add(mImageView19);
            mImageView20 = itemView.findViewById(R.id.ribbon20);
            this.images.add(mImageView20);
            mImageView21 = itemView.findViewById(R.id.ribbon21);
            this.images.add(mImageView21);
            mImageView22 = itemView.findViewById(R.id.ribbon22);
            this.images.add(mImageView22);
            mImageView23 = itemView.findViewById(R.id.ribbon23);
            this.images.add(mImageView23);
            mImageView24 = itemView.findViewById(R.id.ribbon24);
            this.images.add(mImageView24);
            mImageView25 = itemView.findViewById(R.id.ribbon25);
            this.images.add(mImageView25);
            mImageView26 = itemView.findViewById(R.id.ribbon26);
            this.images.add(mImageView26);
            mImageView27 = itemView.findViewById(R.id.ribbon27);
            this.images.add(mImageView27);
            mImageView28 = itemView.findViewById(R.id.ribbon28);
            this.images.add(mImageView28);
            mImageView29 = itemView.findViewById(R.id.ribbon29);
            this.images.add(mImageView29);
            mImageView30 = itemView.findViewById(R.id.ribbon30);
            this.images.add(mImageView30);
            mImageView31 = itemView.findViewById(R.id.ribbon31);
            this.images.add(mImageView31);
            mImageView32 = itemView.findViewById(R.id.ribbon32);
            this.images.add(mImageView32);
            mImageView33 = itemView.findViewById(R.id.ribbon33);
            this.images.add(mImageView33);
            mImageView34 = itemView.findViewById(R.id.ribbon34);
            this.images.add(mImageView34);
            mImageView35 = itemView.findViewById(R.id.ribbon35);
            this.images.add(mImageView35);
            mImageView36 = itemView.findViewById(R.id.ribbon36);
            this.images.add(mImageView36);
            mImageView37 = itemView.findViewById(R.id.ribbon37);
            this.images.add(mImageView37);

        }
    }

    public static class Ribbon38Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
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
        public ImageView mImageView13;
        public ImageView mImageView14;
        public ImageView mImageView15;
        public ImageView mImageView16;
        public ImageView mImageView17;
        public ImageView mImageView18;
        public ImageView mImageView19;
        public ImageView mImageView20;
        public ImageView mImageView21;
        public ImageView mImageView22;
        public ImageView mImageView23;
        public ImageView mImageView24;
        public ImageView mImageView25;
        public ImageView mImageView26;
        public ImageView mImageView27;
        public ImageView mImageView28;
        public ImageView mImageView29;
        public ImageView mImageView30;
        public ImageView mImageView31;
        public ImageView mImageView32;
        public ImageView mImageView33;
        public ImageView mImageView34;
        public ImageView mImageView35;
        public ImageView mImageView36;
        public ImageView mImageView37;
        public ImageView mImageView38;


        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon38Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            this.images.add(mImageView6);
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            this.images.add(mImageView7);
            mImageView8 = itemView.findViewById(R.id.ribbon8);
            this.images.add(mImageView8);
            mImageView9 = itemView.findViewById(R.id.ribbon9);
            this.images.add(mImageView9);
            mImageView10 = itemView.findViewById(R.id.ribbon10);
            this.images.add(mImageView10);
            mImageView11 = itemView.findViewById(R.id.ribbon11);
            this.images.add(mImageView11);
            mImageView12 = itemView.findViewById(R.id.ribbon12);
            this.images.add(mImageView12);
            mImageView13 = itemView.findViewById(R.id.ribbon13);
            this.images.add(mImageView13);
            mImageView14 = itemView.findViewById(R.id.ribbon14);
            this.images.add(mImageView14);
            mImageView15 = itemView.findViewById(R.id.ribbon15);
            this.images.add(mImageView15);
            mImageView16 = itemView.findViewById(R.id.ribbon16);
            this.images.add(mImageView16);
            mImageView17 = itemView.findViewById(R.id.ribbon17);
            this.images.add(mImageView17);
            mImageView18 = itemView.findViewById(R.id.ribbon18);
            this.images.add(mImageView18);
            mImageView19 = itemView.findViewById(R.id.ribbon19);
            this.images.add(mImageView19);
            mImageView20 = itemView.findViewById(R.id.ribbon20);
            this.images.add(mImageView20);
            mImageView21 = itemView.findViewById(R.id.ribbon21);
            this.images.add(mImageView21);
            mImageView22 = itemView.findViewById(R.id.ribbon22);
            this.images.add(mImageView22);
            mImageView23 = itemView.findViewById(R.id.ribbon23);
            this.images.add(mImageView23);
            mImageView24 = itemView.findViewById(R.id.ribbon24);
            this.images.add(mImageView24);
            mImageView25 = itemView.findViewById(R.id.ribbon25);
            this.images.add(mImageView25);
            mImageView26 = itemView.findViewById(R.id.ribbon26);
            this.images.add(mImageView26);
            mImageView27 = itemView.findViewById(R.id.ribbon27);
            this.images.add(mImageView27);
            mImageView28 = itemView.findViewById(R.id.ribbon28);
            this.images.add(mImageView28);
            mImageView29 = itemView.findViewById(R.id.ribbon29);
            this.images.add(mImageView29);
            mImageView30 = itemView.findViewById(R.id.ribbon30);
            this.images.add(mImageView30);
            mImageView31 = itemView.findViewById(R.id.ribbon31);
            this.images.add(mImageView31);
            mImageView32 = itemView.findViewById(R.id.ribbon32);
            this.images.add(mImageView32);
            mImageView33 = itemView.findViewById(R.id.ribbon33);
            this.images.add(mImageView33);
            mImageView34 = itemView.findViewById(R.id.ribbon34);
            this.images.add(mImageView34);
            mImageView35 = itemView.findViewById(R.id.ribbon35);
            this.images.add(mImageView35);
            mImageView36 = itemView.findViewById(R.id.ribbon36);
            this.images.add(mImageView36);
            mImageView37 = itemView.findViewById(R.id.ribbon37);
            this.images.add(mImageView37);
            mImageView38 = itemView.findViewById(R.id.ribbon38);
            this.images.add(mImageView38);

        }
    }

    public static class Ribbon39Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
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
        public ImageView mImageView13;
        public ImageView mImageView14;
        public ImageView mImageView15;
        public ImageView mImageView16;
        public ImageView mImageView17;
        public ImageView mImageView18;
        public ImageView mImageView19;
        public ImageView mImageView20;
        public ImageView mImageView21;
        public ImageView mImageView22;
        public ImageView mImageView23;
        public ImageView mImageView24;
        public ImageView mImageView25;
        public ImageView mImageView26;
        public ImageView mImageView27;
        public ImageView mImageView28;
        public ImageView mImageView29;
        public ImageView mImageView30;
        public ImageView mImageView31;
        public ImageView mImageView32;
        public ImageView mImageView33;
        public ImageView mImageView34;
        public ImageView mImageView35;
        public ImageView mImageView36;
        public ImageView mImageView37;
        public ImageView mImageView38;
        public ImageView mImageView39;


        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon39Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            this.images.add(mImageView6);
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            this.images.add(mImageView7);
            mImageView8 = itemView.findViewById(R.id.ribbon8);
            this.images.add(mImageView8);
            mImageView9 = itemView.findViewById(R.id.ribbon9);
            this.images.add(mImageView9);
            mImageView10 = itemView.findViewById(R.id.ribbon10);
            this.images.add(mImageView10);
            mImageView11 = itemView.findViewById(R.id.ribbon11);
            this.images.add(mImageView11);
            mImageView12 = itemView.findViewById(R.id.ribbon12);
            this.images.add(mImageView12);
            mImageView13 = itemView.findViewById(R.id.ribbon13);
            this.images.add(mImageView13);
            mImageView14 = itemView.findViewById(R.id.ribbon14);
            this.images.add(mImageView14);
            mImageView15 = itemView.findViewById(R.id.ribbon15);
            this.images.add(mImageView15);
            mImageView16 = itemView.findViewById(R.id.ribbon16);
            this.images.add(mImageView16);
            mImageView17 = itemView.findViewById(R.id.ribbon17);
            this.images.add(mImageView17);
            mImageView18 = itemView.findViewById(R.id.ribbon18);
            this.images.add(mImageView18);
            mImageView19 = itemView.findViewById(R.id.ribbon19);
            this.images.add(mImageView19);
            mImageView20 = itemView.findViewById(R.id.ribbon20);
            this.images.add(mImageView20);
            mImageView21 = itemView.findViewById(R.id.ribbon21);
            this.images.add(mImageView21);
            mImageView22 = itemView.findViewById(R.id.ribbon22);
            this.images.add(mImageView22);
            mImageView23 = itemView.findViewById(R.id.ribbon23);
            this.images.add(mImageView23);
            mImageView24 = itemView.findViewById(R.id.ribbon24);
            this.images.add(mImageView24);
            mImageView25 = itemView.findViewById(R.id.ribbon25);
            this.images.add(mImageView25);
            mImageView26 = itemView.findViewById(R.id.ribbon26);
            this.images.add(mImageView26);
            mImageView27 = itemView.findViewById(R.id.ribbon27);
            this.images.add(mImageView27);
            mImageView28 = itemView.findViewById(R.id.ribbon28);
            this.images.add(mImageView28);
            mImageView29 = itemView.findViewById(R.id.ribbon29);
            this.images.add(mImageView29);
            mImageView30 = itemView.findViewById(R.id.ribbon30);
            this.images.add(mImageView30);
            mImageView31 = itemView.findViewById(R.id.ribbon31);
            this.images.add(mImageView31);
            mImageView32 = itemView.findViewById(R.id.ribbon32);
            this.images.add(mImageView32);
            mImageView33 = itemView.findViewById(R.id.ribbon33);
            this.images.add(mImageView33);
            mImageView34 = itemView.findViewById(R.id.ribbon34);
            this.images.add(mImageView34);
            mImageView35 = itemView.findViewById(R.id.ribbon35);
            this.images.add(mImageView35);
            mImageView36 = itemView.findViewById(R.id.ribbon36);
            this.images.add(mImageView36);
            mImageView37 = itemView.findViewById(R.id.ribbon37);
            this.images.add(mImageView37);
            mImageView38 = itemView.findViewById(R.id.ribbon38);
            this.images.add(mImageView38);
            mImageView39 = itemView.findViewById(R.id.ribbon39);
            this.images.add(mImageView39);

        }
    }

    public static class Ribbon40Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
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
        public ImageView mImageView13;
        public ImageView mImageView14;
        public ImageView mImageView15;
        public ImageView mImageView16;
        public ImageView mImageView17;
        public ImageView mImageView18;
        public ImageView mImageView19;
        public ImageView mImageView20;
        public ImageView mImageView21;
        public ImageView mImageView22;
        public ImageView mImageView23;
        public ImageView mImageView24;
        public ImageView mImageView25;
        public ImageView mImageView26;
        public ImageView mImageView27;
        public ImageView mImageView28;
        public ImageView mImageView29;
        public ImageView mImageView30;
        public ImageView mImageView31;
        public ImageView mImageView32;
        public ImageView mImageView33;
        public ImageView mImageView34;
        public ImageView mImageView35;
        public ImageView mImageView36;
        public ImageView mImageView37;
        public ImageView mImageView38;
        public ImageView mImageView39;
        public ImageView mImageView40;


        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon40Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            this.images.add(mImageView6);
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            this.images.add(mImageView7);
            mImageView8 = itemView.findViewById(R.id.ribbon8);
            this.images.add(mImageView8);
            mImageView9 = itemView.findViewById(R.id.ribbon9);
            this.images.add(mImageView9);
            mImageView10 = itemView.findViewById(R.id.ribbon10);
            this.images.add(mImageView10);
            mImageView11 = itemView.findViewById(R.id.ribbon11);
            this.images.add(mImageView11);
            mImageView12 = itemView.findViewById(R.id.ribbon12);
            this.images.add(mImageView12);
            mImageView13 = itemView.findViewById(R.id.ribbon13);
            this.images.add(mImageView13);
            mImageView14 = itemView.findViewById(R.id.ribbon14);
            this.images.add(mImageView14);
            mImageView15 = itemView.findViewById(R.id.ribbon15);
            this.images.add(mImageView15);
            mImageView16 = itemView.findViewById(R.id.ribbon16);
            this.images.add(mImageView16);
            mImageView17 = itemView.findViewById(R.id.ribbon17);
            this.images.add(mImageView17);
            mImageView18 = itemView.findViewById(R.id.ribbon18);
            this.images.add(mImageView18);
            mImageView19 = itemView.findViewById(R.id.ribbon19);
            this.images.add(mImageView19);
            mImageView20 = itemView.findViewById(R.id.ribbon20);
            this.images.add(mImageView20);
            mImageView21 = itemView.findViewById(R.id.ribbon21);
            this.images.add(mImageView21);
            mImageView22 = itemView.findViewById(R.id.ribbon22);
            this.images.add(mImageView22);
            mImageView23 = itemView.findViewById(R.id.ribbon23);
            this.images.add(mImageView23);
            mImageView24 = itemView.findViewById(R.id.ribbon24);
            this.images.add(mImageView24);
            mImageView25 = itemView.findViewById(R.id.ribbon25);
            this.images.add(mImageView25);
            mImageView26 = itemView.findViewById(R.id.ribbon26);
            this.images.add(mImageView26);
            mImageView27 = itemView.findViewById(R.id.ribbon27);
            this.images.add(mImageView27);
            mImageView28 = itemView.findViewById(R.id.ribbon28);
            this.images.add(mImageView28);
            mImageView29 = itemView.findViewById(R.id.ribbon29);
            this.images.add(mImageView29);
            mImageView30 = itemView.findViewById(R.id.ribbon30);
            this.images.add(mImageView30);
            mImageView31 = itemView.findViewById(R.id.ribbon31);
            this.images.add(mImageView31);
            mImageView32 = itemView.findViewById(R.id.ribbon32);
            this.images.add(mImageView32);
            mImageView33 = itemView.findViewById(R.id.ribbon33);
            this.images.add(mImageView33);
            mImageView34 = itemView.findViewById(R.id.ribbon34);
            this.images.add(mImageView34);
            mImageView35 = itemView.findViewById(R.id.ribbon35);
            this.images.add(mImageView35);
            mImageView36 = itemView.findViewById(R.id.ribbon36);
            this.images.add(mImageView36);
            mImageView37 = itemView.findViewById(R.id.ribbon37);
            this.images.add(mImageView37);
            mImageView38 = itemView.findViewById(R.id.ribbon38);
            this.images.add(mImageView38);
            mImageView39 = itemView.findViewById(R.id.ribbon39);
            this.images.add(mImageView39);
            mImageView40 = itemView.findViewById(R.id.ribbon40);
            this.images.add(mImageView40);

        }
    }

    public static class Ribbon41Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
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
        public ImageView mImageView13;
        public ImageView mImageView14;
        public ImageView mImageView15;
        public ImageView mImageView16;
        public ImageView mImageView17;
        public ImageView mImageView18;
        public ImageView mImageView19;
        public ImageView mImageView20;
        public ImageView mImageView21;
        public ImageView mImageView22;
        public ImageView mImageView23;
        public ImageView mImageView24;
        public ImageView mImageView25;
        public ImageView mImageView26;
        public ImageView mImageView27;
        public ImageView mImageView28;
        public ImageView mImageView29;
        public ImageView mImageView30;
        public ImageView mImageView31;
        public ImageView mImageView32;
        public ImageView mImageView33;
        public ImageView mImageView34;
        public ImageView mImageView35;
        public ImageView mImageView36;
        public ImageView mImageView37;
        public ImageView mImageView38;
        public ImageView mImageView39;
        public ImageView mImageView40;
        public ImageView mImageView41;


        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon41Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            this.images.add(mImageView6);
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            this.images.add(mImageView7);
            mImageView8 = itemView.findViewById(R.id.ribbon8);
            this.images.add(mImageView8);
            mImageView9 = itemView.findViewById(R.id.ribbon9);
            this.images.add(mImageView9);
            mImageView10 = itemView.findViewById(R.id.ribbon10);
            this.images.add(mImageView10);
            mImageView11 = itemView.findViewById(R.id.ribbon11);
            this.images.add(mImageView11);
            mImageView12 = itemView.findViewById(R.id.ribbon12);
            this.images.add(mImageView12);
            mImageView13 = itemView.findViewById(R.id.ribbon13);
            this.images.add(mImageView13);
            mImageView14 = itemView.findViewById(R.id.ribbon14);
            this.images.add(mImageView14);
            mImageView15 = itemView.findViewById(R.id.ribbon15);
            this.images.add(mImageView15);
            mImageView16 = itemView.findViewById(R.id.ribbon16);
            this.images.add(mImageView16);
            mImageView17 = itemView.findViewById(R.id.ribbon17);
            this.images.add(mImageView17);
            mImageView18 = itemView.findViewById(R.id.ribbon18);
            this.images.add(mImageView18);
            mImageView19 = itemView.findViewById(R.id.ribbon19);
            this.images.add(mImageView19);
            mImageView20 = itemView.findViewById(R.id.ribbon20);
            this.images.add(mImageView20);
            mImageView21 = itemView.findViewById(R.id.ribbon21);
            this.images.add(mImageView21);
            mImageView22 = itemView.findViewById(R.id.ribbon22);
            this.images.add(mImageView22);
            mImageView23 = itemView.findViewById(R.id.ribbon23);
            this.images.add(mImageView23);
            mImageView24 = itemView.findViewById(R.id.ribbon24);
            this.images.add(mImageView24);
            mImageView25 = itemView.findViewById(R.id.ribbon25);
            this.images.add(mImageView25);
            mImageView26 = itemView.findViewById(R.id.ribbon26);
            this.images.add(mImageView26);
            mImageView27 = itemView.findViewById(R.id.ribbon27);
            this.images.add(mImageView27);
            mImageView28 = itemView.findViewById(R.id.ribbon28);
            this.images.add(mImageView28);
            mImageView29 = itemView.findViewById(R.id.ribbon29);
            this.images.add(mImageView29);
            mImageView30 = itemView.findViewById(R.id.ribbon30);
            this.images.add(mImageView30);
            mImageView31 = itemView.findViewById(R.id.ribbon31);
            this.images.add(mImageView31);
            mImageView32 = itemView.findViewById(R.id.ribbon32);
            this.images.add(mImageView32);
            mImageView33 = itemView.findViewById(R.id.ribbon33);
            this.images.add(mImageView33);
            mImageView34 = itemView.findViewById(R.id.ribbon34);
            this.images.add(mImageView34);
            mImageView35 = itemView.findViewById(R.id.ribbon35);
            this.images.add(mImageView35);
            mImageView36 = itemView.findViewById(R.id.ribbon36);
            this.images.add(mImageView36);
            mImageView37 = itemView.findViewById(R.id.ribbon37);
            this.images.add(mImageView37);
            mImageView38 = itemView.findViewById(R.id.ribbon38);
            this.images.add(mImageView38);
            mImageView39 = itemView.findViewById(R.id.ribbon39);
            this.images.add(mImageView39);
            mImageView40 = itemView.findViewById(R.id.ribbon40);
            this.images.add(mImageView40);
            mImageView41 = itemView.findViewById(R.id.ribbon41);
            this.images.add(mImageView41);

        }
    }

    public static class Ribbon42Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
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
        public ImageView mImageView13;
        public ImageView mImageView14;
        public ImageView mImageView15;
        public ImageView mImageView16;
        public ImageView mImageView17;
        public ImageView mImageView18;
        public ImageView mImageView19;
        public ImageView mImageView20;
        public ImageView mImageView21;
        public ImageView mImageView22;
        public ImageView mImageView23;
        public ImageView mImageView24;
        public ImageView mImageView25;
        public ImageView mImageView26;
        public ImageView mImageView27;
        public ImageView mImageView28;
        public ImageView mImageView29;
        public ImageView mImageView30;
        public ImageView mImageView31;
        public ImageView mImageView32;
        public ImageView mImageView33;
        public ImageView mImageView34;
        public ImageView mImageView35;
        public ImageView mImageView36;
        public ImageView mImageView37;
        public ImageView mImageView38;
        public ImageView mImageView39;
        public ImageView mImageView40;
        public ImageView mImageView41;
        public ImageView mImageView42;


        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon42Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            this.images.add(mImageView6);
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            this.images.add(mImageView7);
            mImageView8 = itemView.findViewById(R.id.ribbon8);
            this.images.add(mImageView8);
            mImageView9 = itemView.findViewById(R.id.ribbon9);
            this.images.add(mImageView9);
            mImageView10 = itemView.findViewById(R.id.ribbon10);
            this.images.add(mImageView10);
            mImageView11 = itemView.findViewById(R.id.ribbon11);
            this.images.add(mImageView11);
            mImageView12 = itemView.findViewById(R.id.ribbon12);
            this.images.add(mImageView12);
            mImageView13 = itemView.findViewById(R.id.ribbon13);
            this.images.add(mImageView13);
            mImageView14 = itemView.findViewById(R.id.ribbon14);
            this.images.add(mImageView14);
            mImageView15 = itemView.findViewById(R.id.ribbon15);
            this.images.add(mImageView15);
            mImageView16 = itemView.findViewById(R.id.ribbon16);
            this.images.add(mImageView16);
            mImageView17 = itemView.findViewById(R.id.ribbon17);
            this.images.add(mImageView17);
            mImageView18 = itemView.findViewById(R.id.ribbon18);
            this.images.add(mImageView18);
            mImageView19 = itemView.findViewById(R.id.ribbon19);
            this.images.add(mImageView19);
            mImageView20 = itemView.findViewById(R.id.ribbon20);
            this.images.add(mImageView20);
            mImageView21 = itemView.findViewById(R.id.ribbon21);
            this.images.add(mImageView21);
            mImageView22 = itemView.findViewById(R.id.ribbon22);
            this.images.add(mImageView22);
            mImageView23 = itemView.findViewById(R.id.ribbon23);
            this.images.add(mImageView23);
            mImageView24 = itemView.findViewById(R.id.ribbon24);
            this.images.add(mImageView24);
            mImageView25 = itemView.findViewById(R.id.ribbon25);
            this.images.add(mImageView25);
            mImageView26 = itemView.findViewById(R.id.ribbon26);
            this.images.add(mImageView26);
            mImageView27 = itemView.findViewById(R.id.ribbon27);
            this.images.add(mImageView27);
            mImageView28 = itemView.findViewById(R.id.ribbon28);
            this.images.add(mImageView28);
            mImageView29 = itemView.findViewById(R.id.ribbon29);
            this.images.add(mImageView29);
            mImageView30 = itemView.findViewById(R.id.ribbon30);
            this.images.add(mImageView30);
            mImageView31 = itemView.findViewById(R.id.ribbon31);
            this.images.add(mImageView31);
            mImageView32 = itemView.findViewById(R.id.ribbon32);
            this.images.add(mImageView32);
            mImageView33 = itemView.findViewById(R.id.ribbon33);
            this.images.add(mImageView33);
            mImageView34 = itemView.findViewById(R.id.ribbon34);
            this.images.add(mImageView34);
            mImageView35 = itemView.findViewById(R.id.ribbon35);
            this.images.add(mImageView35);
            mImageView36 = itemView.findViewById(R.id.ribbon36);
            this.images.add(mImageView36);
            mImageView37 = itemView.findViewById(R.id.ribbon37);
            this.images.add(mImageView37);
            mImageView38 = itemView.findViewById(R.id.ribbon38);
            this.images.add(mImageView38);
            mImageView39 = itemView.findViewById(R.id.ribbon39);
            this.images.add(mImageView39);
            mImageView40 = itemView.findViewById(R.id.ribbon40);
            this.images.add(mImageView40);
            mImageView41 = itemView.findViewById(R.id.ribbon41);
            this.images.add(mImageView41);
            mImageView42 = itemView.findViewById(R.id.ribbon42);
            this.images.add(mImageView42);

        }
    }

    public static class Ribbon43Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
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
        public ImageView mImageView13;
        public ImageView mImageView14;
        public ImageView mImageView15;
        public ImageView mImageView16;
        public ImageView mImageView17;
        public ImageView mImageView18;
        public ImageView mImageView19;
        public ImageView mImageView20;
        public ImageView mImageView21;
        public ImageView mImageView22;
        public ImageView mImageView23;
        public ImageView mImageView24;
        public ImageView mImageView25;
        public ImageView mImageView26;
        public ImageView mImageView27;
        public ImageView mImageView28;
        public ImageView mImageView29;
        public ImageView mImageView30;
        public ImageView mImageView31;
        public ImageView mImageView32;
        public ImageView mImageView33;
        public ImageView mImageView34;
        public ImageView mImageView35;
        public ImageView mImageView36;
        public ImageView mImageView37;
        public ImageView mImageView38;
        public ImageView mImageView39;
        public ImageView mImageView40;
        public ImageView mImageView41;
        public ImageView mImageView42;
        public ImageView mImageView43;


        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon43Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            this.images.add(mImageView6);
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            this.images.add(mImageView7);
            mImageView8 = itemView.findViewById(R.id.ribbon8);
            this.images.add(mImageView8);
            mImageView9 = itemView.findViewById(R.id.ribbon9);
            this.images.add(mImageView9);
            mImageView10 = itemView.findViewById(R.id.ribbon10);
            this.images.add(mImageView10);
            mImageView11 = itemView.findViewById(R.id.ribbon11);
            this.images.add(mImageView11);
            mImageView12 = itemView.findViewById(R.id.ribbon12);
            this.images.add(mImageView12);
            mImageView13 = itemView.findViewById(R.id.ribbon13);
            this.images.add(mImageView13);
            mImageView14 = itemView.findViewById(R.id.ribbon14);
            this.images.add(mImageView14);
            mImageView15 = itemView.findViewById(R.id.ribbon15);
            this.images.add(mImageView15);
            mImageView16 = itemView.findViewById(R.id.ribbon16);
            this.images.add(mImageView16);
            mImageView17 = itemView.findViewById(R.id.ribbon17);
            this.images.add(mImageView17);
            mImageView18 = itemView.findViewById(R.id.ribbon18);
            this.images.add(mImageView18);
            mImageView19 = itemView.findViewById(R.id.ribbon19);
            this.images.add(mImageView19);
            mImageView20 = itemView.findViewById(R.id.ribbon20);
            this.images.add(mImageView20);
            mImageView21 = itemView.findViewById(R.id.ribbon21);
            this.images.add(mImageView21);
            mImageView22 = itemView.findViewById(R.id.ribbon22);
            this.images.add(mImageView22);
            mImageView23 = itemView.findViewById(R.id.ribbon23);
            this.images.add(mImageView23);
            mImageView24 = itemView.findViewById(R.id.ribbon24);
            this.images.add(mImageView24);
            mImageView25 = itemView.findViewById(R.id.ribbon25);
            this.images.add(mImageView25);
            mImageView26 = itemView.findViewById(R.id.ribbon26);
            this.images.add(mImageView26);
            mImageView27 = itemView.findViewById(R.id.ribbon27);
            this.images.add(mImageView27);
            mImageView28 = itemView.findViewById(R.id.ribbon28);
            this.images.add(mImageView28);
            mImageView29 = itemView.findViewById(R.id.ribbon29);
            this.images.add(mImageView29);
            mImageView30 = itemView.findViewById(R.id.ribbon30);
            this.images.add(mImageView30);
            mImageView31 = itemView.findViewById(R.id.ribbon31);
            this.images.add(mImageView31);
            mImageView32 = itemView.findViewById(R.id.ribbon32);
            this.images.add(mImageView32);
            mImageView33 = itemView.findViewById(R.id.ribbon33);
            this.images.add(mImageView33);
            mImageView34 = itemView.findViewById(R.id.ribbon34);
            this.images.add(mImageView34);
            mImageView35 = itemView.findViewById(R.id.ribbon35);
            this.images.add(mImageView35);
            mImageView36 = itemView.findViewById(R.id.ribbon36);
            this.images.add(mImageView36);
            mImageView37 = itemView.findViewById(R.id.ribbon37);
            this.images.add(mImageView37);
            mImageView38 = itemView.findViewById(R.id.ribbon38);
            this.images.add(mImageView38);
            mImageView39 = itemView.findViewById(R.id.ribbon39);
            this.images.add(mImageView39);
            mImageView40 = itemView.findViewById(R.id.ribbon40);
            this.images.add(mImageView40);
            mImageView41 = itemView.findViewById(R.id.ribbon41);
            this.images.add(mImageView41);
            mImageView42 = itemView.findViewById(R.id.ribbon42);
            this.images.add(mImageView42);
            mImageView43 = itemView.findViewById(R.id.ribbon43);
            this.images.add(mImageView43);

        }
    }

    public static class Ribbon44Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
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
        public ImageView mImageView13;
        public ImageView mImageView14;
        public ImageView mImageView15;
        public ImageView mImageView16;
        public ImageView mImageView17;
        public ImageView mImageView18;
        public ImageView mImageView19;
        public ImageView mImageView20;
        public ImageView mImageView21;
        public ImageView mImageView22;
        public ImageView mImageView23;
        public ImageView mImageView24;
        public ImageView mImageView25;
        public ImageView mImageView26;
        public ImageView mImageView27;
        public ImageView mImageView28;
        public ImageView mImageView29;
        public ImageView mImageView30;
        public ImageView mImageView31;
        public ImageView mImageView32;
        public ImageView mImageView33;
        public ImageView mImageView34;
        public ImageView mImageView35;
        public ImageView mImageView36;
        public ImageView mImageView37;
        public ImageView mImageView38;
        public ImageView mImageView39;
        public ImageView mImageView40;
        public ImageView mImageView41;
        public ImageView mImageView42;
        public ImageView mImageView43;
        public ImageView mImageView44;


        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon44Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            this.images.add(mImageView6);
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            this.images.add(mImageView7);
            mImageView8 = itemView.findViewById(R.id.ribbon8);
            this.images.add(mImageView8);
            mImageView9 = itemView.findViewById(R.id.ribbon9);
            this.images.add(mImageView9);
            mImageView10 = itemView.findViewById(R.id.ribbon10);
            this.images.add(mImageView10);
            mImageView11 = itemView.findViewById(R.id.ribbon11);
            this.images.add(mImageView11);
            mImageView12 = itemView.findViewById(R.id.ribbon12);
            this.images.add(mImageView12);
            mImageView13 = itemView.findViewById(R.id.ribbon13);
            this.images.add(mImageView13);
            mImageView14 = itemView.findViewById(R.id.ribbon14);
            this.images.add(mImageView14);
            mImageView15 = itemView.findViewById(R.id.ribbon15);
            this.images.add(mImageView15);
            mImageView16 = itemView.findViewById(R.id.ribbon16);
            this.images.add(mImageView16);
            mImageView17 = itemView.findViewById(R.id.ribbon17);
            this.images.add(mImageView17);
            mImageView18 = itemView.findViewById(R.id.ribbon18);
            this.images.add(mImageView18);
            mImageView19 = itemView.findViewById(R.id.ribbon19);
            this.images.add(mImageView19);
            mImageView20 = itemView.findViewById(R.id.ribbon20);
            this.images.add(mImageView20);
            mImageView21 = itemView.findViewById(R.id.ribbon21);
            this.images.add(mImageView21);
            mImageView22 = itemView.findViewById(R.id.ribbon22);
            this.images.add(mImageView22);
            mImageView23 = itemView.findViewById(R.id.ribbon23);
            this.images.add(mImageView23);
            mImageView24 = itemView.findViewById(R.id.ribbon24);
            this.images.add(mImageView24);
            mImageView25 = itemView.findViewById(R.id.ribbon25);
            this.images.add(mImageView25);
            mImageView26 = itemView.findViewById(R.id.ribbon26);
            this.images.add(mImageView26);
            mImageView27 = itemView.findViewById(R.id.ribbon27);
            this.images.add(mImageView27);
            mImageView28 = itemView.findViewById(R.id.ribbon28);
            this.images.add(mImageView28);
            mImageView29 = itemView.findViewById(R.id.ribbon29);
            this.images.add(mImageView29);
            mImageView30 = itemView.findViewById(R.id.ribbon30);
            this.images.add(mImageView30);
            mImageView31 = itemView.findViewById(R.id.ribbon31);
            this.images.add(mImageView31);
            mImageView32 = itemView.findViewById(R.id.ribbon32);
            this.images.add(mImageView32);
            mImageView33 = itemView.findViewById(R.id.ribbon33);
            this.images.add(mImageView33);
            mImageView34 = itemView.findViewById(R.id.ribbon34);
            this.images.add(mImageView34);
            mImageView35 = itemView.findViewById(R.id.ribbon35);
            this.images.add(mImageView35);
            mImageView36 = itemView.findViewById(R.id.ribbon36);
            this.images.add(mImageView36);
            mImageView37 = itemView.findViewById(R.id.ribbon37);
            this.images.add(mImageView37);
            mImageView38 = itemView.findViewById(R.id.ribbon38);
            this.images.add(mImageView38);
            mImageView39 = itemView.findViewById(R.id.ribbon39);
            this.images.add(mImageView39);
            mImageView40 = itemView.findViewById(R.id.ribbon40);
            this.images.add(mImageView40);
            mImageView41 = itemView.findViewById(R.id.ribbon41);
            this.images.add(mImageView41);
            mImageView42 = itemView.findViewById(R.id.ribbon42);
            this.images.add(mImageView42);
            mImageView43 = itemView.findViewById(R.id.ribbon43);
            this.images.add(mImageView43);
            mImageView44 = itemView.findViewById(R.id.ribbon44);
            this.images.add(mImageView44);

        }
    }

    public static class Ribbon45Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
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
        public ImageView mImageView13;
        public ImageView mImageView14;
        public ImageView mImageView15;
        public ImageView mImageView16;
        public ImageView mImageView17;
        public ImageView mImageView18;
        public ImageView mImageView19;
        public ImageView mImageView20;
        public ImageView mImageView21;
        public ImageView mImageView22;
        public ImageView mImageView23;
        public ImageView mImageView24;
        public ImageView mImageView25;
        public ImageView mImageView26;
        public ImageView mImageView27;
        public ImageView mImageView28;
        public ImageView mImageView29;
        public ImageView mImageView30;
        public ImageView mImageView31;
        public ImageView mImageView32;
        public ImageView mImageView33;
        public ImageView mImageView34;
        public ImageView mImageView35;
        public ImageView mImageView36;
        public ImageView mImageView37;
        public ImageView mImageView38;
        public ImageView mImageView39;
        public ImageView mImageView40;
        public ImageView mImageView41;
        public ImageView mImageView42;
        public ImageView mImageView43;
        public ImageView mImageView44;
        public ImageView mImageView45;


        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon45Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            this.images.add(mImageView6);
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            this.images.add(mImageView7);
            mImageView8 = itemView.findViewById(R.id.ribbon8);
            this.images.add(mImageView8);
            mImageView9 = itemView.findViewById(R.id.ribbon9);
            this.images.add(mImageView9);
            mImageView10 = itemView.findViewById(R.id.ribbon10);
            this.images.add(mImageView10);
            mImageView11 = itemView.findViewById(R.id.ribbon11);
            this.images.add(mImageView11);
            mImageView12 = itemView.findViewById(R.id.ribbon12);
            this.images.add(mImageView12);
            mImageView13 = itemView.findViewById(R.id.ribbon13);
            this.images.add(mImageView13);
            mImageView14 = itemView.findViewById(R.id.ribbon14);
            this.images.add(mImageView14);
            mImageView15 = itemView.findViewById(R.id.ribbon15);
            this.images.add(mImageView15);
            mImageView16 = itemView.findViewById(R.id.ribbon16);
            this.images.add(mImageView16);
            mImageView17 = itemView.findViewById(R.id.ribbon17);
            this.images.add(mImageView17);
            mImageView18 = itemView.findViewById(R.id.ribbon18);
            this.images.add(mImageView18);
            mImageView19 = itemView.findViewById(R.id.ribbon19);
            this.images.add(mImageView19);
            mImageView20 = itemView.findViewById(R.id.ribbon20);
            this.images.add(mImageView20);
            mImageView21 = itemView.findViewById(R.id.ribbon21);
            this.images.add(mImageView21);
            mImageView22 = itemView.findViewById(R.id.ribbon22);
            this.images.add(mImageView22);
            mImageView23 = itemView.findViewById(R.id.ribbon23);
            this.images.add(mImageView23);
            mImageView24 = itemView.findViewById(R.id.ribbon24);
            this.images.add(mImageView24);
            mImageView25 = itemView.findViewById(R.id.ribbon25);
            this.images.add(mImageView25);
            mImageView26 = itemView.findViewById(R.id.ribbon26);
            this.images.add(mImageView26);
            mImageView27 = itemView.findViewById(R.id.ribbon27);
            this.images.add(mImageView27);
            mImageView28 = itemView.findViewById(R.id.ribbon28);
            this.images.add(mImageView28);
            mImageView29 = itemView.findViewById(R.id.ribbon29);
            this.images.add(mImageView29);
            mImageView30 = itemView.findViewById(R.id.ribbon30);
            this.images.add(mImageView30);
            mImageView31 = itemView.findViewById(R.id.ribbon31);
            this.images.add(mImageView31);
            mImageView32 = itemView.findViewById(R.id.ribbon32);
            this.images.add(mImageView32);
            mImageView33 = itemView.findViewById(R.id.ribbon33);
            this.images.add(mImageView33);
            mImageView34 = itemView.findViewById(R.id.ribbon34);
            this.images.add(mImageView34);
            mImageView35 = itemView.findViewById(R.id.ribbon35);
            this.images.add(mImageView35);
            mImageView36 = itemView.findViewById(R.id.ribbon36);
            this.images.add(mImageView36);
            mImageView37 = itemView.findViewById(R.id.ribbon37);
            this.images.add(mImageView37);
            mImageView38 = itemView.findViewById(R.id.ribbon38);
            this.images.add(mImageView38);
            mImageView39 = itemView.findViewById(R.id.ribbon39);
            this.images.add(mImageView39);
            mImageView40 = itemView.findViewById(R.id.ribbon40);
            this.images.add(mImageView40);
            mImageView41 = itemView.findViewById(R.id.ribbon41);
            this.images.add(mImageView41);
            mImageView42 = itemView.findViewById(R.id.ribbon42);
            this.images.add(mImageView42);
            mImageView43 = itemView.findViewById(R.id.ribbon43);
            this.images.add(mImageView43);
            mImageView44 = itemView.findViewById(R.id.ribbon44);
            this.images.add(mImageView44);
            mImageView45 = itemView.findViewById(R.id.ribbon45);
            this.images.add(mImageView45);

        }
    }

    public static class Ribbon46Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
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
        public ImageView mImageView13;
        public ImageView mImageView14;
        public ImageView mImageView15;
        public ImageView mImageView16;
        public ImageView mImageView17;
        public ImageView mImageView18;
        public ImageView mImageView19;
        public ImageView mImageView20;
        public ImageView mImageView21;
        public ImageView mImageView22;
        public ImageView mImageView23;
        public ImageView mImageView24;
        public ImageView mImageView25;
        public ImageView mImageView26;
        public ImageView mImageView27;
        public ImageView mImageView28;
        public ImageView mImageView29;
        public ImageView mImageView30;
        public ImageView mImageView31;
        public ImageView mImageView32;
        public ImageView mImageView33;
        public ImageView mImageView34;
        public ImageView mImageView35;
        public ImageView mImageView36;
        public ImageView mImageView37;
        public ImageView mImageView38;
        public ImageView mImageView39;
        public ImageView mImageView40;
        public ImageView mImageView41;
        public ImageView mImageView42;
        public ImageView mImageView43;
        public ImageView mImageView44;
        public ImageView mImageView45;
        public ImageView mImageView46;


        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon46Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            this.images.add(mImageView6);
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            this.images.add(mImageView7);
            mImageView8 = itemView.findViewById(R.id.ribbon8);
            this.images.add(mImageView8);
            mImageView9 = itemView.findViewById(R.id.ribbon9);
            this.images.add(mImageView9);
            mImageView10 = itemView.findViewById(R.id.ribbon10);
            this.images.add(mImageView10);
            mImageView11 = itemView.findViewById(R.id.ribbon11);
            this.images.add(mImageView11);
            mImageView12 = itemView.findViewById(R.id.ribbon12);
            this.images.add(mImageView12);
            mImageView13 = itemView.findViewById(R.id.ribbon13);
            this.images.add(mImageView13);
            mImageView14 = itemView.findViewById(R.id.ribbon14);
            this.images.add(mImageView14);
            mImageView15 = itemView.findViewById(R.id.ribbon15);
            this.images.add(mImageView15);
            mImageView16 = itemView.findViewById(R.id.ribbon16);
            this.images.add(mImageView16);
            mImageView17 = itemView.findViewById(R.id.ribbon17);
            this.images.add(mImageView17);
            mImageView18 = itemView.findViewById(R.id.ribbon18);
            this.images.add(mImageView18);
            mImageView19 = itemView.findViewById(R.id.ribbon19);
            this.images.add(mImageView19);
            mImageView20 = itemView.findViewById(R.id.ribbon20);
            this.images.add(mImageView20);
            mImageView21 = itemView.findViewById(R.id.ribbon21);
            this.images.add(mImageView21);
            mImageView22 = itemView.findViewById(R.id.ribbon22);
            this.images.add(mImageView22);
            mImageView23 = itemView.findViewById(R.id.ribbon23);
            this.images.add(mImageView23);
            mImageView24 = itemView.findViewById(R.id.ribbon24);
            this.images.add(mImageView24);
            mImageView25 = itemView.findViewById(R.id.ribbon25);
            this.images.add(mImageView25);
            mImageView26 = itemView.findViewById(R.id.ribbon26);
            this.images.add(mImageView26);
            mImageView27 = itemView.findViewById(R.id.ribbon27);
            this.images.add(mImageView27);
            mImageView28 = itemView.findViewById(R.id.ribbon28);
            this.images.add(mImageView28);
            mImageView29 = itemView.findViewById(R.id.ribbon29);
            this.images.add(mImageView29);
            mImageView30 = itemView.findViewById(R.id.ribbon30);
            this.images.add(mImageView30);
            mImageView31 = itemView.findViewById(R.id.ribbon31);
            this.images.add(mImageView31);
            mImageView32 = itemView.findViewById(R.id.ribbon32);
            this.images.add(mImageView32);
            mImageView33 = itemView.findViewById(R.id.ribbon33);
            this.images.add(mImageView33);
            mImageView34 = itemView.findViewById(R.id.ribbon34);
            this.images.add(mImageView34);
            mImageView35 = itemView.findViewById(R.id.ribbon35);
            this.images.add(mImageView35);
            mImageView36 = itemView.findViewById(R.id.ribbon36);
            this.images.add(mImageView36);
            mImageView37 = itemView.findViewById(R.id.ribbon37);
            this.images.add(mImageView37);
            mImageView38 = itemView.findViewById(R.id.ribbon38);
            this.images.add(mImageView38);
            mImageView39 = itemView.findViewById(R.id.ribbon39);
            this.images.add(mImageView39);
            mImageView40 = itemView.findViewById(R.id.ribbon40);
            this.images.add(mImageView40);
            mImageView41 = itemView.findViewById(R.id.ribbon41);
            this.images.add(mImageView41);
            mImageView42 = itemView.findViewById(R.id.ribbon42);
            this.images.add(mImageView42);
            mImageView43 = itemView.findViewById(R.id.ribbon43);
            this.images.add(mImageView43);
            mImageView44 = itemView.findViewById(R.id.ribbon44);
            this.images.add(mImageView44);
            mImageView45 = itemView.findViewById(R.id.ribbon45);
            this.images.add(mImageView45);
            mImageView46 = itemView.findViewById(R.id.ribbon46);
            this.images.add(mImageView46);

        }
    }

    public static class Ribbon47Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
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
        public ImageView mImageView13;
        public ImageView mImageView14;
        public ImageView mImageView15;
        public ImageView mImageView16;
        public ImageView mImageView17;
        public ImageView mImageView18;
        public ImageView mImageView19;
        public ImageView mImageView20;
        public ImageView mImageView21;
        public ImageView mImageView22;
        public ImageView mImageView23;
        public ImageView mImageView24;
        public ImageView mImageView25;
        public ImageView mImageView26;
        public ImageView mImageView27;
        public ImageView mImageView28;
        public ImageView mImageView29;
        public ImageView mImageView30;
        public ImageView mImageView31;
        public ImageView mImageView32;
        public ImageView mImageView33;
        public ImageView mImageView34;
        public ImageView mImageView35;
        public ImageView mImageView36;
        public ImageView mImageView37;
        public ImageView mImageView38;
        public ImageView mImageView39;
        public ImageView mImageView40;
        public ImageView mImageView41;
        public ImageView mImageView42;
        public ImageView mImageView43;
        public ImageView mImageView44;
        public ImageView mImageView45;
        public ImageView mImageView46;
        public ImageView mImageView47;


        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon47Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            this.images.add(mImageView6);
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            this.images.add(mImageView7);
            mImageView8 = itemView.findViewById(R.id.ribbon8);
            this.images.add(mImageView8);
            mImageView9 = itemView.findViewById(R.id.ribbon9);
            this.images.add(mImageView9);
            mImageView10 = itemView.findViewById(R.id.ribbon10);
            this.images.add(mImageView10);
            mImageView11 = itemView.findViewById(R.id.ribbon11);
            this.images.add(mImageView11);
            mImageView12 = itemView.findViewById(R.id.ribbon12);
            this.images.add(mImageView12);
            mImageView13 = itemView.findViewById(R.id.ribbon13);
            this.images.add(mImageView13);
            mImageView14 = itemView.findViewById(R.id.ribbon14);
            this.images.add(mImageView14);
            mImageView15 = itemView.findViewById(R.id.ribbon15);
            this.images.add(mImageView15);
            mImageView16 = itemView.findViewById(R.id.ribbon16);
            this.images.add(mImageView16);
            mImageView17 = itemView.findViewById(R.id.ribbon17);
            this.images.add(mImageView17);
            mImageView18 = itemView.findViewById(R.id.ribbon18);
            this.images.add(mImageView18);
            mImageView19 = itemView.findViewById(R.id.ribbon19);
            this.images.add(mImageView19);
            mImageView20 = itemView.findViewById(R.id.ribbon20);
            this.images.add(mImageView20);
            mImageView21 = itemView.findViewById(R.id.ribbon21);
            this.images.add(mImageView21);
            mImageView22 = itemView.findViewById(R.id.ribbon22);
            this.images.add(mImageView22);
            mImageView23 = itemView.findViewById(R.id.ribbon23);
            this.images.add(mImageView23);
            mImageView24 = itemView.findViewById(R.id.ribbon24);
            this.images.add(mImageView24);
            mImageView25 = itemView.findViewById(R.id.ribbon25);
            this.images.add(mImageView25);
            mImageView26 = itemView.findViewById(R.id.ribbon26);
            this.images.add(mImageView26);
            mImageView27 = itemView.findViewById(R.id.ribbon27);
            this.images.add(mImageView27);
            mImageView28 = itemView.findViewById(R.id.ribbon28);
            this.images.add(mImageView28);
            mImageView29 = itemView.findViewById(R.id.ribbon29);
            this.images.add(mImageView29);
            mImageView30 = itemView.findViewById(R.id.ribbon30);
            this.images.add(mImageView30);
            mImageView31 = itemView.findViewById(R.id.ribbon31);
            this.images.add(mImageView31);
            mImageView32 = itemView.findViewById(R.id.ribbon32);
            this.images.add(mImageView32);
            mImageView33 = itemView.findViewById(R.id.ribbon33);
            this.images.add(mImageView33);
            mImageView34 = itemView.findViewById(R.id.ribbon34);
            this.images.add(mImageView34);
            mImageView35 = itemView.findViewById(R.id.ribbon35);
            this.images.add(mImageView35);
            mImageView36 = itemView.findViewById(R.id.ribbon36);
            this.images.add(mImageView36);
            mImageView37 = itemView.findViewById(R.id.ribbon37);
            this.images.add(mImageView37);
            mImageView38 = itemView.findViewById(R.id.ribbon38);
            this.images.add(mImageView38);
            mImageView39 = itemView.findViewById(R.id.ribbon39);
            this.images.add(mImageView39);
            mImageView40 = itemView.findViewById(R.id.ribbon40);
            this.images.add(mImageView40);
            mImageView41 = itemView.findViewById(R.id.ribbon41);
            this.images.add(mImageView41);
            mImageView42 = itemView.findViewById(R.id.ribbon42);
            this.images.add(mImageView42);
            mImageView43 = itemView.findViewById(R.id.ribbon43);
            this.images.add(mImageView43);
            mImageView44 = itemView.findViewById(R.id.ribbon44);
            this.images.add(mImageView44);
            mImageView45 = itemView.findViewById(R.id.ribbon45);
            this.images.add(mImageView45);
            mImageView46 = itemView.findViewById(R.id.ribbon46);
            this.images.add(mImageView46);
            mImageView47 = itemView.findViewById(R.id.ribbon47);
            this.images.add(mImageView47);

        }
    }

    public static class Ribbon48Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
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
        public ImageView mImageView13;
        public ImageView mImageView14;
        public ImageView mImageView15;
        public ImageView mImageView16;
        public ImageView mImageView17;
        public ImageView mImageView18;
        public ImageView mImageView19;
        public ImageView mImageView20;
        public ImageView mImageView21;
        public ImageView mImageView22;
        public ImageView mImageView23;
        public ImageView mImageView24;
        public ImageView mImageView25;
        public ImageView mImageView26;
        public ImageView mImageView27;
        public ImageView mImageView28;
        public ImageView mImageView29;
        public ImageView mImageView30;
        public ImageView mImageView31;
        public ImageView mImageView32;
        public ImageView mImageView33;
        public ImageView mImageView34;
        public ImageView mImageView35;
        public ImageView mImageView36;
        public ImageView mImageView37;
        public ImageView mImageView38;
        public ImageView mImageView39;
        public ImageView mImageView40;
        public ImageView mImageView41;
        public ImageView mImageView42;
        public ImageView mImageView43;
        public ImageView mImageView44;
        public ImageView mImageView45;
        public ImageView mImageView46;
        public ImageView mImageView47;
        public ImageView mImageView48;


        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon48Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            this.images.add(mImageView6);
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            this.images.add(mImageView7);
            mImageView8 = itemView.findViewById(R.id.ribbon8);
            this.images.add(mImageView8);
            mImageView9 = itemView.findViewById(R.id.ribbon9);
            this.images.add(mImageView9);
            mImageView10 = itemView.findViewById(R.id.ribbon10);
            this.images.add(mImageView10);
            mImageView11 = itemView.findViewById(R.id.ribbon11);
            this.images.add(mImageView11);
            mImageView12 = itemView.findViewById(R.id.ribbon12);
            this.images.add(mImageView12);
            mImageView13 = itemView.findViewById(R.id.ribbon13);
            this.images.add(mImageView13);
            mImageView14 = itemView.findViewById(R.id.ribbon14);
            this.images.add(mImageView14);
            mImageView15 = itemView.findViewById(R.id.ribbon15);
            this.images.add(mImageView15);
            mImageView16 = itemView.findViewById(R.id.ribbon16);
            this.images.add(mImageView16);
            mImageView17 = itemView.findViewById(R.id.ribbon17);
            this.images.add(mImageView17);
            mImageView18 = itemView.findViewById(R.id.ribbon18);
            this.images.add(mImageView18);
            mImageView19 = itemView.findViewById(R.id.ribbon19);
            this.images.add(mImageView19);
            mImageView20 = itemView.findViewById(R.id.ribbon20);
            this.images.add(mImageView20);
            mImageView21 = itemView.findViewById(R.id.ribbon21);
            this.images.add(mImageView21);
            mImageView22 = itemView.findViewById(R.id.ribbon22);
            this.images.add(mImageView22);
            mImageView23 = itemView.findViewById(R.id.ribbon23);
            this.images.add(mImageView23);
            mImageView24 = itemView.findViewById(R.id.ribbon24);
            this.images.add(mImageView24);
            mImageView25 = itemView.findViewById(R.id.ribbon25);
            this.images.add(mImageView25);
            mImageView26 = itemView.findViewById(R.id.ribbon26);
            this.images.add(mImageView26);
            mImageView27 = itemView.findViewById(R.id.ribbon27);
            this.images.add(mImageView27);
            mImageView28 = itemView.findViewById(R.id.ribbon28);
            this.images.add(mImageView28);
            mImageView29 = itemView.findViewById(R.id.ribbon29);
            this.images.add(mImageView29);
            mImageView30 = itemView.findViewById(R.id.ribbon30);
            this.images.add(mImageView30);
            mImageView31 = itemView.findViewById(R.id.ribbon31);
            this.images.add(mImageView31);
            mImageView32 = itemView.findViewById(R.id.ribbon32);
            this.images.add(mImageView32);
            mImageView33 = itemView.findViewById(R.id.ribbon33);
            this.images.add(mImageView33);
            mImageView34 = itemView.findViewById(R.id.ribbon34);
            this.images.add(mImageView34);
            mImageView35 = itemView.findViewById(R.id.ribbon35);
            this.images.add(mImageView35);
            mImageView36 = itemView.findViewById(R.id.ribbon36);
            this.images.add(mImageView36);
            mImageView37 = itemView.findViewById(R.id.ribbon37);
            this.images.add(mImageView37);
            mImageView38 = itemView.findViewById(R.id.ribbon38);
            this.images.add(mImageView38);
            mImageView39 = itemView.findViewById(R.id.ribbon39);
            this.images.add(mImageView39);
            mImageView40 = itemView.findViewById(R.id.ribbon40);
            this.images.add(mImageView40);
            mImageView41 = itemView.findViewById(R.id.ribbon41);
            this.images.add(mImageView41);
            mImageView42 = itemView.findViewById(R.id.ribbon42);
            this.images.add(mImageView42);
            mImageView43 = itemView.findViewById(R.id.ribbon43);
            this.images.add(mImageView43);
            mImageView44 = itemView.findViewById(R.id.ribbon44);
            this.images.add(mImageView44);
            mImageView45 = itemView.findViewById(R.id.ribbon45);
            this.images.add(mImageView45);
            mImageView46 = itemView.findViewById(R.id.ribbon46);
            this.images.add(mImageView46);
            mImageView47 = itemView.findViewById(R.id.ribbon47);
            this.images.add(mImageView47);
            mImageView48 = itemView.findViewById(R.id.ribbon48);
            this.images.add(mImageView48);

        }
    }

    public static class Ribbon49Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
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
        public ImageView mImageView13;
        public ImageView mImageView14;
        public ImageView mImageView15;
        public ImageView mImageView16;
        public ImageView mImageView17;
        public ImageView mImageView18;
        public ImageView mImageView19;
        public ImageView mImageView20;
        public ImageView mImageView21;
        public ImageView mImageView22;
        public ImageView mImageView23;
        public ImageView mImageView24;
        public ImageView mImageView25;
        public ImageView mImageView26;
        public ImageView mImageView27;
        public ImageView mImageView28;
        public ImageView mImageView29;
        public ImageView mImageView30;
        public ImageView mImageView31;
        public ImageView mImageView32;
        public ImageView mImageView33;
        public ImageView mImageView34;
        public ImageView mImageView35;
        public ImageView mImageView36;
        public ImageView mImageView37;
        public ImageView mImageView38;
        public ImageView mImageView39;
        public ImageView mImageView40;
        public ImageView mImageView41;
        public ImageView mImageView42;
        public ImageView mImageView43;
        public ImageView mImageView44;
        public ImageView mImageView45;
        public ImageView mImageView46;
        public ImageView mImageView47;
        public ImageView mImageView48;
        public ImageView mImageView49;


        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon49Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            this.images.add(mImageView6);
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            this.images.add(mImageView7);
            mImageView8 = itemView.findViewById(R.id.ribbon8);
            this.images.add(mImageView8);
            mImageView9 = itemView.findViewById(R.id.ribbon9);
            this.images.add(mImageView9);
            mImageView10 = itemView.findViewById(R.id.ribbon10);
            this.images.add(mImageView10);
            mImageView11 = itemView.findViewById(R.id.ribbon11);
            this.images.add(mImageView11);
            mImageView12 = itemView.findViewById(R.id.ribbon12);
            this.images.add(mImageView12);
            mImageView13 = itemView.findViewById(R.id.ribbon13);
            this.images.add(mImageView13);
            mImageView14 = itemView.findViewById(R.id.ribbon14);
            this.images.add(mImageView14);
            mImageView15 = itemView.findViewById(R.id.ribbon15);
            this.images.add(mImageView15);
            mImageView16 = itemView.findViewById(R.id.ribbon16);
            this.images.add(mImageView16);
            mImageView17 = itemView.findViewById(R.id.ribbon17);
            this.images.add(mImageView17);
            mImageView18 = itemView.findViewById(R.id.ribbon18);
            this.images.add(mImageView18);
            mImageView19 = itemView.findViewById(R.id.ribbon19);
            this.images.add(mImageView19);
            mImageView20 = itemView.findViewById(R.id.ribbon20);
            this.images.add(mImageView20);
            mImageView21 = itemView.findViewById(R.id.ribbon21);
            this.images.add(mImageView21);
            mImageView22 = itemView.findViewById(R.id.ribbon22);
            this.images.add(mImageView22);
            mImageView23 = itemView.findViewById(R.id.ribbon23);
            this.images.add(mImageView23);
            mImageView24 = itemView.findViewById(R.id.ribbon24);
            this.images.add(mImageView24);
            mImageView25 = itemView.findViewById(R.id.ribbon25);
            this.images.add(mImageView25);
            mImageView26 = itemView.findViewById(R.id.ribbon26);
            this.images.add(mImageView26);
            mImageView27 = itemView.findViewById(R.id.ribbon27);
            this.images.add(mImageView27);
            mImageView28 = itemView.findViewById(R.id.ribbon28);
            this.images.add(mImageView28);
            mImageView29 = itemView.findViewById(R.id.ribbon29);
            this.images.add(mImageView29);
            mImageView30 = itemView.findViewById(R.id.ribbon30);
            this.images.add(mImageView30);
            mImageView31 = itemView.findViewById(R.id.ribbon31);
            this.images.add(mImageView31);
            mImageView32 = itemView.findViewById(R.id.ribbon32);
            this.images.add(mImageView32);
            mImageView33 = itemView.findViewById(R.id.ribbon33);
            this.images.add(mImageView33);
            mImageView34 = itemView.findViewById(R.id.ribbon34);
            this.images.add(mImageView34);
            mImageView35 = itemView.findViewById(R.id.ribbon35);
            this.images.add(mImageView35);
            mImageView36 = itemView.findViewById(R.id.ribbon36);
            this.images.add(mImageView36);
            mImageView37 = itemView.findViewById(R.id.ribbon37);
            this.images.add(mImageView37);
            mImageView38 = itemView.findViewById(R.id.ribbon38);
            this.images.add(mImageView38);
            mImageView39 = itemView.findViewById(R.id.ribbon39);
            this.images.add(mImageView39);
            mImageView40 = itemView.findViewById(R.id.ribbon40);
            this.images.add(mImageView40);
            mImageView41 = itemView.findViewById(R.id.ribbon41);
            this.images.add(mImageView41);
            mImageView42 = itemView.findViewById(R.id.ribbon42);
            this.images.add(mImageView42);
            mImageView43 = itemView.findViewById(R.id.ribbon43);
            this.images.add(mImageView43);
            mImageView44 = itemView.findViewById(R.id.ribbon44);
            this.images.add(mImageView44);
            mImageView45 = itemView.findViewById(R.id.ribbon45);
            this.images.add(mImageView45);
            mImageView46 = itemView.findViewById(R.id.ribbon46);
            this.images.add(mImageView46);
            mImageView47 = itemView.findViewById(R.id.ribbon47);
            this.images.add(mImageView47);
            mImageView48 = itemView.findViewById(R.id.ribbon48);
            this.images.add(mImageView48);
            mImageView49 = itemView.findViewById(R.id.ribbon49);
            this.images.add(mImageView49);

        }
    }

    public static class Ribbon50Holder extends RecyclerView.ViewHolder {
        private final ArraySet<ImageView> images;
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
        public ImageView mImageView13;
        public ImageView mImageView14;
        public ImageView mImageView15;
        public ImageView mImageView16;
        public ImageView mImageView17;
        public ImageView mImageView18;
        public ImageView mImageView19;
        public ImageView mImageView20;
        public ImageView mImageView21;
        public ImageView mImageView22;
        public ImageView mImageView23;
        public ImageView mImageView24;
        public ImageView mImageView25;
        public ImageView mImageView26;
        public ImageView mImageView27;
        public ImageView mImageView28;
        public ImageView mImageView29;
        public ImageView mImageView30;
        public ImageView mImageView31;
        public ImageView mImageView32;
        public ImageView mImageView33;
        public ImageView mImageView34;
        public ImageView mImageView35;
        public ImageView mImageView36;
        public ImageView mImageView37;
        public ImageView mImageView38;
        public ImageView mImageView39;
        public ImageView mImageView40;
        public ImageView mImageView41;
        public ImageView mImageView42;
        public ImageView mImageView43;
        public ImageView mImageView44;
        public ImageView mImageView45;
        public ImageView mImageView46;
        public ImageView mImageView47;
        public ImageView mImageView48;
        public ImageView mImageView49;
        public ImageView mImageView50;


        @SuppressLint({"ClickableViewAccessibility", "CutPasteId"})
        public Ribbon50Holder(View itemView, OnItemClickListener listener, ArraySet<ImageView> images) {
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
            mImageView5 = itemView.findViewById(R.id.ribbon5);
            this.images.add(mImageView5);
            mImageView6 = itemView.findViewById(R.id.ribbon6);
            this.images.add(mImageView6);
            mImageView7 = itemView.findViewById(R.id.ribbon7);
            this.images.add(mImageView7);
            mImageView8 = itemView.findViewById(R.id.ribbon8);
            this.images.add(mImageView8);
            mImageView9 = itemView.findViewById(R.id.ribbon9);
            this.images.add(mImageView9);
            mImageView10 = itemView.findViewById(R.id.ribbon10);
            this.images.add(mImageView10);
            mImageView11 = itemView.findViewById(R.id.ribbon11);
            this.images.add(mImageView11);
            mImageView12 = itemView.findViewById(R.id.ribbon12);
            this.images.add(mImageView12);
            mImageView13 = itemView.findViewById(R.id.ribbon13);
            this.images.add(mImageView13);
            mImageView14 = itemView.findViewById(R.id.ribbon14);
            this.images.add(mImageView14);
            mImageView15 = itemView.findViewById(R.id.ribbon15);
            this.images.add(mImageView15);
            mImageView16 = itemView.findViewById(R.id.ribbon16);
            this.images.add(mImageView16);
            mImageView17 = itemView.findViewById(R.id.ribbon17);
            this.images.add(mImageView17);
            mImageView18 = itemView.findViewById(R.id.ribbon18);
            this.images.add(mImageView18);
            mImageView19 = itemView.findViewById(R.id.ribbon19);
            this.images.add(mImageView19);
            mImageView20 = itemView.findViewById(R.id.ribbon20);
            this.images.add(mImageView20);
            mImageView21 = itemView.findViewById(R.id.ribbon21);
            this.images.add(mImageView21);
            mImageView22 = itemView.findViewById(R.id.ribbon22);
            this.images.add(mImageView22);
            mImageView23 = itemView.findViewById(R.id.ribbon23);
            this.images.add(mImageView23);
            mImageView24 = itemView.findViewById(R.id.ribbon24);
            this.images.add(mImageView24);
            mImageView25 = itemView.findViewById(R.id.ribbon25);
            this.images.add(mImageView25);
            mImageView26 = itemView.findViewById(R.id.ribbon26);
            this.images.add(mImageView26);
            mImageView27 = itemView.findViewById(R.id.ribbon27);
            this.images.add(mImageView27);
            mImageView28 = itemView.findViewById(R.id.ribbon28);
            this.images.add(mImageView28);
            mImageView29 = itemView.findViewById(R.id.ribbon29);
            this.images.add(mImageView29);
            mImageView30 = itemView.findViewById(R.id.ribbon30);
            this.images.add(mImageView30);
            mImageView31 = itemView.findViewById(R.id.ribbon31);
            this.images.add(mImageView31);
            mImageView32 = itemView.findViewById(R.id.ribbon32);
            this.images.add(mImageView32);
            mImageView33 = itemView.findViewById(R.id.ribbon33);
            this.images.add(mImageView33);
            mImageView34 = itemView.findViewById(R.id.ribbon34);
            this.images.add(mImageView34);
            mImageView35 = itemView.findViewById(R.id.ribbon35);
            this.images.add(mImageView35);
            mImageView36 = itemView.findViewById(R.id.ribbon36);
            this.images.add(mImageView36);
            mImageView37 = itemView.findViewById(R.id.ribbon37);
            this.images.add(mImageView37);
            mImageView38 = itemView.findViewById(R.id.ribbon38);
            this.images.add(mImageView38);
            mImageView39 = itemView.findViewById(R.id.ribbon39);
            this.images.add(mImageView39);
            mImageView40 = itemView.findViewById(R.id.ribbon40);
            this.images.add(mImageView40);
            mImageView41 = itemView.findViewById(R.id.ribbon41);
            this.images.add(mImageView41);
            mImageView42 = itemView.findViewById(R.id.ribbon42);
            this.images.add(mImageView42);
            mImageView43 = itemView.findViewById(R.id.ribbon43);
            this.images.add(mImageView43);
            mImageView44 = itemView.findViewById(R.id.ribbon44);
            this.images.add(mImageView44);
            mImageView45 = itemView.findViewById(R.id.ribbon45);
            this.images.add(mImageView45);
            mImageView46 = itemView.findViewById(R.id.ribbon46);
            this.images.add(mImageView46);
            mImageView47 = itemView.findViewById(R.id.ribbon47);
            this.images.add(mImageView47);
            mImageView48 = itemView.findViewById(R.id.ribbon48);
            this.images.add(mImageView48);
            mImageView49 = itemView.findViewById(R.id.ribbon49);
            this.images.add(mImageView49);
            mImageView50 = itemView.findViewById(R.id.ribbon50);
            this.images.add(mImageView50);

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
            return new Ribbon1Holder(view, mListener, images, oaks);
        }
        if (ViewType == 2) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item2, parent, false);
            return new Ribbon2Holder(view, mListener, images, oaks);
        }
        if (ViewType == 3) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item3, parent, false);
            return new Ribbon3Holder(view, mListener, images);
        }
        if (ViewType == 4) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item4, parent, false);
            return new Ribbon4Holder(view, mListener, images);
        }
        if (ViewType == 5) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item5, parent, false);
            return new Ribbon5Holder(view, mListener, images);
        }
        if (ViewType == 6) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item6, parent, false);
            return new Ribbon6Holder(view, mListener, images);
        }
        if (ViewType == 7) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item7, parent, false);
            return new Ribbon7Holder(view, mListener, images);
        }
        if (ViewType == 8) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item8, parent, false);
            return new Ribbon8Holder(view, mListener, images);
        }
        if (ViewType == 9) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item9, parent, false);
            return new Ribbon9Holder(view, mListener, images);
        }
        if (ViewType == 10) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item10, parent, false);
            return new Ribbon10Holder(view, mListener, images);
        }
        if (ViewType == 11) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item11, parent, false);
            return new Ribbon11Holder(view, mListener, images);
        }
        if (ViewType == 12) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item12, parent, false);
            return new Ribbon12Holder(view, mListener, images);

        }
        if (ViewType == 13) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item13, parent, false);
            return new Ribbon13Holder(view, mListener, images);
        }
        if (ViewType == 14) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item14, parent, false);
            return new Ribbon14Holder(view, mListener, images);
        }
        if (ViewType == 15) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item15, parent, false);
            return new Ribbon15Holder(view, mListener, images);
        }
        if (ViewType == 16) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item16, parent, false);
            return new Ribbon16Holder(view, mListener, images);
        }
        if (ViewType == 17) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item17, parent, false);
            return new Ribbon17Holder(view, mListener, images);


        }
        if (ViewType == 18) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item18, parent, false);
            return new Ribbon18Holder(view, mListener, images);


        }
        if (ViewType == 19) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item19, parent, false);
            return new Ribbon19Holder(view, mListener, images);


        }
        if (ViewType == 20) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item20, parent, false);
            return new Ribbon20Holder(view, mListener, images);
        }
        if (ViewType == 21) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item21, parent, false);
            return new Ribbon21Holder(view, mListener, images);
        }
        if (ViewType == 22) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item22, parent, false);
            return new Ribbon22Holder(view, mListener, images);
        }
        if (ViewType == 23) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item23, parent, false);
            return new Ribbon23Holder(view, mListener, images);
        }
        if (ViewType == 24) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item24, parent, false);
            return new Ribbon24Holder(view, mListener, images);
        }
        if (ViewType == 25) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item25, parent, false);
            return new Ribbon25Holder(view, mListener, images);
        }
        if (ViewType == 26) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item26, parent, false);
            return new Ribbon26Holder(view, mListener, images);
        }
        if (ViewType == 27) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item27, parent, false);
            return new Ribbon27Holder(view, mListener, images);
        }
        if (ViewType == 28) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item28, parent, false);
            return new Ribbon28Holder(view, mListener, images);
        }
        if (ViewType == 29) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item29, parent, false);
            return new Ribbon29Holder(view, mListener, images);
        }
        if (ViewType == 30) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item30, parent, false);
            return new Ribbon30Holder(view, mListener, images);
        }
        if (ViewType == 31) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item31, parent, false);
            return new Ribbon31Holder(view, mListener, images);
        }
        if (ViewType == 32) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item32, parent, false);
            return new Ribbon32Holder(view, mListener, images);
        }
        if (ViewType == 33) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item33, parent, false);
            return new Ribbon33Holder(view, mListener, images);
        }
        if (ViewType == 34) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item34, parent, false);
            return new Ribbon34Holder(view, mListener, images);
        }
        if (ViewType == 35) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item35, parent, false);
            return new Ribbon35Holder(view, mListener, images);
        }
        if (ViewType == 36) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item36, parent, false);
            return new Ribbon36Holder(view, mListener, images);
        }
        if (ViewType == 37) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item37, parent, false);
            return new Ribbon37Holder(view, mListener, images);
        }
        if (ViewType == 38) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item38, parent, false);
            return new Ribbon38Holder(view, mListener, images);
        }
        if (ViewType == 39) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item39, parent, false);
            return new Ribbon39Holder(view, mListener, images);
        }
        if (ViewType == 40) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item40, parent, false);
            return new Ribbon40Holder(view, mListener, images);
        }
        if (ViewType == 41) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item41, parent, false);
            return new Ribbon41Holder(view, mListener, images);
        }
        if (ViewType == 42) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item42, parent, false);
            return new Ribbon42Holder(view, mListener, images);
        }
        if (ViewType == 43) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item43, parent, false);
            return new Ribbon43Holder(view, mListener, images);
        }
        if (ViewType == 44) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item44, parent, false);
            return new Ribbon44Holder(view, mListener, images);
        }
        if (ViewType == 45) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item45, parent, false);
            return new Ribbon45Holder(view, mListener, images);
        }
        if (ViewType == 46) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item46, parent, false);
            return new Ribbon46Holder(view, mListener, images);
        }
        if (ViewType == 47) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item47, parent, false);
            return new Ribbon47Holder(view, mListener, images);
        }
        if (ViewType == 48) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item48, parent, false);
            return new Ribbon48Holder(view, mListener, images);
        }
        if (ViewType == 49) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item49, parent, false);
            return new Ribbon49Holder(view, mListener, images);
        }
        if (ViewType == 50) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ribbon_item50, parent, false);
            return new Ribbon50Holder(view, mListener, images);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof Ribbon1Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon1Holder) holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon1Holder) holder).mImageView1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    System.out.println("Oaks before" + oaks);
                    showPopup(view, oaks, 0);
                }
            });
        } else if (holder instanceof Ribbon2Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon2Holder) holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon2Holder) holder).mImageView1.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    System.out.println("Oaks first ribbon" + oaks.get(0));
                    showPopup(view, oaks, 0);
                }
            });
            ((Ribbon2Holder) holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon2Holder) holder).mImageView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    System.out.println("Oaks second ribbon" + oaks.get(1));
                    showPopup(view, oaks, 1);
                }
            });
        } else if (holder instanceof Ribbon3Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon3Holder) holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon3Holder) holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon3Holder) holder).mImageView3.setImageResource(currentItem.getImageResource3());
        } else if (holder instanceof Ribbon4Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon4Holder) holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon4Holder) holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon4Holder) holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon4Holder) holder).mImageView4.setImageResource(currentItem.getImageResource4());
        } else if (holder instanceof Ribbon5Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon5Holder) holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon5Holder) holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon5Holder) holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon5Holder) holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon5Holder) holder).mImageView5.setImageResource(currentItem.getImageResource5());
        } else if (holder instanceof Ribbon6Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon6Holder) holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon6Holder) holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon6Holder) holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon6Holder) holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon6Holder) holder).mImageView5.setImageResource(currentItem.getImageResource5());
            ((Ribbon6Holder) holder).mImageView6.setImageResource(currentItem.getImageResource6());
        } else if (holder instanceof Ribbon7Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon7Holder) holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon7Holder) holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon7Holder) holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon7Holder) holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon7Holder) holder).mImageView5.setImageResource(currentItem.getImageResource5());
            ((Ribbon7Holder) holder).mImageView6.setImageResource(currentItem.getImageResource6());
            ((Ribbon7Holder) holder).mImageView7.setImageResource(currentItem.getImageResource7());
        } else if (holder instanceof Ribbon8Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon8Holder) holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon8Holder) holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon8Holder) holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon8Holder) holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon8Holder) holder).mImageView5.setImageResource(currentItem.getImageResource5());
            ((Ribbon8Holder) holder).mImageView6.setImageResource(currentItem.getImageResource6());
            ((Ribbon8Holder) holder).mImageView7.setImageResource(currentItem.getImageResource7());
            ((Ribbon8Holder) holder).mImageView8.setImageResource(currentItem.getImageResource8());

        } else if (holder instanceof Ribbon9Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon9Holder)holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon9Holder) holder).mImageView1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //showPopup(view);
                    System.out.println("You clicked me@"+currentItem);
                }
            });
            ((Ribbon9Holder)holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon9Holder) holder).mImageView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //showPopup(view);
                    System.out.println("You clicked me@"+currentItem);
                }
            });
            ((Ribbon9Holder)holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon9Holder) holder).mImageView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //showPopup(view);
                    System.out.println("You clicked me@"+currentItem);
                }
            });
            ((Ribbon9Holder)holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon9Holder) holder).mImageView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //showPopup(view);
                    System.out.println("You clicked me@"+currentItem);
                }
            });
            ((Ribbon9Holder)holder).mImageView5.setImageResource(currentItem.getImageResource5());
            ((Ribbon9Holder) holder).mImageView5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //showPopup(view);
                    System.out.println("You clicked me@"+currentItem);
                }
            });
            ((Ribbon9Holder)holder).mImageView6.setImageResource(currentItem.getImageResource6());
            ((Ribbon9Holder) holder).mImageView6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //showPopup(view);
                    System.out.println("You clicked me@"+currentItem);
                }
            });
            ((Ribbon9Holder)holder).mImageView7.setImageResource(currentItem.getImageResource7());
            ((Ribbon9Holder) holder).mImageView7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //showPopup(view);
                    System.out.println("You clicked me@"+currentItem);
                }
            });
            ((Ribbon9Holder)holder).mImageView8.setImageResource(currentItem.getImageResource8());
            ((Ribbon9Holder) holder).mImageView8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //showPopup(view);
                    System.out.println("You clicked me@"+currentItem);
                }
            });
            ((Ribbon9Holder)holder).mImageView9.setImageResource(currentItem.getImageResource9());
            ((Ribbon9Holder) holder).mImageView9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //showPopup(view);
                    System.out.println("You clicked me@"+currentItem);
                }
            });
        } else if (holder instanceof Ribbon10Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon10Holder) holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon10Holder) holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon10Holder) holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon10Holder) holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon10Holder) holder).mImageView5.setImageResource(currentItem.getImageResource5());
            ((Ribbon10Holder) holder).mImageView6.setImageResource(currentItem.getImageResource6());
            ((Ribbon10Holder) holder).mImageView7.setImageResource(currentItem.getImageResource7());
            ((Ribbon10Holder) holder).mImageView8.setImageResource(currentItem.getImageResource8());
            ((Ribbon10Holder) holder).mImageView9.setImageResource(currentItem.getImageResource9());
            ((Ribbon10Holder) holder).mImageView10.setImageResource(currentItem.getImageResource10());

        } else if (holder instanceof Ribbon11Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon11Holder) holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon11Holder) holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon11Holder) holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon11Holder) holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon11Holder) holder).mImageView5.setImageResource(currentItem.getImageResource5());
            ((Ribbon11Holder) holder).mImageView6.setImageResource(currentItem.getImageResource6());
            ((Ribbon11Holder) holder).mImageView7.setImageResource(currentItem.getImageResource7());
            ((Ribbon11Holder) holder).mImageView8.setImageResource(currentItem.getImageResource8());
            ((Ribbon11Holder) holder).mImageView9.setImageResource(currentItem.getImageResource9());
            ((Ribbon11Holder) holder).mImageView10.setImageResource(currentItem.getImageResource10());
            ((Ribbon11Holder) holder).mImageView11.setImageResource(currentItem.getImageResource11());
        } else if (holder instanceof Ribbon12Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon12Holder) holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon12Holder) holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon12Holder) holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon12Holder) holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon12Holder) holder).mImageView5.setImageResource(currentItem.getImageResource5());
            ((Ribbon12Holder) holder).mImageView6.setImageResource(currentItem.getImageResource6());
            ((Ribbon12Holder) holder).mImageView7.setImageResource(currentItem.getImageResource7());
            ((Ribbon12Holder) holder).mImageView8.setImageResource(currentItem.getImageResource8());
            ((Ribbon12Holder) holder).mImageView9.setImageResource(currentItem.getImageResource9());
            ((Ribbon12Holder) holder).mImageView10.setImageResource(currentItem.getImageResource10());
            ((Ribbon12Holder) holder).mImageView11.setImageResource(currentItem.getImageResource11());
            ((Ribbon12Holder) holder).mImageView12.setImageResource(currentItem.getImageResource12());
        }

        else if (holder instanceof Ribbon13Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon13Holder)holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon13Holder)holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon13Holder)holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon13Holder)holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon13Holder)holder).mImageView5.setImageResource(currentItem.getImageResource5());
            ((Ribbon13Holder)holder).mImageView6.setImageResource(currentItem.getImageResource6());
            ((Ribbon13Holder)holder).mImageView7.setImageResource(currentItem.getImageResource7());
            ((Ribbon13Holder)holder).mImageView8.setImageResource(currentItem.getImageResource8());
            ((Ribbon13Holder)holder).mImageView9.setImageResource(currentItem.getImageResource9());
            ((Ribbon13Holder)holder).mImageView10.setImageResource(currentItem.getImageResource10());
            ((Ribbon13Holder)holder).mImageView11.setImageResource(currentItem.getImageResource11());
            ((Ribbon13Holder)holder).mImageView12.setImageResource(currentItem.getImageResource12());
            ((Ribbon13Holder)holder).mImageView13.setImageResource(currentItem.getImageResource13());
        }

        else if (holder instanceof Ribbon14Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon14Holder)holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon14Holder)holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon14Holder)holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon14Holder)holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon14Holder)holder).mImageView5.setImageResource(currentItem.getImageResource5());
            ((Ribbon14Holder)holder).mImageView6.setImageResource(currentItem.getImageResource6());
            ((Ribbon14Holder)holder).mImageView7.setImageResource(currentItem.getImageResource7());
            ((Ribbon14Holder)holder).mImageView8.setImageResource(currentItem.getImageResource8());
            ((Ribbon14Holder)holder).mImageView9.setImageResource(currentItem.getImageResource9());
            ((Ribbon14Holder)holder).mImageView10.setImageResource(currentItem.getImageResource10());
            ((Ribbon14Holder)holder).mImageView11.setImageResource(currentItem.getImageResource11());
            ((Ribbon14Holder)holder).mImageView12.setImageResource(currentItem.getImageResource12());
            ((Ribbon14Holder)holder).mImageView13.setImageResource(currentItem.getImageResource13());
            ((Ribbon14Holder)holder).mImageView14.setImageResource(currentItem.getImageResource14());
        }


        else if (holder instanceof Ribbon15Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon15Holder)holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon15Holder)holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon15Holder)holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon15Holder)holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon15Holder)holder).mImageView5.setImageResource(currentItem.getImageResource5());
            ((Ribbon15Holder)holder).mImageView6.setImageResource(currentItem.getImageResource6());
            ((Ribbon15Holder)holder).mImageView7.setImageResource(currentItem.getImageResource7());
            ((Ribbon15Holder)holder).mImageView8.setImageResource(currentItem.getImageResource8());
            ((Ribbon15Holder)holder).mImageView9.setImageResource(currentItem.getImageResource9());
            ((Ribbon15Holder)holder).mImageView10.setImageResource(currentItem.getImageResource10());
            ((Ribbon15Holder)holder).mImageView11.setImageResource(currentItem.getImageResource11());
            ((Ribbon15Holder)holder).mImageView12.setImageResource(currentItem.getImageResource12());
            ((Ribbon15Holder)holder).mImageView13.setImageResource(currentItem.getImageResource13());
            ((Ribbon15Holder)holder).mImageView14.setImageResource(currentItem.getImageResource14());
            ((Ribbon15Holder)holder).mImageView15.setImageResource(currentItem.getImageResource15());
        }


        else if (holder instanceof Ribbon16Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon16Holder)holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon16Holder)holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon16Holder)holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon16Holder)holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon16Holder)holder).mImageView5.setImageResource(currentItem.getImageResource5());
            ((Ribbon16Holder)holder).mImageView6.setImageResource(currentItem.getImageResource6());
            ((Ribbon16Holder)holder).mImageView7.setImageResource(currentItem.getImageResource7());
            ((Ribbon16Holder)holder).mImageView8.setImageResource(currentItem.getImageResource8());
            ((Ribbon16Holder)holder).mImageView9.setImageResource(currentItem.getImageResource9());
            ((Ribbon16Holder)holder).mImageView10.setImageResource(currentItem.getImageResource10());
            ((Ribbon16Holder)holder).mImageView11.setImageResource(currentItem.getImageResource11());
            ((Ribbon16Holder)holder).mImageView12.setImageResource(currentItem.getImageResource12());
            ((Ribbon16Holder)holder).mImageView13.setImageResource(currentItem.getImageResource13());
            ((Ribbon16Holder)holder).mImageView14.setImageResource(currentItem.getImageResource14());
            ((Ribbon16Holder)holder).mImageView15.setImageResource(currentItem.getImageResource15());
            ((Ribbon16Holder)holder).mImageView16.setImageResource(currentItem.getImageResource16());
        }


        else if (holder instanceof Ribbon17Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon17Holder)holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon17Holder)holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon17Holder)holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon17Holder)holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon17Holder)holder).mImageView5.setImageResource(currentItem.getImageResource5());
            ((Ribbon17Holder)holder).mImageView6.setImageResource(currentItem.getImageResource6());
            ((Ribbon17Holder)holder).mImageView7.setImageResource(currentItem.getImageResource7());
            ((Ribbon17Holder)holder).mImageView8.setImageResource(currentItem.getImageResource8());
            ((Ribbon17Holder)holder).mImageView9.setImageResource(currentItem.getImageResource9());
            ((Ribbon17Holder)holder).mImageView10.setImageResource(currentItem.getImageResource10());
            ((Ribbon17Holder)holder).mImageView11.setImageResource(currentItem.getImageResource11());
            ((Ribbon17Holder)holder).mImageView12.setImageResource(currentItem.getImageResource12());
            ((Ribbon17Holder)holder).mImageView13.setImageResource(currentItem.getImageResource13());
            ((Ribbon17Holder)holder).mImageView14.setImageResource(currentItem.getImageResource14());
            ((Ribbon17Holder)holder).mImageView15.setImageResource(currentItem.getImageResource15());
            ((Ribbon17Holder)holder).mImageView16.setImageResource(currentItem.getImageResource16());
            ((Ribbon17Holder)holder).mImageView17.setImageResource(currentItem.getImageResource17());
        }


        else if (holder instanceof Ribbon18Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon18Holder)holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon18Holder)holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon18Holder)holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon18Holder)holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon18Holder)holder).mImageView5.setImageResource(currentItem.getImageResource5());
            ((Ribbon18Holder)holder).mImageView6.setImageResource(currentItem.getImageResource6());
            ((Ribbon18Holder)holder).mImageView7.setImageResource(currentItem.getImageResource7());
            ((Ribbon18Holder)holder).mImageView8.setImageResource(currentItem.getImageResource8());
            ((Ribbon18Holder)holder).mImageView9.setImageResource(currentItem.getImageResource9());
            ((Ribbon18Holder)holder).mImageView10.setImageResource(currentItem.getImageResource10());
            ((Ribbon18Holder)holder).mImageView11.setImageResource(currentItem.getImageResource11());
            ((Ribbon18Holder)holder).mImageView12.setImageResource(currentItem.getImageResource12());
            ((Ribbon18Holder)holder).mImageView13.setImageResource(currentItem.getImageResource13());
            ((Ribbon18Holder)holder).mImageView14.setImageResource(currentItem.getImageResource14());
            ((Ribbon18Holder)holder).mImageView15.setImageResource(currentItem.getImageResource15());
            ((Ribbon18Holder)holder).mImageView16.setImageResource(currentItem.getImageResource16());
            ((Ribbon18Holder)holder).mImageView17.setImageResource(currentItem.getImageResource17());
            ((Ribbon18Holder)holder).mImageView18.setImageResource(currentItem.getImageResource18());
        }


        else if (holder instanceof Ribbon19Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon19Holder)holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon19Holder)holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon19Holder)holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon19Holder)holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon19Holder)holder).mImageView5.setImageResource(currentItem.getImageResource5());
            ((Ribbon19Holder)holder).mImageView6.setImageResource(currentItem.getImageResource6());
            ((Ribbon19Holder)holder).mImageView7.setImageResource(currentItem.getImageResource7());
            ((Ribbon19Holder)holder).mImageView8.setImageResource(currentItem.getImageResource8());
            ((Ribbon19Holder)holder).mImageView9.setImageResource(currentItem.getImageResource9());
            ((Ribbon19Holder)holder).mImageView10.setImageResource(currentItem.getImageResource10());
            ((Ribbon19Holder)holder).mImageView11.setImageResource(currentItem.getImageResource11());
            ((Ribbon19Holder)holder).mImageView12.setImageResource(currentItem.getImageResource12());
            ((Ribbon19Holder)holder).mImageView13.setImageResource(currentItem.getImageResource13());
            ((Ribbon19Holder)holder).mImageView14.setImageResource(currentItem.getImageResource14());
            ((Ribbon19Holder)holder).mImageView15.setImageResource(currentItem.getImageResource15());
            ((Ribbon19Holder)holder).mImageView16.setImageResource(currentItem.getImageResource16());
            ((Ribbon19Holder)holder).mImageView17.setImageResource(currentItem.getImageResource17());
            ((Ribbon19Holder)holder).mImageView18.setImageResource(currentItem.getImageResource18());
            ((Ribbon19Holder)holder).mImageView19.setImageResource(currentItem.getImageResource19());
        }


        else if (holder instanceof Ribbon20Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon20Holder)holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon20Holder)holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon20Holder)holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon20Holder)holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon20Holder)holder).mImageView5.setImageResource(currentItem.getImageResource5());
            ((Ribbon20Holder)holder).mImageView6.setImageResource(currentItem.getImageResource6());
            ((Ribbon20Holder)holder).mImageView7.setImageResource(currentItem.getImageResource7());
            ((Ribbon20Holder)holder).mImageView8.setImageResource(currentItem.getImageResource8());
            ((Ribbon20Holder)holder).mImageView9.setImageResource(currentItem.getImageResource9());
            ((Ribbon20Holder)holder).mImageView10.setImageResource(currentItem.getImageResource10());
            ((Ribbon20Holder)holder).mImageView11.setImageResource(currentItem.getImageResource11());
            ((Ribbon20Holder)holder).mImageView12.setImageResource(currentItem.getImageResource12());
            ((Ribbon20Holder)holder).mImageView13.setImageResource(currentItem.getImageResource13());
            ((Ribbon20Holder)holder).mImageView14.setImageResource(currentItem.getImageResource14());
            ((Ribbon20Holder)holder).mImageView15.setImageResource(currentItem.getImageResource15());
            ((Ribbon20Holder)holder).mImageView16.setImageResource(currentItem.getImageResource16());
            ((Ribbon20Holder)holder).mImageView17.setImageResource(currentItem.getImageResource17());
            ((Ribbon20Holder)holder).mImageView18.setImageResource(currentItem.getImageResource18());
            ((Ribbon20Holder)holder).mImageView19.setImageResource(currentItem.getImageResource19());
            ((Ribbon20Holder)holder).mImageView20.setImageResource(currentItem.getImageResource20());
        }


        else if (holder instanceof Ribbon21Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon21Holder)holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon21Holder)holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon21Holder)holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon21Holder)holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon21Holder)holder).mImageView5.setImageResource(currentItem.getImageResource5());
            ((Ribbon21Holder)holder).mImageView6.setImageResource(currentItem.getImageResource6());
            ((Ribbon21Holder)holder).mImageView7.setImageResource(currentItem.getImageResource7());
            ((Ribbon21Holder)holder).mImageView8.setImageResource(currentItem.getImageResource8());
            ((Ribbon21Holder)holder).mImageView9.setImageResource(currentItem.getImageResource9());
            ((Ribbon21Holder)holder).mImageView10.setImageResource(currentItem.getImageResource10());
            ((Ribbon21Holder)holder).mImageView11.setImageResource(currentItem.getImageResource11());
            ((Ribbon21Holder)holder).mImageView12.setImageResource(currentItem.getImageResource12());
            ((Ribbon21Holder)holder).mImageView13.setImageResource(currentItem.getImageResource13());
            ((Ribbon21Holder)holder).mImageView14.setImageResource(currentItem.getImageResource14());
            ((Ribbon21Holder)holder).mImageView15.setImageResource(currentItem.getImageResource15());
            ((Ribbon21Holder)holder).mImageView16.setImageResource(currentItem.getImageResource16());
            ((Ribbon21Holder)holder).mImageView17.setImageResource(currentItem.getImageResource17());
            ((Ribbon21Holder)holder).mImageView18.setImageResource(currentItem.getImageResource18());
            ((Ribbon21Holder)holder).mImageView19.setImageResource(currentItem.getImageResource19());
            ((Ribbon21Holder)holder).mImageView20.setImageResource(currentItem.getImageResource20());
            ((Ribbon21Holder)holder).mImageView21.setImageResource(currentItem.getImageResource21());
        }


        else if (holder instanceof Ribbon22Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon22Holder)holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon22Holder)holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon22Holder)holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon22Holder)holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon22Holder)holder).mImageView5.setImageResource(currentItem.getImageResource5());
            ((Ribbon22Holder)holder).mImageView6.setImageResource(currentItem.getImageResource6());
            ((Ribbon22Holder)holder).mImageView7.setImageResource(currentItem.getImageResource7());
            ((Ribbon22Holder)holder).mImageView8.setImageResource(currentItem.getImageResource8());
            ((Ribbon22Holder)holder).mImageView9.setImageResource(currentItem.getImageResource9());
            ((Ribbon22Holder)holder).mImageView10.setImageResource(currentItem.getImageResource10());
            ((Ribbon22Holder)holder).mImageView11.setImageResource(currentItem.getImageResource11());
            ((Ribbon22Holder)holder).mImageView12.setImageResource(currentItem.getImageResource12());
            ((Ribbon22Holder)holder).mImageView13.setImageResource(currentItem.getImageResource13());
            ((Ribbon22Holder)holder).mImageView14.setImageResource(currentItem.getImageResource14());
            ((Ribbon22Holder)holder).mImageView15.setImageResource(currentItem.getImageResource15());
            ((Ribbon22Holder)holder).mImageView16.setImageResource(currentItem.getImageResource16());
            ((Ribbon22Holder)holder).mImageView17.setImageResource(currentItem.getImageResource17());
            ((Ribbon22Holder)holder).mImageView18.setImageResource(currentItem.getImageResource18());
            ((Ribbon22Holder)holder).mImageView19.setImageResource(currentItem.getImageResource19());
            ((Ribbon22Holder)holder).mImageView20.setImageResource(currentItem.getImageResource20());
            ((Ribbon22Holder)holder).mImageView21.setImageResource(currentItem.getImageResource21());
            ((Ribbon22Holder)holder).mImageView22.setImageResource(currentItem.getImageResource22());
        }


        else if (holder instanceof Ribbon23Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon23Holder)holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon23Holder)holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon23Holder)holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon23Holder)holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon23Holder)holder).mImageView5.setImageResource(currentItem.getImageResource5());
            ((Ribbon23Holder)holder).mImageView6.setImageResource(currentItem.getImageResource6());
            ((Ribbon23Holder)holder).mImageView7.setImageResource(currentItem.getImageResource7());
            ((Ribbon23Holder)holder).mImageView8.setImageResource(currentItem.getImageResource8());
            ((Ribbon23Holder)holder).mImageView9.setImageResource(currentItem.getImageResource9());
            ((Ribbon23Holder)holder).mImageView10.setImageResource(currentItem.getImageResource10());
            ((Ribbon23Holder)holder).mImageView11.setImageResource(currentItem.getImageResource11());
            ((Ribbon23Holder)holder).mImageView12.setImageResource(currentItem.getImageResource12());
            ((Ribbon23Holder)holder).mImageView13.setImageResource(currentItem.getImageResource13());
            ((Ribbon23Holder)holder).mImageView14.setImageResource(currentItem.getImageResource14());
            ((Ribbon23Holder)holder).mImageView15.setImageResource(currentItem.getImageResource15());
            ((Ribbon23Holder)holder).mImageView16.setImageResource(currentItem.getImageResource16());
            ((Ribbon23Holder)holder).mImageView17.setImageResource(currentItem.getImageResource17());
            ((Ribbon23Holder)holder).mImageView18.setImageResource(currentItem.getImageResource18());
            ((Ribbon23Holder)holder).mImageView19.setImageResource(currentItem.getImageResource19());
            ((Ribbon23Holder)holder).mImageView20.setImageResource(currentItem.getImageResource20());
            ((Ribbon23Holder)holder).mImageView21.setImageResource(currentItem.getImageResource21());
            ((Ribbon23Holder)holder).mImageView22.setImageResource(currentItem.getImageResource22());
            ((Ribbon23Holder)holder).mImageView23.setImageResource(currentItem.getImageResource23());
        }


        else if (holder instanceof Ribbon24Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon24Holder)holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon24Holder)holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon24Holder)holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon24Holder)holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon24Holder)holder).mImageView5.setImageResource(currentItem.getImageResource5());
            ((Ribbon24Holder)holder).mImageView6.setImageResource(currentItem.getImageResource6());
            ((Ribbon24Holder)holder).mImageView7.setImageResource(currentItem.getImageResource7());
            ((Ribbon24Holder)holder).mImageView8.setImageResource(currentItem.getImageResource8());
            ((Ribbon24Holder)holder).mImageView9.setImageResource(currentItem.getImageResource9());
            ((Ribbon24Holder)holder).mImageView10.setImageResource(currentItem.getImageResource10());
            ((Ribbon24Holder)holder).mImageView11.setImageResource(currentItem.getImageResource11());
            ((Ribbon24Holder)holder).mImageView12.setImageResource(currentItem.getImageResource12());
            ((Ribbon24Holder)holder).mImageView13.setImageResource(currentItem.getImageResource13());
            ((Ribbon24Holder)holder).mImageView14.setImageResource(currentItem.getImageResource14());
            ((Ribbon24Holder)holder).mImageView15.setImageResource(currentItem.getImageResource15());
            ((Ribbon24Holder)holder).mImageView16.setImageResource(currentItem.getImageResource16());
            ((Ribbon24Holder)holder).mImageView17.setImageResource(currentItem.getImageResource17());
            ((Ribbon24Holder)holder).mImageView18.setImageResource(currentItem.getImageResource18());
            ((Ribbon24Holder)holder).mImageView19.setImageResource(currentItem.getImageResource19());
            ((Ribbon24Holder)holder).mImageView20.setImageResource(currentItem.getImageResource20());
            ((Ribbon24Holder)holder).mImageView21.setImageResource(currentItem.getImageResource21());
            ((Ribbon24Holder)holder).mImageView22.setImageResource(currentItem.getImageResource22());
            ((Ribbon24Holder)holder).mImageView23.setImageResource(currentItem.getImageResource23());
            ((Ribbon24Holder)holder).mImageView24.setImageResource(currentItem.getImageResource24());
        }


        else if (holder instanceof Ribbon25Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon25Holder)holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon25Holder)holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon25Holder)holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon25Holder)holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon25Holder)holder).mImageView5.setImageResource(currentItem.getImageResource5());
            ((Ribbon25Holder)holder).mImageView6.setImageResource(currentItem.getImageResource6());
            ((Ribbon25Holder)holder).mImageView7.setImageResource(currentItem.getImageResource7());
            ((Ribbon25Holder)holder).mImageView8.setImageResource(currentItem.getImageResource8());
            ((Ribbon25Holder)holder).mImageView9.setImageResource(currentItem.getImageResource9());
            ((Ribbon25Holder)holder).mImageView10.setImageResource(currentItem.getImageResource10());
            ((Ribbon25Holder)holder).mImageView11.setImageResource(currentItem.getImageResource11());
            ((Ribbon25Holder)holder).mImageView12.setImageResource(currentItem.getImageResource12());
            ((Ribbon25Holder)holder).mImageView13.setImageResource(currentItem.getImageResource13());
            ((Ribbon25Holder)holder).mImageView14.setImageResource(currentItem.getImageResource14());
            ((Ribbon25Holder)holder).mImageView15.setImageResource(currentItem.getImageResource15());
            ((Ribbon25Holder)holder).mImageView16.setImageResource(currentItem.getImageResource16());
            ((Ribbon25Holder)holder).mImageView17.setImageResource(currentItem.getImageResource17());
            ((Ribbon25Holder)holder).mImageView18.setImageResource(currentItem.getImageResource18());
            ((Ribbon25Holder)holder).mImageView19.setImageResource(currentItem.getImageResource19());
            ((Ribbon25Holder)holder).mImageView20.setImageResource(currentItem.getImageResource20());
            ((Ribbon25Holder)holder).mImageView21.setImageResource(currentItem.getImageResource21());
            ((Ribbon25Holder)holder).mImageView22.setImageResource(currentItem.getImageResource22());
            ((Ribbon25Holder)holder).mImageView23.setImageResource(currentItem.getImageResource23());
            ((Ribbon25Holder)holder).mImageView24.setImageResource(currentItem.getImageResource24());
            ((Ribbon25Holder)holder).mImageView25.setImageResource(currentItem.getImageResource25());
        }


        else if (holder instanceof Ribbon26Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon26Holder)holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon26Holder)holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon26Holder)holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon26Holder)holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon26Holder)holder).mImageView5.setImageResource(currentItem.getImageResource5());
            ((Ribbon26Holder)holder).mImageView6.setImageResource(currentItem.getImageResource6());
            ((Ribbon26Holder)holder).mImageView7.setImageResource(currentItem.getImageResource7());
            ((Ribbon26Holder)holder).mImageView8.setImageResource(currentItem.getImageResource8());
            ((Ribbon26Holder)holder).mImageView9.setImageResource(currentItem.getImageResource9());
            ((Ribbon26Holder)holder).mImageView10.setImageResource(currentItem.getImageResource10());
            ((Ribbon26Holder)holder).mImageView11.setImageResource(currentItem.getImageResource11());
            ((Ribbon26Holder)holder).mImageView12.setImageResource(currentItem.getImageResource12());
            ((Ribbon26Holder)holder).mImageView13.setImageResource(currentItem.getImageResource13());
            ((Ribbon26Holder)holder).mImageView14.setImageResource(currentItem.getImageResource14());
            ((Ribbon26Holder)holder).mImageView15.setImageResource(currentItem.getImageResource15());
            ((Ribbon26Holder)holder).mImageView16.setImageResource(currentItem.getImageResource16());
            ((Ribbon26Holder)holder).mImageView17.setImageResource(currentItem.getImageResource17());
            ((Ribbon26Holder)holder).mImageView18.setImageResource(currentItem.getImageResource18());
            ((Ribbon26Holder)holder).mImageView19.setImageResource(currentItem.getImageResource19());
            ((Ribbon26Holder)holder).mImageView20.setImageResource(currentItem.getImageResource20());
            ((Ribbon26Holder)holder).mImageView21.setImageResource(currentItem.getImageResource21());
            ((Ribbon26Holder)holder).mImageView22.setImageResource(currentItem.getImageResource22());
            ((Ribbon26Holder)holder).mImageView23.setImageResource(currentItem.getImageResource23());
            ((Ribbon26Holder)holder).mImageView24.setImageResource(currentItem.getImageResource24());
            ((Ribbon26Holder)holder).mImageView25.setImageResource(currentItem.getImageResource25());
            ((Ribbon26Holder)holder).mImageView26.setImageResource(currentItem.getImageResource26());
        }


        else if (holder instanceof Ribbon27Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon27Holder)holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon27Holder)holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon27Holder)holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon27Holder)holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon27Holder)holder).mImageView5.setImageResource(currentItem.getImageResource5());
            ((Ribbon27Holder)holder).mImageView6.setImageResource(currentItem.getImageResource6());
            ((Ribbon27Holder)holder).mImageView7.setImageResource(currentItem.getImageResource7());
            ((Ribbon27Holder)holder).mImageView8.setImageResource(currentItem.getImageResource8());
            ((Ribbon27Holder)holder).mImageView9.setImageResource(currentItem.getImageResource9());
            ((Ribbon27Holder)holder).mImageView10.setImageResource(currentItem.getImageResource10());
            ((Ribbon27Holder)holder).mImageView11.setImageResource(currentItem.getImageResource11());
            ((Ribbon27Holder)holder).mImageView12.setImageResource(currentItem.getImageResource12());
            ((Ribbon27Holder)holder).mImageView13.setImageResource(currentItem.getImageResource13());
            ((Ribbon27Holder)holder).mImageView14.setImageResource(currentItem.getImageResource14());
            ((Ribbon27Holder)holder).mImageView15.setImageResource(currentItem.getImageResource15());
            ((Ribbon27Holder)holder).mImageView16.setImageResource(currentItem.getImageResource16());
            ((Ribbon27Holder)holder).mImageView17.setImageResource(currentItem.getImageResource17());
            ((Ribbon27Holder)holder).mImageView18.setImageResource(currentItem.getImageResource18());
            ((Ribbon27Holder)holder).mImageView19.setImageResource(currentItem.getImageResource19());
            ((Ribbon27Holder)holder).mImageView20.setImageResource(currentItem.getImageResource20());
            ((Ribbon27Holder)holder).mImageView21.setImageResource(currentItem.getImageResource21());
            ((Ribbon27Holder)holder).mImageView22.setImageResource(currentItem.getImageResource22());
            ((Ribbon27Holder)holder).mImageView23.setImageResource(currentItem.getImageResource23());
            ((Ribbon27Holder)holder).mImageView24.setImageResource(currentItem.getImageResource24());
            ((Ribbon27Holder)holder).mImageView25.setImageResource(currentItem.getImageResource25());
            ((Ribbon27Holder)holder).mImageView26.setImageResource(currentItem.getImageResource26());
            ((Ribbon27Holder)holder).mImageView27.setImageResource(currentItem.getImageResource27());
        }


        else if (holder instanceof Ribbon28Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon28Holder)holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon28Holder)holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon28Holder)holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon28Holder)holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon28Holder)holder).mImageView5.setImageResource(currentItem.getImageResource5());
            ((Ribbon28Holder)holder).mImageView6.setImageResource(currentItem.getImageResource6());
            ((Ribbon28Holder)holder).mImageView7.setImageResource(currentItem.getImageResource7());
            ((Ribbon28Holder)holder).mImageView8.setImageResource(currentItem.getImageResource8());
            ((Ribbon28Holder)holder).mImageView9.setImageResource(currentItem.getImageResource9());
            ((Ribbon28Holder)holder).mImageView10.setImageResource(currentItem.getImageResource10());
            ((Ribbon28Holder)holder).mImageView11.setImageResource(currentItem.getImageResource11());
            ((Ribbon28Holder)holder).mImageView12.setImageResource(currentItem.getImageResource12());
            ((Ribbon28Holder)holder).mImageView13.setImageResource(currentItem.getImageResource13());
            ((Ribbon28Holder)holder).mImageView14.setImageResource(currentItem.getImageResource14());
            ((Ribbon28Holder)holder).mImageView15.setImageResource(currentItem.getImageResource15());
            ((Ribbon28Holder)holder).mImageView16.setImageResource(currentItem.getImageResource16());
            ((Ribbon28Holder)holder).mImageView17.setImageResource(currentItem.getImageResource17());
            ((Ribbon28Holder)holder).mImageView18.setImageResource(currentItem.getImageResource18());
            ((Ribbon28Holder)holder).mImageView19.setImageResource(currentItem.getImageResource19());
            ((Ribbon28Holder)holder).mImageView20.setImageResource(currentItem.getImageResource20());
            ((Ribbon28Holder)holder).mImageView21.setImageResource(currentItem.getImageResource21());
            ((Ribbon28Holder)holder).mImageView22.setImageResource(currentItem.getImageResource22());
            ((Ribbon28Holder)holder).mImageView23.setImageResource(currentItem.getImageResource23());
            ((Ribbon28Holder)holder).mImageView24.setImageResource(currentItem.getImageResource24());
            ((Ribbon28Holder)holder).mImageView25.setImageResource(currentItem.getImageResource25());
            ((Ribbon28Holder)holder).mImageView26.setImageResource(currentItem.getImageResource26());
            ((Ribbon28Holder)holder).mImageView27.setImageResource(currentItem.getImageResource27());
            ((Ribbon28Holder)holder).mImageView28.setImageResource(currentItem.getImageResource28());
        }


        else if (holder instanceof Ribbon29Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon29Holder)holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon29Holder)holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon29Holder)holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon29Holder)holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon29Holder)holder).mImageView5.setImageResource(currentItem.getImageResource5());
            ((Ribbon29Holder)holder).mImageView6.setImageResource(currentItem.getImageResource6());
            ((Ribbon29Holder)holder).mImageView7.setImageResource(currentItem.getImageResource7());
            ((Ribbon29Holder)holder).mImageView8.setImageResource(currentItem.getImageResource8());
            ((Ribbon29Holder)holder).mImageView9.setImageResource(currentItem.getImageResource9());
            ((Ribbon29Holder)holder).mImageView10.setImageResource(currentItem.getImageResource10());
            ((Ribbon29Holder)holder).mImageView11.setImageResource(currentItem.getImageResource11());
            ((Ribbon29Holder)holder).mImageView12.setImageResource(currentItem.getImageResource12());
            ((Ribbon29Holder)holder).mImageView13.setImageResource(currentItem.getImageResource13());
            ((Ribbon29Holder)holder).mImageView14.setImageResource(currentItem.getImageResource14());
            ((Ribbon29Holder)holder).mImageView15.setImageResource(currentItem.getImageResource15());
            ((Ribbon29Holder)holder).mImageView16.setImageResource(currentItem.getImageResource16());
            ((Ribbon29Holder)holder).mImageView17.setImageResource(currentItem.getImageResource17());
            ((Ribbon29Holder)holder).mImageView18.setImageResource(currentItem.getImageResource18());
            ((Ribbon29Holder)holder).mImageView19.setImageResource(currentItem.getImageResource19());
            ((Ribbon29Holder)holder).mImageView20.setImageResource(currentItem.getImageResource20());
            ((Ribbon29Holder)holder).mImageView21.setImageResource(currentItem.getImageResource21());
            ((Ribbon29Holder)holder).mImageView22.setImageResource(currentItem.getImageResource22());
            ((Ribbon29Holder)holder).mImageView23.setImageResource(currentItem.getImageResource23());
            ((Ribbon29Holder)holder).mImageView24.setImageResource(currentItem.getImageResource24());
            ((Ribbon29Holder)holder).mImageView25.setImageResource(currentItem.getImageResource25());
            ((Ribbon29Holder)holder).mImageView26.setImageResource(currentItem.getImageResource26());
            ((Ribbon29Holder)holder).mImageView27.setImageResource(currentItem.getImageResource27());
            ((Ribbon29Holder)holder).mImageView28.setImageResource(currentItem.getImageResource28());
            ((Ribbon29Holder)holder).mImageView29.setImageResource(currentItem.getImageResource29());
        }


        else if (holder instanceof Ribbon30Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon30Holder)holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon30Holder)holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon30Holder)holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon30Holder)holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon30Holder)holder).mImageView5.setImageResource(currentItem.getImageResource5());
            ((Ribbon30Holder)holder).mImageView6.setImageResource(currentItem.getImageResource6());
            ((Ribbon30Holder)holder).mImageView7.setImageResource(currentItem.getImageResource7());
            ((Ribbon30Holder)holder).mImageView8.setImageResource(currentItem.getImageResource8());
            ((Ribbon30Holder)holder).mImageView9.setImageResource(currentItem.getImageResource9());
            ((Ribbon30Holder)holder).mImageView10.setImageResource(currentItem.getImageResource10());
            ((Ribbon30Holder)holder).mImageView11.setImageResource(currentItem.getImageResource11());
            ((Ribbon30Holder)holder).mImageView12.setImageResource(currentItem.getImageResource12());
            ((Ribbon30Holder)holder).mImageView13.setImageResource(currentItem.getImageResource13());
            ((Ribbon30Holder)holder).mImageView14.setImageResource(currentItem.getImageResource14());
            ((Ribbon30Holder)holder).mImageView15.setImageResource(currentItem.getImageResource15());
            ((Ribbon30Holder)holder).mImageView16.setImageResource(currentItem.getImageResource16());
            ((Ribbon30Holder)holder).mImageView17.setImageResource(currentItem.getImageResource17());
            ((Ribbon30Holder)holder).mImageView18.setImageResource(currentItem.getImageResource18());
            ((Ribbon30Holder)holder).mImageView19.setImageResource(currentItem.getImageResource19());
            ((Ribbon30Holder)holder).mImageView20.setImageResource(currentItem.getImageResource20());
            ((Ribbon30Holder)holder).mImageView21.setImageResource(currentItem.getImageResource21());
            ((Ribbon30Holder)holder).mImageView22.setImageResource(currentItem.getImageResource22());
            ((Ribbon30Holder)holder).mImageView23.setImageResource(currentItem.getImageResource23());
            ((Ribbon30Holder)holder).mImageView24.setImageResource(currentItem.getImageResource24());
            ((Ribbon30Holder)holder).mImageView25.setImageResource(currentItem.getImageResource25());
            ((Ribbon30Holder)holder).mImageView26.setImageResource(currentItem.getImageResource26());
            ((Ribbon30Holder)holder).mImageView27.setImageResource(currentItem.getImageResource27());
            ((Ribbon30Holder)holder).mImageView28.setImageResource(currentItem.getImageResource28());
            ((Ribbon30Holder)holder).mImageView29.setImageResource(currentItem.getImageResource29());
            ((Ribbon30Holder)holder).mImageView30.setImageResource(currentItem.getImageResource30());
        }


        else if (holder instanceof Ribbon31Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon31Holder)holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon31Holder)holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon31Holder)holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon31Holder)holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon31Holder)holder).mImageView5.setImageResource(currentItem.getImageResource5());
            ((Ribbon31Holder)holder).mImageView6.setImageResource(currentItem.getImageResource6());
            ((Ribbon31Holder)holder).mImageView7.setImageResource(currentItem.getImageResource7());
            ((Ribbon31Holder)holder).mImageView8.setImageResource(currentItem.getImageResource8());
            ((Ribbon31Holder)holder).mImageView9.setImageResource(currentItem.getImageResource9());
            ((Ribbon31Holder)holder).mImageView10.setImageResource(currentItem.getImageResource10());
            ((Ribbon31Holder)holder).mImageView11.setImageResource(currentItem.getImageResource11());
            ((Ribbon31Holder)holder).mImageView12.setImageResource(currentItem.getImageResource12());
            ((Ribbon31Holder)holder).mImageView13.setImageResource(currentItem.getImageResource13());
            ((Ribbon31Holder)holder).mImageView14.setImageResource(currentItem.getImageResource14());
            ((Ribbon31Holder)holder).mImageView15.setImageResource(currentItem.getImageResource15());
            ((Ribbon31Holder)holder).mImageView16.setImageResource(currentItem.getImageResource16());
            ((Ribbon31Holder)holder).mImageView17.setImageResource(currentItem.getImageResource17());
            ((Ribbon31Holder)holder).mImageView18.setImageResource(currentItem.getImageResource18());
            ((Ribbon31Holder)holder).mImageView19.setImageResource(currentItem.getImageResource19());
            ((Ribbon31Holder)holder).mImageView20.setImageResource(currentItem.getImageResource20());
            ((Ribbon31Holder)holder).mImageView21.setImageResource(currentItem.getImageResource21());
            ((Ribbon31Holder)holder).mImageView22.setImageResource(currentItem.getImageResource22());
            ((Ribbon31Holder)holder).mImageView23.setImageResource(currentItem.getImageResource23());
            ((Ribbon31Holder)holder).mImageView24.setImageResource(currentItem.getImageResource24());
            ((Ribbon31Holder)holder).mImageView25.setImageResource(currentItem.getImageResource25());
            ((Ribbon31Holder)holder).mImageView26.setImageResource(currentItem.getImageResource26());
            ((Ribbon31Holder)holder).mImageView27.setImageResource(currentItem.getImageResource27());
            ((Ribbon31Holder)holder).mImageView28.setImageResource(currentItem.getImageResource28());
            ((Ribbon31Holder)holder).mImageView29.setImageResource(currentItem.getImageResource29());
            ((Ribbon31Holder)holder).mImageView30.setImageResource(currentItem.getImageResource30());
            ((Ribbon31Holder)holder).mImageView31.setImageResource(currentItem.getImageResource31());
        }


        else if (holder instanceof Ribbon32Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon32Holder)holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon32Holder)holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon32Holder)holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon32Holder)holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon32Holder)holder).mImageView5.setImageResource(currentItem.getImageResource5());
            ((Ribbon32Holder)holder).mImageView6.setImageResource(currentItem.getImageResource6());
            ((Ribbon32Holder)holder).mImageView7.setImageResource(currentItem.getImageResource7());
            ((Ribbon32Holder)holder).mImageView8.setImageResource(currentItem.getImageResource8());
            ((Ribbon32Holder)holder).mImageView9.setImageResource(currentItem.getImageResource9());
            ((Ribbon32Holder)holder).mImageView10.setImageResource(currentItem.getImageResource10());
            ((Ribbon32Holder)holder).mImageView11.setImageResource(currentItem.getImageResource11());
            ((Ribbon32Holder)holder).mImageView12.setImageResource(currentItem.getImageResource12());
            ((Ribbon32Holder)holder).mImageView13.setImageResource(currentItem.getImageResource13());
            ((Ribbon32Holder)holder).mImageView14.setImageResource(currentItem.getImageResource14());
            ((Ribbon32Holder)holder).mImageView15.setImageResource(currentItem.getImageResource15());
            ((Ribbon32Holder)holder).mImageView16.setImageResource(currentItem.getImageResource16());
            ((Ribbon32Holder)holder).mImageView17.setImageResource(currentItem.getImageResource17());
            ((Ribbon32Holder)holder).mImageView18.setImageResource(currentItem.getImageResource18());
            ((Ribbon32Holder)holder).mImageView19.setImageResource(currentItem.getImageResource19());
            ((Ribbon32Holder)holder).mImageView20.setImageResource(currentItem.getImageResource20());
            ((Ribbon32Holder)holder).mImageView21.setImageResource(currentItem.getImageResource21());
            ((Ribbon32Holder)holder).mImageView22.setImageResource(currentItem.getImageResource22());
            ((Ribbon32Holder)holder).mImageView23.setImageResource(currentItem.getImageResource23());
            ((Ribbon32Holder)holder).mImageView24.setImageResource(currentItem.getImageResource24());
            ((Ribbon32Holder)holder).mImageView25.setImageResource(currentItem.getImageResource25());
            ((Ribbon32Holder)holder).mImageView26.setImageResource(currentItem.getImageResource26());
            ((Ribbon32Holder)holder).mImageView27.setImageResource(currentItem.getImageResource27());
            ((Ribbon32Holder)holder).mImageView28.setImageResource(currentItem.getImageResource28());
            ((Ribbon32Holder)holder).mImageView29.setImageResource(currentItem.getImageResource29());
            ((Ribbon32Holder)holder).mImageView30.setImageResource(currentItem.getImageResource30());
            ((Ribbon32Holder)holder).mImageView31.setImageResource(currentItem.getImageResource31());
            ((Ribbon32Holder)holder).mImageView32.setImageResource(currentItem.getImageResource32());
        }


        else if (holder instanceof Ribbon33Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon33Holder)holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon33Holder)holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon33Holder)holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon33Holder)holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon33Holder)holder).mImageView5.setImageResource(currentItem.getImageResource5());
            ((Ribbon33Holder)holder).mImageView6.setImageResource(currentItem.getImageResource6());
            ((Ribbon33Holder)holder).mImageView7.setImageResource(currentItem.getImageResource7());
            ((Ribbon33Holder)holder).mImageView8.setImageResource(currentItem.getImageResource8());
            ((Ribbon33Holder)holder).mImageView9.setImageResource(currentItem.getImageResource9());
            ((Ribbon33Holder)holder).mImageView10.setImageResource(currentItem.getImageResource10());
            ((Ribbon33Holder)holder).mImageView11.setImageResource(currentItem.getImageResource11());
            ((Ribbon33Holder)holder).mImageView12.setImageResource(currentItem.getImageResource12());
            ((Ribbon33Holder)holder).mImageView13.setImageResource(currentItem.getImageResource13());
            ((Ribbon33Holder)holder).mImageView14.setImageResource(currentItem.getImageResource14());
            ((Ribbon33Holder)holder).mImageView15.setImageResource(currentItem.getImageResource15());
            ((Ribbon33Holder)holder).mImageView16.setImageResource(currentItem.getImageResource16());
            ((Ribbon33Holder)holder).mImageView17.setImageResource(currentItem.getImageResource17());
            ((Ribbon33Holder)holder).mImageView18.setImageResource(currentItem.getImageResource18());
            ((Ribbon33Holder)holder).mImageView19.setImageResource(currentItem.getImageResource19());
            ((Ribbon33Holder)holder).mImageView20.setImageResource(currentItem.getImageResource20());
            ((Ribbon33Holder)holder).mImageView21.setImageResource(currentItem.getImageResource21());
            ((Ribbon33Holder)holder).mImageView22.setImageResource(currentItem.getImageResource22());
            ((Ribbon33Holder)holder).mImageView23.setImageResource(currentItem.getImageResource23());
            ((Ribbon33Holder)holder).mImageView24.setImageResource(currentItem.getImageResource24());
            ((Ribbon33Holder)holder).mImageView25.setImageResource(currentItem.getImageResource25());
            ((Ribbon33Holder)holder).mImageView26.setImageResource(currentItem.getImageResource26());
            ((Ribbon33Holder)holder).mImageView27.setImageResource(currentItem.getImageResource27());
            ((Ribbon33Holder)holder).mImageView28.setImageResource(currentItem.getImageResource28());
            ((Ribbon33Holder)holder).mImageView29.setImageResource(currentItem.getImageResource29());
            ((Ribbon33Holder)holder).mImageView30.setImageResource(currentItem.getImageResource30());
            ((Ribbon33Holder)holder).mImageView31.setImageResource(currentItem.getImageResource31());
            ((Ribbon33Holder)holder).mImageView32.setImageResource(currentItem.getImageResource32());
            ((Ribbon33Holder)holder).mImageView33.setImageResource(currentItem.getImageResource33());
        }

        else if (holder instanceof Ribbon34Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon34Holder)holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon34Holder)holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon34Holder)holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon34Holder)holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon34Holder)holder).mImageView5.setImageResource(currentItem.getImageResource5());
            ((Ribbon34Holder)holder).mImageView6.setImageResource(currentItem.getImageResource6());
            ((Ribbon34Holder)holder).mImageView7.setImageResource(currentItem.getImageResource7());
            ((Ribbon34Holder)holder).mImageView8.setImageResource(currentItem.getImageResource8());
            ((Ribbon34Holder)holder).mImageView9.setImageResource(currentItem.getImageResource9());
            ((Ribbon34Holder)holder).mImageView10.setImageResource(currentItem.getImageResource10());
            ((Ribbon34Holder)holder).mImageView11.setImageResource(currentItem.getImageResource11());
            ((Ribbon34Holder)holder).mImageView12.setImageResource(currentItem.getImageResource12());
            ((Ribbon34Holder)holder).mImageView13.setImageResource(currentItem.getImageResource13());
            ((Ribbon34Holder)holder).mImageView14.setImageResource(currentItem.getImageResource14());
            ((Ribbon34Holder)holder).mImageView15.setImageResource(currentItem.getImageResource15());
            ((Ribbon34Holder)holder).mImageView16.setImageResource(currentItem.getImageResource16());
            ((Ribbon34Holder)holder).mImageView17.setImageResource(currentItem.getImageResource17());
            ((Ribbon34Holder)holder).mImageView18.setImageResource(currentItem.getImageResource18());
            ((Ribbon34Holder)holder).mImageView19.setImageResource(currentItem.getImageResource19());
            ((Ribbon34Holder)holder).mImageView20.setImageResource(currentItem.getImageResource20());
            ((Ribbon34Holder)holder).mImageView21.setImageResource(currentItem.getImageResource21());
            ((Ribbon34Holder)holder).mImageView22.setImageResource(currentItem.getImageResource22());
            ((Ribbon34Holder)holder).mImageView23.setImageResource(currentItem.getImageResource23());
            ((Ribbon34Holder)holder).mImageView24.setImageResource(currentItem.getImageResource24());
            ((Ribbon34Holder)holder).mImageView25.setImageResource(currentItem.getImageResource25());
            ((Ribbon34Holder)holder).mImageView26.setImageResource(currentItem.getImageResource26());
            ((Ribbon34Holder)holder).mImageView27.setImageResource(currentItem.getImageResource27());
            ((Ribbon34Holder)holder).mImageView28.setImageResource(currentItem.getImageResource28());
            ((Ribbon34Holder)holder).mImageView29.setImageResource(currentItem.getImageResource29());
            ((Ribbon34Holder)holder).mImageView30.setImageResource(currentItem.getImageResource30());
            ((Ribbon34Holder)holder).mImageView31.setImageResource(currentItem.getImageResource31());
            ((Ribbon34Holder)holder).mImageView32.setImageResource(currentItem.getImageResource32());
            ((Ribbon34Holder)holder).mImageView33.setImageResource(currentItem.getImageResource33());
            ((Ribbon34Holder)holder).mImageView34.setImageResource(currentItem.getImageResource34());
        }


        else if (holder instanceof Ribbon35Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon35Holder)holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon35Holder)holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon35Holder)holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon35Holder)holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon35Holder)holder).mImageView5.setImageResource(currentItem.getImageResource5());
            ((Ribbon35Holder)holder).mImageView6.setImageResource(currentItem.getImageResource6());
            ((Ribbon35Holder)holder).mImageView7.setImageResource(currentItem.getImageResource7());
            ((Ribbon35Holder)holder).mImageView8.setImageResource(currentItem.getImageResource8());
            ((Ribbon35Holder)holder).mImageView9.setImageResource(currentItem.getImageResource9());
            ((Ribbon35Holder)holder).mImageView10.setImageResource(currentItem.getImageResource10());
            ((Ribbon35Holder)holder).mImageView11.setImageResource(currentItem.getImageResource11());
            ((Ribbon35Holder)holder).mImageView12.setImageResource(currentItem.getImageResource12());
            ((Ribbon35Holder)holder).mImageView13.setImageResource(currentItem.getImageResource13());
            ((Ribbon35Holder)holder).mImageView14.setImageResource(currentItem.getImageResource14());
            ((Ribbon35Holder)holder).mImageView15.setImageResource(currentItem.getImageResource15());
            ((Ribbon35Holder)holder).mImageView16.setImageResource(currentItem.getImageResource16());
            ((Ribbon35Holder)holder).mImageView17.setImageResource(currentItem.getImageResource17());
            ((Ribbon35Holder)holder).mImageView18.setImageResource(currentItem.getImageResource18());
            ((Ribbon35Holder)holder).mImageView19.setImageResource(currentItem.getImageResource19());
            ((Ribbon35Holder)holder).mImageView20.setImageResource(currentItem.getImageResource20());
            ((Ribbon35Holder)holder).mImageView21.setImageResource(currentItem.getImageResource21());
            ((Ribbon35Holder)holder).mImageView22.setImageResource(currentItem.getImageResource22());
            ((Ribbon35Holder)holder).mImageView23.setImageResource(currentItem.getImageResource23());
            ((Ribbon35Holder)holder).mImageView24.setImageResource(currentItem.getImageResource24());
            ((Ribbon35Holder)holder).mImageView25.setImageResource(currentItem.getImageResource25());
            ((Ribbon35Holder)holder).mImageView26.setImageResource(currentItem.getImageResource26());
            ((Ribbon35Holder)holder).mImageView27.setImageResource(currentItem.getImageResource27());
            ((Ribbon35Holder)holder).mImageView28.setImageResource(currentItem.getImageResource28());
            ((Ribbon35Holder)holder).mImageView29.setImageResource(currentItem.getImageResource29());
            ((Ribbon35Holder)holder).mImageView30.setImageResource(currentItem.getImageResource30());
            ((Ribbon35Holder)holder).mImageView31.setImageResource(currentItem.getImageResource31());
            ((Ribbon35Holder)holder).mImageView32.setImageResource(currentItem.getImageResource32());
            ((Ribbon35Holder)holder).mImageView33.setImageResource(currentItem.getImageResource33());
            ((Ribbon35Holder)holder).mImageView34.setImageResource(currentItem.getImageResource34());
            ((Ribbon35Holder)holder).mImageView35.setImageResource(currentItem.getImageResource35());
        }


        else if (holder instanceof Ribbon36Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon36Holder)holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon36Holder)holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon36Holder)holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon36Holder)holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon36Holder)holder).mImageView5.setImageResource(currentItem.getImageResource5());
            ((Ribbon36Holder)holder).mImageView6.setImageResource(currentItem.getImageResource6());
            ((Ribbon36Holder)holder).mImageView7.setImageResource(currentItem.getImageResource7());
            ((Ribbon36Holder)holder).mImageView8.setImageResource(currentItem.getImageResource8());
            ((Ribbon36Holder)holder).mImageView9.setImageResource(currentItem.getImageResource9());
            ((Ribbon36Holder)holder).mImageView10.setImageResource(currentItem.getImageResource10());
            ((Ribbon36Holder)holder).mImageView11.setImageResource(currentItem.getImageResource11());
            ((Ribbon36Holder)holder).mImageView12.setImageResource(currentItem.getImageResource12());
            ((Ribbon36Holder)holder).mImageView13.setImageResource(currentItem.getImageResource13());
            ((Ribbon36Holder)holder).mImageView14.setImageResource(currentItem.getImageResource14());
            ((Ribbon36Holder)holder).mImageView15.setImageResource(currentItem.getImageResource15());
            ((Ribbon36Holder)holder).mImageView16.setImageResource(currentItem.getImageResource16());
            ((Ribbon36Holder)holder).mImageView17.setImageResource(currentItem.getImageResource17());
            ((Ribbon36Holder)holder).mImageView18.setImageResource(currentItem.getImageResource18());
            ((Ribbon36Holder)holder).mImageView19.setImageResource(currentItem.getImageResource19());
            ((Ribbon36Holder)holder).mImageView20.setImageResource(currentItem.getImageResource20());
            ((Ribbon36Holder)holder).mImageView21.setImageResource(currentItem.getImageResource21());
            ((Ribbon36Holder)holder).mImageView22.setImageResource(currentItem.getImageResource22());
            ((Ribbon36Holder)holder).mImageView23.setImageResource(currentItem.getImageResource23());
            ((Ribbon36Holder)holder).mImageView24.setImageResource(currentItem.getImageResource24());
            ((Ribbon36Holder)holder).mImageView25.setImageResource(currentItem.getImageResource25());
            ((Ribbon36Holder)holder).mImageView26.setImageResource(currentItem.getImageResource26());
            ((Ribbon36Holder)holder).mImageView27.setImageResource(currentItem.getImageResource27());
            ((Ribbon36Holder)holder).mImageView28.setImageResource(currentItem.getImageResource28());
            ((Ribbon36Holder)holder).mImageView29.setImageResource(currentItem.getImageResource29());
            ((Ribbon36Holder)holder).mImageView30.setImageResource(currentItem.getImageResource30());
            ((Ribbon36Holder)holder).mImageView31.setImageResource(currentItem.getImageResource31());
            ((Ribbon36Holder)holder).mImageView32.setImageResource(currentItem.getImageResource32());
            ((Ribbon36Holder)holder).mImageView33.setImageResource(currentItem.getImageResource33());
            ((Ribbon36Holder)holder).mImageView34.setImageResource(currentItem.getImageResource34());
            ((Ribbon36Holder)holder).mImageView35.setImageResource(currentItem.getImageResource35());
            ((Ribbon36Holder)holder).mImageView36.setImageResource(currentItem.getImageResource36());
        }


        else if (holder instanceof Ribbon37Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon37Holder)holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon37Holder)holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon37Holder)holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon37Holder)holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon37Holder)holder).mImageView5.setImageResource(currentItem.getImageResource5());
            ((Ribbon37Holder)holder).mImageView6.setImageResource(currentItem.getImageResource6());
            ((Ribbon37Holder)holder).mImageView7.setImageResource(currentItem.getImageResource7());
            ((Ribbon37Holder)holder).mImageView8.setImageResource(currentItem.getImageResource8());
            ((Ribbon37Holder)holder).mImageView9.setImageResource(currentItem.getImageResource9());
            ((Ribbon37Holder)holder).mImageView10.setImageResource(currentItem.getImageResource10());
            ((Ribbon37Holder)holder).mImageView11.setImageResource(currentItem.getImageResource11());
            ((Ribbon37Holder)holder).mImageView12.setImageResource(currentItem.getImageResource12());
            ((Ribbon37Holder)holder).mImageView13.setImageResource(currentItem.getImageResource13());
            ((Ribbon37Holder)holder).mImageView14.setImageResource(currentItem.getImageResource14());
            ((Ribbon37Holder)holder).mImageView15.setImageResource(currentItem.getImageResource15());
            ((Ribbon37Holder)holder).mImageView16.setImageResource(currentItem.getImageResource16());
            ((Ribbon37Holder)holder).mImageView17.setImageResource(currentItem.getImageResource17());
            ((Ribbon37Holder)holder).mImageView18.setImageResource(currentItem.getImageResource18());
            ((Ribbon37Holder)holder).mImageView19.setImageResource(currentItem.getImageResource19());
            ((Ribbon37Holder)holder).mImageView20.setImageResource(currentItem.getImageResource20());
            ((Ribbon37Holder)holder).mImageView21.setImageResource(currentItem.getImageResource21());
            ((Ribbon37Holder)holder).mImageView22.setImageResource(currentItem.getImageResource22());
            ((Ribbon37Holder)holder).mImageView23.setImageResource(currentItem.getImageResource23());
            ((Ribbon37Holder)holder).mImageView24.setImageResource(currentItem.getImageResource24());
            ((Ribbon37Holder)holder).mImageView25.setImageResource(currentItem.getImageResource25());
            ((Ribbon37Holder)holder).mImageView26.setImageResource(currentItem.getImageResource26());
            ((Ribbon37Holder)holder).mImageView27.setImageResource(currentItem.getImageResource27());
            ((Ribbon37Holder)holder).mImageView28.setImageResource(currentItem.getImageResource28());
            ((Ribbon37Holder)holder).mImageView29.setImageResource(currentItem.getImageResource29());
            ((Ribbon37Holder)holder).mImageView30.setImageResource(currentItem.getImageResource30());
            ((Ribbon37Holder)holder).mImageView31.setImageResource(currentItem.getImageResource31());
            ((Ribbon37Holder)holder).mImageView32.setImageResource(currentItem.getImageResource32());
            ((Ribbon37Holder)holder).mImageView33.setImageResource(currentItem.getImageResource33());
            ((Ribbon37Holder)holder).mImageView34.setImageResource(currentItem.getImageResource34());
            ((Ribbon37Holder)holder).mImageView35.setImageResource(currentItem.getImageResource35());
            ((Ribbon37Holder)holder).mImageView36.setImageResource(currentItem.getImageResource36());
            ((Ribbon37Holder)holder).mImageView37.setImageResource(currentItem.getImageResource37());
        }


        else if (holder instanceof Ribbon38Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon38Holder)holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon38Holder)holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon38Holder)holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon38Holder)holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon38Holder)holder).mImageView5.setImageResource(currentItem.getImageResource5());
            ((Ribbon38Holder)holder).mImageView6.setImageResource(currentItem.getImageResource6());
            ((Ribbon38Holder)holder).mImageView7.setImageResource(currentItem.getImageResource7());
            ((Ribbon38Holder)holder).mImageView8.setImageResource(currentItem.getImageResource8());
            ((Ribbon38Holder)holder).mImageView9.setImageResource(currentItem.getImageResource9());
            ((Ribbon38Holder)holder).mImageView10.setImageResource(currentItem.getImageResource10());
            ((Ribbon38Holder)holder).mImageView11.setImageResource(currentItem.getImageResource11());
            ((Ribbon38Holder)holder).mImageView12.setImageResource(currentItem.getImageResource12());
            ((Ribbon38Holder)holder).mImageView13.setImageResource(currentItem.getImageResource13());
            ((Ribbon38Holder)holder).mImageView14.setImageResource(currentItem.getImageResource14());
            ((Ribbon38Holder)holder).mImageView15.setImageResource(currentItem.getImageResource15());
            ((Ribbon38Holder)holder).mImageView16.setImageResource(currentItem.getImageResource16());
            ((Ribbon38Holder)holder).mImageView17.setImageResource(currentItem.getImageResource17());
            ((Ribbon38Holder)holder).mImageView18.setImageResource(currentItem.getImageResource18());
            ((Ribbon38Holder)holder).mImageView19.setImageResource(currentItem.getImageResource19());
            ((Ribbon38Holder)holder).mImageView20.setImageResource(currentItem.getImageResource20());
            ((Ribbon38Holder)holder).mImageView21.setImageResource(currentItem.getImageResource21());
            ((Ribbon38Holder)holder).mImageView22.setImageResource(currentItem.getImageResource22());
            ((Ribbon38Holder)holder).mImageView23.setImageResource(currentItem.getImageResource23());
            ((Ribbon38Holder)holder).mImageView24.setImageResource(currentItem.getImageResource24());
            ((Ribbon38Holder)holder).mImageView25.setImageResource(currentItem.getImageResource25());
            ((Ribbon38Holder)holder).mImageView26.setImageResource(currentItem.getImageResource26());
            ((Ribbon38Holder)holder).mImageView27.setImageResource(currentItem.getImageResource27());
            ((Ribbon38Holder)holder).mImageView28.setImageResource(currentItem.getImageResource28());
            ((Ribbon38Holder)holder).mImageView29.setImageResource(currentItem.getImageResource29());
            ((Ribbon38Holder)holder).mImageView30.setImageResource(currentItem.getImageResource30());
            ((Ribbon38Holder)holder).mImageView31.setImageResource(currentItem.getImageResource31());
            ((Ribbon38Holder)holder).mImageView32.setImageResource(currentItem.getImageResource32());
            ((Ribbon38Holder)holder).mImageView33.setImageResource(currentItem.getImageResource33());
            ((Ribbon38Holder)holder).mImageView34.setImageResource(currentItem.getImageResource34());
            ((Ribbon38Holder)holder).mImageView35.setImageResource(currentItem.getImageResource35());
            ((Ribbon38Holder)holder).mImageView36.setImageResource(currentItem.getImageResource36());
            ((Ribbon38Holder)holder).mImageView37.setImageResource(currentItem.getImageResource37());
            ((Ribbon38Holder)holder).mImageView38.setImageResource(currentItem.getImageResource38());
        }


        else if (holder instanceof Ribbon39Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon39Holder)holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon39Holder)holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon39Holder)holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon39Holder)holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon39Holder)holder).mImageView5.setImageResource(currentItem.getImageResource5());
            ((Ribbon39Holder)holder).mImageView6.setImageResource(currentItem.getImageResource6());
            ((Ribbon39Holder)holder).mImageView7.setImageResource(currentItem.getImageResource7());
            ((Ribbon39Holder)holder).mImageView8.setImageResource(currentItem.getImageResource8());
            ((Ribbon39Holder)holder).mImageView9.setImageResource(currentItem.getImageResource9());
            ((Ribbon39Holder)holder).mImageView10.setImageResource(currentItem.getImageResource10());
            ((Ribbon39Holder)holder).mImageView11.setImageResource(currentItem.getImageResource11());
            ((Ribbon39Holder)holder).mImageView12.setImageResource(currentItem.getImageResource12());
            ((Ribbon39Holder)holder).mImageView13.setImageResource(currentItem.getImageResource13());
            ((Ribbon39Holder)holder).mImageView14.setImageResource(currentItem.getImageResource14());
            ((Ribbon39Holder)holder).mImageView15.setImageResource(currentItem.getImageResource15());
            ((Ribbon39Holder)holder).mImageView16.setImageResource(currentItem.getImageResource16());
            ((Ribbon39Holder)holder).mImageView17.setImageResource(currentItem.getImageResource17());
            ((Ribbon39Holder)holder).mImageView18.setImageResource(currentItem.getImageResource18());
            ((Ribbon39Holder)holder).mImageView19.setImageResource(currentItem.getImageResource19());
            ((Ribbon39Holder)holder).mImageView20.setImageResource(currentItem.getImageResource20());
            ((Ribbon39Holder)holder).mImageView21.setImageResource(currentItem.getImageResource21());
            ((Ribbon39Holder)holder).mImageView22.setImageResource(currentItem.getImageResource22());
            ((Ribbon39Holder)holder).mImageView23.setImageResource(currentItem.getImageResource23());
            ((Ribbon39Holder)holder).mImageView24.setImageResource(currentItem.getImageResource24());
            ((Ribbon39Holder)holder).mImageView25.setImageResource(currentItem.getImageResource25());
            ((Ribbon39Holder)holder).mImageView26.setImageResource(currentItem.getImageResource26());
            ((Ribbon39Holder)holder).mImageView27.setImageResource(currentItem.getImageResource27());
            ((Ribbon39Holder)holder).mImageView28.setImageResource(currentItem.getImageResource28());
            ((Ribbon39Holder)holder).mImageView29.setImageResource(currentItem.getImageResource29());
            ((Ribbon39Holder)holder).mImageView30.setImageResource(currentItem.getImageResource30());
            ((Ribbon39Holder)holder).mImageView31.setImageResource(currentItem.getImageResource31());
            ((Ribbon39Holder)holder).mImageView32.setImageResource(currentItem.getImageResource32());
            ((Ribbon39Holder)holder).mImageView33.setImageResource(currentItem.getImageResource33());
            ((Ribbon39Holder)holder).mImageView34.setImageResource(currentItem.getImageResource34());
            ((Ribbon39Holder)holder).mImageView35.setImageResource(currentItem.getImageResource35());
            ((Ribbon39Holder)holder).mImageView36.setImageResource(currentItem.getImageResource36());
            ((Ribbon39Holder)holder).mImageView37.setImageResource(currentItem.getImageResource37());
            ((Ribbon39Holder)holder).mImageView38.setImageResource(currentItem.getImageResource38());
            ((Ribbon39Holder)holder).mImageView39.setImageResource(currentItem.getImageResource39());
        }
        else if (holder instanceof Ribbon40Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon40Holder)holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon40Holder)holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon40Holder)holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon40Holder)holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon40Holder)holder).mImageView5.setImageResource(currentItem.getImageResource5());
            ((Ribbon40Holder)holder).mImageView6.setImageResource(currentItem.getImageResource6());
            ((Ribbon40Holder)holder).mImageView7.setImageResource(currentItem.getImageResource7());
            ((Ribbon40Holder)holder).mImageView8.setImageResource(currentItem.getImageResource8());
            ((Ribbon40Holder)holder).mImageView9.setImageResource(currentItem.getImageResource9());
            ((Ribbon40Holder)holder).mImageView10.setImageResource(currentItem.getImageResource10());
            ((Ribbon40Holder)holder).mImageView11.setImageResource(currentItem.getImageResource11());
            ((Ribbon40Holder)holder).mImageView12.setImageResource(currentItem.getImageResource12());
            ((Ribbon40Holder)holder).mImageView13.setImageResource(currentItem.getImageResource13());
            ((Ribbon40Holder)holder).mImageView14.setImageResource(currentItem.getImageResource14());
            ((Ribbon40Holder)holder).mImageView15.setImageResource(currentItem.getImageResource15());
            ((Ribbon40Holder)holder).mImageView16.setImageResource(currentItem.getImageResource16());
            ((Ribbon40Holder)holder).mImageView17.setImageResource(currentItem.getImageResource17());
            ((Ribbon40Holder)holder).mImageView18.setImageResource(currentItem.getImageResource18());
            ((Ribbon40Holder)holder).mImageView19.setImageResource(currentItem.getImageResource19());
            ((Ribbon40Holder)holder).mImageView20.setImageResource(currentItem.getImageResource20());
            ((Ribbon40Holder)holder).mImageView21.setImageResource(currentItem.getImageResource21());
            ((Ribbon40Holder)holder).mImageView22.setImageResource(currentItem.getImageResource22());
            ((Ribbon40Holder)holder).mImageView23.setImageResource(currentItem.getImageResource23());
            ((Ribbon40Holder)holder).mImageView24.setImageResource(currentItem.getImageResource24());
            ((Ribbon40Holder)holder).mImageView25.setImageResource(currentItem.getImageResource25());
            ((Ribbon40Holder)holder).mImageView26.setImageResource(currentItem.getImageResource26());
            ((Ribbon40Holder)holder).mImageView27.setImageResource(currentItem.getImageResource27());
            ((Ribbon40Holder)holder).mImageView28.setImageResource(currentItem.getImageResource28());
            ((Ribbon40Holder)holder).mImageView29.setImageResource(currentItem.getImageResource29());
            ((Ribbon40Holder)holder).mImageView30.setImageResource(currentItem.getImageResource30());
            ((Ribbon40Holder)holder).mImageView31.setImageResource(currentItem.getImageResource31());
            ((Ribbon40Holder)holder).mImageView32.setImageResource(currentItem.getImageResource32());
            ((Ribbon40Holder)holder).mImageView33.setImageResource(currentItem.getImageResource33());
            ((Ribbon40Holder)holder).mImageView34.setImageResource(currentItem.getImageResource34());
            ((Ribbon40Holder)holder).mImageView35.setImageResource(currentItem.getImageResource35());
            ((Ribbon40Holder)holder).mImageView36.setImageResource(currentItem.getImageResource36());
            ((Ribbon40Holder)holder).mImageView37.setImageResource(currentItem.getImageResource37());
            ((Ribbon40Holder)holder).mImageView38.setImageResource(currentItem.getImageResource38());
            ((Ribbon40Holder)holder).mImageView39.setImageResource(currentItem.getImageResource39());
            ((Ribbon40Holder)holder).mImageView40.setImageResource(currentItem.getImageResource40());
        }


        else if (holder instanceof Ribbon41Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon41Holder)holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon41Holder)holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon41Holder)holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon41Holder)holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon41Holder)holder).mImageView5.setImageResource(currentItem.getImageResource5());
            ((Ribbon41Holder)holder).mImageView6.setImageResource(currentItem.getImageResource6());
            ((Ribbon41Holder)holder).mImageView7.setImageResource(currentItem.getImageResource7());
            ((Ribbon41Holder)holder).mImageView8.setImageResource(currentItem.getImageResource8());
            ((Ribbon41Holder)holder).mImageView9.setImageResource(currentItem.getImageResource9());
            ((Ribbon41Holder)holder).mImageView10.setImageResource(currentItem.getImageResource10());
            ((Ribbon41Holder)holder).mImageView11.setImageResource(currentItem.getImageResource11());
            ((Ribbon41Holder)holder).mImageView12.setImageResource(currentItem.getImageResource12());
            ((Ribbon41Holder)holder).mImageView13.setImageResource(currentItem.getImageResource13());
            ((Ribbon41Holder)holder).mImageView14.setImageResource(currentItem.getImageResource14());
            ((Ribbon41Holder)holder).mImageView15.setImageResource(currentItem.getImageResource15());
            ((Ribbon41Holder)holder).mImageView16.setImageResource(currentItem.getImageResource16());
            ((Ribbon41Holder)holder).mImageView17.setImageResource(currentItem.getImageResource17());
            ((Ribbon41Holder)holder).mImageView18.setImageResource(currentItem.getImageResource18());
            ((Ribbon41Holder)holder).mImageView19.setImageResource(currentItem.getImageResource19());
            ((Ribbon41Holder)holder).mImageView20.setImageResource(currentItem.getImageResource20());
            ((Ribbon41Holder)holder).mImageView21.setImageResource(currentItem.getImageResource21());
            ((Ribbon41Holder)holder).mImageView22.setImageResource(currentItem.getImageResource22());
            ((Ribbon41Holder)holder).mImageView23.setImageResource(currentItem.getImageResource23());
            ((Ribbon41Holder)holder).mImageView24.setImageResource(currentItem.getImageResource24());
            ((Ribbon41Holder)holder).mImageView25.setImageResource(currentItem.getImageResource25());
            ((Ribbon41Holder)holder).mImageView26.setImageResource(currentItem.getImageResource26());
            ((Ribbon41Holder)holder).mImageView27.setImageResource(currentItem.getImageResource27());
            ((Ribbon41Holder)holder).mImageView28.setImageResource(currentItem.getImageResource28());
            ((Ribbon41Holder)holder).mImageView29.setImageResource(currentItem.getImageResource29());
            ((Ribbon41Holder)holder).mImageView30.setImageResource(currentItem.getImageResource30());
            ((Ribbon41Holder)holder).mImageView31.setImageResource(currentItem.getImageResource31());
            ((Ribbon41Holder)holder).mImageView32.setImageResource(currentItem.getImageResource32());
            ((Ribbon41Holder)holder).mImageView33.setImageResource(currentItem.getImageResource33());
            ((Ribbon41Holder)holder).mImageView34.setImageResource(currentItem.getImageResource34());
            ((Ribbon41Holder)holder).mImageView35.setImageResource(currentItem.getImageResource35());
            ((Ribbon41Holder)holder).mImageView36.setImageResource(currentItem.getImageResource36());
            ((Ribbon41Holder)holder).mImageView37.setImageResource(currentItem.getImageResource37());
            ((Ribbon41Holder)holder).mImageView38.setImageResource(currentItem.getImageResource38());
            ((Ribbon41Holder)holder).mImageView39.setImageResource(currentItem.getImageResource39());
            ((Ribbon41Holder)holder).mImageView40.setImageResource(currentItem.getImageResource40());
            ((Ribbon41Holder)holder).mImageView41.setImageResource(currentItem.getImageResource41());
        }


        else if (holder instanceof Ribbon42Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon42Holder)holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon42Holder)holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon42Holder)holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon42Holder)holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon42Holder)holder).mImageView5.setImageResource(currentItem.getImageResource5());
            ((Ribbon42Holder)holder).mImageView6.setImageResource(currentItem.getImageResource6());
            ((Ribbon42Holder)holder).mImageView7.setImageResource(currentItem.getImageResource7());
            ((Ribbon42Holder)holder).mImageView8.setImageResource(currentItem.getImageResource8());
            ((Ribbon42Holder)holder).mImageView9.setImageResource(currentItem.getImageResource9());
            ((Ribbon42Holder)holder).mImageView10.setImageResource(currentItem.getImageResource10());
            ((Ribbon42Holder)holder).mImageView11.setImageResource(currentItem.getImageResource11());
            ((Ribbon42Holder)holder).mImageView12.setImageResource(currentItem.getImageResource12());
            ((Ribbon42Holder)holder).mImageView13.setImageResource(currentItem.getImageResource13());
            ((Ribbon42Holder)holder).mImageView14.setImageResource(currentItem.getImageResource14());
            ((Ribbon42Holder)holder).mImageView15.setImageResource(currentItem.getImageResource15());
            ((Ribbon42Holder)holder).mImageView16.setImageResource(currentItem.getImageResource16());
            ((Ribbon42Holder)holder).mImageView17.setImageResource(currentItem.getImageResource17());
            ((Ribbon42Holder)holder).mImageView18.setImageResource(currentItem.getImageResource18());
            ((Ribbon42Holder)holder).mImageView19.setImageResource(currentItem.getImageResource19());
            ((Ribbon42Holder)holder).mImageView20.setImageResource(currentItem.getImageResource20());
            ((Ribbon42Holder)holder).mImageView21.setImageResource(currentItem.getImageResource21());
            ((Ribbon42Holder)holder).mImageView22.setImageResource(currentItem.getImageResource22());
            ((Ribbon42Holder)holder).mImageView23.setImageResource(currentItem.getImageResource23());
            ((Ribbon42Holder)holder).mImageView24.setImageResource(currentItem.getImageResource24());
            ((Ribbon42Holder)holder).mImageView25.setImageResource(currentItem.getImageResource25());
            ((Ribbon42Holder)holder).mImageView26.setImageResource(currentItem.getImageResource26());
            ((Ribbon42Holder)holder).mImageView27.setImageResource(currentItem.getImageResource27());
            ((Ribbon42Holder)holder).mImageView28.setImageResource(currentItem.getImageResource28());
            ((Ribbon42Holder)holder).mImageView29.setImageResource(currentItem.getImageResource29());
            ((Ribbon42Holder)holder).mImageView30.setImageResource(currentItem.getImageResource30());
            ((Ribbon42Holder)holder).mImageView31.setImageResource(currentItem.getImageResource31());
            ((Ribbon42Holder)holder).mImageView32.setImageResource(currentItem.getImageResource32());
            ((Ribbon42Holder)holder).mImageView33.setImageResource(currentItem.getImageResource33());
            ((Ribbon42Holder)holder).mImageView34.setImageResource(currentItem.getImageResource34());
            ((Ribbon42Holder)holder).mImageView35.setImageResource(currentItem.getImageResource35());
            ((Ribbon42Holder)holder).mImageView36.setImageResource(currentItem.getImageResource36());
            ((Ribbon42Holder)holder).mImageView37.setImageResource(currentItem.getImageResource37());
            ((Ribbon42Holder)holder).mImageView38.setImageResource(currentItem.getImageResource38());
            ((Ribbon42Holder)holder).mImageView39.setImageResource(currentItem.getImageResource39());
            ((Ribbon42Holder)holder).mImageView40.setImageResource(currentItem.getImageResource40());
            ((Ribbon42Holder)holder).mImageView41.setImageResource(currentItem.getImageResource41());
            ((Ribbon42Holder)holder).mImageView42.setImageResource(currentItem.getImageResource42());
        }


        else if (holder instanceof Ribbon43Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon43Holder)holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon43Holder)holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon43Holder)holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon43Holder)holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon43Holder)holder).mImageView5.setImageResource(currentItem.getImageResource5());
            ((Ribbon43Holder)holder).mImageView6.setImageResource(currentItem.getImageResource6());
            ((Ribbon43Holder)holder).mImageView7.setImageResource(currentItem.getImageResource7());
            ((Ribbon43Holder)holder).mImageView8.setImageResource(currentItem.getImageResource8());
            ((Ribbon43Holder)holder).mImageView9.setImageResource(currentItem.getImageResource9());
            ((Ribbon43Holder)holder).mImageView10.setImageResource(currentItem.getImageResource10());
            ((Ribbon43Holder)holder).mImageView11.setImageResource(currentItem.getImageResource11());
            ((Ribbon43Holder)holder).mImageView12.setImageResource(currentItem.getImageResource12());
            ((Ribbon43Holder)holder).mImageView13.setImageResource(currentItem.getImageResource13());
            ((Ribbon43Holder)holder).mImageView14.setImageResource(currentItem.getImageResource14());
            ((Ribbon43Holder)holder).mImageView15.setImageResource(currentItem.getImageResource15());
            ((Ribbon43Holder)holder).mImageView16.setImageResource(currentItem.getImageResource16());
            ((Ribbon43Holder)holder).mImageView17.setImageResource(currentItem.getImageResource17());
            ((Ribbon43Holder)holder).mImageView18.setImageResource(currentItem.getImageResource18());
            ((Ribbon43Holder)holder).mImageView19.setImageResource(currentItem.getImageResource19());
            ((Ribbon43Holder)holder).mImageView20.setImageResource(currentItem.getImageResource20());
            ((Ribbon43Holder)holder).mImageView21.setImageResource(currentItem.getImageResource21());
            ((Ribbon43Holder)holder).mImageView22.setImageResource(currentItem.getImageResource22());
            ((Ribbon43Holder)holder).mImageView23.setImageResource(currentItem.getImageResource23());
            ((Ribbon43Holder)holder).mImageView24.setImageResource(currentItem.getImageResource24());
            ((Ribbon43Holder)holder).mImageView25.setImageResource(currentItem.getImageResource25());
            ((Ribbon43Holder)holder).mImageView26.setImageResource(currentItem.getImageResource26());
            ((Ribbon43Holder)holder).mImageView27.setImageResource(currentItem.getImageResource27());
            ((Ribbon43Holder)holder).mImageView28.setImageResource(currentItem.getImageResource28());
            ((Ribbon43Holder)holder).mImageView29.setImageResource(currentItem.getImageResource29());
            ((Ribbon43Holder)holder).mImageView30.setImageResource(currentItem.getImageResource30());
            ((Ribbon43Holder)holder).mImageView31.setImageResource(currentItem.getImageResource31());
            ((Ribbon43Holder)holder).mImageView32.setImageResource(currentItem.getImageResource32());
            ((Ribbon43Holder)holder).mImageView33.setImageResource(currentItem.getImageResource33());
            ((Ribbon43Holder)holder).mImageView34.setImageResource(currentItem.getImageResource34());
            ((Ribbon43Holder)holder).mImageView35.setImageResource(currentItem.getImageResource35());
            ((Ribbon43Holder)holder).mImageView36.setImageResource(currentItem.getImageResource36());
            ((Ribbon43Holder)holder).mImageView37.setImageResource(currentItem.getImageResource37());
            ((Ribbon43Holder)holder).mImageView38.setImageResource(currentItem.getImageResource38());
            ((Ribbon43Holder)holder).mImageView39.setImageResource(currentItem.getImageResource39());
            ((Ribbon43Holder)holder).mImageView40.setImageResource(currentItem.getImageResource40());
            ((Ribbon43Holder)holder).mImageView41.setImageResource(currentItem.getImageResource41());
            ((Ribbon43Holder)holder).mImageView42.setImageResource(currentItem.getImageResource42());
            ((Ribbon43Holder)holder).mImageView43.setImageResource(currentItem.getImageResource43());
        }


        else if (holder instanceof Ribbon44Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon44Holder)holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon44Holder)holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon44Holder)holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon44Holder)holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon44Holder)holder).mImageView5.setImageResource(currentItem.getImageResource5());
            ((Ribbon44Holder)holder).mImageView6.setImageResource(currentItem.getImageResource6());
            ((Ribbon44Holder)holder).mImageView7.setImageResource(currentItem.getImageResource7());
            ((Ribbon44Holder)holder).mImageView8.setImageResource(currentItem.getImageResource8());
            ((Ribbon44Holder)holder).mImageView9.setImageResource(currentItem.getImageResource9());
            ((Ribbon44Holder)holder).mImageView10.setImageResource(currentItem.getImageResource10());
            ((Ribbon44Holder)holder).mImageView11.setImageResource(currentItem.getImageResource11());
            ((Ribbon44Holder)holder).mImageView12.setImageResource(currentItem.getImageResource12());
            ((Ribbon44Holder)holder).mImageView13.setImageResource(currentItem.getImageResource13());
            ((Ribbon44Holder)holder).mImageView14.setImageResource(currentItem.getImageResource14());
            ((Ribbon44Holder)holder).mImageView15.setImageResource(currentItem.getImageResource15());
            ((Ribbon44Holder)holder).mImageView16.setImageResource(currentItem.getImageResource16());
            ((Ribbon44Holder)holder).mImageView17.setImageResource(currentItem.getImageResource17());
            ((Ribbon44Holder)holder).mImageView18.setImageResource(currentItem.getImageResource18());
            ((Ribbon44Holder)holder).mImageView19.setImageResource(currentItem.getImageResource19());
            ((Ribbon44Holder)holder).mImageView20.setImageResource(currentItem.getImageResource20());
            ((Ribbon44Holder)holder).mImageView21.setImageResource(currentItem.getImageResource21());
            ((Ribbon44Holder)holder).mImageView22.setImageResource(currentItem.getImageResource22());
            ((Ribbon44Holder)holder).mImageView23.setImageResource(currentItem.getImageResource23());
            ((Ribbon44Holder)holder).mImageView24.setImageResource(currentItem.getImageResource24());
            ((Ribbon44Holder)holder).mImageView25.setImageResource(currentItem.getImageResource25());
            ((Ribbon44Holder)holder).mImageView26.setImageResource(currentItem.getImageResource26());
            ((Ribbon44Holder)holder).mImageView27.setImageResource(currentItem.getImageResource27());
            ((Ribbon44Holder)holder).mImageView28.setImageResource(currentItem.getImageResource28());
            ((Ribbon44Holder)holder).mImageView29.setImageResource(currentItem.getImageResource29());
            ((Ribbon44Holder)holder).mImageView30.setImageResource(currentItem.getImageResource30());
            ((Ribbon44Holder)holder).mImageView31.setImageResource(currentItem.getImageResource31());
            ((Ribbon44Holder)holder).mImageView32.setImageResource(currentItem.getImageResource32());
            ((Ribbon44Holder)holder).mImageView33.setImageResource(currentItem.getImageResource33());
            ((Ribbon44Holder)holder).mImageView34.setImageResource(currentItem.getImageResource34());
            ((Ribbon44Holder)holder).mImageView35.setImageResource(currentItem.getImageResource35());
            ((Ribbon44Holder)holder).mImageView36.setImageResource(currentItem.getImageResource36());
            ((Ribbon44Holder)holder).mImageView37.setImageResource(currentItem.getImageResource37());
            ((Ribbon44Holder)holder).mImageView38.setImageResource(currentItem.getImageResource38());
            ((Ribbon44Holder)holder).mImageView39.setImageResource(currentItem.getImageResource39());
            ((Ribbon44Holder)holder).mImageView40.setImageResource(currentItem.getImageResource40());
            ((Ribbon44Holder)holder).mImageView41.setImageResource(currentItem.getImageResource41());
            ((Ribbon44Holder)holder).mImageView42.setImageResource(currentItem.getImageResource42());
            ((Ribbon44Holder)holder).mImageView43.setImageResource(currentItem.getImageResource43());
            ((Ribbon44Holder)holder).mImageView44.setImageResource(currentItem.getImageResource44());
        }


        else if (holder instanceof Ribbon45Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon45Holder)holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon45Holder)holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon45Holder)holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon45Holder)holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon45Holder)holder).mImageView5.setImageResource(currentItem.getImageResource5());
            ((Ribbon45Holder)holder).mImageView6.setImageResource(currentItem.getImageResource6());
            ((Ribbon45Holder)holder).mImageView7.setImageResource(currentItem.getImageResource7());
            ((Ribbon45Holder)holder).mImageView8.setImageResource(currentItem.getImageResource8());
            ((Ribbon45Holder)holder).mImageView9.setImageResource(currentItem.getImageResource9());
            ((Ribbon45Holder)holder).mImageView10.setImageResource(currentItem.getImageResource10());
            ((Ribbon45Holder)holder).mImageView11.setImageResource(currentItem.getImageResource11());
            ((Ribbon45Holder)holder).mImageView12.setImageResource(currentItem.getImageResource12());
            ((Ribbon45Holder)holder).mImageView13.setImageResource(currentItem.getImageResource13());
            ((Ribbon45Holder)holder).mImageView14.setImageResource(currentItem.getImageResource14());
            ((Ribbon45Holder)holder).mImageView15.setImageResource(currentItem.getImageResource15());
            ((Ribbon45Holder)holder).mImageView16.setImageResource(currentItem.getImageResource16());
            ((Ribbon45Holder)holder).mImageView17.setImageResource(currentItem.getImageResource17());
            ((Ribbon45Holder)holder).mImageView18.setImageResource(currentItem.getImageResource18());
            ((Ribbon45Holder)holder).mImageView19.setImageResource(currentItem.getImageResource19());
            ((Ribbon45Holder)holder).mImageView20.setImageResource(currentItem.getImageResource20());
            ((Ribbon45Holder)holder).mImageView21.setImageResource(currentItem.getImageResource21());
            ((Ribbon45Holder)holder).mImageView22.setImageResource(currentItem.getImageResource22());
            ((Ribbon45Holder)holder).mImageView23.setImageResource(currentItem.getImageResource23());
            ((Ribbon45Holder)holder).mImageView24.setImageResource(currentItem.getImageResource24());
            ((Ribbon45Holder)holder).mImageView25.setImageResource(currentItem.getImageResource25());
            ((Ribbon45Holder)holder).mImageView26.setImageResource(currentItem.getImageResource26());
            ((Ribbon45Holder)holder).mImageView27.setImageResource(currentItem.getImageResource27());
            ((Ribbon45Holder)holder).mImageView28.setImageResource(currentItem.getImageResource28());
            ((Ribbon45Holder)holder).mImageView29.setImageResource(currentItem.getImageResource29());
            ((Ribbon45Holder)holder).mImageView30.setImageResource(currentItem.getImageResource30());
            ((Ribbon45Holder)holder).mImageView31.setImageResource(currentItem.getImageResource31());
            ((Ribbon45Holder)holder).mImageView32.setImageResource(currentItem.getImageResource32());
            ((Ribbon45Holder)holder).mImageView33.setImageResource(currentItem.getImageResource33());
            ((Ribbon45Holder)holder).mImageView34.setImageResource(currentItem.getImageResource34());
            ((Ribbon45Holder)holder).mImageView35.setImageResource(currentItem.getImageResource35());
            ((Ribbon45Holder)holder).mImageView36.setImageResource(currentItem.getImageResource36());
            ((Ribbon45Holder)holder).mImageView37.setImageResource(currentItem.getImageResource37());
            ((Ribbon45Holder)holder).mImageView38.setImageResource(currentItem.getImageResource38());
            ((Ribbon45Holder)holder).mImageView39.setImageResource(currentItem.getImageResource39());
            ((Ribbon45Holder)holder).mImageView40.setImageResource(currentItem.getImageResource40());
            ((Ribbon45Holder)holder).mImageView41.setImageResource(currentItem.getImageResource41());
            ((Ribbon45Holder)holder).mImageView42.setImageResource(currentItem.getImageResource42());
            ((Ribbon45Holder)holder).mImageView43.setImageResource(currentItem.getImageResource43());
            ((Ribbon45Holder)holder).mImageView44.setImageResource(currentItem.getImageResource44());
            ((Ribbon45Holder)holder).mImageView45.setImageResource(currentItem.getImageResource45());
        }


        else if (holder instanceof Ribbon46Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon46Holder)holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon46Holder)holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon46Holder)holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon46Holder)holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon46Holder)holder).mImageView5.setImageResource(currentItem.getImageResource5());
            ((Ribbon46Holder)holder).mImageView6.setImageResource(currentItem.getImageResource6());
            ((Ribbon46Holder)holder).mImageView7.setImageResource(currentItem.getImageResource7());
            ((Ribbon46Holder)holder).mImageView8.setImageResource(currentItem.getImageResource8());
            ((Ribbon46Holder)holder).mImageView9.setImageResource(currentItem.getImageResource9());
            ((Ribbon46Holder)holder).mImageView10.setImageResource(currentItem.getImageResource10());
            ((Ribbon46Holder)holder).mImageView11.setImageResource(currentItem.getImageResource11());
            ((Ribbon46Holder)holder).mImageView12.setImageResource(currentItem.getImageResource12());
            ((Ribbon46Holder)holder).mImageView13.setImageResource(currentItem.getImageResource13());
            ((Ribbon46Holder)holder).mImageView14.setImageResource(currentItem.getImageResource14());
            ((Ribbon46Holder)holder).mImageView15.setImageResource(currentItem.getImageResource15());
            ((Ribbon46Holder)holder).mImageView16.setImageResource(currentItem.getImageResource16());
            ((Ribbon46Holder)holder).mImageView17.setImageResource(currentItem.getImageResource17());
            ((Ribbon46Holder)holder).mImageView18.setImageResource(currentItem.getImageResource18());
            ((Ribbon46Holder)holder).mImageView19.setImageResource(currentItem.getImageResource19());
            ((Ribbon46Holder)holder).mImageView20.setImageResource(currentItem.getImageResource20());
            ((Ribbon46Holder)holder).mImageView21.setImageResource(currentItem.getImageResource21());
            ((Ribbon46Holder)holder).mImageView22.setImageResource(currentItem.getImageResource22());
            ((Ribbon46Holder)holder).mImageView23.setImageResource(currentItem.getImageResource23());
            ((Ribbon46Holder)holder).mImageView24.setImageResource(currentItem.getImageResource24());
            ((Ribbon46Holder)holder).mImageView25.setImageResource(currentItem.getImageResource25());
            ((Ribbon46Holder)holder).mImageView26.setImageResource(currentItem.getImageResource26());
            ((Ribbon46Holder)holder).mImageView27.setImageResource(currentItem.getImageResource27());
            ((Ribbon46Holder)holder).mImageView28.setImageResource(currentItem.getImageResource28());
            ((Ribbon46Holder)holder).mImageView29.setImageResource(currentItem.getImageResource29());
            ((Ribbon46Holder)holder).mImageView30.setImageResource(currentItem.getImageResource30());
            ((Ribbon46Holder)holder).mImageView31.setImageResource(currentItem.getImageResource31());
            ((Ribbon46Holder)holder).mImageView32.setImageResource(currentItem.getImageResource32());
            ((Ribbon46Holder)holder).mImageView33.setImageResource(currentItem.getImageResource33());
            ((Ribbon46Holder)holder).mImageView34.setImageResource(currentItem.getImageResource34());
            ((Ribbon46Holder)holder).mImageView35.setImageResource(currentItem.getImageResource35());
            ((Ribbon46Holder)holder).mImageView36.setImageResource(currentItem.getImageResource36());
            ((Ribbon46Holder)holder).mImageView37.setImageResource(currentItem.getImageResource37());
            ((Ribbon46Holder)holder).mImageView38.setImageResource(currentItem.getImageResource38());
            ((Ribbon46Holder)holder).mImageView39.setImageResource(currentItem.getImageResource39());
            ((Ribbon46Holder)holder).mImageView40.setImageResource(currentItem.getImageResource40());
            ((Ribbon46Holder)holder).mImageView41.setImageResource(currentItem.getImageResource41());
            ((Ribbon46Holder)holder).mImageView42.setImageResource(currentItem.getImageResource42());
            ((Ribbon46Holder)holder).mImageView43.setImageResource(currentItem.getImageResource43());
            ((Ribbon46Holder)holder).mImageView44.setImageResource(currentItem.getImageResource44());
            ((Ribbon46Holder)holder).mImageView45.setImageResource(currentItem.getImageResource45());
            ((Ribbon46Holder)holder).mImageView46.setImageResource(currentItem.getImageResource46());
        }


        else if (holder instanceof Ribbon47Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon47Holder)holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon47Holder)holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon47Holder)holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon47Holder)holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon47Holder)holder).mImageView5.setImageResource(currentItem.getImageResource5());
            ((Ribbon47Holder)holder).mImageView6.setImageResource(currentItem.getImageResource6());
            ((Ribbon47Holder)holder).mImageView7.setImageResource(currentItem.getImageResource7());
            ((Ribbon47Holder)holder).mImageView8.setImageResource(currentItem.getImageResource8());
            ((Ribbon47Holder)holder).mImageView9.setImageResource(currentItem.getImageResource9());
            ((Ribbon47Holder)holder).mImageView10.setImageResource(currentItem.getImageResource10());
            ((Ribbon47Holder)holder).mImageView11.setImageResource(currentItem.getImageResource11());
            ((Ribbon47Holder)holder).mImageView12.setImageResource(currentItem.getImageResource12());
            ((Ribbon47Holder)holder).mImageView13.setImageResource(currentItem.getImageResource13());
            ((Ribbon47Holder)holder).mImageView14.setImageResource(currentItem.getImageResource14());
            ((Ribbon47Holder)holder).mImageView15.setImageResource(currentItem.getImageResource15());
            ((Ribbon47Holder)holder).mImageView16.setImageResource(currentItem.getImageResource16());
            ((Ribbon47Holder)holder).mImageView17.setImageResource(currentItem.getImageResource17());
            ((Ribbon47Holder)holder).mImageView18.setImageResource(currentItem.getImageResource18());
            ((Ribbon47Holder)holder).mImageView19.setImageResource(currentItem.getImageResource19());
            ((Ribbon47Holder)holder).mImageView20.setImageResource(currentItem.getImageResource20());
            ((Ribbon47Holder)holder).mImageView21.setImageResource(currentItem.getImageResource21());
            ((Ribbon47Holder)holder).mImageView22.setImageResource(currentItem.getImageResource22());
            ((Ribbon47Holder)holder).mImageView23.setImageResource(currentItem.getImageResource23());
            ((Ribbon47Holder)holder).mImageView24.setImageResource(currentItem.getImageResource24());
            ((Ribbon47Holder)holder).mImageView25.setImageResource(currentItem.getImageResource25());
            ((Ribbon47Holder)holder).mImageView26.setImageResource(currentItem.getImageResource26());
            ((Ribbon47Holder)holder).mImageView27.setImageResource(currentItem.getImageResource27());
            ((Ribbon47Holder)holder).mImageView28.setImageResource(currentItem.getImageResource28());
            ((Ribbon47Holder)holder).mImageView29.setImageResource(currentItem.getImageResource29());
            ((Ribbon47Holder)holder).mImageView30.setImageResource(currentItem.getImageResource30());
            ((Ribbon47Holder)holder).mImageView31.setImageResource(currentItem.getImageResource31());
            ((Ribbon47Holder)holder).mImageView32.setImageResource(currentItem.getImageResource32());
            ((Ribbon47Holder)holder).mImageView33.setImageResource(currentItem.getImageResource33());
            ((Ribbon47Holder)holder).mImageView34.setImageResource(currentItem.getImageResource34());
            ((Ribbon47Holder)holder).mImageView35.setImageResource(currentItem.getImageResource35());
            ((Ribbon47Holder)holder).mImageView36.setImageResource(currentItem.getImageResource36());
            ((Ribbon47Holder)holder).mImageView37.setImageResource(currentItem.getImageResource37());
            ((Ribbon47Holder)holder).mImageView38.setImageResource(currentItem.getImageResource38());
            ((Ribbon47Holder)holder).mImageView39.setImageResource(currentItem.getImageResource39());
            ((Ribbon47Holder)holder).mImageView40.setImageResource(currentItem.getImageResource40());
            ((Ribbon47Holder)holder).mImageView41.setImageResource(currentItem.getImageResource41());
            ((Ribbon47Holder)holder).mImageView42.setImageResource(currentItem.getImageResource42());
            ((Ribbon47Holder)holder).mImageView43.setImageResource(currentItem.getImageResource43());
            ((Ribbon47Holder)holder).mImageView44.setImageResource(currentItem.getImageResource44());
            ((Ribbon47Holder)holder).mImageView45.setImageResource(currentItem.getImageResource45());
            ((Ribbon47Holder)holder).mImageView46.setImageResource(currentItem.getImageResource46());
            ((Ribbon47Holder)holder).mImageView47.setImageResource(currentItem.getImageResource47());
        }


        else if (holder instanceof Ribbon48Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon48Holder)holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon48Holder)holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon48Holder)holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon48Holder)holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon48Holder)holder).mImageView5.setImageResource(currentItem.getImageResource5());
            ((Ribbon48Holder)holder).mImageView6.setImageResource(currentItem.getImageResource6());
            ((Ribbon48Holder)holder).mImageView7.setImageResource(currentItem.getImageResource7());
            ((Ribbon48Holder)holder).mImageView8.setImageResource(currentItem.getImageResource8());
            ((Ribbon48Holder)holder).mImageView9.setImageResource(currentItem.getImageResource9());
            ((Ribbon48Holder)holder).mImageView10.setImageResource(currentItem.getImageResource10());
            ((Ribbon48Holder)holder).mImageView11.setImageResource(currentItem.getImageResource11());
            ((Ribbon48Holder)holder).mImageView12.setImageResource(currentItem.getImageResource12());
            ((Ribbon48Holder)holder).mImageView13.setImageResource(currentItem.getImageResource13());
            ((Ribbon48Holder)holder).mImageView14.setImageResource(currentItem.getImageResource14());
            ((Ribbon48Holder)holder).mImageView15.setImageResource(currentItem.getImageResource15());
            ((Ribbon48Holder)holder).mImageView16.setImageResource(currentItem.getImageResource16());
            ((Ribbon48Holder)holder).mImageView17.setImageResource(currentItem.getImageResource17());
            ((Ribbon48Holder)holder).mImageView18.setImageResource(currentItem.getImageResource18());
            ((Ribbon48Holder)holder).mImageView19.setImageResource(currentItem.getImageResource19());
            ((Ribbon48Holder)holder).mImageView20.setImageResource(currentItem.getImageResource20());
            ((Ribbon48Holder)holder).mImageView21.setImageResource(currentItem.getImageResource21());
            ((Ribbon48Holder)holder).mImageView22.setImageResource(currentItem.getImageResource22());
            ((Ribbon48Holder)holder).mImageView23.setImageResource(currentItem.getImageResource23());
            ((Ribbon48Holder)holder).mImageView24.setImageResource(currentItem.getImageResource24());
            ((Ribbon48Holder)holder).mImageView25.setImageResource(currentItem.getImageResource25());
            ((Ribbon48Holder)holder).mImageView26.setImageResource(currentItem.getImageResource26());
            ((Ribbon48Holder)holder).mImageView27.setImageResource(currentItem.getImageResource27());
            ((Ribbon48Holder)holder).mImageView28.setImageResource(currentItem.getImageResource28());
            ((Ribbon48Holder)holder).mImageView29.setImageResource(currentItem.getImageResource29());
            ((Ribbon48Holder)holder).mImageView30.setImageResource(currentItem.getImageResource30());
            ((Ribbon48Holder)holder).mImageView31.setImageResource(currentItem.getImageResource31());
            ((Ribbon48Holder)holder).mImageView32.setImageResource(currentItem.getImageResource32());
            ((Ribbon48Holder)holder).mImageView33.setImageResource(currentItem.getImageResource33());
            ((Ribbon48Holder)holder).mImageView34.setImageResource(currentItem.getImageResource34());
            ((Ribbon48Holder)holder).mImageView35.setImageResource(currentItem.getImageResource35());
            ((Ribbon48Holder)holder).mImageView36.setImageResource(currentItem.getImageResource36());
            ((Ribbon48Holder)holder).mImageView37.setImageResource(currentItem.getImageResource37());
            ((Ribbon48Holder)holder).mImageView38.setImageResource(currentItem.getImageResource38());
            ((Ribbon48Holder)holder).mImageView39.setImageResource(currentItem.getImageResource39());
            ((Ribbon48Holder)holder).mImageView40.setImageResource(currentItem.getImageResource40());
            ((Ribbon48Holder)holder).mImageView41.setImageResource(currentItem.getImageResource41());
            ((Ribbon48Holder)holder).mImageView42.setImageResource(currentItem.getImageResource42());
            ((Ribbon48Holder)holder).mImageView43.setImageResource(currentItem.getImageResource43());
            ((Ribbon48Holder)holder).mImageView44.setImageResource(currentItem.getImageResource44());
            ((Ribbon48Holder)holder).mImageView45.setImageResource(currentItem.getImageResource45());
            ((Ribbon48Holder)holder).mImageView46.setImageResource(currentItem.getImageResource46());
            ((Ribbon48Holder)holder).mImageView47.setImageResource(currentItem.getImageResource47());
            ((Ribbon48Holder)holder).mImageView48.setImageResource(currentItem.getImageResource48());
        }


        else if (holder instanceof Ribbon49Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon49Holder)holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon49Holder)holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon49Holder)holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon49Holder)holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon49Holder)holder).mImageView5.setImageResource(currentItem.getImageResource5());
            ((Ribbon49Holder)holder).mImageView6.setImageResource(currentItem.getImageResource6());
            ((Ribbon49Holder)holder).mImageView7.setImageResource(currentItem.getImageResource7());
            ((Ribbon49Holder)holder).mImageView8.setImageResource(currentItem.getImageResource8());
            ((Ribbon49Holder)holder).mImageView9.setImageResource(currentItem.getImageResource9());
            ((Ribbon49Holder)holder).mImageView10.setImageResource(currentItem.getImageResource10());
            ((Ribbon49Holder)holder).mImageView11.setImageResource(currentItem.getImageResource11());
            ((Ribbon49Holder)holder).mImageView12.setImageResource(currentItem.getImageResource12());
            ((Ribbon49Holder)holder).mImageView13.setImageResource(currentItem.getImageResource13());
            ((Ribbon49Holder)holder).mImageView14.setImageResource(currentItem.getImageResource14());
            ((Ribbon49Holder)holder).mImageView15.setImageResource(currentItem.getImageResource15());
            ((Ribbon49Holder)holder).mImageView16.setImageResource(currentItem.getImageResource16());
            ((Ribbon49Holder)holder).mImageView17.setImageResource(currentItem.getImageResource17());
            ((Ribbon49Holder)holder).mImageView18.setImageResource(currentItem.getImageResource18());
            ((Ribbon49Holder)holder).mImageView19.setImageResource(currentItem.getImageResource19());
            ((Ribbon49Holder)holder).mImageView20.setImageResource(currentItem.getImageResource20());
            ((Ribbon49Holder)holder).mImageView21.setImageResource(currentItem.getImageResource21());
            ((Ribbon49Holder)holder).mImageView22.setImageResource(currentItem.getImageResource22());
            ((Ribbon49Holder)holder).mImageView23.setImageResource(currentItem.getImageResource23());
            ((Ribbon49Holder)holder).mImageView24.setImageResource(currentItem.getImageResource24());
            ((Ribbon49Holder)holder).mImageView25.setImageResource(currentItem.getImageResource25());
            ((Ribbon49Holder)holder).mImageView26.setImageResource(currentItem.getImageResource26());
            ((Ribbon49Holder)holder).mImageView27.setImageResource(currentItem.getImageResource27());
            ((Ribbon49Holder)holder).mImageView28.setImageResource(currentItem.getImageResource28());
            ((Ribbon49Holder)holder).mImageView29.setImageResource(currentItem.getImageResource29());
            ((Ribbon49Holder)holder).mImageView30.setImageResource(currentItem.getImageResource30());
            ((Ribbon49Holder)holder).mImageView31.setImageResource(currentItem.getImageResource31());
            ((Ribbon49Holder)holder).mImageView32.setImageResource(currentItem.getImageResource32());
            ((Ribbon49Holder)holder).mImageView33.setImageResource(currentItem.getImageResource33());
            ((Ribbon49Holder)holder).mImageView34.setImageResource(currentItem.getImageResource34());
            ((Ribbon49Holder)holder).mImageView35.setImageResource(currentItem.getImageResource35());
            ((Ribbon49Holder)holder).mImageView36.setImageResource(currentItem.getImageResource36());
            ((Ribbon49Holder)holder).mImageView37.setImageResource(currentItem.getImageResource37());
            ((Ribbon49Holder)holder).mImageView38.setImageResource(currentItem.getImageResource38());
            ((Ribbon49Holder)holder).mImageView39.setImageResource(currentItem.getImageResource39());
            ((Ribbon49Holder)holder).mImageView40.setImageResource(currentItem.getImageResource40());
            ((Ribbon49Holder)holder).mImageView41.setImageResource(currentItem.getImageResource41());
            ((Ribbon49Holder)holder).mImageView42.setImageResource(currentItem.getImageResource42());
            ((Ribbon49Holder)holder).mImageView43.setImageResource(currentItem.getImageResource43());
            ((Ribbon49Holder)holder).mImageView44.setImageResource(currentItem.getImageResource44());
            ((Ribbon49Holder)holder).mImageView45.setImageResource(currentItem.getImageResource45());
            ((Ribbon49Holder)holder).mImageView46.setImageResource(currentItem.getImageResource46());
            ((Ribbon49Holder)holder).mImageView47.setImageResource(currentItem.getImageResource47());
            ((Ribbon49Holder)holder).mImageView48.setImageResource(currentItem.getImageResource48());
            ((Ribbon49Holder)holder).mImageView49.setImageResource(currentItem.getImageResource49());
        }


        else if (holder instanceof Ribbon50Holder) {
            RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
            ((Ribbon50Holder)holder).mImageView1.setImageResource(currentItem.getImageResource1());
            ((Ribbon50Holder)holder).mImageView2.setImageResource(currentItem.getImageResource2());
            ((Ribbon50Holder)holder).mImageView3.setImageResource(currentItem.getImageResource3());
            ((Ribbon50Holder)holder).mImageView4.setImageResource(currentItem.getImageResource4());
            ((Ribbon50Holder)holder).mImageView5.setImageResource(currentItem.getImageResource5());
            ((Ribbon50Holder)holder).mImageView6.setImageResource(currentItem.getImageResource6());
            ((Ribbon50Holder)holder).mImageView7.setImageResource(currentItem.getImageResource7());
            ((Ribbon50Holder)holder).mImageView8.setImageResource(currentItem.getImageResource8());
            ((Ribbon50Holder)holder).mImageView9.setImageResource(currentItem.getImageResource9());
            ((Ribbon50Holder)holder).mImageView10.setImageResource(currentItem.getImageResource10());
            ((Ribbon50Holder)holder).mImageView11.setImageResource(currentItem.getImageResource11());
            ((Ribbon50Holder)holder).mImageView12.setImageResource(currentItem.getImageResource12());
            ((Ribbon50Holder)holder).mImageView13.setImageResource(currentItem.getImageResource13());
            ((Ribbon50Holder)holder).mImageView14.setImageResource(currentItem.getImageResource14());
            ((Ribbon50Holder)holder).mImageView15.setImageResource(currentItem.getImageResource15());
            ((Ribbon50Holder)holder).mImageView16.setImageResource(currentItem.getImageResource16());
            ((Ribbon50Holder)holder).mImageView17.setImageResource(currentItem.getImageResource17());
            ((Ribbon50Holder)holder).mImageView18.setImageResource(currentItem.getImageResource18());
            ((Ribbon50Holder)holder).mImageView19.setImageResource(currentItem.getImageResource19());
            ((Ribbon50Holder)holder).mImageView20.setImageResource(currentItem.getImageResource20());
            ((Ribbon50Holder)holder).mImageView21.setImageResource(currentItem.getImageResource21());
            ((Ribbon50Holder)holder).mImageView22.setImageResource(currentItem.getImageResource22());
            ((Ribbon50Holder)holder).mImageView23.setImageResource(currentItem.getImageResource23());
            ((Ribbon50Holder)holder).mImageView24.setImageResource(currentItem.getImageResource24());
            ((Ribbon50Holder)holder).mImageView25.setImageResource(currentItem.getImageResource25());
            ((Ribbon50Holder)holder).mImageView26.setImageResource(currentItem.getImageResource26());
            ((Ribbon50Holder)holder).mImageView27.setImageResource(currentItem.getImageResource27());
            ((Ribbon50Holder)holder).mImageView28.setImageResource(currentItem.getImageResource28());
            ((Ribbon50Holder)holder).mImageView29.setImageResource(currentItem.getImageResource29());
            ((Ribbon50Holder)holder).mImageView30.setImageResource(currentItem.getImageResource30());
            ((Ribbon50Holder)holder).mImageView31.setImageResource(currentItem.getImageResource31());
            ((Ribbon50Holder)holder).mImageView32.setImageResource(currentItem.getImageResource32());
            ((Ribbon50Holder)holder).mImageView33.setImageResource(currentItem.getImageResource33());
            ((Ribbon50Holder)holder).mImageView34.setImageResource(currentItem.getImageResource34());
            ((Ribbon50Holder)holder).mImageView35.setImageResource(currentItem.getImageResource35());
            ((Ribbon50Holder)holder).mImageView36.setImageResource(currentItem.getImageResource36());
            ((Ribbon50Holder)holder).mImageView37.setImageResource(currentItem.getImageResource37());
            ((Ribbon50Holder)holder).mImageView38.setImageResource(currentItem.getImageResource38());
            ((Ribbon50Holder)holder).mImageView39.setImageResource(currentItem.getImageResource39());
            ((Ribbon50Holder)holder).mImageView40.setImageResource(currentItem.getImageResource40());
            ((Ribbon50Holder)holder).mImageView41.setImageResource(currentItem.getImageResource41());
            ((Ribbon50Holder)holder).mImageView42.setImageResource(currentItem.getImageResource42());
            ((Ribbon50Holder)holder).mImageView43.setImageResource(currentItem.getImageResource43());
            ((Ribbon50Holder)holder).mImageView44.setImageResource(currentItem.getImageResource44());
            ((Ribbon50Holder)holder).mImageView45.setImageResource(currentItem.getImageResource45());
            ((Ribbon50Holder)holder).mImageView46.setImageResource(currentItem.getImageResource46());
            ((Ribbon50Holder)holder).mImageView47.setImageResource(currentItem.getImageResource47());
            ((Ribbon50Holder)holder).mImageView48.setImageResource(currentItem.getImageResource48());
            ((Ribbon50Holder)holder).mImageView49.setImageResource(currentItem.getImageResource49());
            ((Ribbon50Holder)holder).mImageView50.setImageResource(currentItem.getImageResource50());
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
    }

         */
    @Override
    public int getItemViewType(int position) {
        RibbonItem currentItem = (RibbonItem) mRibbonList.get(position);
        if (currentItem instanceof RibbonItem.RibbonItem1) {return 1;}
        if (currentItem instanceof RibbonItem.RibbonItem2) {return 2;}
        if (currentItem instanceof RibbonItem.RibbonItem3) {return 3;}
        if (currentItem instanceof RibbonItem.RibbonItem4) {return 4;}
        if (currentItem instanceof RibbonItem.RibbonItem5) {return 5;}
        if (currentItem instanceof RibbonItem.RibbonItem6) {return 6;}
        if (currentItem instanceof RibbonItem.RibbonItem7) {return 7;}
        if (currentItem instanceof RibbonItem.RibbonItem8) {return 8;}
        if (currentItem instanceof RibbonItem.RibbonItem9) {return 9;}
        if (currentItem instanceof RibbonItem.RibbonItem10) {return 10;}
        if (currentItem instanceof RibbonItem.RibbonItem11) {return 11;}
        if (currentItem instanceof RibbonItem.RibbonItem12) {return 12;}
        if (currentItem instanceof RibbonItem.RibbonItem13) {return 13;}
        if (currentItem instanceof RibbonItem.RibbonItem14) {return 14;}
        if (currentItem instanceof RibbonItem.RibbonItem15) {return 15;}
        if (currentItem instanceof RibbonItem.RibbonItem16) {return 16;}
        if (currentItem instanceof RibbonItem.RibbonItem17) {return 17;}
        if (currentItem instanceof RibbonItem.RibbonItem18) {return 18;}
        if (currentItem instanceof RibbonItem.RibbonItem19) {return 19;}
        if (currentItem instanceof RibbonItem.RibbonItem20) {return 20;}
        if (currentItem instanceof RibbonItem.RibbonItem21) {return 21;}
        if (currentItem instanceof RibbonItem.RibbonItem22) {return 22;}
        if (currentItem instanceof RibbonItem.RibbonItem23) {return 23;}
        if (currentItem instanceof RibbonItem.RibbonItem24) {return 24;}
        if (currentItem instanceof RibbonItem.RibbonItem25) {return 25;}
        if (currentItem instanceof RibbonItem.RibbonItem26) {return 26;}
        if (currentItem instanceof RibbonItem.RibbonItem27) {return 27;}
        if (currentItem instanceof RibbonItem.RibbonItem28) {return 28;}
        if (currentItem instanceof RibbonItem.RibbonItem29) {return 29;}
        if (currentItem instanceof RibbonItem.RibbonItem30) {return 30;}
        if (currentItem instanceof RibbonItem.RibbonItem31) {return 31;}
        if (currentItem instanceof RibbonItem.RibbonItem32) {return 32;}
        if (currentItem instanceof RibbonItem.RibbonItem33) {return 33;}
        if (currentItem instanceof RibbonItem.RibbonItem34) {return 34;}
        if (currentItem instanceof RibbonItem.RibbonItem35) {return 35;}
        if (currentItem instanceof RibbonItem.RibbonItem36) {return 36;}
        if (currentItem instanceof RibbonItem.RibbonItem37) {return 37;}
        if (currentItem instanceof RibbonItem.RibbonItem38) {return 38;}
        if (currentItem instanceof RibbonItem.RibbonItem39) {return 39;}
        if (currentItem instanceof RibbonItem.RibbonItem40) {return 40;}
        if (currentItem instanceof RibbonItem.RibbonItem41) {return 41;}
        if (currentItem instanceof RibbonItem.RibbonItem42) {return 42;}
        if (currentItem instanceof RibbonItem.RibbonItem43) {return 43;}
        if (currentItem instanceof RibbonItem.RibbonItem44) {return 44;}
        if (currentItem instanceof RibbonItem.RibbonItem45) {return 45;}
        if (currentItem instanceof RibbonItem.RibbonItem46) {return 46;}
        if (currentItem instanceof RibbonItem.RibbonItem47) {return 47;}
        if (currentItem instanceof RibbonItem.RibbonItem48) {return 48;}
        if (currentItem instanceof RibbonItem.RibbonItem49) {return 49;}
        if (currentItem instanceof RibbonItem.RibbonItem50) {return 50;}
        return 0;
    }

    @Override
    public int getItemCount() {
        return mRibbonList.size();
    }
}