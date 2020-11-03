package com.example.asuandroid.screens;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.asuandroid.R;

public class HomeScreen extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
            //final Context contextThemeWrapper = new ContextThemeWrapper(getActivity(), R.styles.yourCustomTheme);
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_screen, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ImageView rocketImage = (ImageView) view.findViewById(R.id.ribbonAnim);
        rocketImage.setBackgroundResource(R.drawable.ribbon_anim);
        AnimationDrawable rocketAnimation = (AnimationDrawable) rocketImage.getBackground();

        view.findViewById(R.id.btn_gotoFragment2).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                NavHostFragment.findNavController(HomeScreen.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });
        view.findViewById(R.id.btn_gotoCloset).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                NavHostFragment.findNavController(HomeScreen.this)
                        .navigate(R.id.action_HomeScreen_to_wardrobeScreen);
            }
        });
        view.findViewById(R.id.ribbonAnim).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                rocketAnimation.start();
            }
        });

    }
}