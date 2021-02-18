package com.example.practica_1_compi_1;

import android.content.Context;
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


import com.example.DAO.*;
import com.example.Figuras.GraficarFiguraCirculo;
import com.example.Figuras.GraficarFiguraCuadrado;
import com.example.Figuras.GraficarFiguraLinea;
import com.example.Figuras.GraficarFiguraPoligono;
import com.example.Figuras.GraficarFiguraRectangulo;
import com.example.Figuras.GraficarFigura;
import com.example.gramatica.exercise;
import com.example.gramatica.parser;
import java.io.StringReader;
import java.util.ArrayList;

public class Visualizador extends Fragment {
    private TextView txtTituloFigura;
    private final Context mContext;
    public Visualizador(Context mcontext){
        this.mContext = mcontext;
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
                String txtEntradaDatos = "fdfd";
                txtEntradaDatos = result.getString("txtEntradaDatos");
                System.out.println(txtEntradaDatos);


                ViewGroup parent = (ViewGroup) txtTituloFigura.getParent();
                //Removemos todas las figuras si es que hay

                if(parent.getChildCount() > 1){
                    //Limpiamos todos las figuras, desde la posicion 1 hasta la ultima - 1 porque el titulo tambien se cuenta
                    parent.removeViews(1, parent.getChildCount() - 1);

                }

                try {
                    StringReader sr = new StringReader(txtEntradaDatos);
                    exercise lexico = new exercise(sr);
                    parser pars = new parser(lexico);

                    pars.parse();

                    ArrayList<Figura> listadoFiguras = pars.listadoFiguras;

                    //Graficar
                    for(Figura auxFig: listadoFiguras){
                        System.out.println("Figura: /////");
                        //Instanciamos la clase graficar figura
                        GraficarFigura auxGraficarFigura;

                        if(auxFig.getTipoFigura().equals("rectangulo")){
                            auxGraficarFigura = new GraficarFiguraRectangulo(mContext, auxFig);
                            parent.addView(auxGraficarFigura, parent.getChildCount());
                        }else if(auxFig.getTipoFigura().equals("circulo")){
                            auxGraficarFigura = new GraficarFiguraCirculo(mContext, auxFig);
                            parent.addView(auxGraficarFigura, parent.getChildCount());

                        }else if(auxFig.getTipoFigura().equals("cuadrado")){
                            auxGraficarFigura = new GraficarFiguraCuadrado(mContext, auxFig);
                            parent.addView(auxGraficarFigura, parent.getChildCount());

                        }else if(auxFig.getTipoFigura().equals("linea")){
                            auxGraficarFigura = new GraficarFiguraLinea(mContext, auxFig);
                            parent.addView(auxGraficarFigura, parent.getChildCount());

                        }else if(auxFig.getTipoFigura().equals("poligono")){
                            auxGraficarFigura = new GraficarFiguraPoligono(mContext, auxFig);
                            parent.addView(auxGraficarFigura, parent.getChildCount()+1);

                        }
                    }

                } catch (Exception ex) {
                    System.out.println("Error irrecuperrable: "+ex);
                }


            }
        });


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //FiguraRectangulo figRec = new FiguraRectangulo(mContext);
        return inflater.inflate(R.layout.fragment_visualizador, container, false);
        //return figRec;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //button2 = view.findViewById(R.id.button2);
        txtTituloFigura = view.findViewById(R.id.txtTituloFigura);



    }


}