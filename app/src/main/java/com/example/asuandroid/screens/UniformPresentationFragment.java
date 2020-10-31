package com.example.asuandroid.screens;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.asuandroid.R;
import com.example.asuandroid.outfitAdapters.AwardAdapter;
import com.example.asuandroid.outfitAdapters.RibbonAdapter;
import com.example.asuandroid.outfitfragments.AwardFragment;
import com.example.asuandroid.outfitfragments.AwardItem;
import com.example.asuandroid.outfitfragments.RibbonItem;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class UniformPresentationFragment extends Fragment{
    private ArrayList<RibbonItem> mRibbonList;
    private RecyclerView mRecyclerView;
    private RibbonAdapter mRecyclerViewAdapter;
//    public ArrayList<String> fromAward = AwardFragment.ribbonValues;



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
        mRibbonList.add(new RibbonItem(R.drawable.ic_medal_of_honor_ribbon, R.drawable.ic_afghanistan_campaign_medal_ribbon, R.drawable.ic_air_medal_ribbon, R.drawable.ic_american_campaign_medal_ribbon, R.drawable.ic_antarctica_service_medal_ribbon, R.drawable.ic_army_achievement_medal_ribbon, R.drawable.ic_armed_forces_expeditionary_medal_ribbon, R.drawable.ic_army_overseas_service_ribbon, R.drawable.ic_army_service_ribbon, R.drawable.ic_medal_of_honor_ribbon, R.drawable.ic_medal_of_honor_ribbon, R.drawable.ic_medal_of_honor_ribbon));
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.btn_return_home_fromPresentation).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //System.out.println(fromAward);
                NavHostFragment.findNavController(UniformPresentationFragment.this)
                        .navigate(R.id.action_uniformPresentationFragment_to_HomeScreen);
            }

        });
    }
}