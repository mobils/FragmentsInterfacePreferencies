package com.example.fragmentsinterface;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.preference.PreferenceManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Fragment1.onElMeuBotoListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inflo fragment just començada l'activitat, es podria fer amb un botó que al clicar ho infli.

        FragmentManager fm = getSupportFragmentManager();
        if (fm.findFragmentById(R.id.contenidor) == null) { // OPCIONAL comprova si hi ha un fragment
            Fragment1 fragment1 = new Fragment1();
            fm.beginTransaction().replace(R.id.contenidor, fragment1).commit();// o .replace si vol substituir o afegir
        }


        //PreferenceManager.setDefaultValues(this, R.xml.root_preferences, false);






        /* Pas 1: Crear un SettingsFragment
        2. adaptar el root_preference.xml al que vulguem
        3. Crear un EmptyActivity (li hem posat de nom que infli el SettingsFragment al onCreate
        4. Cridar amb un Intent al Activity anterior (això es pot fer amb menu o amb botó)
         */

        //TODO: Ficar dins d'un menu o sino dins d'un botó




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);

        //Mostra el menu.

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
         super.onOptionsItemSelected(item);

        //Quan cliques al menu ve aquí.
        //el intent que crida el Settings Activity

        //Mostrar els settings:
        Intent i = new Intent(this, SettingsActivity.class);
        startActivity(i);

        return true;
    }








    @Override
    public void onElMeuBoto(String text) {
        //TODO: Recuperar el text i mostra-ho

        TextView nomRecuperat = findViewById(R.id.nomRecuperat);
        nomRecuperat.setText( nomRecuperat.getText() + text);

    }
}