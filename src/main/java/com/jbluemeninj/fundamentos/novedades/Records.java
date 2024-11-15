package com.jbluemeninj.fundamentos.novedades;

public class Records {
    public static void main(String[] args) {
        Puntos p = new Puntos(1.5,2.9);
        System.out.println(p.x());
    }

}

record Puntos(double x, double y){}
