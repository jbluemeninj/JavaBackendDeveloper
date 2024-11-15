package com.jbluemeninj.fundamentos.funcional;

import java.util.Random;
import java.util.function.Supplier;

public class Proveedor {

    public static void main(String[] args) {
        Supplier<Integer> numeroAleatorio = () -> new Random().nextInt(100);

        for(int i = 0; i < 5; i++) {
            System.out.println(numeroAleatorio.get());
        }

    }
}
