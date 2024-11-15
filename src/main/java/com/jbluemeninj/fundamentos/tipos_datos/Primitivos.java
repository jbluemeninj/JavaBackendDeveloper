package com.jbluemeninj.fundamentos.tipos_datos;

public class Primitivos {

    public static void main(String[] args) {

        //Tipos de datos primitivos
        //Numerico Entero
        byte enteroByte = 127;
        short enteroShort = 1244;
        int enteroInt = 45646566;
        long enteroLong = 46564646464L;
        //Numerico Decimal
        float decimalFloat = 1455.1f;
        double decimalDouble = 146664.16565;
        //Caracter
        char caracter = 'a';
        //Logico
        boolean logicoVerdadero = true;
        boolean logicoFalso = false;

        //Practicando....
        //Representar 10 en binario| octal | hexadecimal
        byte binario = 0b1010;
        byte hexadecimal = 0xA;
        byte octal = 012;

        System.out.println(octal);
    }

}
