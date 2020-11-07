package com.example.asuandroid.screens;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;

import androidx.collection.ArraySet;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.asuandroid.R;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter;
import com.example.asuandroid.outfitfragments.AwardFragment;
import com.example.asuandroid.vectorBuildAdapters.RibbonItem;
import com.zoomage.ZoomageView;


import java.io.File;
import java.util.ArrayList;

public class UniformPresentationFragment extends Fragment{
    public static ArrayList<Integer> fromAward = AwardFragment.finalExport;
    private ArrayList<RibbonItem> mRibbonList;
    private RecyclerView mRecyclerView;
    private RibbonAdapter mRecyclerViewAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        createRibbonList();
        final View view = inflater.inflate(R.layout.fragment_uniform_presentation, container, false);
        final FragmentActivity c = getActivity();
        RibbonAdapter mAdapter = new RibbonAdapter(mRibbonList);
        mRecyclerViewAdapter = new RibbonAdapter(mRibbonList);
        final RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerViewRibbonRack);
        LinearLayoutManager layoutManager = new LinearLayoutManager(c);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mAdapter);
        // Inflate the layout for this fragment
        return view;
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

    private Bitmap getBitmapFromView(View view) {
        //Define a bitmap with the same size as the view
        Bitmap returnedBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(),Bitmap.Config.ARGB_8888);
        //Bind a canvas to it
        Canvas canvas = new Canvas(returnedBitmap);
        //Get the view's background
        Drawable bgDrawable =view.getBackground();
        if (bgDrawable!=null) {
            //has background drawable, then draw it on the canvas
            bgDrawable.draw(canvas);
        }   else{
            //does not have background drawable, then draw white background on the canvas
            canvas.drawColor(Color.WHITE);
        }
        // draw the view on the canvas
        view.draw(canvas);
        //return the bitmap
        return returnedBitmap;
    }


    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.btn_return_home_fromPresentation).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                fromAward.removeAll(fromAward);
                View layout_view = view.findViewById(R.id.ribbonRack);
                System.out.println("FromawardSize"+ fromAward.size());
                NavHostFragment.findNavController(UniformPresentationFragment.this)
                        .navigate(R.id.action_uniformPresentationFragment_to_HomeScreen);
            }

        });
    }
}