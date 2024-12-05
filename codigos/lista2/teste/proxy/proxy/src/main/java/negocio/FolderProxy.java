package negocio;

public class FolderProxy implements IFolder {
    private Folder folder;
    private User user;

    public FolderProxy(User user) {
        this.user = user;
        this.folder = new Folder();
    }

    @Override
    public void performOperations(String cmd) {
        if (this.user != null){
            if (this.user.getUsername() != null && this.user.getPassword() != null){
                if (!this.user.getUsername().isEmpty() && !this.user.getPassword().isEmpty()){
                    this.folder.performOperations(cmd);
                    System.out.println("Usuário:"+this.user.getUsername()+" executou o seguinte comando:"+cmd);
                } else {
                    throw new IllegalArgumentException("Usuário precisa ter username e password! Deu xabum!");
                }
            } else {
                throw new IllegalArgumentException("Usuário precisa ter username e password! Deu xabum!");
            }
        } else {
            throw new IllegalArgumentException("Sem usuário não rola! Dá xabum!");
        }
    }
    
}
