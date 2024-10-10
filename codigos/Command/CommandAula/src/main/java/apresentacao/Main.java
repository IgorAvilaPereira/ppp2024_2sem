/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package apresentacao;

import negocio.TvLgCommand;
import negocio.Controle;
import negocio.HomeTheater;
import negocio.MacroCinemaEmCasaCommand;
import negocio.TvLG;
import negocio.TvSamsung;
import negocio.TvSamsungCommand;

/**
 *
 * @author iapereira
 */
public class Main {

    public static void main(String[] args) {
        Controle controle = new Controle();
        controle.setSlot(0, new MacroCinemaEmCasaCommand(new TvSamsung(), new HomeTheater()));
//        controle.setSlot(0, new TvSamsungCommand(new TvSamsung()));
//        controle.setSlot(1, new TvLgCommand(new TvLG()));
        controle.buttonOn(0);
//        controle.buttonOn(1);

//        controle.button1Off();
    }
}
