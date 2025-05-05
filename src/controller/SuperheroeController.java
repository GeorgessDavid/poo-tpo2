import java.util.List;

/*
 public class EquipoController {
    private static EquipoController instance;
    private Equipo equipo;

    public static EquipoController getInstance() {
        return instance;
    }

    public Equipo createEquipo(Equipo equipo) {
        if (equipo instanceof Superheroe) {
            return new EquipoSuperheroe();
        }

        if (equipo instanceof Villano) {
            return new EquipoVillano();
        }

        throw new InvalidTeamTypeException("Tipo de equipo no válido.");
    }
}


 */


public class SuperheroeController extends EquipoController {
    private List<Superheroe> superheroes;
    private String baseOperaciones;
    private String mision;

    @Override
    public EquipoSuperheroe createEquipo(Equipo equipo) {
        if (equipo instanceof )
    }
}