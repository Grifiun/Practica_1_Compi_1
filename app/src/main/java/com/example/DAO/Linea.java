package com.example.DAO;

/**
 * Figura geometrica de tipo linea
 *
 */
public class Linea extends Figura{
    private int posX1;
    private int posY1;

    /**
     * Constructor, solamente agregamos el color, ya que es un atributo general
     * ademas de las posiciones x y y que indicaran donde se colocara la figura
     *Atributos de la linea;
     * @param color
     * @param posX
     * @param posY
     * @param posX1
     * @param posY1
     */
    public Linea(String color, double posX, double posY, double posX1, double posY1) {
        super(color, posX, posY);
        this.posX1 = (int) posX1;
        this.posY1 = (int) posY1;
        //Establecemos que es un linea
        setTipoFigura("linea");
    }

    /**
     * Setter de int posX1
     * @param posX1
     */
    public void setPosX1(double posX1){
        this.posX1 = (int) posX1;
    }

    /**
     * Getter de int posX1
     * @return
     */
    public int getPosX1(){
        return this.posX1;
    }
    /**
     * Setter de int posY1
     * @param posY1
     */
    public void setPosY1(double posY1){
        this.posY1 = (int) posY1;
    }

    /**
     * Getter de int posY1
     * @return
     */
    public int getPosY1(){
        return this.posY1;
    }
}
