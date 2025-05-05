package controller;

import java.util.List;

public class VillanoController {
    private static final VillanoController instance = new VillanoController();
    private String baseVillanos;
    private String ubicacion;

    public static VillanoController getInstance() {
        return VillanoController.instance;
    }

    public EquipoVillano crearEquipo(List<Villano> villanos){
        return new EquipoVillano(villanos);
    }
}