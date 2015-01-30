/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

/**
 *
 * @author Usuario
 */
public class SumaVectores {

    int[] tercero;

    public static int[] SumVec(int[] n, int[] v) {

        if (n.length == 0 || v.length == 0 || v.length != n.length) {
            return null;
        } else {

            int sum = n[0] + v[0];
            int[] arr = new int[n.length];
            arr[0] = sum;
            for (int i = 0; i < arr.length; i++) {
            }
            return null;
        }
    }
}
