package com.jbluemeninj.fundamentos.funcional;

import java.util.List;
import java.util.function.Function;

public class Funcion {
    public static void main(String[] args) {
        List<String> nombreMujeres = List.of("Ana", "María", "Laura", "Sofía", "Isabel");
        Function<String, String> convertirMayusculas = nombre -> nombre.toUpperCase();

        List<String> nombreMujeresMayusculas =nombreMujeres.stream()
                .map(convertirMayusculas)
                .toList();

        nombreMujeresMayusculas.forEach(System.out::println);

    }
}
