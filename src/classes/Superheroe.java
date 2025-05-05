import java.util.List;


public class Superheroe implements Humano, Mutante, Poder {
    // Atributos de Superheroe.
    private String identidad_secreta;
    private List<Poder> poderes;
    private Traje traje;
    
    // Atributos de SerVivo
    public String nombre;
    
    // Atributos de Humano.
    public int edad;
    public boolean sexo;
    public String nacionalidad;
    
    // Atributos de Mutante.
    public String mutacion;
    public TipoMutante tipoMutante;

    public static void Superheroe(String nombre, Humano humano, Mutante mutante){
        if(nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío.");
        }

        if(humano){
            this.nombre = humano.nombre;
            this.edad = humano.edad;
            this.sexo = humano.sexo;
            this.nacionalidad = humano.nacionalidad;
        }else if{
            this.nombre = mutante.nombre;
            this.mutacion = mutante.mutacion;
            this.tipoMutante = mutante.tipoMutante;
        } else {
            throw new IllegalArgumentException("El objeto Humano no puede ser nulo.");
        }


    }

    public void volar() {
        System.out.println("Volando...");
    }

    public void pelear(Villano villano) {
        System.out.printf("Peleando contra el villano %s, mejor conocido como %s.", villano.obtenerNombre(), villano.obtenerAlias());
    }

    public void usarPoderes() {
        String nombres = String.join(", ", poderes.stream().map(Poder::obtenerNombre).toList()).replaceAll(", ([^,]+)$", " y $1");System.out.printf("Utilizando los poderes %s.", List.of(this.Poderes));
    }
nombres%%n}

    public String obtenerNombre() {
        return this.nombre;
    }

