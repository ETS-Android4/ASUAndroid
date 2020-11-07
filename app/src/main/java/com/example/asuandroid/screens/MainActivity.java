package com.example.asuandroid.screens;
import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.AlertDialog;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.DialogInterface;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.example.asuandroid.R;
import com.example.asuandroid.outfitAdapters.AwardAdapter;
import com.example.asuandroid.outfitfragments.AwardFragment;
import com.example.asuandroid.outfitfragments.AwardItem;
import com.zoomage.ZoomageView;

import static android.app.ActionBar.DISPLAY_SHOW_CUSTOM;


public class MainActivity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener{
    public ArrayList<String> fromSpinner;
    private ZoomageView demoView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Toolbar myToolbar = (Toolbar) findViewById(R.id.tool_bar);
        //setSupportActionBar(myToolbar);
        setContentView(R.layout.activity_main);
        //demoView = findViewById(R.id.myZoomageView);

        fromSpinner = NewUniformPromptFragment.spinnerAr;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    //zoomage
    public void onCheckedChanged(final CompoundButton buttonView, final boolean isChecked) {
        switch (buttonView.getId()) {
            case R.id.zoomable:
                demoView.setZoomable(isChecked);
                break;
            case R.id.translatable:
                demoView.setTranslatable(isChecked);
                break;
            case R.id.restrictBounds:
                demoView.setRestrictBounds(isChecked);
                break;
            case R.id.animateOnReset:
                demoView.setAnimateOnReset(isChecked);
                break;
            case R.id.autoCenter:
                demoView.setAutoCenter(isChecked);
                break;
        }
    }

    //Zoomage
    @Override
    public void onClick(final View v) {
        if (v.getId() == R.id.reset) {
            demoView.reset();
        }
        else {
            showResetOptions();
        }
    }
    //Zoomage
    private void showResetOptions() {
        CharSequence[] options = new CharSequence[]{"Under", "Over", "Always", "Never"};

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setItems(options, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(final DialogInterface dialog, final int which) {
                demoView.setAutoResetMode(which);
            }
        });
        builder.create().show();
    }
}

