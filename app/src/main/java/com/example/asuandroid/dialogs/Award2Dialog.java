package com.example.asuandroid.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.asuandroid.R;
import com.example.asuandroid.outfitfragments.Award2Fragment;
import com.example.asuandroid.outfitfragments.AwardFragment;
import com.zoomage.ZoomageView;

import java.util.ArrayList;

public class Award2Dialog extends AppCompatDialogFragment {

    private ExampleDialogListener listener;
    public static ArrayList<Drawable> toCloset = new ArrayList<>();

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.fragment_award_dialog, null);
        ZoomageView zoomageView = view.findViewById(R.id.myZoomageView);
        zoomageView.setDrawableResource(Award2Fragment.bitmapDrawableArray.get(0));
        Button saveRack = view.findViewById(R.id.btn_saveRackToCloset);
        Button home = view.findViewById(R.id.btn_backToAward2);
        Button saveForUniform = view.findViewById(R.id.btn_useForUniform);
        builder.setView(view)
            .setTitle("Ribbon Rack");
        saveRack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toCloset.add(Award2Fragment.bitmapDrawableArray.get(0));
                Award2Fragment.bitmapDrawableArray.removeAll(Award2Fragment.bitmapDrawableArray);
                System.out.println(toCloset);
                NavHostFragment.findNavController(Award2Dialog.this)
                    .navigate(R.id.action_award2Dialog2_to_HomeScreen);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Award2Fragment.bitmapDrawableArray.removeAll(Award2Fragment.bitmapDrawableArray);
                NavHostFragment.findNavController(Award2Dialog.this)
                    .navigate(R.id.action_award2Dialog2_to_award2Fragment);
            }
        });
        return builder.create();
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            listener = (ExampleDialogListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() +
                    "must implement ExampleDialogListener");
        }
    }
    public interface ExampleDialogListener {
        void applyTexts(String username, String password);
    }
}
