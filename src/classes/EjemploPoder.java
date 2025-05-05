package classes;

import interfaces.Poder;

public class EjemploPoder implements Poder {
    private final String nombre;

    public EjemploPoder(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String obtenerNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}