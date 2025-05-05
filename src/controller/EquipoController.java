public class EquipoController {
    private static EquipoController instance;
    private EquipoEnum equipo;

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