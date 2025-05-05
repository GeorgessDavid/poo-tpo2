public class Mutante implements SerVivo{
    public String nombre;
    public String mutacion;
    public String tipoMutante;

    public static void Mutante(String nombre, String mutacion, TipoMutante tipoMutante) {
        this.nombre = nombre;
        this.mutacion = mutacion;
        this.tipoMutante = tipoMutante;
    }

    public void teletransportar() {
        System.out.printf("El mutante %s se teletransporta.", nombre);
    }

    public void autoRegenerarse(){
        System.out.printf("El mutante %s se autoregenera.", nombre);
    }
}