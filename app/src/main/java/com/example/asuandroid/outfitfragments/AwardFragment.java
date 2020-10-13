package com.example.asuandroid.outfitfragments;

import android.annotation.SuppressLint;
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
import android.widget.CompoundButton;

import com.example.asuandroid.R;
import com.example.asuandroid.outfitAdapters.AwardAdapter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AwardFragment extends Fragment {
    private ArrayList<AwardItem> mAwardList;
    private AwardAdapter mRecyclerViewAdapter;
    public SwitchCompat switchRibbon;
    private ArrayList<String> ribbonValues;



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
        mAwardList.add(new AwardItem(R.drawable.ic_medal_of_honor_ribbon, "Medal of Honor", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_distinguished_service_cross_ribbon, " Army Distinguished Service Cross", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_defense_distinguished_service_medal_ribbon, " Defense Distinguished Service", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_homeland_security_distinguished_service_medal_ribbon, " Homeland Security Distinguished Service Medal", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_army_distinguished_service_medal_ribbon, " Army Distinguished Service", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_army_silver_star_medal_ribbon, " Silver Star", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_defense_superior_service_medal_ribbon, " Defense Superior Service", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_legion_of_merit_ribbon, " Legion of Merit", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_distinguished_flying_cross_ribbon, " Distinguished Flying Cross", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_soldiers_medal_ribbon, " Soldiers Medal", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_bronze_star_medal_ribbon, " Bronze Star", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_purple_heart_ribbon, " Purple Heart", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_defense_meritorious_service_medal_ribbon, " Defense Meritorious Service", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_meritorious_service_medal_ribbon, " Meritorious Service", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_air_medal_ribbon, " Air Medal", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_joint_service_commendation_medal_ribbon, " Joint Service Commendation", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_army_commendation_medal_ribbon, " Army Commendation", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_joint_service_achievement_medal_ribbon, " Joint Service Achievement", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_army_achievement_medal_ribbon, " Army Achievement", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_army_presidential_unit_citation, " Army Presidential Unit Citation", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_joint_meritorious_unit_award_ribbon, " Joint Service Meritorious Unit", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_valorous_unit_award_ribbon, " Army Valorous Unit Award", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_meritorious_unit_commendation_ribbon, " Army Meritorious Unit Commendation", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_army_superior_unit_award_ribbon, " Army Superior Unit Award", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_prisoner_of_war_medal_ribbon, " Prisoner of War", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_army_good_conduct_medal_ribbon, " Army Good Conduct", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_army_reserve_components_achievement_medal_ribbon, " Army Reserve Components Achievement", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_american_defense_service_medal_ribbon, " American Defense Service", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_american_campaign_medal_ribbon, " American Campaign", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_asiatic_pacific_campaign_medal_ribbon, " Asiatic Pacific Service", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_european_african_middle_eastern_campaign_ribbon, " European African Middle Eastern Campaign Medal", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_world_war_ii_victory_medal_ribbon, " World War II Victory Medal", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_army_of_occupation_ribbon, " Army Occupation", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_medal_for_humane_action_ribbon, " Humane Action", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_national_defense_service_medal_ribbon, " National Defense Service Medal", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_korean_service_medal_ribbon, " Korea Service Medal", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_antarctica_service_medal_ribbon, " Antarctica Service", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_armed_forces_expeditionary_medal_ribbon, " Armed Forces Expeditionary Medal", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_vietnam_service_medal_ribbon, " Vietnam Service Medal", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_southwest_asia_service_medal_ribbon, " Southwest Asia Service Medal", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_kosovo_campaign_medal_ribbon, " Kosovo Campaign Medal", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_afghanistan_campaign_medal_ribbon, " Afghanistan Campaign Medal", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_iraq_campaign_medal_ribbon, " Iraq Campaign Medal", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_inherent_resolve_campaign_medal_ribbon, " Inherent Resolve Campaign Medal", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_global_war_on_terrorism_expeditionary_medal_ribbon, " Global War on Terrorism Expeditionary", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_global_war_on_terrorism_service_medal_ribbon, " Global War Terrorism Service", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_korea_defense_service_medal_ribbon, " Korea Defense Service Medal", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_armed_forces_service_medal_ribbon, " Armed Forces Service", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_humanitarian_service_medal_ribbon, " Humanitarian Service Medal", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_us_army_sea_duty_ribbon, " Army Sea Duty", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_armed_forces_reserve_medal_ribbon, " Armed Forces Reserve", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_non_commissioned_officer_professional_development_ribbon, " NCO Professional Development", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_army_service_ribbon, " Army Service", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_navy_arctic_service_ribbon, " Arctic Service", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_army_overseas_service_ribbon, " Army Overseas Service", ""));
        mAwardList.add(new AwardItem(R.drawable.ic_army_reserve_overseas_training_ribbon, " Army Reserve Componenets Overseas", ""));
        /*mAwardList.add(new AwardItem(R.drawable.ic_vietnam_gallantry_cross_unit_award_wpalm, " Vietnam Gallantry Cross", ""));
        mAwardList.add(new AwardItem(R.drawable., " Vietnam Armed Forces Honor 1C", ""));
        mAwardList.add(new AwardItem(R.drawable., " Vietnam Armed Forces Honor 2C", ""));
        mAwardList.add(new AwardItem(R.drawable., " Vietnam Civil Action 1C", ""));
        mAwardList.add(new AwardItem(R.drawable., " Vietnam Civil Action 2C", ""));
        mAwardList.add(new AwardItem(R.drawable., " Philippines Republic Presidential Unit Citation", ""));
        mAwardList.add(new AwardItem(R.drawable., " Republic of Korea Presidential Unit Citation", ""));
        mAwardList.add(new AwardItem(R.drawable., " Republic of Vietnam Presidential Unit Citation", ""));
        mAwardList.add(new AwardItem(R.drawable., " Republic of Vietnam Gallantry Cross Unit Citation", ""));
        mAwardList.add(new AwardItem(R.drawable., " Republic of Vietnam Civil Action", ""));
        mAwardList.add(new AwardItem(R.drawable., " Philippine Defence", ""));
        mAwardList.add(new AwardItem(R.drawable., " Philippine Liberation", ""));
        mAwardList.add(new AwardItem(R.drawable., " Philippine Independence", ""));
        mAwardList.add(new AwardItem(R.drawable., " Korea Services United Nations", ""));
        mAwardList.add(new AwardItem(R.drawable., " United Nations Medal", ""));
        mAwardList.add(new AwardItem(R.drawable., " Nato Medal Meritorious", ""));
        mAwardList.add(new AwardItem(R.drawable., " Nato Bosnia", ""));
        mAwardList.add(new AwardItem(R.drawable., " Nato Kosovo", ""));
        mAwardList.add(new AwardItem(R.drawable., " Nato Non Article 5", ""));
        mAwardList.add(new AwardItem(R.drawable., " Nato ISAF", ""));
        mAwardList.add(new AwardItem(R.drawable., " Multinational Forces and Observers Medal", ""));
        mAwardList.add(new AwardItem(R.drawable., " Inter American Defense Board Medal", ""));
        mAwardList.add(new AwardItem(R.drawable., " Republic of Vietnam Campaign", ""));
        mAwardList.add(new AwardItem(R.drawable., " Kuwait Liberation Saudi Arabia", ""));
        mAwardList.add(new AwardItem(R.drawable., " Kuwait Liberation Kuwait", ""));
        mAwardList.add(new AwardItem(R.drawable., " Republic of Korea Service", ""));
        mAwardList.add(new AwardItem(R.drawable., " Army Presidential Unit Citation", ""));
        mAwardList.add(new AwardItem(R.drawable., " Navy Marine Corps Presidential Unit Citation", ""));
        mAwardList.add(new AwardItem(R.drawable., " Joint Service Meritorious Unit", ""));
        mAwardList.add(new AwardItem(R.drawable., " Army Valorous Unit Award", ""));
        mAwardList.add(new AwardItem(R.drawable., " Army Meritorious Unit Commendation", ""));
        mAwardList.add(new AwardItem(R.drawable., " Navy Unit Commendation", ""));
        mAwardList.add(new AwardItem(R.drawable., " Air Force Outstanding Unit Award", ""));
        mAwardList.add(new AwardItem(R.drawable., " Coast Guard Unit Commendation", ""));
        mAwardList.add(new AwardItem(R.drawable., " Army Superior Unit Award", ""));
        mAwardList.add(new AwardItem(R.drawable., " Navy Meritorious Unit Commendation", ""));
        mAwardList.add(new AwardItem(R.drawable., " Navy E Ribbon", ""));
        mAwardList.add(new AwardItem(R.drawable., " Air Force Organizational Excellence Award", ""));
        mAwardList.add(new AwardItem(R.drawable., " Coast Guard Meritorious Unit Commendation", ""));
        mAwardList.add(new AwardItem(R.drawable., " Philippines Republic Presidential Unit", ""));
        mAwardList.add(new AwardItem(R.drawable., " Republic of Korea Presidential Unit", ""));
        mAwardList.add(new AwardItem(R.drawable., " Republic of Vietnam Presidential Unit", ""));
    */

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
    public void setButtons(View view){
        switchRibbon = view.findViewById(R.id.switchRibbon);

        switchRibbon.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            ArrayList<String> mRibbonList = new ArrayList<String>();
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(isChecked){
                    System.out.println(mRibbonList);
                } else {
                }
            }
        });
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