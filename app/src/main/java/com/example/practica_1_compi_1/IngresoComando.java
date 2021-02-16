package com.example.practica_1_compi_1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class IngresoComando extends Fragment {
    private EditText txtEntradaDatos;
    private Button btnDibujar;
    public IngresoComando() {
            System.out.println("\nSe crea nuevo fragmento de ingreso");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_ingreso_comando, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        txtEntradaDatos = view.findViewById(R.id.txtEntradaDatos);
        btnDibujar = view.findViewById(R.id.btnDibujar);
        //Accion del boton
        btnDibujar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle datosEnviar = new Bundle();
                datosEnviar.putString("txtEntradaDatos", txtEntradaDatos.getText().toString().trim());
                //Empaquetamos la informacion
                getParentFragmentManager().setFragmentResult("key", datosEnviar);
                txtEntradaDatos.setText("Dato enviado: " + datosEnviar.getString("txtEntradaDatos"));


            }
        });
    }
}