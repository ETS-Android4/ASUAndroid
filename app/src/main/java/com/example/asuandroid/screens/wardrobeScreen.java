package com.example.asuandroid.screens;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.asuandroid.R;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.viewpager.widget.ViewPager;

import com.knightly.infinitecycleviewpager.HorizontalInfiniteCycleViewPager;
import com.example.asuandroid.cycleViewerAdapters.HorizontalPagerAdapter;

/**
 * Created by GIGAMOLE on 8/18/16.
 */
public class wardrobeScreen extends Fragment {


    @Override
    public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_wardrobe_screen, container, false);
    }

    @Override
    public void onViewCreated(final View view, @Nullable final Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ViewPager viewPager = (ViewPager) view.findViewById(R.id.wardrobe_main);
        final HorizontalInfiniteCycleViewPager horizontalInfiniteCycleViewPager =
                (HorizontalInfiniteCycleViewPager) view.findViewById(R.id.carousel);
        horizontalInfiniteCycleViewPager.setAdapter(new HorizontalPagerAdapter(getContext()));

        view.findViewById(R.id.btn_back_to_main).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(wardrobeScreen.this)
                        .navigate(R.id.action_wardrobeScreen_to_HomeScreen);
            }
        });

//        horizontalInfiniteCycleViewPager.setScrollDuration(400);
//        horizontalInfiniteCycleViewPager.setPageDuration(1000);
//        horizontalInfiniteCycleViewPager.setInterpolator(
//                AnimationUtils.loadInterpolator(getContext(), android.R.anim.overshoot_interpolator)
//        );
//        horizontalInfiniteCycleViewPager.setMediumScaled(false);
//        horizontalInfiniteCycleViewPager.setMaxPageScale(0.8F);
//        horizontalInfiniteCycleViewPager.setMinPageScale(0.5F);
//        horizontalInfiniteCycleViewPager.setCenterPageScaleOffset(30.0F);
//        horizontalInfiniteCycleViewPager.setMinPageScaleOffset(5.0F);
//        horizontalInfiniteCycleViewPager.setOnInfiniteCyclePageTransformListener();

//        horizontalInfiniteCycleViewPager.setCurrentItem(
//                horizontalInfiniteCycleViewPager.getRealItem() + 1
//        );
    }
}
