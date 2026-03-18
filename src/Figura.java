public abstract class Figura {
    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularArea();

    public abstract double calcularPerimetro();

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Area: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}
