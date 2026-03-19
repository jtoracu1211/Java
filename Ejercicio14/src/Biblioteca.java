import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Biblioteca {
    private final ArrayList<Libro> libros;
    private final ArrayList<Alumno> alumnos;

    public Biblioteca() {
        this.libros = new ArrayList<>();
        this.alumnos = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public int disponibilidad_libro(String tituloLibro) {
        Libro libro = buscarLibroPorTitulo(tituloLibro);

        if (libro == null) {
            return -1;
        }

        if (libro.prestarUnaUnidad()) {
            return libro.getCodigo();
        }

        return -1;
    }

    public boolean devolucion_libro(String dniAlumno, int codigoLibro) {
        Alumno alumno = buscarAlumnoPorDni(dniAlumno);
        Libro libro = buscarLibroPorCodigo(codigoLibro);

        if (alumno == null || libro == null) {
            return false;
        }

        if (!alumno.devolverLibroPrestado(codigoLibro)) {
            return false;
        }

        libro.devolverUnaUnidad();
        return true;
    }

    public boolean prestamo_libro(String dniAlumno, String tituloLibro) {
        Alumno alumno = buscarAlumnoPorDni(dniAlumno);

        if (alumno == null || !alumno.puedePedirPrestamo()) {
            return false;
        }

        Libro libro = buscarLibroPorTitulo(tituloLibro);
        if (libro == null || !libro.hayDisponibilidad()) {
            return false;
        }

        if (alumno.tieneLibro(libro.getCodigo())) {
            return false;
        }

        int codigoPrestado = disponibilidad_libro(tituloLibro);
        if (codigoPrestado == -1) {
            return false;
        }

        boolean agregado = alumno.agregarLibroPrestado(codigoPrestado);
        if (!agregado) {
            Libro libroParaRollback = buscarLibroPorCodigo(codigoPrestado);
            if (libroParaRollback != null) {
                libroParaRollback.devolverUnaUnidad();
            }
            return false;
        }

        return true;
    }

    public List<Libro> listadoOrdenadoPorTitulo() {
        ArrayList<Libro> copiaOrdenada = new ArrayList<>(libros);
        copiaOrdenada.sort(Comparator.comparing(Libro::getTitulo, String.CASE_INSENSITIVE_ORDER));
        return copiaOrdenada;
    }

    public void imprimirListadoOrdenadoPorTitulo() {
        List<Libro> ordenados = listadoOrdenadoPorTitulo();
        for (Libro libro : ordenados) {
            System.out.println(libro.getTitulo() + " -> Unidades disponibles: " + libro.getUnidadesDisponibles());
        }
    }

    private Libro buscarLibroPorTitulo(String tituloLibro) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(tituloLibro)) {
                return libro;
            }
        }
        return null;
    }

    private Libro buscarLibroPorCodigo(int codigoLibro) {
        for (Libro libro : libros) {
            if (libro.getCodigo() == codigoLibro) {
                return libro;
            }
        }
        return null;
    }

    private Alumno buscarAlumnoPorDni(String dniAlumno) {
        for (Alumno alumno : alumnos) {
            if (alumno.getDni().equalsIgnoreCase(dniAlumno)) {
                return alumno;
            }
        }
        return null;
    }
}