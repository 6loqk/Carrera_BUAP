package backend;

public class Persona {
    private String nombre;
    private String paterno;
    private String materno;
    private int edad;
    private String facultad;

    public Persona(String nombre, String paterno, String materno, int edad, String facultad) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.edad = edad;
        this.facultad = facultad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public int getEdad() {
        return edad;
    }

    public String getFacultad() {
        return facultad;
    }

    // setters si quieres permitir modificar los datos
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

}