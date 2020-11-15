package com.example.asuandroid.screens;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.example.asuandroid.R;
import com.example.asuandroid.cycleViewerAdapters.HorizontalPagerAdapter;
import com.example.asuandroid.cycleViewerAdapters.UniformPagerAdapter;
import com.knightly.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;
import com.zoomage.ZoomageView;

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
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.uniform_mechanism);
        final HorizontalInfiniteCycleViewPager horizontalInfiniteCycleViewPager =
                (HorizontalInfiniteCycleViewPager) view.findViewById(R.id.carousel_uniform_mechanism);
        horizontalInfiniteCycleViewPager.setAdapter(new UniformPagerAdapter(getContext()));
        view.findViewById(R.id.btn_continue_to_award).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(OutfitFragment.this)
                        .navigate(R.id.action_uniformFragment_to_awardFragment);
                getSpinnerAr(savedInstanceState);
            }
        });
    }
}