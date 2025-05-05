package classes;

import interfaces.SerVivo;

public abstract class Superheroe implements SerVivo {
    public String nombre;
    private Traje traje;

    public Superheroe(String nombre, Traje traje) {
        this.nombre = nombre;
        this.traje = traje;
    }

    public void volar() {
        System.out.println("Volando...");
    }

    public void pelear(Villano villano) {
        System.out.printf("Peleando contra el villano %s, mejor conocido como %s.", villano.obtenerNombre(), villano.obtenerAlias());
    }

    public String obtenerNombre() {
        return this.nombre;
    }

}