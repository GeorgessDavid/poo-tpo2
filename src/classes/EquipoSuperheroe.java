import java.util.List;

public class EquipoSuperheroe {
    private List<Superheroe> superheroes;
    private String baseOperaciones;
    private String mision;

    public String combatirCrimen() {
        System.out.printf("El equipo combate el crimen en la misión '%s'.", mision);
    }

    public String salvarMundo() {
        System.out.printf("El equipo salva el mundo en la misión '%s'.", mision);
    }

    public String obtenerBaseOperaciones() {
        return this.baseOperaciones;
    }

    public String obtenerMision() {
        return this.mision;
    }
}