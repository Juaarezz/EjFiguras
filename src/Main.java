import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Figura c = new Circulo("Circulo 1", 2);
        Figura r = new Rectangulo("Cuadrado 1", 3, 4);
        Figura t = new Triangulo("Triangulo 1", 1, 2, 3);

        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(c);
        figuras.add(r);
        figuras.add(t);

        for (Figura figura : figuras) {
            System.out.println(figura.calcularPerimetro());
            System.out.println(figura.calcularArea());
            figura.mostrar();
            ((Dibujable)figura).dibujar();
        }
    }
}
