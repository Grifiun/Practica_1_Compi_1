package com.example.gramatica;

public class Token {
    private final String lexema;
    private final int linea;
    private final int columna;

    public Token(String lexema, int linea, int columna) {
        this.lexema = lexema;
        this.linea = linea;
        this.columna = columna;
    }

    public Token(int fila, int columna) {
        this(null, fila, columna);
    }


    public String getLexema() {
        return lexema;
    }

    public int getLinea() {
        return linea;
    }

    public int getColumna() {
        return columna;
    }
}