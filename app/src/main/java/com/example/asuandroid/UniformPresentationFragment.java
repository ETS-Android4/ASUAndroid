package com.example.asuandroid;

import android.content.Context;
import android.os.Bundle;
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
import java.util.ArrayList;



public class UniformPresentationFragment extends Fragment {

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        //SubsamplingScaleImageView imageView = (SubsamplingScaleImageView)findViewById(id.imageView);
        //imageView.setImage(ImageSource.resource(R.drawable.pylon));
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.btn_return_home).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(UniformPresentationFragment.this)
                        .navigate(R.id.action_uniformPresentationFragment_to_HomeScreen);
            }
        });
    }
}