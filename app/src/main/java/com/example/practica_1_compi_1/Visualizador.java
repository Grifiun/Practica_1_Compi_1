package com.example.practica_1_compi_1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.FragmentResultListener;

import java.io.StringReader;
import com.example.gramatica.exercise;
import com.example.gramatica.parser;

public class Visualizador extends Fragment {
    private TextView txtResultado;
    private Button button2;
    public Visualizador(){

        System.out.println("\nSe crea nuevo fragmento de visualizador");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Recibbimos los datos enviados
        System.out.println("\nse reciben datos\n");

        getParentFragmentManager().setFragmentResultListener("key", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
                String txtEntradaDatos;
                txtEntradaDatos = result.getString("txtEntradaDatos");
                txtResultado.setText(txtEntradaDatos);

                try {
                    StringReader sr = new StringReader(txtEntradaDatos);
                    exercise lexico = new exercise(sr);
                    parser pars = new parser(lexico);

                    pars.parse();
                } catch (Exception ex) {
                    System.out.println("Error irrecuperrable");
                }
            }
        });
        //txtResultado.setText("dato recibido: ");

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_visualizador, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //button2 = view.findViewById(R.id.button2);
        txtResultado = view.findViewById(R.id.txtResultado);
        //Accion del boton
        /*
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //getParentFragmentManager().setFragmentResult();
                txtResultado.setText(" cf");
            }
        });*/

    }
}