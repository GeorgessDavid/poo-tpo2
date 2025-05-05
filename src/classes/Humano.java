public class Humano implements SerVivo {    
    public String nombre;
    public int edad;
    public boolean sexo;
    public String nacionalidad;

    public static void Humano(String nombre, int edad, boolean sexo, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
    }

    public void hablar() {
        System.out.printf("Hola, soy %s y tengo %s años.", nombre, edad);
    }

    public void caminar() {
        System.out.printf("%s está caminando.", nombre);
    }

    public void comer() {
        System.out.printf("%s está comiendo.", nombre);
    }
}