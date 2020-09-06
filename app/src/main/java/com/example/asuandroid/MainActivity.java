package com.example.asuandroid;
import android.os.Bundle;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HomeScreen fragment1 = new HomeScreen();
        getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment1).commit();
        NewUniformPrompt NewUniformPrompt = new NewUniformPrompt();
    }
}
