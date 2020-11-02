package com.example.asuandroid.screens;

import android.os.Bundle;

import androidx.collection.ArraySet;
import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.asuandroid.R;
import com.example.asuandroid.vectorBuildAdapters.RibbonAdapter;
import com.example.asuandroid.outfitfragments.AwardFragment;
import com.example.asuandroid.outfitfragments.RibbonItem;

import java.util.ArrayList;

public class UniformPresentationFragment extends Fragment{
    private ArrayList<RibbonItem> mRibbonList;
    private RecyclerView mRecyclerView;
    private RibbonAdapter mRecyclerViewAdapter;
    public ArrayList<String> fromAward = AwardFragment.ribbonImages;
    public ArraySet<ImageView> images = RibbonAdapter.images;

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
        mRibbonList.add(new RibbonItem(R.drawable.ic_european_african_middle_eastern_campaign_ribbon, R.drawable.ic_afghanistan_campaign_medal_ribbon, R.drawable.ic_air_medal_ribbon, R.drawable.ic_american_campaign_medal_ribbon, R.drawable.ic_antarctica_service_medal_ribbon, R.drawable.ic_army_achievement_medal_ribbon, R.drawable.ic_armed_forces_expeditionary_medal_ribbon, R.drawable.ic_army_overseas_service_ribbon, R.drawable.ic_army_service_ribbon, R.drawable.ic_armed_forces_service_medal_ribbon, R.drawable.ic_legion_of_merit_ribbon, R.drawable.ic_navy_arctic_service_ribbon));
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.btn_return_home_fromPresentation).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                System.out.println(fromAward);
                System.out.println(images);
                NavHostFragment.findNavController(UniformPresentationFragment.this)
                        .navigate(R.id.action_uniformPresentationFragment_to_HomeScreen);
            }

        });
    }
}