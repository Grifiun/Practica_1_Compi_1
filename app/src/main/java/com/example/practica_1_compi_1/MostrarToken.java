package com.example.practica_1_compi_1;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TableLayout;

import com.example.gramatica.exercise;
import com.example.gramatica.parser;
import com.example.tablas.TablaGenerica;

import java.io.StringReader;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MostrarToken} factory method to
 * create an instance of this fragment.
 */
public class MostrarToken extends Fragment {
    private Context mContext;
    private TableLayout tabla;
    private Button btnSiguiente;
    private int indexTabla = 0;
    private ArrayList<String[]> encabezados = new ArrayList<>();
    private ArrayList<String[]> datosOperadores = new ArrayList<>();
    private ArrayList<String[]> datosColores = new ArrayList<>();
    private ArrayList<String[]> datosFiguras = new ArrayList<>();
    private ArrayList<String[]> datosAnimacion = new ArrayList<>();

    private ArrayList<String> operadores, colores, figuras, animaciones;

    public MostrarToken(Context mContext) {
        // Required empty public constructor
        this.mContext = mContext;
        System.out.println("\nSe crea nuevo fragmento de mostrar Tokens");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Recibbimos los datos enviados
        System.out.println("\nse reciben datos en el fragment de mostrar tokens\n");

        getParentFragmentManager().setFragmentResultListener("key1", this, new FragmentResultListener() {
            @Override
            public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
                indexTabla = 1;//reseteamos la tabla

                datosOperadores.clear();
                datosColores.clear();
                datosFiguras.clear();
                datosAnimacion.clear();

                operadores = result.getStringArrayList("operadores");//Obtenemos la entrada de datos
                colores = result.getStringArrayList("colores");//Obtenemos la entrada de datos
                figuras = result.getStringArrayList("figuras");//Obtenemos la entrada de datos
                animaciones = result.getStringArrayList("animaciones");//Obtenemos la entrada de datos

                cargarDatosTabla(indexTabla);
            }
        });

    }

    /**
     * Cargamos los datos de la tabla segun su posicion
     * @param indexTabla
     */
    public void cargarDatosTabla(int indexTabla){
        //removemos los datos que tenga la tabla
        tabla.removeAllViews();
        TablaGenerica tabOperador = new TablaGenerica(tabla, mContext);
        tabOperador.setEncabezado(encabezados.get(indexTabla));

        //Cargamos los datos
        switch (indexTabla){
            case 0:
                if(datosOperadores.isEmpty()){//si esta vacio
                    System.out.println("\nCARGA OPERADoRES");
                    datosOperadores = obtenerDatosTabla(operadores);
                }
                tabOperador.setDatos(datosOperadores);
                break;
            case 1:
                if(datosColores.isEmpty()){//si esta vacio
                    System.out.println("\nCARGA colores");
                    datosColores = obtenerDatosTabla(colores);
                }
                tabOperador.setDatos(datosColores);
                break;
            case 2:
                if(datosFiguras.isEmpty()){//si esta vacio
                    System.out.println("\nCARGA figuras");
                    datosFiguras = obtenerDatosTabla(figuras);
                }
                tabOperador.setDatos(datosFiguras);
                break;
            case 3:
                if(datosAnimacion.isEmpty()){//si esta vacio
                    System.out.println("\nCARGA animaciones");
                    datosAnimacion = obtenerDatosTabla(animaciones);
                }
                tabOperador.setDatos(datosAnimacion);
                break;
        }

    }

    public ArrayList<String[]> obtenerDatosTabla(ArrayList<String> listadaoAux){
        ArrayList<String[]> datosAux = new ArrayList<>();
        for(String aux: listadaoAux){//separamos los datos de las animaciones
            String[] auxArrString;
            auxArrString = aux.split("@");//separamos por el signo de arroba
            datosAux.add(auxArrString);
        }
        return datosAux;
    }

    /**
     * Establecemos los encabezados
     */
    public void establecerEncabezados(){
        encabezados.add(new String[] {"Operador", "Fila", "Columna", "Ocurrencia"});
        encabezados.add(new String[] {"Color", "Cantidad de usos"});
        encabezados.add(new String[] {"Objeto", "Cantidad de usos"});
        encabezados.add(new String[] {"Animacion", "Cantidad de usos"});
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mostrar_token, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tabla = view.findViewById(R.id.tabla);
        establecerEncabezados();

        btnSiguiente = view.findViewById(R.id.btnSiguiente);
        //Accion del boton
        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(indexTabla == 3){
                    indexTabla = 0;
                }else{
                    indexTabla++;
                }
                cargarDatosTabla(indexTabla);

            }
        });
    }

}