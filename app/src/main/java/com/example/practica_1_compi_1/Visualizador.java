package com.example.practica_1_compi_1;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Parcelable;
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
    private final String[] listaColors = {"azul", "rojo", "verde", "amarillo", "naranja", "morado", "cafe", "negro"};
    private final String[] listaFigura = {"circulo", "cuadrado", "rectangulo", "linea", "poligono"};
    private final String[] listaAnimaciones = {"curva", "linea"};
    private Bundle datosEnviar = new Bundle();

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
                datosEnviar.clear();//limpiamos los datos
                String txtEntradaDatos = "";
                txtEntradaDatos = result.getString("txtEntradaDatos");//Obtenemos la entrada de datos

                ViewGroup parent = (ViewGroup) txtTituloFigura.getParent();
                //Removemos todas las figuras si es que hay

                if(parent.getChildCount() > 1){
                    //Limpiamos todos las figuras, desde la posicion 1 hasta la ultima - 1 porque el titulo tambien se cuenta
                    parent.removeViews(1, parent.getChildCount() - 1);
                }

                try {
                    //Ejecutamos el lexer
                    StringReader sr = new StringReader(txtEntradaDatos);
                    exercise lexico = new exercise(sr);
                    //ejecutamos el parser
                    parser pars = new parser(lexico);
                    pars.parse();

                    //Preparamos los datos de las tablas
                    prepararDatosTabla(lexico.obtenerListadoTokens());
                    //preparar Datos lexicos
                    prepararErroresTabla(lexico.obtenerListadoErroresLexicos());
                    //Enviamos los datos e
                    // mpaquetados
                    enviarPaqueteDatos();
                    //Graficar
                    graficarListadoFiguras(pars.listadoFiguras, parent);
                } catch (Exception ex) {
                    System.out.println("Error irrecuperrable: "+ex);
                }


            }
        });


    }

    /**
     * Se envia el viewgroup y el listado de figuras, para posteriormente ser graficadas
     * @param listadoFiguras
     * @param parent
     */
    private void graficarListadoFiguras(ArrayList<Figura> listadoFiguras, ViewGroup parent){
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
                parent.addView(auxGraficarFigura, parent.getChildCount());

            }
        }

    }

    /**
     * Reenviar el listadao de toknes al fragment de mostrar tokens leidos
     * @param listadoTokens
     * @return
     */
    private void prepararDatosTabla (ArrayList<Token> listadoTokens){
        ArrayList<String> listadoOperadores = new ArrayList<>();
        String colores = "";
        String figuras = "";
        String animaciones = "";


        for(int i = 0; i < listadoTokens.size(); i++){
            //Auxiliar de los tokens
            Token tokenAux = listadoTokens.get(i);
            //Si el token es un operador, lo agregamos al listado de operadores
            if(tokenAux.getTipoToken().equals("SUMA") || tokenAux.getTipoToken().equals("RESTA") || tokenAux.getTipoToken().equals("MULTIPLICACION") || tokenAux.getTipoToken().equals("DIVISION")){
                //creamos el auxiliar
                String operadorAuxiliar = "";
                operadorAuxiliar = operadorAuxiliar + tokenAux.getTipoToken() + "@";                  // TIPO OPERACION
                operadorAuxiliar = operadorAuxiliar + String.valueOf(tokenAux.getLinea()) + "@";      //LINEA
                operadorAuxiliar = operadorAuxiliar + String.valueOf(tokenAux.getColumna()) + "@"; //COLUMNA

                String ocurrencia;
                String valorAntes = (i > 0) ? listadoTokens.get(i - 1).getLexema() : "";// Si i es mayor a 0, entonces tiene un token anterior, sino el anterior es vacio
                String valorDespues = (i < listadoTokens.size() - 2) ? listadoTokens.get(i + 1).getLexema() : ""; // Si i es el token penultimo de la lista, entonces tiene un token siguiente, sino el siguiente es vacio
                ocurrencia = valorAntes + tokenAux.getLexema() +valorDespues;
                operadorAuxiliar = operadorAuxiliar + ocurrencia; //OCURRENCIA

                //agregamos al listado de operadores
                listadoOperadores.add(operadorAuxiliar);
            }else if(tokenAux.getTipoToken().equals("COLOR")){//Se verifica si son colores
                colores = colores + " "+tokenAux.getLexema();
            }else if(tokenAux.getTipoToken().equals("CIRCULO")   ||
                     tokenAux.getTipoToken().equals("CUADRADO")   ||
                     tokenAux.getTipoToken().equals("RECTANGULO")   ||
                     tokenAux.getTipoToken().equals("POLIGONO")){//Se verifica figuras
                figuras = figuras + " "+tokenAux.getLexema();
            }else if(tokenAux.getTipoToken().equals("CURVA")){//Se verifica animacion curva
                animaciones = animaciones + " "+tokenAux.getLexema();
            }else if(tokenAux.getTipoToken().equals("LINEA")){//se verifica por separado ya que puede ser una figura o una animacion
                String valorAntes = (i > 0) ? listadoTokens.get(i - 1).getTipoToken() : "";// Si i es mayor a 0, entonces tiene un token anterior, sino el anterior es vacio
                if(valorAntes.equals("GRAFICAR")){//es una figura linea
                    figuras = figuras + " "+tokenAux.getLexema();
                }else{
                    animaciones = animaciones + " "+tokenAux.getLexema();
                }
            }

        }

        //Enviamos el dato
        datosEnviar.putStringArrayList("operadores", listadoOperadores);
        datosEnviar.putStringArrayList("colores", contarSubstringsCadena(colores, listaColors));
        datosEnviar.putStringArrayList("figuras", contarSubstringsCadena(figuras, listaFigura));
        datosEnviar.putStringArrayList("animaciones", contarSubstringsCadena(animaciones, listaAnimaciones));

    }

    /**
     * Preparamos el listado de errores lexicos
     * @param listadoTokens
     */
    private  void prepararErroresTabla(ArrayList<TokenError> listadoTokens){
        ArrayList<String> erroresLexicos = new ArrayList<>();

        for(int i = 0; i < listadoTokens.size(); i++){
            //Auxiliar de los tokens
            TokenError tokenAux = listadoTokens.get(i);
            //Si el token es un operador, lo agregamos al listado de errores lexicos
            if(tokenAux.getTipoToken().equals("LEXICO")){

                //creamos el auxiliar
                String lexicoAuxiliar = "";
                lexicoAuxiliar = lexicoAuxiliar + tokenAux.getTipoToken() + "@";                  // TIPO ERROR (LEXEMA)
                lexicoAuxiliar = lexicoAuxiliar + tokenAux.getLexema()+ "@";                      // Valor del token
                lexicoAuxiliar = lexicoAuxiliar + String.valueOf(tokenAux.getLinea()) + "@";      // LINEA
                lexicoAuxiliar = lexicoAuxiliar + String.valueOf(tokenAux.getColumna()) + "@";    // COLUMNA
                lexicoAuxiliar = lexicoAuxiliar + tokenAux.getMsgError();                    // mensaje de error del token


                //agregamos al listado de errores lexicos
                erroresLexicos.add(lexicoAuxiliar);
            }
        }

        //agregamos al bunlde
        datosEnviar.putStringArrayList("lexicos", erroresLexicos);
    }

    /**
     * Empaquetamos el bundle y lo enviamos
     */
    private void enviarPaqueteDatos(){
        //Empaquetamos la informacion
        getParentFragmentManager().setFragmentResult("key1", datosEnviar);
    }

    /**
     * Busca la ocurrencia de cada subcadena que se manda, y retorna un listado con
     * las subcadenas que ocurren y su cantidad
     * @return
     */
    public ArrayList<String> contarSubstringsCadena(String cadena, String[] cadenasEvaluar){
        ArrayList<String> cantidadOcurrencia = new ArrayList<>();

        for(int i = 0; i < cadenasEvaluar.length; i++){

            //substring a buscar
            String findStr = cadenasEvaluar[i];
            int lastIndex = 0;
            int count = 0;

            while(lastIndex != -1){
                lastIndex = cadena.indexOf(findStr,lastIndex);
                if(lastIndex != -1){
                    count ++;
                    lastIndex += findStr.length();
                }
            }

            if(count > 0){
                cantidadOcurrencia.add(cadenasEvaluar[i]+"@"+count);//agregamos la arroba para separar los valores
            }
        }
        return cantidadOcurrencia;//retornamos la lista
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