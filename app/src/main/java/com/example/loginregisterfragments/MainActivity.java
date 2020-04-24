package com.example.loginregisterfragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragmentFormulario.FragmentFormularioListener {

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

    @Override
    public void recibirDatosFragmentFormulario(String username, String password) {
        Intent mainAWelcome = new Intent(MainActivity.this, WelcomeActivity.class);
        Bundle datosAWelcome = new Bundle();
        datosAWelcome.putString("username", username);
        datosAWelcome.putString("password", password);
        mainAWelcome.putExtras(datosAWelcome);
        startActivity(mainAWelcome);
    }
}
