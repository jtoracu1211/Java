import java.util.Arrays;

public class Alumno {
    public static final int MAX_LIBROS_PRESTAMO = 5;

    private final String dni;
    private final String nombre;
    private int numeroLibrosPrestamo;
    private final int[] codigosLibrosPrestados;

    public Alumno(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.numeroLibrosPrestamo = 0;
        this.codigosLibrosPrestados = new int[MAX_LIBROS_PRESTAMO];
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroLibrosPrestamo() {
        return numeroLibrosPrestamo;
    }

    public int[] getCodigosLibrosPrestados() {
        return Arrays.copyOf(codigosLibrosPrestados, numeroLibrosPrestamo);
    }

    public boolean puedePedirPrestamo() {
        return numeroLibrosPrestamo < MAX_LIBROS_PRESTAMO;
    }

    public boolean tieneLibro(int codigoLibro) {
        for (int i = 0; i < numeroLibrosPrestamo; i++) {
            if (codigosLibrosPrestados[i] == codigoLibro) {
                return true;
            }
        }
        return false;
    }

    public boolean agregarLibroPrestado(int codigoLibro) {
        if (!puedePedirPrestamo() || tieneLibro(codigoLibro)) {
            return false;
        }

        codigosLibrosPrestados[numeroLibrosPrestamo] = codigoLibro;
        numeroLibrosPrestamo++;
        return true;
    }

    public boolean devolverLibroPrestado(int codigoLibro) {
        int indice = -1;

        for (int i = 0; i < numeroLibrosPrestamo; i++) {
            if (codigosLibrosPrestados[i] == codigoLibro) {
                indice = i;
                break;
            }
        }

        if (indice == -1) {
            return false;
        }

        for (int i = indice; i < numeroLibrosPrestamo - 1; i++) {
            codigosLibrosPrestados[i] = codigosLibrosPrestados[i + 1];
        }

        numeroLibrosPrestamo--;
        codigosLibrosPrestados[numeroLibrosPrestamo] = 0;
        return true;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", numeroLibrosPrestamo=" + numeroLibrosPrestamo +
                ", codigosLibrosPrestados=" + Arrays.toString(getCodigosLibrosPrestados()) +
                '}';
    }
}