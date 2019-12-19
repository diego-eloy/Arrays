package ExamenT4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Diego-Eloy DAM 1
 */
public class EjercicioUno {

    static Scanner teclado = new Scanner(System.in);
    static int[] array;

    public static void main(String[] args) {

        array = new int[30];
        rellenarAleatoriamente();
        maxMin();
        parImpar();
        numeroRepetido();
    }

    public static void rellenarAleatoriamente() {
        for (int i = 0; i < array.length; i++) {
            int aleatorio = (int) (Math.random() * 20);
            array[i] += aleatorio;
            System.out.printf("%d, ", array[i]);

        }
    }

    public static void maxMin() {
        Arrays.sort(array);
        System.out.println("");
        System.out.println("************************************");
        System.out.printf("El numero Minimo es: %d %n", array[0]);
        System.out.printf("El numero Maximo es: %d %n", array[array.length - 1]);

    }

    public static void parImpar() {
        int acumuladorPar = 0;
        int acumuladorImpar = 0;
        for (int i = 0; i < array.length; i++) {
            int par = array[i] % 2;
            if (par == 0) {
                acumuladorPar++;
            } else if (par != 0) {
                acumuladorImpar++;
            }
        }
        System.out.println("********************************************");
        System.out.printf("Tenemos un total de %d pares %n", acumuladorPar);
        System.out.printf("Tenemos un total de %d impares %n", acumuladorImpar);
        System.out.println("************************************************");
    }

    public static void numeroRepetido() {
        int numero;
        do {
            System.out.println("Dime el numero y te digo cuantas veces se ha repetido:");
            numero = teclado.nextInt();
        } while (!(numero < 20 && numero >= 0));
        int numAcu = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numero) {
                numAcu++;
            }
        }
        System.out.printf("El numero %d se ha repetido %d veces %n",numero,numAcu);
        

    }
}
