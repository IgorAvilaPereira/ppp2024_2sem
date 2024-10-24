/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Menu {
    private Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
    
    
    public Menu(Command command){
        this.command = command;
    }
    
    public void pressioneiMenu(){
        this.command.execute();
    }
    
    public void controlZ(){
        this.command.undo();
    }
    
}
