/*
    (SumaArrays) Crear una aplicación que:
pida la longitud de dos arrays de enteros
crea los array de enteros con las longitudes introducidas
crea un tercer array de la misma longitud que los dos anteriores
rellena el tercer array con la suma de las posiciones 
(Array1.posicion1 + array2.posicion = array3.posicion)
 */
package EjerciciosT4;

import java.util.Scanner;

/**
 *
 * @author Diego-Eloy,.  DAM 1
 */
public class sumaArray {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int long1, long2;
        System.out.println("Introduce la primera longitud:");
        long1 = teclado.nextInt();
        System.out.println("Introduce la segunda longitud:");
        long2 = teclado.nextInt();
        
        int[] arrayUno = new int[long1];
        int[] arrayDos = new int[long2];
        int[] arrayTres = new int[long1];
        
        for (int i = 0; i < arrayUno.length; i++) {
            System.out.println("Dime numeros");
            int numeroPedido = teclado.nextInt();
            arrayUno[i]=numeroPedido;
        }
        for (int i = 0; i < arrayDos.length; i++) {
            System.out.println("Dime numeros segundo");
            int numeroPedido = teclado.nextInt();
            arrayDos[i]=numeroPedido;
        }
        
        for (int i = 0; i < arrayDos.length; i++) {
            arrayTres[i] = arrayUno[i] + arrayDos[i];
            
        }
        
         
         
        
        
}
}
