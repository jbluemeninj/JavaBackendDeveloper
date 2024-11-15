package com.jbluemeninj.fundamentos.funcional;

public class InterfaceFuncional {

    public static void main(String[] args) {
        Calculadora sumar = (a, b) -> a + b;
        Calculadora restar = (a, b) -> a - b;
        Calculadora multiplicar = (a, b) -> a * b;
        Calculadora dividir = (a, b) -> a / b;

        System.out.println(sumar.operar(2, 3));
        System.out.println(restar.operar(2, 3));
        System.out.println(multiplicar.operar(2, 3));
        System.out.println(dividir.operar(2, 3));
    }
}

@FunctionalInterface
interface Calculadora {
    int operar(int x, int y);
}
