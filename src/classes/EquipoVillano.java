package classes;

import java.util.List;

public class EquipoVillano {
    private List<Villano> villanos;
    private String baseVillanos;
    private String ubicacion;

    public String eliminarSuperheroes() {
        System.out.println("Eliminando superhéroes...");
    }

    public String dominarMundo() {
        System.out.println("Dominando el mundo...");
    }

    public String obtenerBase() {
        return this.baseVillanos;
    }

    public String obtenerUbicacion() {
        return this.ubicacion;
    }
}