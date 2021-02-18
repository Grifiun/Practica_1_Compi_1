package com.example.Figuras;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import com.example.DAO.Cuadrado;
import com.example.DAO.Figura;
import com.example.DAO.Rectangulo;

public class GraficarFiguraCuadrado extends GraficarFigura{
    public GraficarFiguraCuadrado(Context context, Figura figura){
        //Agregamos el contexto
        super(context, figura);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        Cuadrado cuadrado = (Cuadrado) getFigura();//obtenemos el rectangulo
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10);
        //COLOR
        paint.setColor(getColor(cuadrado.getColor()));

        canvas.drawRect(cuadrado.getLongitudLado() + cuadrado.getPosX(), cuadrado.getLongitudLado() + cuadrado.getPosY(), cuadrado.getPosX(), cuadrado.getPosY(), paint);
        //lado, lado, posX, posY

    }
}
