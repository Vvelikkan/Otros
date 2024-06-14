package Models;
public class User {
    private String iduser;
    private String name;
    private String email;
    private String password;
    private String role;
    private String direccion;
    private String telefono;
    private String estado;
    private String fecha_registro;

    public User(String name, String email, String password, String role) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.role = role;
    }

public  String getName(){
    return name;
}
public  String getEmail(){
    return email;
}
public  String getPassword(){
    return password;
}
public  String getRole(){
    return role;
}
public  String getDireccion(){
    return direccion;
}
public  String getTelefono(){
    return telefono;
}
public  String getEstado(){
    return estado;
}
public  String getFecha_registro(){
    return fecha_registro;
}
public  String getIduser(){
    return iduser;
}
public void setName(String name){
    this.name = name;
}
public void setEmail(String email){
    this.email = email;
}
public void setPassword(String password){
    this.password = password;
}
public void setRole(String role){
    this.role = role;
}
public void setDireccion(String direccion){
    this.direccion = direccion;
}
public void setTelefono(String telefono){
    this.telefono = telefono;
}
public void setEstado(String estado){
    this.estado = estado;
}
public void setFecha_registro(String fecha_registro){
    this.fecha_registro = fecha_registro;
}
public void setIduser(String iduser){
    this.iduser = iduser;
}
}




