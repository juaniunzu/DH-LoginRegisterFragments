package com.example.loginregisterfragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentWelcome extends Fragment {

    private TextView fragmentWelcomeTextView;

    public FragmentWelcome() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_welcome, container, false);

        //enlazo el atributo con el elemento del xml

        fragmentWelcomeTextView = view.findViewById(R.id.fragmentWelcomeTextView);

        //recibo el bundle que viene desde el welcomeActivity
        Bundle bundleDesdeActivity = getArguments();
        //le saco los datos que trae
        String usernameRecibido = bundleDesdeActivity.getString("username");

        fragmentWelcomeTextView.setText(usernameRecibido);

        return view;
    }
}
