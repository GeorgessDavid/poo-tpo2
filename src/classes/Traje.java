package classes;

public class Traje {
    public String nombre;
    public String descripcion;
    public String color;
    public String debilidad;
    private int durabilidad;

    public void Traje(String nombre, String descripcion, String color, String debilidad, int durabilidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.color = color;
        this.debilidad = debilidad;
        this.durabilidad = durabilidad;
        System.out.println("Creando un nuevo traje...");
    }

    public int obtenerDurabilidad() {
        return this.durabilidad;
    } 
}