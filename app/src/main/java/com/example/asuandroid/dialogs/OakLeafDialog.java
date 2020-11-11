package com.example.asuandroid.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public class OakLeafDialog extends AppCompatDialogFragment {

    private Award2Dialog.ExampleDialogListener listener;
    public static ArrayList<Drawable> toCloset = new ArrayList<>();

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.oak_leaf_menu, container, false);
        return rootView;
    }
}

