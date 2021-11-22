package com.example.fragmentsinterface;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        //Només servirà per inflar el SettingsFragment.

        FragmentManager fm = getSupportFragmentManager();
        if (fm.findFragmentById(R.id.contenidorSettingsFragment) == null) { // OPCIONAL comprova si hi ha un fragment
            SettingsFragment sFragment = new SettingsFragment();
            fm.beginTransaction().replace(R.id.contenidorSettingsFragment, sFragment).commit();
        }

    }
}