/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author Usuario
 */
public class Fibonacci {
    
    public static int NFibonacci(int n){
        
        if (n==0||n==1)return 1;    
        else return NFibonacci(n-1) + NFibonacci(n-2);
        }
    
    
}
