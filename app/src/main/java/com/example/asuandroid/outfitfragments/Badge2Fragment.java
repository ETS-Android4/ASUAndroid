package com.example.asuandroid.outfitfragments;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.appcompat.widget.PopupMenu;
import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.RecyclerView;

import android.util.ArraySet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.asuandroid.R;
import com.example.asuandroid.outfitAdapters.BadgesCardAdapter;
import com.example.asuandroid.vectorBuildAdapters.BadgesAdapter;
import com.example.asuandroid.vectorItems.BadgeItem;
import com.google.android.flexbox.FlexWrap;
import com.google.android.flexbox.FlexboxLayoutManager;


import java.util.ArrayList;

public class Badge2Fragment extends Fragment implements PopupMenu.OnMenuItemClickListener {
    public static ArrayList<Integer> fromBadge = BadgeFragment.finalExport;
    private ArrayList<BadgeItem> mBadgesList;
    private RecyclerView mRecyclerView;
    private BadgesAdapter mRecyclerViewAdapter;
    RecyclerView.RecycledViewPool sharedPool = new RecyclerView.RecycledViewPool();
    public static Context context;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        createBadgeList();
        assert container != null;
        context = container.getContext();
        //View v = inflater.inflate(R.id.oak);
        final View view = inflater.inflate(R.layout.fragment_badge2, container, false);
        final FragmentActivity c = getActivity();
        System.out.println(Award2Fragment.bitmapDrawableArray.get(0));
        BadgesAdapter mAdapter = new BadgesAdapter(mBadgesList);
        mRecyclerViewAdapter = new BadgesAdapter(mBadgesList);
        final RecyclerView recyclerView = view.findViewById(R.id.recyclerViewBadgesRack);
        FlexboxLayoutManager layoutManager = new FlexboxLayoutManager(c);
        layoutManager.setFlexWrap(FlexWrap.WRAP);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mAdapter);
        recyclerView.setRecycledViewPool(sharedPool);
        mAdapter.setOnItemClickListener(new BadgesAdapter.OnItemClickListener() {
            @Override
            public void onEditBadgesClick(int badges, int position) {
            }
        });
        // Inflate the layout for this fragment
        return view;
    }

    public void showPopup(View v, RecyclerView holder, ArraySet<ImageView> oaks) {
        new Thread() {
            public void run() {
                PopupMenu oakMenu = new PopupMenu(context, v);
                oakMenu.getMenuInflater().inflate(R.menu.oak_leaf_menu, oakMenu.getMenu());
                oakMenu.setOnMenuItemClickListener(Badge2Fragment.this);
                oakMenu.inflate(R.menu.oak_leaf_menu);
                oakMenu.show();
            }
        };
    }
    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Toast.makeText(context, "Item 1 clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item2:
                Toast.makeText(context, "Item 2 clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item3:
                Toast.makeText(context, "Item 3 clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item4:
                Toast.makeText(context, "Item 4 clicked", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return false;
        }
    }

    public void createBadgeList() {
        mBadgesList = new ArrayList<>();
        //for(int i = 0; i < fromBadge.size(); i++)
        System.out.println(fromBadge);
        fromBadge.trimToSize();
        System.out.println(fromBadge);
        int tots = fromBadge.size();
        System.out.println("Size of tots"  + tots);
        /*
        if(fromBadge.size() == 1){
            mBadgesList.add(new RibbonItem.RibbonItem1(fromBadge));
        } else if(fromBadge.size() ==2){
            mBadgesList.add(new RibbonItem.RibbonItem2(fromBadge));
        }
        */
        switch(tots) {
            case 1:
                mBadgesList.add(new BadgeItem.BadgeItem1(fromBadge));
                break;
            case 2:
                mBadgesList.add(new BadgeItem.BadgeItem2(fromBadge));
                break;
        }
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewRibbonRack);
        //ZoomageView zoomageView = view.findViewById(R.id.myZoomageView);
        view.setDrawingCacheEnabled(true);
        //ConstraintLayout uniformConstraint = view.findViewById(R.id.uniform_constraint);
        Button convertView = view.findViewById(R.id.btn_populateFromDialogB);
        Button continueToBadge = view.findViewById(R.id.btn_badges2_continue);
        //ImageView holderConvert = view.findViewById(R.id.convertedHolder);
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bitmap bpm = Bitmap.createBitmap(recyclerView.getWidth(), recyclerView.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bpm);
                recyclerView.draw(canvas);
                Drawable d = new BitmapDrawable(getResources(), bpm);
                //zoomageView.setDrawableResource(d);
                Award2Fragment.bitmapDrawableArray.add(d);
                System.out.println(Award2Fragment.bitmapDrawableArray);
                NavHostFragment.findNavController(Badge2Fragment.this)
                        .navigate(R.id.action_award2Fragment_to_award2Dialog);
            }
        });
        continueToBadge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bitmap bpm = Bitmap.createBitmap(recyclerView.getWidth(), recyclerView.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bpm);
                recyclerView.draw(canvas);
                Drawable d1 = new BitmapDrawable(getResources(), bpm);
                //zoomageView.setDrawableResource(d);
                Award2Fragment.bitmapDrawableArray.add(d1);
                System.out.println(Award2Fragment.bitmapDrawableArray);
                NavHostFragment.findNavController(Badge2Fragment.this)
                        .navigate(R.id.action_award2Fragment_to_badgeFragment);
            };
        });
        /*
         */
    }

}