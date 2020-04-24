package com.example.loginregisterfragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //creo manager
        FragmentManager fragmentManager = getSupportFragmentManager();

        //creo fragment
        Fragment fragmentFormularioAPegar = new FragmentFormulario();

        //creo transaction
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        //pego fragment
        fragmentTransaction.replace(R.id.activityMainFragmentContainer, fragmentFormularioAPegar);

        //commiteo
        fragmentTransaction.commit();

    }
}
