package Tarea01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class ListaProductos {
    ArrayList<Producto> lista = new ArrayList<Producto>();
    void addProducto(Producto producto) {
        lista.add(producto);
    }
    void removeProductoPorValoracionMinima(double valoracion) {
        Iterator<Producto> it = lista.iterator();
        while (it.hasNext())
            if (it.next().getValoracion() < valoracion) it.remove();
    }
    public Producto getProducto(int pos) {
        if (pos < lista.size() && pos >= 0) return lista.get(pos);
        else return null;
    }
    public String toString() {
        String cadena = "Lista de productos" + "\n";
        for (Producto p : lista) {
            cadena += p.toString() + "\n";
        }
        return cadena;
    }
    void ordenarProductos(int criterio) {
        switch (criterio) {
            case 0:
                Collections.sort(lista, Collections.reverseOrder());
                break;
            case 1:
                Collections.sort(lista, Producto.ORDEN_PRECIO);
                break;
        }
    }
}
