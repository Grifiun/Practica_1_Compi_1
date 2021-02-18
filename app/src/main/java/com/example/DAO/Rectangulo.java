package com.example.DAO;

/**
 * Figura geometrica de tipo rectangulo
 *
 */
public class Rectangulo extends Figura{
    private int alto;
    private int ancho;

    /**
     * Constructor, solamente agregamos el color, ya que es un atributo general
     * ademas de las posiciones x y y que indicaran donde se colocara la figura
     *Atributos del Rectangulo;
     * @param color
     * @param posX
     * @param posY
     * @param alto
     * @param ancho
     */
    public Rectangulo(String color, double posX, double posY, double alto, double ancho) {
        super(color, posX, posY);
        this.alto = (int) alto;
        this.ancho = (int) ancho;
        //Establecemos que es un rectangulo
        setTipoFigura("rectangulo");
    }

    /**
     * Setter de int alto
     * @param alto
     */
    public void setAlto(double alto) {
        this.alto = (int) alto;
    }

    /**
     * Getter de int alto
     * @return
     */
    public int getAlto() {
        return alto;
    }

    /**
     * Setter de int ancho
     * @param ancho
     */
    public void setAncho(double ancho) {
        this.ancho = (int) ancho;
    }

    /**
     * getter de int ancho
     * @return
     */
    public int getAncho() {
        return ancho;
    }


}
