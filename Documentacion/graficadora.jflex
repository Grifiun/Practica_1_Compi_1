/*Primera seccion, librerias */
package com.example.gramatica;
import java_cup.runtime.*;
import static com.example.gramatica.sym.*;
import com.example.DAO.Token;
import com.example.DAO.TokenError;
import java.util.ArrayList;
import java.util.List;

/*Segunda seccion, config*/
%%
%class exercise
%cup
%cupdebug
%unicode
%line
%public
%column

%{
    //Creamos un listado de los operadores invocados
    ArrayList<Token> listadoOperadoresInvocados = new ArrayList();
    ArrayList<TokenError> listadoErroresLexicos = new ArrayList();

%}

%{
    //Funciones
    //retorna un simbolo despues de crear un nuevo token y agregarlo al listado
    private Symbol retornarSimbolo(int tipo, String tipoToken, String lexema, int fila, int columna){
        //creamos un  token auxiliar
        Token tokenAux = new Token(tipoToken, lexema, fila, columna);
        //Agregamos al listado
        listadoOperadoresInvocados.add(tokenAux);
        //retornamos el token aux como simbolo
        return new Symbol(tipo, tokenAux);
    }
    
    //Agregamos un token al array list de errores lexicos
    private void addErrorLexico(String tipoToken, String lexema, String msgError, int fila, int columna){
        //creamos un  token auxiliar
        TokenError tokenErrorAux = new TokenError(tipoToken, lexema, msgError, fila, columna);
        //Agregamos al listado
        listadoErroresLexicos.add(tokenErrorAux);
    }

    //Obtenemos el arrLust de los errores lexicos
    public ArrayList<TokenError> obtenerListadoErroresLexicos(){
        return listadoErroresLexicos;
    }

    //Obtenemos el lstado de los tokens
    public ArrayList<Token> obtenerListadoTokens(){
        return listadoOperadoresInvocados;
    }

%}
SEPARADORES = [ \r\t\b\f\n]
DIGITO =  [[:digit:]]+ ("." [[:digit:]]+)?
CLR = azul | rojo | verde | amarillo | naranja | morado | cafe | negro
CURV = curva
CIRC = circulo 
CUAD = cuadrado
RECTAN = rectangulo
LIN = linea
POLIGON = poligono
GRAF = graficar
ANIM = animar
OBJ = objeto
ANTER = anterior
%%

/*Tercera accion, expresiones*/
<YYINITIAL>{
    {DIGITO}	{ return retornarSimbolo(ENTERO         , "ENTERO"         , yytext(), yyline + 1, yycolumn + 1); }
    "+"	        { return retornarSimbolo(SUMA           , "SUMA"           , yytext(), yyline + 1, yycolumn + 1); } 
    "-"	        { return retornarSimbolo(RESTA          , "RESTA"          , yytext(), yyline + 1, yycolumn + 1); } 
    "*"     	{ return retornarSimbolo(MULTIPLICACION , "MULTIPLICACION" , yytext(), yyline + 1, yycolumn + 1); }
    "/"	        { return retornarSimbolo(DIVISION       , "DIVISION"       , yytext(), yyline + 1, yycolumn + 1); }
    "(" 	    { return retornarSimbolo(PARENTESISA    , "PARENTESISA"    , yytext(), yyline + 1, yycolumn + 1); }
    ")"	        { return retornarSimbolo(PARENTESISB    , "PARENTESISB"    , yytext(), yyline + 1, yycolumn + 1); }
    ","     	{ return retornarSimbolo(COMA           , "COMA"           , yytext(), yyline + 1, yycolumn + 1); }
    {CLR}   	{ return retornarSimbolo(COLOR          , "COLOR"          , yytext(), yyline + 1, yycolumn + 1); }
    {CURV}	    { return retornarSimbolo(CURVA          , "CURVA"          , yytext(), yyline + 1, yycolumn + 1); }    
    {CIRC}  	{ return retornarSimbolo(CIRCULO        , "CIRCULO"        , yytext(), yyline + 1, yycolumn + 1); }   
    {CUAD}	    { return retornarSimbolo(CUADRADO       , "CUADRADO"       , yytext(), yyline + 1, yycolumn + 1); }  
    {RECTAN}	{ return retornarSimbolo(RECTANGULO     , "RECTANGULO"     , yytext(), yyline + 1, yycolumn + 1); }   
    {LIN}	    { return retornarSimbolo(LINEA          , "LINEA"          , yytext(), yyline + 1, yycolumn + 1); } 
    {POLIGON}	{ return retornarSimbolo(POLIGONO       , "POLIGONO"       , yytext(), yyline + 1, yycolumn + 1); }        
    {GRAF}	    { return retornarSimbolo(GRAFICAR       , "GRAFICAR"       , yytext(), yyline + 1, yycolumn + 1); }    
    {ANIM}	    { return retornarSimbolo(ANIMAR         , "ANIMAR"         , yytext(), yyline + 1, yycolumn + 1); }    
    {OBJ}	    { return retornarSimbolo(OBJETO         , "OBJETO"         , yytext(), yyline + 1, yycolumn + 1); }  
    {ANTER}	    { return retornarSimbolo(ANTERIOR       , "ANTERIOR"       , yytext(), yyline + 1, yycolumn + 1); }   
    {SEPARADORES}   {/*  */}
}

//Los simbolos que no concuerdan con las expresiones especificadas son errores lexicos
//Recibe: TipoError, Lexema, Mensaje del error/descripcion, fila y columna
    [^]         { addErrorLexico ("LEXICO", yytext(), "Token no valido",yyline + 1, yycolumn + 1);}
