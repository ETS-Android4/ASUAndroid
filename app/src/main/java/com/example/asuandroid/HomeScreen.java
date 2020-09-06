package com.example.asuandroid;

import android.os.Bundle;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class HomeScreen extends Fragment implements View.OnClickListener {
    Button btn_gotoFragment2;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home_screen, container, false);

        btn_gotoFragment2 = getView().findViewById(R.id.action_FirstFragment_to_SecondFragment);
        btn_gotoFragment2.setOnClickListener(this);

        return view;
    }
    @Override
    public void onClick(View view) {
        Navigation.findNavController(view).navigate(R.id.action_FirstFragment_to_SecondFragment);
    }
}