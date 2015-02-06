/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("-------Suma---------");
        System.out.println(Ejercicios.Primeros.Suma(4));
        
        System.out.println("-------Multiplicar---------");
        System.out.println(Ejercicios.Producto.Mult(5));
        
        System.out.println("-------Suma Array---------");
        int[] a = {1,2,3,4,5,6,7,8,9,76,5,3,2,2,2,3,3};
        int[] b = Ejercicios.SumArray.SumArray(a);
        if(a.length==0) System.out.println("Vacio");
        else System.out.println(b[0]);
        
        System.out.println("-------Suma Vectores---------");
        int[] primer_vector ={10,1,3};
        int[] segundo_vector ={10,1,3};
        int[] sumaV = Ejercicios.SumaVectores.SumVec(primer_vector,segundo_vector);
       System.out.println("-------fb---------");
        System.out.println(Ejercicios.Fibonacci.NFibonacci(5));
    }
}
