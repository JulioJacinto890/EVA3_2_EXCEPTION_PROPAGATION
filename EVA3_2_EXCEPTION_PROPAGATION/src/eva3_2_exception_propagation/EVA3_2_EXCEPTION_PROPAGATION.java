/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_2_exception_propagation;

/**
 *
 * @author hp
 */
public class EVA3_2_EXCEPTION_PROPAGATION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("inicia main");
        A();
        
        System.err.println("TERMINAR MAIN");
        
    }
    
    public static void A(){
        System.err.println("INICIO A");
        B();
        
        System.err.println("Terminar A");
    }
    public static void B(){
        System.err.println("INICIO B");
        C();
        
        System.err.println("Terminar B");
    }
    public static void C(){
        System.err.println("INICIO C");
         int x=3,y=0;
        int res=x / y;
       
        System.out.println("Resyultado:"+ res);
        
        System.err.println("Terminar C");
    }
    
   
       
                
        
    }

