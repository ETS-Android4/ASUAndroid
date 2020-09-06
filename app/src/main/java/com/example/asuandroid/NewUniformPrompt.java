package com.example.asuandroid;

import android.app.Activity;
import android.os.Bundle;

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

import java.lang.reflect.Array;


public class NewUniformPrompt extends Fragment implements AdapterView.OnItemSelectedListener {
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
        rankSpinner.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> branchadapter = ArrayAdapter.createFromResource(getActivity(), R.array.branch_array, android.R.layout.simple_spinner_item);
        branchadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        branchSpinner.setAdapter(branchadapter);

       //genderSpinner
        Spinner genderSpinner = (Spinner) view.findViewById(R.id.spinnerGender);
        rankSpinner.setOnItemSelectedListener(this);
        ArrayAdapter<CharSequence> genderadapter = ArrayAdapter.createFromResource(getActivity(), R.array.gender_array, android.R.layout.simple_spinner_item);
        branchadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genderSpinner.setAdapter(genderadapter);
        return view;

    }
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long id){
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)
        String text = parent.getItemAtPosition(pos).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
    }
    public void onNothingSelected(AdapterView<?> parent){
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        view.findViewById(R.id.button_second).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(NewUniformPrompt.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
            }
        });
    }
}