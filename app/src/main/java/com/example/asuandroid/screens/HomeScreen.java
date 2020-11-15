package com.example.asuandroid.screens;

import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.asuandroid.R;
import com.example.asuandroid.dialogs.Award2Dialog;

import java.util.ArrayList;

public class HomeScreen extends Fragment {
    public static ArrayList<Drawable> toCloset = Award2Dialog.toCloset;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
            //final Context contextThemeWrapper = new ContextThemeWrapper(getActivity(), R.styles.yourCustomTheme);
    ) {
        System.out.println(toCloset);
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_screen, container, false);

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.btn_gotoFragment2).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                NavHostFragment.findNavController(HomeScreen.this)
                        .navigate(R.id.action_HomeScreen_to_OufitFragment);
            }
        });
        view.findViewById(R.id.btn_gotoCloset).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                NavHostFragment.findNavController(HomeScreen.this)
                        .navigate(R.id.action_HomeScreen_to_wardrobeScreen);
            }
        });

    }
}