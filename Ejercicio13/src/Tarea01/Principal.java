package Tarea01;

public class Principal {
    public static void main(String[] args) {
        ListaProductos lista = new ListaProductos();
        lista.addProducto(new Producto("Balon de fútbol New Balance", 4, 3.5));
        lista.addProducto(new Producto("Xiaomi Redmi Note 8 Pro 6GB/128GB", 163, 4.8));
        lista.addProducto(new Producto("Polaroid OneStep2 + Un carrete", 79, 3.9));
        lista.addProducto(new Producto("Monitor Gamer - AOC G2490VXA 23.8 LED FullHD", 134.99, 4.6));
        lista.addProducto(new Producto("adidas Originals TEAM COURT", 28.43, 4.9));
        lista.removeProductoPorValoracionMinima(4);
        System.out.println(lista.toString());
        lista.ordenarProductos(0);//por valoracion
        System.out.println("Ordenados por valoración descendente");
        System.out.println(lista.toString());
        lista.ordenarProductos(1);//por precio
        System.out.println("Ordenados por precio ascendente");
        System.out.println(lista.toString());
    }
}

