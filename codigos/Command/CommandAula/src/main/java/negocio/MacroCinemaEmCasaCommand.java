/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class MacroCinemaEmCasaCommand implements Command {
    private final HomeTheater homeTheater;
    private final TvSamsung tvSamsung;
    
    public MacroCinemaEmCasaCommand(TvSamsung tvSamsung, HomeTheater homeTheater){
        this.homeTheater = homeTheater;
        this.tvSamsung = tvSamsung;
    }

    @Override
    public void execute() {
        this.tvSamsung.on();
        this.homeTheater.modoCinema();
    }

    @Override
    public void undo() {
        this.tvSamsung.off();
        this.homeTheater.desligar();
    }
    
}
