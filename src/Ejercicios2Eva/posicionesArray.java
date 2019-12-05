/*
 (PosicionesArray) Crea una aplicación que:
pida por teclado la longitud de un array
cree el array de enteros de la longitud introducida
pida al usuario que introduzca todos los datos del array
mueva una posición todos los elementos. el elemento de la posición 0 
pasa a la posición 1 y así sucesivamente. El elemento que está en la 
última posición pasa a la primera
realizar la tarea anterior pero al contrario. El elemento que está en 
la primera posición pasa a la última y así sucesivamente
 */
package Ejercicios2Eva;

import java.util.Scanner;

/**
 *
 * @author Diego-Eloy DAM 1
 */
public class posicionesArray {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Dime la longitud de tu array:");
        int posicion = teclado.nextInt();
        int[] numeros = new int[posicion];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("");
            System.out.printf("Dime 1 numero para la posicion %d %n", i);
            numeros[i] = teclado.nextInt();
        }

        //muestra el array
        /*for (int numero : numeros) {
            System.out.printf("el numero %d",numero);
        }*/
        //Aqui guardamos el primer numero para que luego no nos lo pise
        int primero = numeros[0];

        //cambia el orden de las posiciones
        /*for (int i = 0; i < numeros.length; i++) {
            if (i == numeros.length - 1) {
                numeros[i] = primero;
            } else {
                numeros[i] = numeros[i + 1];
            }
        }
        System.out.println("MODIFICADO");
        System.out.println("-----------------------");

        //mostrar el array modificado
        for (Object numero : numeros) {
            System.out.println(numero);
            System.out.println("");
        }*/
        
        int[] numerosCopia = numeros.clone();
        //cambia el orden de las posiciones al contrario
        for (int i = 0; i < numeros.length; i++) {
            if (i == 0) {
                numerosCopia[i] = numeros[numeros.length - 1];
            } else {
                numerosCopia[i] = numeros[i - 1];
            }
        }

        System.out.println("MODIFICADO AL REVES");
        System.out.println("-----------------------");

        //mostrar el array modificado
        for (Object numeroCop : numerosCopia) {
            System.out.println(numeroCop);
        }
    }
}
