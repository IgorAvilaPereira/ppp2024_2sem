package apresentacao;

import negocio.FolderProxy;
import negocio.IFolder;
import negocio.User;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setUsername("iapereira");
        // user.setPassword("123");
        IFolder proxy = new FolderProxy(user);
        proxy.performOperations("touch teste.txt");
    }
}