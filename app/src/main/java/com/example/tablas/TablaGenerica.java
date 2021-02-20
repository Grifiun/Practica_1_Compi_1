package com.example.tablas;

import android.content.Context;
import android.view.Gravity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Tabla generica, que recibe parametros y agrega titulos y datos
 */
public class TablaGenerica {

    private TableLayout tabla;
    private Context context;
    private String[] encabezado;
    private ArrayList<String[]> datos;
    private TableRow filaTabla;
    private TextView celda;

    private boolean multiColor = false;
    int firtColor, secondColor, textColor, colorLinea;

    /**
     * Obtenemos el contexto y la tabla
     * @param tabla
     * @param context
     */
    public TablaGenerica(TableLayout tabla, Context context) {
        this.tabla = tabla;
        this.context = context;
    }

    private void crearNuevaCelda() {
        celda = new TextView(context);
        //centramos
        celda.setGravity(Gravity.CENTER);
        //tamano
        celda.setTextSize(15);
    }

    /**
     * creamos una nueva fila en la tabla
     */
    private void crearNuevaFila(){
        filaTabla = new TableRow(context);
    }

    /**
     * Agregamos los titulos del encabezado
     */
    private void agregarEncabezado() {
        int i = 0;
        crearNuevaFila();
        while (i < encabezado.length) {
            crearNuevaCelda();
            celda.setText(encabezado[i++]);
            //Agregamos una fila, y cada celda del encabezado de las filas
            filaTabla.addView(celda, parametrosFilaTabla());
        }
        tabla.addView(filaTabla);
    }

    private void agregarDatosTabla() {
        String valorCelda;
        for (int i = 1; i <= datos.size(); i++) {
            crearNuevaFila();

            for (int j = 0; j < encabezado.length; j++) {
                crearNuevaCelda();
                String[] row = datos.get(i - 1);
                //Agregamos el valor de la columna en la fila actual
                valorCelda = row[j];
                celda.setText(valorCelda);
                filaTabla.addView(celda, parametrosFilaTabla());
            }
            tabla.addView(filaTabla);

        }
    }

    /**
     * Setter del encabezado
     * @param encabezado
     */
    public void setEncabezado(String[] encabezado) {
        this.encabezado = encabezado;
        agregarEncabezado();
    }

    /**
     * setter de los datos de la tabla
     * @param datos
     */
    public void setDatos(ArrayList<String[]> datos) {
        this.datos = datos;
        agregarDatosTabla();
    }

    private TableRow.LayoutParams parametrosFilaTabla() {
        TableRow.LayoutParams params = new TableRow.LayoutParams();
        //Agregamos el margen
        params.setMargins(3, 3, 3, 3);
        params.weight = 1;
        return params;

    }


}
