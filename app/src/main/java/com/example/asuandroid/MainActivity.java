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
import androidx.fragment.app.FragmentTransaction;


public class MainActivity extends AppCompatActivity {

    Spinner spinner;

    HomeScreen HomeScreen;
    NewUniformPrompt NewUniformPrompt;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.rankSpinner);

        HomeScreen = new HomeScreen();
        NewUniformPrompt = new NewUniformPrompt();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this,
                R.layout.fragment_new_uniform_prompt);
                getResources().getStringArray(R.array.fragments);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                switch(i){
                    case 0:
                        break;
                    case 1:
                        break;
                }
            }
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
    public void setFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_frame, fragment);
        fragmentTransaction.commit();
    }

}
