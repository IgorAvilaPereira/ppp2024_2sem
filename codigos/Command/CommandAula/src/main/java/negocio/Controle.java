/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class Controle {
   private Command slots[];
   
   public Controle(){
       this.slots = new Command[8];
       for (int i = 0; i < this.slots.length; i++) {
           this.slots[i] = new NoCommand();           
       }
   }
   
   public void setSlot(int i, Command command){
       this.slots[i] = command;
   }
   
   public void buttonOn(int i){
       this.slots[i].execute();
   }
   
    public void button1Off(int i) {
        this.slots[i].undo();
    }  

//    public void setSlot1(Command slot1) {
//        this.slot1 = slot1;
//    }
//
//    public void setSlot2(Command slot2) {
//        this.slot2 = slot2;
//    }
//
//    public void button1On() {
//        this.slot1.execute();
//    }
//
  
//    
//    
//    public void button2On() {
//        this.slot2.execute();
//    }
//
//    public void button2Off() {
//        this.slot2.undo();
//    }    
}