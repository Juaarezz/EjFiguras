public class Main {
    public static void main(String[] args) {
        Circulo c = new Circulo("Circulo 1", 2);
        Rectangulo r = new Rectangulo("Cuadrado 1", 3, 4);
        Triangulo t = new Triangulo("Triangulo 1", 1, 2, 3);

        System.out.println(c.calcularPerimetro());
        System.out.println(c.calcularArea());
        c.dibujar();
        c.mostrar();

        System.out.println(r.calcularPerimetro());
        System.out.println(r.calcularArea());
        r.dibujar();
        r.mostrar();

        System.out.println(t.calcularPerimetro());
        System.out.println(t.calcularArea());
        t.dibujar();
        t.mostrar();
    }
}
