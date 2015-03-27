
package Nomina;

import static java.awt.Frame.MAXIMIZED_BOTH;

public class Nomina {
    
 
    public static void main(String[] args){
        VerificarUsuario VU=new VerificarUsuario();
        VU.setLocationRelativeTo(VU);
     //   VU.setResizable(false);
        
        VU.setTitle("Verificar el Usuario");
        VU.setVisible(true);
        
        
    }
    
}
