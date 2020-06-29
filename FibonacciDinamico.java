/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonaccidinamico;

/**
 *
 * @author denny
 */
public class FibonacciDinamico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long TInicio, TFin; //Variables para medir el tiempo de ejecución
            TInicio = System.currentTimeMillis();
            System.out.println(fibonacciRecursivo(50));
            TFin = System.currentTimeMillis();
            System.out.println("Tiempo Fibonacci Recursivo: "+ (TFin-TInicio));
		
		
		//Programacion dinámica
            long[] almacenamiento = new long[51];
            TInicio = System.currentTimeMillis();
            System.out.println(fibonacciDinamico(50, almacenamiento));
            TFin = System.currentTimeMillis();
            System.out.println("Tiempo Fibonacci Dinámico: "+ (TFin-TInicio));
    }
    
    private static int fibonacciRecursivo(int n){
        if(n<=1)
            return 1;
        else
            return(fibonacciRecursivo(n-1)+fibonacciRecursivo(n-2));
    }
    
    private static long fibonacciDinamico(int n, long[] almacenamiento){
        if(n<=1)
            return 1;
        if (almacenamiento[n]==0)
            almacenamiento[n]=fibonacciDinamico(n-1,almacenamiento)+fibonacciDinamico(n-2,almacenamiento);
        return almacenamiento[n];
    }
}
