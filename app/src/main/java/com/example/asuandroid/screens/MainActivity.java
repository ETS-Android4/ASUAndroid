package com.example.asuandroid.screens;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;


import android.content.DialogInterface;
import android.widget.CompoundButton;

import com.example.asuandroid.R;

import com.example.asuandroid.dialogs.Award2Dialog;
import com.zoomage.ZoomageView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, Award2Dialog.ExampleDialogListener {
    public ArrayList<String> fromSpinner;
    private ZoomageView demoView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Toolbar myToolbar = (Toolbar) findViewById(R.id.tool_bar);
        //setSupportActionBar(myToolbar);
        setContentView(R.layout.activity_main);
        demoView = findViewById(R.id.myZoomageView);
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
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

    @Override
    public void applyTexts(String username, String password) {

    }
}

