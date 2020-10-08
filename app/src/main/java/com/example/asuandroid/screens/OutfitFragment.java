package com.example.asuandroid.screens;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.fragment.NavHostFragment;
import com.example.asuandroid.R;
import java.util.ArrayList;


public class OutfitFragment extends Fragment {

    public ArrayList<String> fromSpinner;

    public void getSpinnerAr(Bundle savedInstanceBundle){
        super.onCreate(savedInstanceBundle);
        fromSpinner = NewUniformPromptFragment.spinnerAr;
        System.out.println(fromSpinner);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_uniform, container, false);
    }
    //prompt to awards
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.btn_ribbons).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(OutfitFragment.this)
                        .navigate(R.id.action_uniformFragment_to_awardFragment);

            }
        });
        view.findViewById(R.id.btn_badges).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(OutfitFragment.this)
                        .navigate(R.id.action_uniformFragment_to_badgeFragment);
            }
        });
        view.findViewById(R.id.btn_combatService).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(OutfitFragment.this)
                        .navigate(R.id.action_uniformFragment_to_combatServiceFragment);
            }
        });
        view.findViewById(R.id.btn_overseas).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(OutfitFragment.this)
                        .navigate(R.id.action_uniformFragment_to_overSeasServiceFragment);
            }
        });
        view.findViewById(R.id.btn_serviceStripes).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(OutfitFragment.this)
                        .navigate(R.id.action_uniformFragment_to_serviceStripes);
            }
        });
        view.findViewById(R.id.btn_insignia).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(OutfitFragment.this)
                        .navigate(R.id.action_uniformFragment_to_regimentalInsigniaFragment);
            }
        });
        view.findViewById(R.id.btn_identificationbadge).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(OutfitFragment.this)
                        .navigate(R.id.action_uniformFragment_to_identificationBadgeFragment);
            }
        });
        view.findViewById(R.id.btn_build_uniform).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NavHostFragment.findNavController(OutfitFragment.this)
                        .navigate(R.id.action_uniformFragment_to_uniformPresentationFragment);
                getSpinnerAr(savedInstanceState);
            }

        });
    }
}