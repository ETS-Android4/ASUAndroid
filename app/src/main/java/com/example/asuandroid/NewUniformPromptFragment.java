package com.example.asuandroid;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.content.Intent;

import android.content.Context;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.lang.reflect.Array;
import java.util.ArrayList;


public class NewUniformPromptFragment extends Fragment implements AdapterView.OnItemSelectedListener {
    public ArrayList<String> spinnerAr = new ArrayList<String>();
    private FragmentNewUniformPromptListener listener;

    public interface FragmentNewUniformPromptListener {
        void onInputNewUniformPromptSent(ArrayList<String> input);
    }
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

        view.findViewById(R.id.btn_tothirdFragment).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick (View view){
                    ArrayList<String> input = spinnerAr;
                    NavHostFragment.findNavController(NewUniformPromptFragment.this)
                            .navigate(R.id.action_second_fragment_to_third);
                    //listener.onInputNewUniformPromptSent(input);
                }
            }
        );
        return view;
    }
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)
        switch (parent.getId()) {
            case R.id.rankSpinner:
                String ranksText = parent.getItemAtPosition(pos).toString();
                spinnerAr.add(ranksText);
                Toast.makeText(parent.getContext(), ranksText, Toast.LENGTH_SHORT).show();
                break;
            case R.id.spinnerBranch:
                String branchText = parent.getItemAtPosition(pos).toString();
                spinnerAr.add(branchText);
                Toast.makeText(parent.getContext(), branchText, Toast.LENGTH_SHORT).show();
                break;
            case R.id.spinnerGender:
                String genderText = parent.getItemAtPosition(pos).toString();
                spinnerAr.add(genderText);
                Toast.makeText(parent.getContext(), genderText, Toast.LENGTH_SHORT).show();
                break;
        }
    }
    public void updateSpinnerValues(String spinnerValue){
        spinnerAr.add(spinnerValue);
    }


    public void onNothingSelected(AdapterView<?> parent){
    }


    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.button_second).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(NewUniformPromptFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
            }
        });
    }
}