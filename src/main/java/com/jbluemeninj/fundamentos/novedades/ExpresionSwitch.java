package com.jbluemeninj.fundamentos.novedades;


import java.util.List;

public class ExpresionSwitch {

    public static void main(String[] args) {
        List<Forma> formas = List.of(
                new Triangulo(10, 5),
                new Rectangulo(10, 5),
                new Circulo(10));


        for (var forma : formas) {
            double area = switch (forma) {
                case Circulo c -> c.CulcularArea();
                case Rectangulo r -> r.CulcularArea();
                case Triangulo t -> t.CulcularArea();
                default -> throw new IllegalStateException("Forma no soportada: " + forma);
            };
            System.out.println(area);
        }
    }

}

record Triangulo(double base, double altura) implements Forma{

    @Override
    public double CulcularArea() {
        return base * altura / 2;
    }
}

record Rectangulo(double base, double altura) implements Forma{

    @Override
    public double CulcularArea() {
        return base * altura;
    }
}

record Circulo(double radio) implements Forma{

    @Override
    public double CulcularArea() {
        return Math.PI * radio * radio;
    }
}




sealed interface Forma {
    double CulcularArea();
}
