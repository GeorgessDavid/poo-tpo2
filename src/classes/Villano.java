package classes;

import interfaces.Poder;

import java.util.List;

public class Villano extends Alienigena implements Poder {
    public String nombre;
    public String alias;
    public List<Poder> poderes;
    public String objetivo;
    public Arma arma;

    public Villano(String nombre, String alias, List<Poder> poderes, String objetivo, Arma arma) {
        this.nombre = nombre;
        this.alias = alias;
        this.poderes = poderes;
        this.objetivo = objetivo;
        this.arma = arma;
        System.out.println("Creando un nuevo objeto Villano...");
    }


    public void atacar() {
        System.out.printf("Atacando con su arma %s.", arma);
    }

    public void conquistar() {
        System.out.println("Conquistando...");
    }

    public void matar(Superheroe superheroe) {
        System.out.printf("Matando al superhéroe %s...", superheroe.obtenerNombre());
    }

    public String obtenerNombre(){
        return nombre;
    }

    public String obtenerAlias(){
        return alias;
    }
}