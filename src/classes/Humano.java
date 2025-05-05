package classes;

import interfaces.SerVivo;

public class Humano extends Superheroe {
    private String nombre;
    private int edad;
    private boolean sexo;
    private String nacionalidad;

    public void hablar() {
        System.out.printf("Hola, soy %s y tengo %s años.", this.nombre, this.edad);
    }

    public void caminar() {
        System.out.printf("%s está caminando.", this.nombre);
    }

    public void comer() {
        System.out.printf("%s está comiendo.", this.nombre);
    }

    public String obtenerSexo() {
        return this.sexo ? "Masculino" : "Femenino";
    }

    public String obtenerNacionalidad() {
        return this.nacionalidad;
    }

    @Override
    public String obtenerNombre() {
        return this.nombre;
    }
}