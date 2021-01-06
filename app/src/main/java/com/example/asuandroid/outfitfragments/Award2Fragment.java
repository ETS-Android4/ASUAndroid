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
import androidx.recyclerview.widget.LinearLayoutManager;
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
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter50;
import com.example.asuandroid.vectorBuildAdapters.RibbonItem;
import com.google.android.flexbox.FlexWrap;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter1;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter2;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter20;


import java.util.ArrayList;

public class Award2Fragment extends Fragment implements PopupMenu.OnMenuItemClickListener {
    public static ArrayList<Integer> fromAward = AwardFragment.finalExport;
    private ArrayList<RibbonItem> mRibbonList;
    private RecyclerView mRecyclerView;
    private RibbonAdapter1 mRecyclerViewAdapter1;
    private RibbonAdapter2 mRecyclerViewAdapter2;
    private RibbonAdapter20 mRecyclerViewAdapter20;
    private RibbonAdapter50 mRecyclerViewAdapter50;
    public static ArrayList<Drawable> bitmapDrawableArray = new ArrayList<Drawable>();
    RecyclerView.RecycledViewPool sharedPool = new RecyclerView.RecycledViewPool();
    public static Context context;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
        Bundle savedInstanceState) {
        assert container != null;
        System.out.println(fromAward);
        fromAward.trimToSize();
        System.out.println(fromAward);
        int tots = fromAward.size();
        context = container.getContext();
        createRibbonList();
        //View v = inflater.inflate(R.id.oak);
        final View view = inflater.inflate(R.layout.fragment_award2, container, false);
        final FragmentActivity c = getActivity();
        switch(tots) {
            case 1:
                RibbonAdapter1 mAdapter1 = new RibbonAdapter1(mRibbonList);
                mRecyclerViewAdapter1 = new RibbonAdapter1(mRibbonList);
                final RecyclerView recyclerView1 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager1 = new LinearLayoutManager(c);
                recyclerView1.setLayoutManager(layoutManager1);
                recyclerView1.setAdapter(mAdapter1);
                break;
            case 2:
                RibbonAdapter2 mAdapter2 = new RibbonAdapter2(mRibbonList);
                mRecyclerViewAdapter2 = new RibbonAdapter2(mRibbonList);
                final RecyclerView recyclerView2 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager2 = new LinearLayoutManager(c);
                recyclerView2.setLayoutManager(layoutManager2);
                recyclerView2.setAdapter(mAdapter2);
                break;
            case 20:
                RibbonAdapter20 mAdapter20 = new RibbonAdapter20(mRibbonList);
                mRecyclerViewAdapter20 = new RibbonAdapter20(mRibbonList);
                final RecyclerView recyclerView20 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager20 = new LinearLayoutManager(c);
                recyclerView20.setLayoutManager(layoutManager20);
                recyclerView20.setAdapter(mAdapter20);
                break;
            case 50:
                RibbonAdapter50 mAdapter50 = new RibbonAdapter50(mRibbonList);
                mRecyclerViewAdapter50 = new RibbonAdapter50(mRibbonList);
                final RecyclerView recyclerView50 = view.findViewById(R.id.recyclerViewRibbonRack);
                LinearLayoutManager layoutManager50 = new LinearLayoutManager(c);
                recyclerView50.setLayoutManager(layoutManager50);
                recyclerView50.setAdapter(mAdapter50);
                break;
        }
        // Inflate the layout for this fragment
        return view;
    }

    public void showPopup(View v, RecyclerView holder, ArraySet<ImageView> oaks) {
        new Thread() {
            public void run() {
                PopupMenu oakMenu = new PopupMenu(context, v);
                oakMenu.getMenuInflater().inflate(R.menu.oak_leaf_menu, oakMenu.getMenu());
                oakMenu.setOnMenuItemClickListener(Award2Fragment.this);
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

    public void createRibbonList() {
        mRibbonList = new ArrayList<>();
        //for(int i = 0; i < fromAward.size(); i++)
        System.out.println(fromAward);
        fromAward.trimToSize();
        System.out.println(fromAward);
        int tots = fromAward.size();
        System.out.println("Size of tots"  + tots);
        /*
        if(fromAward.size() == 1){
            mRibbonList.add(new RibbonItem.RibbonItem1(fromAward));
        } else if(fromAward.size() ==2){
            mRibbonList.add(new RibbonItem.RibbonItem2(fromAward));
        }
        */
        switch(tots) {
            case 1:
            mRibbonList.add(new RibbonItem.RibbonItem1(fromAward));
            break;
            case 2:
            mRibbonList.add(new RibbonItem.RibbonItem2(fromAward));
            break;
            case 3:
            mRibbonList.add(new RibbonItem.RibbonItem3(fromAward));
            break;
            case 4:
            mRibbonList.add(new RibbonItem.RibbonItem4(fromAward));
            break;
            case 5:
            mRibbonList.add(new RibbonItem.RibbonItem5(fromAward));
            break;
            case 6:
            mRibbonList.add(new RibbonItem.RibbonItem6(fromAward));
            break;
            case 7:
            mRibbonList.add(new RibbonItem.RibbonItem7(fromAward));
            break;
            case 8:
            mRibbonList.add(new RibbonItem.RibbonItem8(fromAward));
            break;
            case 9:
            mRibbonList.add(new RibbonItem.RibbonItem9(fromAward));
            break;
            case 10:
            mRibbonList.add(new RibbonItem.RibbonItem10(fromAward));
            break;
            case 11:
            mRibbonList.add(new RibbonItem.RibbonItem11(fromAward));
            break;
            case 12:
            mRibbonList.add(new RibbonItem.RibbonItem12(fromAward));
            break;
            case 13:
            mRibbonList.add(new RibbonItem.RibbonItem13(fromAward));
            break;
            case 14:
            mRibbonList.add(new RibbonItem.RibbonItem14(fromAward));
            break;
            case 15:
            mRibbonList.add(new RibbonItem.RibbonItem15(fromAward));
            break;
            case 16:
            mRibbonList.add(new RibbonItem.RibbonItem16(fromAward));
            break;
            case 17:
            mRibbonList.add(new RibbonItem.RibbonItem17(fromAward));
            break;
            case 18:
            mRibbonList.add(new RibbonItem.RibbonItem18(fromAward));
            break;
            case 19:
            mRibbonList.add(new RibbonItem.RibbonItem19(fromAward));
            break;
            case 20:
            mRibbonList.add(new RibbonItem.RibbonItem20(fromAward));
            break;
            case 21:
            mRibbonList.add(new RibbonItem.RibbonItem21(fromAward));
            break;
            case 22:
            mRibbonList.add(new RibbonItem.RibbonItem22(fromAward));
            break;
            case 23:
            mRibbonList.add(new RibbonItem.RibbonItem23(fromAward));
            break;
            case 24:
            mRibbonList.add(new RibbonItem.RibbonItem24(fromAward));
            break;
            case 25:
            mRibbonList.add(new RibbonItem.RibbonItem25(fromAward));
            break;
            case 26:
            mRibbonList.add(new RibbonItem.RibbonItem26(fromAward));
            break;
            case 27:
            mRibbonList.add(new RibbonItem.RibbonItem27(fromAward));
            break;
            case 28:
            mRibbonList.add(new RibbonItem.RibbonItem28(fromAward));
            break;
            case 29:
            mRibbonList.add(new RibbonItem.RibbonItem29(fromAward));
            break;
            case 30:
            mRibbonList.add(new RibbonItem.RibbonItem30(fromAward));
            break;
            case 31:
            mRibbonList.add(new RibbonItem.RibbonItem31(fromAward));
            break;
            case 32:
            mRibbonList.add(new RibbonItem.RibbonItem32(fromAward));
            break;
            case 33:
            mRibbonList.add(new RibbonItem.RibbonItem33(fromAward));
            break;
            case 34:
            mRibbonList.add(new RibbonItem.RibbonItem34(fromAward));
            break;
            case 35:
            mRibbonList.add(new RibbonItem.RibbonItem35(fromAward));
            break;
            case 36:
            mRibbonList.add(new RibbonItem.RibbonItem36(fromAward));
            break;
            case 37:
            mRibbonList.add(new RibbonItem.RibbonItem37(fromAward));
            break;
            case 38:
            mRibbonList.add(new RibbonItem.RibbonItem38(fromAward));
            break;
            case 39:
            mRibbonList.add(new RibbonItem.RibbonItem39(fromAward));
            break;
            case 40:
            mRibbonList.add(new RibbonItem.RibbonItem40(fromAward));
            break;
            case 41:
            mRibbonList.add(new RibbonItem.RibbonItem41(fromAward));
            break;
            case 42:
            mRibbonList.add(new RibbonItem.RibbonItem42(fromAward));
            break;
            case 43:
            mRibbonList.add(new RibbonItem.RibbonItem43(fromAward));
            break;
            case 44:
            mRibbonList.add(new RibbonItem.RibbonItem44(fromAward));
            break;
            case 45:
            mRibbonList.add(new RibbonItem.RibbonItem45(fromAward));
            break;
            case 46:
            mRibbonList.add(new RibbonItem.RibbonItem46(fromAward));
            break;
            case 47:
            mRibbonList.add(new RibbonItem.RibbonItem47(fromAward));
            break;
            case 48:
            mRibbonList.add(new RibbonItem.RibbonItem48(fromAward));
            break;
            case 49:
            mRibbonList.add(new RibbonItem.RibbonItem49(fromAward));
            break;
            case 50:
            mRibbonList.add(new RibbonItem.RibbonItem50(fromAward));
            break;
        }
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewRibbonRack);
        //ZoomageView zoomageView = view.findViewById(R.id.myZoomageView);
        view.setDrawingCacheEnabled(true);
        //ConstraintLayout uniformConstraint = view.findViewById(R.id.uniform_constraint);
        Button convertView = view.findViewById(R.id.btn_populateFromDialog);
        //ImageView holderConvert = view.findViewById(R.id.convertedHolder);
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bitmap bpm = Bitmap.createBitmap(recyclerView.getWidth(), recyclerView.getHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bpm);
                recyclerView.draw(canvas);
                Drawable d = new BitmapDrawable(getResources(), bpm);
                //zoomageView.setDrawableResource(d);
                bitmapDrawableArray.add(d);
                System.out.println(bitmapDrawableArray);
                NavHostFragment.findNavController(Award2Fragment.this)
                    .navigate(R.id.action_award2Fragment_to_award2Dialog);
                //System.out.println(bitmap);
            }
        });
        /*
         */
    }

}