package negocio;

import java.io.IOException;

public class Folder implements IFolder {

    @Override
    public void performOperations(String cmd) {
        try {
            Runtime.getRuntime().exec(cmd);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}
