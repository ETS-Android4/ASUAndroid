package com.example.asuandroid.outfitfragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.SwitchCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.asuandroid.R;
import com.example.asuandroid.outfitAdapters.BadgesCardAdapter;
import com.example.asuandroid.vectorItems.BadgeCardItem;
import com.google.android.flexbox.FlexWrap;
import com.google.android.flexbox.FlexboxLayoutManager;

import java.util.ArrayList;
import java.util.Arrays;

public class BadgeFragment extends Fragment {
    private ArrayList<BadgeCardItem> mBadgeList;
    private BadgesCardAdapter mRecyclerViewAdapter;
    private RecyclerView mRecyclerView;
    public SwitchCompat switchRibbon;
    public static ArrayList<Integer> badgeImages = new ArrayList<Integer>();
    public static ArrayList<Integer> finalExport = new ArrayList<>();
    public void addRibbon(String ribbon){
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        createBadgesList();
        final View view = inflater.inflate(R.layout.fragment_badge, container, false);
        final FragmentActivity c = getActivity();
        final RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerViewBadge);
        BadgesCardAdapter mAdapter = new BadgesCardAdapter(mBadgeList);
        mRecyclerViewAdapter = new BadgesCardAdapter(mBadgeList);
        FlexboxLayoutManager layoutManager = new FlexboxLayoutManager(c);
        layoutManager.setFlexWrap(FlexWrap.WRAP);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mAdapter);
        mAdapter.setOnItemClickListener(new BadgesCardAdapter.OnItemClickListener() {
            @Override
            public void onAddBadgesClick(int badge, int position, boolean isBadgeOn) {
                assert c != null;
                if(isBadgeOn){
                    badgeImages.add(badge);
                } else if (!isBadgeOn){
                    System.out.println(badgeImages.size());
                    badgeImages.removeAll(Arrays.asList(badge));
                }
            }
        });
        return view;
    }
    private void createBadgesList() {
       mBadgeList = new ArrayList<>();
       mBadgeList.add(new BadgeCardItem(R.drawable.ic_combat_action_badge, "Combat Action Badge", "hello", R.drawable.ic_frame00));
       mBadgeList.add(new BadgeCardItem(R.drawable.ic_combat_infantry_badge, "Combat Action Badge", "R.string.ref2", R.drawable.ic_frame00));
    }



    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //back to outfit prompt
        view.findViewById(R.id.btn_badge_to_prompt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(badgeImages.size());
                badgeImages.trimToSize();
                System.out.println(badgeImages.size());
                finalExport = badgeImages;
                System.out.println("Heres the size of badgeImages" + badgeImages.size());
                System.out.println(badgeImages);
                NavHostFragment.findNavController(BadgeFragment.this)
                        .navigate(R.id.action_badgeFragment_to_badge2Fragment);
            }
        });
    }
}
