package Views;

import Models.User;

public class UsersView {
    public static void main(String[] args) {
        User caja = new User("Juan Perez", "cosa@gmail.com", "ILP345671", "Caja");
        System.out.println(caja.getName());
        caja.getName();
        System.out.println("EL nombre del cajero cambió a "+caja.getName());
    }
}
