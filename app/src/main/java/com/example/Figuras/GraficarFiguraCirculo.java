package com.example.Figuras;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import com.example.DAO.Circulo;
import com.example.DAO.Figura;
import com.example.DAO.Rectangulo;

public class GraficarFiguraCirculo extends GraficarFigura{
    public GraficarFiguraCirculo(Context context, Figura figura){
        //Agregamos el contexto
        super(context, figura);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        Circulo circulo = (Circulo) getFigura();//obtenemos el rectangulo
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10);
        //COLOR
        paint.setColor(getColor(circulo.getColor()));

        canvas.drawCircle(circulo.getPosX(), circulo.getPosY(), circulo.getRadio(), paint);
        //posX, posY, Radio


    }
}
