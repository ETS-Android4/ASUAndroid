package com.example.asuandroid.outfitfragments;

import android.graphics.drawable.AnimationDrawable;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.content.ContextCompat;
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


import static com.stanko.tools.ResHelper.getDrawable;

public class AwardFragment extends Fragment {
    private ArrayList<AwardItem> mAwardList;
    private AwardAdapter mRecyclerViewAdapter;
    private RecyclerView mRecyclerView;
    public SwitchCompat switchRibbon;
    public static ArrayList<String> ribbonImages = new ArrayList<String>();
    ImageView ribbonAdd;

    public void addRibbon(Integer ribbon){
    }



    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        createAwardList();
        //buildRecyclerView(container.findViewById(R.id.recyclerView));
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_award, container, false);
        final FragmentActivity c = getActivity();
        final RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recyclerViewAward);
        AwardAdapter mAdapter = new AwardAdapter(mAwardList);
        ImageView rocketImage = (ImageView) view.findViewById(R.id.img_addRibbon);
        LinearLayoutManager layoutManager = new LinearLayoutManager(c);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mAdapter);
        mAdapter.setOnItemClickListener(new AwardAdapter.OnItemClickListener() {
            @Override
            public void onAddRibbonClick(String ribbon, int position) {
                assert c != null;
                ribbonImages.add(ribbon);
            }
        });
        return view;
    }

    public void createAwardList() {
        mAwardList = new ArrayList<>();
        mAwardList.add(new AwardItem(R.drawable.ic_distinguished_service_cross_ribbon, " Army Distinguished Service Cross", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_medal_of_honor_ribbon, "Medal of Honor", "Dixon", R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_distinguished_service_cross_ribbon, " Army Distinguished Service Cross", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_defense_distinguished_service_medal_ribbon, " Defense Distinguished Service", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_homeland_security_distinguished_service_medal_ribbon, " Homeland Security Distinguished Service Medal", "",R.drawable.ic_frame00));

        mAwardList.add(new AwardItem(R.drawable.ic_army_distinguished_service_medal_ribbon, " Army Distinguished Service", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_army_silver_star_medal_ribbon, " Silver Star", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_defense_superior_service_medal_ribbon, " Defense Superior Service", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_legion_of_merit_ribbon, " Legion of Merit", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_distinguished_flying_cross_ribbon, " Distinguished Flying Cross", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_soldiers_medal_ribbon, " Soldiers Medal", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_bronze_star_medal_ribbon, " Bronze Star", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_purple_heart_ribbon, " Purple Heart", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_defense_meritorious_service_medal_ribbon, " Defense Meritorious Service", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_meritorious_service_medal_ribbon, " Meritorious Service", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_air_medal_ribbon, " Air Medal", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_joint_service_commendation_medal_ribbon, " Joint Service Commendation", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_army_commendation_medal_ribbon, " Army Commendation", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_joint_service_achievement_medal_ribbon, " Joint Service Achievement", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_army_achievement_medal_ribbon, " Army Achievement", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_army_presidential_unit_citation, " Army Presidential Unit Citation", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_joint_meritorious_unit_award_ribbon, " Joint Service Meritorious Unit", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_valorous_unit_award_ribbon, " Army Valorous Unit Award", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_meritorious_unit_commendation_ribbon, " Army Meritorious Unit Commendation", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_army_superior_unit_award_ribbon, " Army Superior Unit Award", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_prisoner_of_war_medal_ribbon, " Prisoner of War", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_army_good_conduct_medal_ribbon, " Army Good Conduct", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_army_reserve_components_achievement_medal_ribbon, " Army Reserve Components Achievement", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_american_defense_service_medal_ribbon, " American Defense Service", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_american_campaign_medal_ribbon, " American Campaign", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_asiatic_pacific_campaign_medal_ribbon, " Asiatic Pacific Service", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_european_african_middle_eastern_campaign_ribbon, " European African Middle Eastern Campaign Medal", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_world_war_ii_victory_medal_ribbon, " World War II Victory Medal", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_army_of_occupation_ribbon, " Army Occupation", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_medal_for_humane_action_ribbon, " Humane Action", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_national_defense_service_medal_ribbon, " National Defense Service Medal", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_korean_service_medal_ribbon, " Korea Service Medal", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_antarctica_service_medal_ribbon, " Antarctica Service", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_armed_forces_expeditionary_medal_ribbon, " Armed Forces Expeditionary Medal", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_vietnam_service_medal_ribbon, " Vietnam Service Medal", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_southwest_asia_service_medal_ribbon, " Southwest Asia Service Medal", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_kosovo_campaign_medal_ribbon, " Kosovo Campaign Medal", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_afghanistan_campaign_medal_ribbon, " Afghanistan Campaign Medal", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_iraq_campaign_medal_ribbon, " Iraq Campaign Medal", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_inherent_resolve_campaign_medal_ribbon, " Inherent Resolve Campaign Medal", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_global_war_on_terrorism_expeditionary_medal_ribbon, " Global War on Terrorism Expeditionary", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_global_war_on_terrorism_service_medal_ribbon, " Global War Terrorism Service", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_korea_defense_service_medal_ribbon, " Korea Defense Service Medal", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_armed_forces_service_medal_ribbon, " Armed Forces Service", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_humanitarian_service_medal_ribbon, " Humanitarian Service Medal", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_us_army_sea_duty_ribbon, " Army Sea Duty", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_armed_forces_reserve_medal_ribbon, " Armed Forces Reserve", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_non_commissioned_officer_professional_development_ribbon, " NCO Professional Development", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_army_service_ribbon, " Army Service", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_navy_arctic_service_ribbon, " Arctic Service", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_army_overseas_service_ribbon, " Army Overseas Service", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable.ic_army_reserve_overseas_training_ribbon, " Army Reserve Componenets Overseas", "",R.drawable.ic_frame00));
        /*mAwardList.add(new AwardItem(R.drawable.ic_vietnam_gallantry_cross_unit_award_wpalm, " Vietnam Gallantry Cross", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable., " Vietnam Armed Forces Honor 1C", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable., " Vietnam Armed Forces Honor 2C", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable., " Vietnam Civil Action 1C", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable., " Vietnam Civil Action 2C", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable., " Philippines Republic Presidential Unit Citation", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable., " Republic of Korea Presidential Unit Citation", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable., " Republic of Vietnam Presidential Unit Citation", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable., " Republic of Vietnam Gallantry Cross Unit Citation", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable., " Republic of Vietnam Civil Action", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable., " Philippine Defence", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable., " Philippine Liberation", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable., " Philippine Independence", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable., " Korea Services United Nations", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable., " United Nations Medal", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable., " Nato Medal Meritorious", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable., " Nato Bosnia", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable., " Nato Kosovo", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable., " Nato Non Article 5", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable., " Nato ISAF", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable., " Multinational Forces and Observers Medal", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable., " Inter American Defense Board Medal", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable., " Republic of Vietnam Campaign", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable., " Kuwait Liberation Saudi Arabia", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable., " Kuwait Liberation Kuwait", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable., " Republic of Korea Service", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable., " Army Presidential Unit Citation", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable., " Navy Marine Corps Presidential Unit Citation", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable., " Joint Service Meritorious Unit", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable., " Army Valorous Unit Award", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable., " Army Meritorious Unit Commendation", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable., " Navy Unit Commendation", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable., " Air Force Outstanding Unit Award", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable., " Coast Guard Unit Commendation", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable., " Army Superior Unit Award", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable., " Navy Meritorious Unit Commendation", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable., " Navy E Ribbon", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable., " Air Force Organizational Excellence Award", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable., " Coast Guard Meritorious Unit Commendation", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable., " Philippines Republic Presidential Unit", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable., " Republic of Korea Presidential Unit", "",R.drawable.ic_frame00));
        mAwardList.add(new AwardItem(R.drawable., " Republic of Vietnam Presidential Unit", "",R.drawable.ic_frame00));
*/
    }

    /*

    public void ribbonAnim(int position, View view) {
        mAwardList.get(position).changeImage(position, view.findViewById(R.id.img_addRibbon));
    }
*/

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //back to outfit prompt
        view.findViewById(R.id.btn_badge_to_prompt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(ribbonImages);
                NavHostFragment.findNavController(AwardFragment.this)
                        .navigate(R.id.action_awardFragment_to_uniformFragment);
            }
        });
    }
}