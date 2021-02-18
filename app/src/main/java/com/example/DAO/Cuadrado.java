package com.example.DAO;

/**
 * Figura geometrica de tipo cuadrado
 *
 */
public class Cuadrado extends Figura{
    private int longitudLado;

    /**
     * Constructor, solamente agregamos el color, ya que es un atributo general
     * ademas de las posiciones x y y que indicaran donde se colocara la figura
     *Atributos del Cuadrado;
     * @param color
     * @param posX
     * @param posY
     * @param longitudLado
     */
    public Cuadrado(String color, double posX, double posY, double longitudLado) {
        super(color, posX, posY);
        this.longitudLado = (int) longitudLado;
        //Establecemos que es un cuadrado
        setTipoFigura("cuadrado");
    }

    /**
     * Setter de int longitudLado
     * @param longitudLado
     */
    public void setLongitudLado(double longitudLado){
        this.longitudLado = (int) longitudLado;
    }

    /**
     * Getter de int longitudLado
     * @return
     */
    public int getLongitudLado(){
        return this.longitudLado;
    }
}
