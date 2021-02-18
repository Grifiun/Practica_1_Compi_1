package com.example.DAO;

/**
 * Figura geometrica de tipo poligono *
 */
public class Poligono extends Figura{
    private int alto;
    private int ancho;
    private int cantidadLados;

    /**
     * Constructor, solamente agregamos el color, ya que es un atributo general
     * ademas de las posiciones x y y que indicaran donde se colocara la figura
     *Atributos del poligono;
     * @param color
     * @param posX
     * @param posY
     * @param alto
     * @param ancho
     */
    public Poligono(String color, double posX, double posY, double alto, double ancho, double cantidadLados) {
        super(color, posX, posY);
        this.alto = (int) alto;
        this.ancho = (int) ancho;
        this.cantidadLados = (int) cantidadLados;
        //Establecemos que es un poligono
        setTipoFigura("poligono");
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

    /**
     * Setter de int cantidadLados
     * @param cantidadLados
     */
    public void setCantidadLados(double cantidadLados) {
        this.cantidadLados = (int) cantidadLados;
    }

    /**
     * Getter de int cantidadLados
     * @return
     */
    public int getCantidadLados() {
        return cantidadLados;
    }
}
