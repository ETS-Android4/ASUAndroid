package com.example.asuandroid.outfitfragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.asuandroid.R;
import com.example.asuandroid.outfitAdapters.AwardAdapter;

import java.util.ArrayList;

public class BadgeFragment extends Fragment {
    private ArrayList<AwardItem> mBadgeList;
    private AwardAdapter mRecyclerViewAdapter;
    private RecyclerView mRecyclerView;
    public SwitchCompat switchRibbon;
    public static ArrayList<Integer> badgeImages = new ArrayList<Integer>();


    public void addRibbon(String ribbon){
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        createAwardList();
        //buildRecyclerView(container.findViewById(R.id.recyclerView));
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_badge, container, false);
        final FragmentActivity c = getActivity();
        final RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerViewBadge);
        AwardAdapter mAdapter = new AwardAdapter(mBadgeList);
        mRecyclerViewAdapter = new AwardAdapter(mBadgeList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(c);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mAdapter);
        mAdapter.setOnItemClickListener(new AwardAdapter.OnItemClickListener() {

            @Override
            public void onAddRibbonClick(int ribbon, int position, boolean isRibbonOn) {
                assert c != null;
                //Toast.makeText(c.getApplicationContext(), ribbon, Toast.LENGTH_LONG).show();
                badgeImages.add(ribbon);
            }
        });
        return view;
    }

    private void createAwardList() {
        mBadgeList = new ArrayList<>();
       // mBadgeList.add(new AwardItem(R.drawable.ic_combat_action_badge, "Combat Action Badge", "hello", R.drawable.ic_frame00));
       // mBadgeList.add(new AwardItem(R.drawable.ic_combat_infantry_badge, "Combat Action Badge", "R.string.ref2", R.drawable.ic_frame00));
    }



    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //back to outfit prompt
        view.findViewById(R.id.btn_badge_to_prompt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(BadgeFragment.this)
                        .navigate(R.id.action_badgeFragment_to_uniformFragment);
            }
        });
    }
}
