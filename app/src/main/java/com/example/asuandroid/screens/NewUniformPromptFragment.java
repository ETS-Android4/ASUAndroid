package com.example.asuandroid.screens;

import android.content.Context;
import android.os.Bundle;
import com.google.gson.Gson;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.navigation.fragment.NavHostFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.io.Serializable;


import com.example.asuandroid.R;

import java.util.ArrayList;

import kotlin.text.UStringsKt;


public class NewUniformPromptFragment extends Fragment implements AdapterView.OnItemSelectedListener, Serializable {
    public static ArrayList<String> spinnerAr = new ArrayList<String>();
    private FragmentNewUniformPromptListener listener;
    public interface FragmentNewUniformPromptListener {
        void onInputNewUniformPromptSent(ArrayList<String> input);
    }
    @Nullable
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
       View view = inflater.inflate(R.layout.fragment_new_uniform_prompt, container, false);


       //rankSpinner
       Spinner rankSpinner = (Spinner) view.findViewById(R.id.rankSpinner);
       rankSpinner.setOnItemSelectedListener(this);
       ArrayAdapter<CharSequence> rankadapter = ArrayAdapter.createFromResource(getActivity(), R.array.ranks_array, android.R.layout.simple_spinner_item);
       rankadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
       rankSpinner.setAdapter(rankadapter);

       //branchSpinner
        Spinner branchSpinner = (Spinner) view.findViewById(R.id.spinnerBranch);
        branchSpinner.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> branchadapter = ArrayAdapter.createFromResource(getActivity(), R.array.branch_array, android.R.layout.simple_spinner_item);
        branchadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        branchSpinner.setAdapter(branchadapter);

       //genderSpinner
        Spinner genderSpinner = (Spinner) view.findViewById(R.id.spinnerGender);
        genderSpinner.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> genderadapter = ArrayAdapter.createFromResource(getActivity(), R.array.gender_array, android.R.layout.simple_spinner_item);
        branchadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genderSpinner.setAdapter(genderadapter);

        //yearsSpinner
        Spinner yearsSpinner = (Spinner) view.findViewById(R.id.yearsSpinner);
        yearsSpinner.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> yearsadapter = ArrayAdapter.createFromResource(getActivity(), R.array.years_array, android.R.layout.simple_spinner_item);
        branchadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        yearsSpinner.setAdapter(yearsadapter);

        return view;
    }


    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)
        switch (parent.getId()) {
            case R.id.rankSpinner:
                String ranksText = parent.getItemAtPosition(pos).toString();
                spinnerAr.add(ranksText);
                break;
            case R.id.spinnerBranch:
                String branchText = parent.getItemAtPosition(pos).toString();
                spinnerAr.add(branchText);
                break;
            case R.id.spinnerGender:
                String genderText = parent.getItemAtPosition(pos).toString();
                spinnerAr.add(genderText);
                break;
        }
    }
    public ArrayList<String> getSpinnerAr(Bundle savedInstanceState){
        return spinnerAr;
    }

    public void onNothingSelected(AdapterView<?> parent){
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}