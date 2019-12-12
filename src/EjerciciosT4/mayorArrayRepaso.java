/*
MayorArray) Crea una aplicación que realice lo siguiente:
pida por pantalla la longitud del array de enteros
crea el array de enteros con la longitud introducida
pida al usuario que introduzca todos los datos del array
saque por pantalla el elemento mayor y el elemento menor
 */
package EjerciciosT4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Dieguito
 */
public class mayorArrayRepaso {
    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Dime la longitud del ARRAY");
        int tamanio = teclado.nextInt();
        
        int[] numeros = new int[tamanio];
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce Un numero al ARRAY:");
            numeros[i] = teclado.nextInt();
        }
        
        Arrays.sort(numeros);
        System.out.printf("El numero mas grande es: %d %n",numeros[numeros.length -1]);
        System.out.printf("El numero mas pequeño es %d %n",numeros[0]);
    }
}
