package negocio;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.Builder;
import lombok.Singular;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author iapereira
 */
@Getter
@Setter
@Builder(access = AccessLevel.PUBLIC)
public class Pizza {
    private int tamanho;
    private boolean queijo;
    private boolean tomate;
    private boolean bacon;
    private boolean cebola;

  
    
    

   
    
}
