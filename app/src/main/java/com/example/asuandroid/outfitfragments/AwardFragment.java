package com.example.asuandroid.outfitfragments;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.asuandroid.R;
import com.example.asuandroid.outfitAdapters.AwardAdapter;
import com.example.asuandroid.screens.MainActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


public class AwardFragment extends Fragment {
    private ArrayList<AwardItem> mAwardList;
    private AwardAdapter mRecyclerViewAdapter;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        createAwardList();
        System.out.println(mAwardList);
        //buildRecyclerView(container.findViewById(R.id.recyclerView));
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_award, container, false);

        final FragmentActivity c = getActivity();
        final RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        mRecyclerViewAdapter = new AwardAdapter(mAwardList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(c);
        recyclerView.setLayoutManager(layoutManager);

        new Thread(new Runnable() {
            @Override
            public void run() {
                final AwardAdapter adapter = new AwardAdapter(mAwardList);
                assert c != null;
                c.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        sortArrayList();
                        recyclerView.setAdapter(adapter);
                    }
                });
            }
        }).start();

        return view;

    }

    public void createAwardList() {
        mAwardList = new ArrayList<>();
        mAwardList.add(new AwardItem(R.drawable.ic_medal_of_honor_ribbon, "Medal of Honor", "Dixon"));


    }
    private void sortArrayList() {
        Collections.sort(mAwardList, new Comparator<AwardItem>() {
            @Override
            public int compare(AwardItem o1, AwardItem o2) {
                return o1.getText1().compareTo(o2.getText1());
            }
        });
        mRecyclerViewAdapter.notifyDataSetChanged();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //back to outfit prompt
        view.findViewById(R.id.btn_sort).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(AwardFragment.this)
                        .navigate(R.id.action_awardFragment_to_uniformFragment);
            }
        });
    }
}