public class Alumno {
    private String nombre;
    private int edad;
    private double promedio;
    private String materiasInscritas;

    public Alumno(String nombre, int edad, double promedio, String materiasInscritas) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
        this.materiasInscritas = materiasInscritas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getMateriasInscritas() {
        return materiasInscritas;
    }

    public void setMateriasInscritas(String materiasInscritas) {
        this.materiasInscritas = materiasInscritas;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", promedio=" + promedio +
                ", materiasInscritas='" + materiasInscritas + '\'' +
                '}';
    }
}
