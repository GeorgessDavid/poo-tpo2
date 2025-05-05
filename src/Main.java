import classes.*;
import controller.SuperheroeController;
import controller.VillanoController;
import interfaces.Poder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SuperheroeController superheroeController = new SuperheroeController();
        VillanoController villanoController = new VillanoController();


        Traje t1 = new Traje();

        Humano clarkKent = new Humano(
                "Clark Kent",
                35,
                true,
                "Kryptoniano",
                t1
        );

        Arma arma = new Arma();

        Villano joker = new Villano(
                "Jack Napier",
                "Joker",
                poderesJoker,
                "Destruir Gotham",
                arma
        );


        List<Superheroe> heroes = new ArrayList<>();
        heroes.add(clarkKent);

        List<Villano> villanos = new ArrayList<>();
        villanos.add(joker);

        superheroeController.crearEquipo(heroes);
    }
}
