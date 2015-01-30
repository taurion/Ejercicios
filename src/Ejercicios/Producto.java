/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author Usuario
 */
public class Producto {
    
    
    public static int Mult(int n){
      if(n<0){
            System.err.println("No se permite");
        }else{
        if(n==0) return 1;
        else return n * Mult(n-1);
           
            }
        return 0;
        
        
    }
    
}
