/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author Usuario
 */
public class Primeros {
    
    public static int Suma(int n){
        if(n<0){
            System.err.println("No se permite");
        }else{
        if(n==0) return 0;
        else return n + Suma(n-1);
           
            }
        return 0;
        
    
            
        }
}
    
    

