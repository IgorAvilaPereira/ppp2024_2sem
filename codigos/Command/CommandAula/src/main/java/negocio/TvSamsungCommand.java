/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class TvSamsungCommand implements Command {

    private final TvSamsung tvSamsung;

    public TvSamsungCommand(TvSamsung tvSamsung) {
        this.tvSamsung = tvSamsung;
    }

    @Override
    public void execute() {
        this.tvSamsung.on();
    }

    @Override
    public void undo() {
        this.tvSamsung.off();
    }
    
}
