package com.example.loginregisterfragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentFormulario extends Fragment {

    private FragmentFormularioListener listener;

    private EditText fragmentFormularioEditTextUsername;
    private EditText fragmentFormularioEditTextPassword;
    private Button fragmentFormularioButtonLogin;

    public FragmentFormulario() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_formulario, container, false);

        fragmentFormularioEditTextUsername = view.findViewById(R.id.fragmentFormularioEditTextUsername);
        fragmentFormularioEditTextPassword = view.findViewById(R.id.fragmentFormularioEditTextPassword);
        fragmentFormularioButtonLogin = view.findViewById(R.id.fragmentFormularioButtonLogin);

        fragmentFormularioButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editTextVacio(fragmentFormularioEditTextUsername.getText().toString()) || editTextVacio(fragmentFormularioEditTextPassword.getText().toString())){
                    Toast.makeText(getContext(), "Verifique los datos ingresados", Toast.LENGTH_SHORT).show();
                } else {
                    listener.recibirDatosFragmentFormulario(fragmentFormularioEditTextUsername.getText().toString(), fragmentFormularioEditTextPassword.getText().toString());
                }
            }
        });

        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        this.listener = (FragmentFormularioListener) context;

    }

    public Boolean editTextVacio(String campo){
        return campo.isEmpty();
    }

    public interface FragmentFormularioListener{
        void recibirDatosFragmentFormulario(String username, String password);
    }
}
