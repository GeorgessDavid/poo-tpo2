package classes;

import java.util.List;

public class EquipoVillano {
    private final List<Villano> villanos;
    private String baseVillanos;
    private String ubicacion;

    public EquipoVillano(List<Villano> villanos) {
        this.villanos = villanos;
    }

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

    public List<Villano> obtenerVillanos() {
        return villanos;
    }

    public void asignarVillano(Villano villano) {
        this.villanos.add(villano);
    }
}