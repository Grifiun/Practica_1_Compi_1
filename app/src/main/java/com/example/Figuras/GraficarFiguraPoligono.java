package com.example.Figuras;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import com.example.DAO.Figura;
import com.example.DAO.Linea;
import com.example.DAO.Poligono;

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


        //canvas.draw
        //posX, posY, posX1, posY

    }
}
