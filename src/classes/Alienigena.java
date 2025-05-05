package classes;

import interfaces.SerVivo;

public class Alienigena implements SerVivo {
    public String nombre;
    public String planetaOrigen;
    public String especie;

    public Alienigena(String planetaOrigen, String especie) {
        this.planetaOrigen = planetaOrigen;
        this.especie = especie;
    }

    public void cambiarForma() {
        System.out.printf("El alienígena %s, proveniente de la especie %s, cambia de forma.", this.nombre, this.especie);
    }

    @Override
    public String obtenerNombre() {
        return this.nombre;
    }
}