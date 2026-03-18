public class Triangulo extends Figura implements Dibujable {
    private int lado1;
    private int lado2;
    private int lado3;

    public Triangulo(String nombre, int lado1, int lado2, int lado3) {
        super(nombre);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
        double s = (lado1 * lado2 * lado3) / 2;
        return Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = lado1 + lado2 + lado3;
        return perimetro;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando... " + nombre);
    }
}
