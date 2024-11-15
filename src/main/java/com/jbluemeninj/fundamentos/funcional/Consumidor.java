package com.jbluemeninj.fundamentos.funcional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        List<String> frutas = Arrays.asList("Manzana", "Naranja", "Pera", "Durazno");
        Consumer<String> imprimirFruta = System.out::println;

        frutas.forEach(imprimirFruta);

    }
}
