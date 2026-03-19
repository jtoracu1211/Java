package Tarea1;

public class Principal {
    public static void main(String[] args) {
        Forma f = new Forma("Rojo", "Forma1", new Punto(23,45));
        Rectangulo r = new Rectangulo("Azul", "Rectangulo1", new Punto(12,34), 5, 10);
        System.out.println(f);
        System.out.println(r);
        System.out.println("Area del rectangulo:"+ r.area());
        System.out.println("Perimetro del rectangulo:"+r.perimetro());
        r.cambiarTamano(2);
        System.out.println(r);
        Cuadrado c = new Cuadrado("Amarillo", "Cuadrado1", new Punto(55,66), 7, 8);
        System.out.println(c);
        System.out.println("Perimetro del cuadrado:"+c.perimetro());
        Elipse e = new Elipse("Verde", "Elipse1", new Punto(12,55), 20, 4);
        System.out.println(e);
        Circulo cir = new Circulo("Naranja", "Circulo1", new Punto(66,44), 33);
        System.out.println(cir.area());
    }
}
