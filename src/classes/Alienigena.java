public class Alienigena implements SerVivo{
    public Planeta planetaOrigen;
    public String especie;

    public static void Alienigena(Planeta planetaOrigen, String especie) {
        this.planetaOrigen = planetaOrigen;
        this.especie = especie;
    }

    public void cambiarForma() {
        System.out.printf("El alienígena de la especie %s cambia de forma.", especie);
    }
}