public class Circulo extends Figura implements Dibujable {
    public int radio;

    public Circulo(String nombre, int radio) {
        super(nombre);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double s = Math.PI*radio*radio;
        return s;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = 2 * Math.PI * radio;
        return perimetro;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando... " + nombre);
    }
}
