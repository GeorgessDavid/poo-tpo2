package classes;

public class Arma {
    public String codigo;
    public String nombre;
    public String descripcion;
    public String estado;

    public static void Arma(String codigo, String nombre, String descripcion, String estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
        System.out.println("Creando un nuevo objeto Arma...");
    }
}