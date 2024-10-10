/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import negocio.Command;
import negocio.TvLG;

/**
 *
 * @author iapereira
 */
public class TvLgCommand implements Command {

    private final TvLG tvLg;

    public TvLgCommand(TvLG tvLG) {
        this.tvLg = tvLG;
    }

    @Override
    public void execute() {
       this.tvLg.powerOn();
    }

    @Override
    public void undo() {
        this.tvLg.powerOff();
    }
    
}
