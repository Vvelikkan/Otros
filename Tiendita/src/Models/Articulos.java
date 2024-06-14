package Models;

public class Articulos {
int nume_columna; 
String idarticulo;
String num_estante;
String idCategoria;
String nombre; 
String precio_ompra;
String precio_venta;
String stock;
String descripcion;
String imagen;
String estado;

public void ariticulos(int nume_columna, String idarticulo, String num_estante, String idCategoria, String nombre, String precio_ompra, String precio_venta, String stock, String descripcion, String imagen, String estado){
    this.nume_columna = nume_columna;
    this.idarticulo = idarticulo;
    this.num_estante = num_estante;
    this.idCategoria = idCategoria;
    this.nombre = nombre;
    this.stock = stock;
    this.descripcion = descripcion;
    this.imagen = imagen;
    this.estado = estado;
}
public int getNume_columna(){
    return nume_columna;
}
public String getIdarticulo(){
    return idarticulo;
}
public String getNum_estante(){
    return num_estante;
}
public String getIdCategoria(){
    return idCategoria;
}
public String getNombre(){
    return nombre;
}
public String getPrecio_ompra(){
    return precio_ompra;
}
public String getPrecio_venta(){
    return precio_venta;
}
public String getStock(){
    return stock;
}
public String getDescripcion(){
    return descripcion;
}
public String getImagen(){
    return imagen;
}
public String getEstado(){
    return estado;
}
public void setNume_columna(int nume_columna){
    this.nume_columna = nume_columna;
}
public void setIdarticulo(String idarticulo){
    this.idarticulo = idarticulo;
}
public void setNum_estante(String num_estante){
    this.num_estante = num_estante;
}
public void setIdCategoria(String idCategoria){
    this.idCategoria = idCategoria;
}
public void setNombre(String nombre){
    this.nombre = nombre;
}
public void setPrecio_ompra(String precio_ompra){
    this.precio_ompra = precio_ompra;
}
public void setPrecio_venta(String precio_venta){
    this.precio_venta = precio_venta;
}
public void setStock(String stock){
    this.stock = stock;
}
public void setDescripcion(String descripcion){
    this.descripcion = descripcion;
}
public void setImagen(String imagen){
    this.imagen = imagen;
}
public void setEstado(String estado){
    this.estado = estado;
}
}


