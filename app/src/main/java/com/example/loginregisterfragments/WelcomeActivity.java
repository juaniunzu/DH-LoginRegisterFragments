package com.example.loginregisterfragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        //creo manager
        FragmentManager fragmentManager = getSupportFragmentManager();

        //creo fragment
        Fragment fragmentWelcomeAPegar = new FragmentWelcome();

        //creo transaction
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        //pego fragment
        fragmentTransaction.replace(R.id.activityWelcomeFragmentContainer, fragmentWelcomeAPegar);

        //commiteo
        fragmentTransaction.commit();
    }
}
