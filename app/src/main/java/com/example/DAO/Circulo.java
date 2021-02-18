package com.example.DAO;

import android.content.Context;

/**
 * Figura geometrica de tipo circulo
 * Posee un radio
 */
public class Circulo extends Figura{

    private int radio;

    /**
     * Constructor, solamente agregamos el color, ya que es un atributo general
     * ademas de las posiciones x y y que indicaran donde se colocara la figura
     *Atributos del circulo;
     * @param color
     * @param posX
     * @param posY
     * @param radio
     */
    public Circulo(String color, double posX, double posY, double radio) {
        super(color, posX, posY);
        this.radio = (int) radio;
        //Establecemos que es un circulo
        setTipoFigura("circulo");
    }


    /**
     * Setter de int radio
     * @param radio
     */
    public void setRadio(double radio){
        this.radio = (int) radio;
    }

    /**
     * Getter de int radio
     * @return
     */
    public int getRadio(){
        return this.radio;
    }
}
