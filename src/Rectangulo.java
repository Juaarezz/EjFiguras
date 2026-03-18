public class Rectangulo extends Figura implements Dibujable {
    public int lado1;
    public int lado2;

    public Rectangulo(String nombre, int lado1, int lado2) {
        super(nombre);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double calcularArea() {
        return lado1 * lado2;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (lado1 + lado2);
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando... " + nombre);
    }
}
