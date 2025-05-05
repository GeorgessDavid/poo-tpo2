package classes;

import java.util.List;

public class EquipoSuperheroe {
    private final List<Superheroe> superheroes;
    private String baseOperaciones;
    private String mision;

    public EquipoSuperheroe(List<Superheroe> superheroes) {
        this.superheroes = superheroes;
    }

    public void combatirCrimen() {
        System.out.printf("El equipo combate el crimen en la misión '%s'.", mision);
    }

    public void salvarMundo() {
        System.out.printf("El equipo salva el mundo en la misión '%s'.", mision);
    }

    public String obtenerBaseOperaciones() {
        return this.baseOperaciones;
    }

    public String obtenerMision() {
        return this.mision;
    }

    public void asignarBaseOperaciones(String baseOperaciones) {
        this.baseOperaciones = baseOperaciones;
    }

    public void asignarMision(String mision) {
        this.mision = mision;
    }

    public List<Superheroe> obtenerSuperheroes() {
        return superheroes;
    }

    public void asignarSuperheroe(Superheroe superheroe) {
        this.superheroes.add(superheroe);
    }
}