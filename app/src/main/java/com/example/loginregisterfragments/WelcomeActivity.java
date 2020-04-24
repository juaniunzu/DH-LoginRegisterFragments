package com.example.loginregisterfragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        //recibo el intent del main
        Intent desdeMain = getIntent();
        //obtengo bundle que contiene
        Bundle datosDesdeMain = desdeMain.getExtras();

        //creo manager
        FragmentManager fragmentManager = getSupportFragmentManager();

        //creo fragment
        Fragment fragmentWelcomeAPegar = new FragmentWelcome();
        //creo transaction
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        //le agrego bundle recibido al fragment recien creado, ANTES DE PEGARLO EN LA ACTIVIDAD
        fragmentWelcomeAPegar.setArguments(datosDesdeMain);

        //pego fragment e inicio
        fragmentTransaction.replace(R.id.activityWelcomeFragmentContainer, fragmentWelcomeAPegar);
        fragmentTransaction.commit();
    }
}
