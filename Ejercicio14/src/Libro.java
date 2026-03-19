public class Libro {
    private final int codigo;
    private final String titulo;
    private final String autor;
    private int unidadesDisponibles;

    public Libro(int codigo, String titulo, String autor, int unidadesDisponibles) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public boolean hayDisponibilidad() {
        return unidadesDisponibles > 0;
    }

    public boolean prestarUnaUnidad() {
        if (!hayDisponibilidad()) {
            return false;
        }
        unidadesDisponibles--;
        return true;
    }

    public void devolverUnaUnidad() {
        unidadesDisponibles++;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", unidadesDisponibles=" + unidadesDisponibles +
                '}';
    }
}