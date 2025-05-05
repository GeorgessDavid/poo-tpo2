package classes;

import java.util.List;

public class EquipoVillano {
    private final List<Villano> villanos;
    private String baseVillanos;
    private String ubicacion;

    public EquipoVillano(List<Villano> villanos, String baseVillanos, String ubicacion) {
        this.villanos = villanos;
        this.baseVillanos = baseVillanos;
        this.ubicacion = ubicacion;
    }

    public void eliminarSuperheroes() {
        System.out.println("Eliminando superhéroes...");
    }

    public void dominarMundo() {
        System.out.println("Dominando el mundo...");
    }

    public String obtenerBase() {
        return this.baseVillanos;
    }

    public void asignarBase(String base) {
        this.baseVillanos = base;
    }

    public String obtenerUbicacion() {
        return this.ubicacion;
    }

    public void asignarUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<Villano> obtenerVillanos() {
        return villanos;
    }

    public void asignarVillano(Villano villano) {
        this.villanos.add(villano);
    }
}