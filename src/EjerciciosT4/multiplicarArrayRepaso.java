/*
 (MultiplicarArray) Crear un array de 5 posiciones:
se le pedirá al usuario que introduzca cada unos de los elementos del array
Multiplica cada elemento del array * 2 y vuelve a guardar su valor
Saca por consola la suma de todos los números
Saca la media de todos los elementos
 */
package EjerciciosT4;

import java.util.Scanner;

/**
 *
 * @author Dieguito
 */
public class multiplicarArrayRepaso {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int[] array = new int[5];
        int acumulador = 0;
        int media = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Añade un numero al Array:");
            System.out.println("-------------------------");
            array[i] = teclado.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
        System.out.println("");
        System.out.println("ARRAY MULTIPLICADO POR 2");
        System.out.println("------------------------");
        for (int resultado : array) {
            System.out.println(resultado);
        }
        for (int i = 0; i < array.length; i++) {
            acumulador += array[i];
        }

        for (int i = 0; i < array.length; i++) {
            media = acumulador / array.length;
        }
        System.out.printf("La mdeia del array es: %d %n", media);
        System.out.printf("La suma de todos los numeros del array es: %d %n", acumulador);

    }
}
