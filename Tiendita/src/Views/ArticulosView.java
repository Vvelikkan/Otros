package Views;

import Models.Articulos;

public class ArticulosView {
public static void main(String[] args) {
    Articulos articulo = new Articulos();
    articulo.ariticulos(1, "1", "1", "1", "Papas", "10", "15", "100", "Papas de la mejor calidad", "imagen", "Activo");
    System.out.println("Nombre del ariticulo: "+articulo.getNombre());
}
}


