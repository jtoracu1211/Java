public class Principal {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarLibro(new Libro(1001, "Clean Code", "Robert C. Martin", 2));
        biblioteca.agregarLibro(new Libro(1002, "Effective Java", "Joshua Bloch", 1));
        biblioteca.agregarLibro(new Libro(1003, "El Quijote", "Miguel de Cervantes", 3));

        biblioteca.agregarAlumno(new Alumno("11111111A", "Ana"));
        biblioteca.agregarAlumno(new Alumno("22222222B", "Luis"));

        boolean prestamo1 = biblioteca.prestamo_libro("11111111A", "Clean Code");
        boolean prestamo2 = biblioteca.prestamo_libro("11111111A", "Effective Java");
        boolean prestamo3 = biblioteca.prestamo_libro("22222222B", "Effective Java");

        System.out.println("Prestamo 1 (Ana, Clean Code): " + prestamo1);
        System.out.println("Prestamo 2 (Ana, Effective Java): " + prestamo2);
        System.out.println("Prestamo 3 (Luis, Effective Java): " + prestamo3);

        boolean devolucion = biblioteca.devolucion_libro("11111111A", 1002);
        System.out.println("Devolucion (Ana, codigo 1002): " + devolucion);

        System.out.println("\nListado ordenado por titulo:");
        biblioteca.imprimirListadoOrdenadoPorTitulo();
    }
}
