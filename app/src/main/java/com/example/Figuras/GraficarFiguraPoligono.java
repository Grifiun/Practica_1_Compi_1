package com.example.Figuras;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import com.example.DAO.Figura;
import com.example.DAO.Linea;
import com.example.DAO.Poligono;

import java.util.ArrayList;

public class GraficarFiguraPoligono extends GraficarFigura{
    public GraficarFiguraPoligono(Context context, Figura figura){
        //Agregamos el contexto
        super(context, figura);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        Poligono poligono = (Poligono) getFigura();//obtenemos el rectangulo
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10);

        //COLOR
        paint.setColor(getColor(poligono.getColor()));

        int[] posicionesX = new int[poligono.getCantidadLados()];
        int[] posicionesY = new int[poligono.getCantidadLados()];

        double degradianes = 0;
        for(int i = 0; i < poligono.getCantidadLados(); i++){
            double posX, posY;

            // convertir degradianes a radianess
            double radianes = Math.toRadians(degradianes);

            posX = poligono.getAncho() * (Math.cos(radianes));
            posY = poligono.getAlto() * (Math.sin(radianes));
            posicionesX[i] = (int) posX;
            posicionesY[i] = (int) posY;
            degradianes += 360 / poligono.getCantidadLados();
        }

        for(int i = 0; i < posicionesX.length; i++){
            System.out.println("x:   "+posicionesX[i]+ "   y:    "+posicionesY[i]);
        }


        int inicioX = poligono.getPosX();
        int inicioY = poligono.getPosY();
        //Graficamos n lineas que se conecten entre las posiciones generadas
        for(int i = 0; i < posicionesX.length; i++){
            int posX;
            int posY;
            int posX1;
            int posY1;
            if(i < posicionesX.length - 1){

                posX = posicionesX[i];
                posY = posicionesY[i];
                posX1 = posicionesX[i + 1];
                posY1 = posicionesY[i + 1];
            }else{
                posX = posicionesX[i];
                posY = posicionesY[i];
                posX1 = posicionesX[0];
                posY1 = posicionesY[0];
            }
            System.out.println(""+(inicioX + posX)+ ","+(posY + inicioY) + "  a   "+(posX1 + inicioX)+ ","+(inicioY + posY1));
            canvas.drawLine(inicioX + posX, posY + inicioY, posX1 + inicioX, inicioY + posY1, paint);
        }

    }
}
