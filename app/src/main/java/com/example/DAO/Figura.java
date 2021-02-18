package com.example.DAO;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

public class Figura {
    private String tipoFigura;
    private String color;
    private int posX;
    private int posY;
    /**
     * Constructor, solamente agregamos el color, ya que es un atributo general
     * ademas de las posiciones x y y que indicaran donde se colocara la figura
     * @param color
     */
    public Figura(String color, double posX, double posY){
        this.posX = (int) posX;//Agregamos a numeros enteros por si vienen decicmales
        this.posY = (int) posY;//Agregamos a numeros enteros por si vienen decicmales
        this.color = color;//color
    }

    /**
     * Setter de String color
     * @param color
     */
    public void setColor(String color){
        this.color = color;
    }

    /**
     * Getter de String color
     * @return
     */
    public String getColor(){
        return this.color;
    }
    /**
     * Setter de int posX
     * @param posX
     */
    public void setPosX(double posX){
        this.posX = (int) posX;
    }

    /**
     * Getter de int posX
     * @return
     */
    public int getPosX(){
        return this.posX;
    }
    /**
     * Setter de int posY
     * @param posY
     */
    public void setPosY(double posY){
        this.posY = (int) posY;
    }

    /**
     * Getter de int posX
     * @return
     */
    public int getPosY(){
        return this.posY;
    }

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }
}
