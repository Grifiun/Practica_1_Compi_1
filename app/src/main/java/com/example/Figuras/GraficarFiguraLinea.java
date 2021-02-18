package com.example.Figuras;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import com.example.DAO.Cuadrado;
import com.example.DAO.Figura;
import com.example.DAO.Linea;

public class GraficarFiguraLinea extends GraficarFigura{
    public GraficarFiguraLinea(Context context, Figura figura){
        //Agregamos el contexto
        super(context, figura);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        Linea linea = (Linea) getFigura();//obtenemos el rectangulo
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10);
        //COLOR
        paint.setColor(getColor(linea.getColor()));

        canvas.drawLine(linea.getPosX(), linea.getPosY(), linea.getPosY1(), linea.getPosX1(), paint);
        //posX, posY, posX1, posY

    }
}
