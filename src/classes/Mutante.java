package classes;

public class Mutante extends Superheroe {
    public String nombre;
    public String mutacion;

    public Mutante(String nombre, String mutacion) {
        super(nombre, new Traje("Ejemplo traje", "Traje bonito", "Rojo", "Ninguna", 100));
        this.nombre = nombre;
        this.mutacion = mutacion;
    }

    public void teletransportar() {
        System.out.printf("El mutante %s se teletransporta.", nombre);
    }

    public void autoRegenerarse(){
        System.out.printf("El mutante %s se autoregenera.", nombre);
    }

    @Override
    public String obtenerNombre() {
        return this.nombre;
    }
}