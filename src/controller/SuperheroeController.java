package controller;

import classes.EquipoSuperheroe;
import classes.Superheroe;
import interfaces.Equipo;

import java.util.List;

public class SuperheroeController {
    private static final SuperheroeController instance = new SuperheroeController();
    private List<Equipo> equipos;

    public static SuperheroeController getInstance() {
        return SuperheroeController.instance;
    }

    public EquipoSuperheroe crearEquipo(List<Superheroe> superheroes, String baseOperaciones, String mision) {
        return new EquipoSuperheroe(superheroes, baseOperaciones, mision);
    }
}
