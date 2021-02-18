package com.example.Figuras;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

import com.example.DAO.Figura;
import com.example.DAO.Rectangulo;

public class GraficarFiguraRectangulo extends GraficarFigura{
    public GraficarFiguraRectangulo(Context context, Figura figura){
            //Agregamos el contexto
            super(context, figura);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        Rectangulo rectangulo = (Rectangulo) getFigura();//obtenemos el rectangulo
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(10);
        //COLOR
        paint.setColor(getColor(rectangulo.getColor()));

        canvas.drawRect(rectangulo.getAncho()+rectangulo.getPosX(), rectangulo.getAlto()+rectangulo.getPosY(), rectangulo.getPosX(), rectangulo.getPosY(), paint);
        //Ancho,alto, posX, posY

    }
}
