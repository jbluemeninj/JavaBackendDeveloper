package com.jbluemeninj.fundamentos.funcional;

import java.util.Optional;

public class Opcional {
    public static void main(String[] args) {
        Persona persona = new Persona("FREDDY", Optional.of("Calle 123"));
        Persona persona2 = new Persona("FREDDY", Optional.empty());

        System.out.println(persona.getDireccion().isPresent());
        System.out.println(persona2.getDireccion().isPresent());
    }
}

class Persona {
    private String nombre;
    private Optional<String> direccion;

    //Getter y setter
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Optional<String> getDireccion() {
        return direccion;
    }
    public void setDireccion(Optional<String> direccion) {
        this.direccion = direccion;
    }

    public Persona(String nombre, Optional<String> direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Persona(){}

    //ToString
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", direccion=" + direccion +
                '}';
    }
}