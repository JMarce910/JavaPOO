/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejem01;

import Entidad.Persona;

/**
 *
 * @author Pc
 */
public class POOEjem01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona persona1 = new Persona();
        
        Persona persona2 = new Persona ("Marcela", 36, 1094888 );
        
        persona1.setNombre("Rafael");
        
        persona2.getNombre();
        
    }
    
}
