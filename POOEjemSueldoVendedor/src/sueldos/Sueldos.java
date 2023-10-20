/*
Un programa que averigue el sueldo y la antiguedad de un vendedor
 */
package sueldos;

import entidades.Vendedor;
import servicio.VendedorServicio;

public class Sueldos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
// 11. Ahora instancio un objeto del tipo Servicio y hago una instancia del objeto
// que voy a alojar el retorno (return v1)

        VendedorServicio vs = new VendedorServicio();
        Vendedor v1 = vs.altaVendedor();
        
// Ahora voy a llamar los métodos declarados en la clase Servicio

       vs.SueldoMensual(v1);
       vs.vacaciones(v1);
     
    }
    
}
