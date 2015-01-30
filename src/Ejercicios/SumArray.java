/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author Usuario
 */
public class SumArray {

    public static int[] SumArray(int[] n) {

        int len = n.length;
        
        if (len <= 1) {
            return n;
        } else {
            int[] enviar = new int[len - 1];
            int sum = n[0] + n[1];
            enviar[0] = sum;
            for (int x = 1; x < len - 1; x++) {
                enviar[x] = n[x + 1];
            }
            return SumArray(enviar);
        }

    }
}
