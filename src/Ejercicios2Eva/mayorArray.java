package Ejercicios2Eva;

 
import java.util.Arrays;
import java.util.Scanner;

/*
(MayorArray) Crea una aplicación que realice lo siguiente:
pida por pantalla la longitud del array de enteros
crea el array de enteros con la longitud introducida
pida al usuario que introduzca todos los datos del array
saque por pantalla el elemento mayor y el elemento menor
 */

/**
 *
 * @author Diego-Eloy DAM 1
 */
public class mayorArray {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce le tamaño del Array");
        int tamanio = teclado.nextInt();
        int[] numeros = new int[tamanio];

        for (int i = 0; i < tamanio; i++) {
            System.out.println("Dime numeros");
            int numeroPedido = teclado.nextInt();
            numeros[i]=numeroPedido;
        }
        
        Arrays.sort(numeros);
        System.out.printf("El numero mas grande es %d %n",numeros[numeros.length -1]);
        System.out.printf("El numero mas pequeño es %d %n",numeros[0]);
    }
}
