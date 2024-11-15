package com.jbluemeninj.fundamentos.funcional;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicado {

    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate<Integer> esPar = x -> x % 2 == 0;
        List<Integer> numerosPares = numeros.stream()
                .filter(esPar)
                .toList();

        numerosPares.forEach(System.out::println);

    }


}

