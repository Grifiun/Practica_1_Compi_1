package com.example.Figuras;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

import com.example.DAO.Figura;
import com.example.DAO.Rectangulo;

public class GraficarFigura extends View {
    private final int COLORROJO = Color.RED;
    private final int COLORBLUE = Color.BLUE;
    private final int COLORVERDE = Color.GREEN;
    private final int COLORAMARILLO = Color.YELLOW;
    private final int COLORNARANJA = Color.rgb(255,140,0);
    private final int COLORMORADO = Color.rgb(138,43,226);
    private final int COLORCAFE = Color.rgb(139,69,19);
    private final int COLORNEGRO = Color.BLACK;


    private Figura figura;
    public GraficarFigura(Context context, Figura figura){
        super(context);
        this.figura = figura;
    }


    public Figura getFigura() {
        return figura;
    }

    public void setFigura(Figura figura) {
        this.figura = figura;
    }

    public int getColor(String color){
        switch (color){
            case "rojo":
                return COLORROJO;
            case "azul":
                return COLORBLUE;
            case "verde":
                return COLORVERDE;
            case "amarillo":
                return COLORAMARILLO;
            case "naranja":
                return COLORNARANJA;
            case "morado":
                return COLORMORADO;
            case "cafe":
                return COLORCAFE;
            case "negro":
                return COLORNEGRO;

        }

        return 0;
    }
}
