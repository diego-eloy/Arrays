package EjerciciosT4;

import java.util.Scanner;
//Generar aleatoriamente una palabra de la longitud que metamos por teclado

/**
 *
 * @author Diego-Eloy DAM 1
 */
public class generadorPalabras {

    static Scanner teclado = new Scanner(System.in);
    static char[] palabras = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
        'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public static void main(String[] args) {

        System.out.println("Dime la longitud de tu palabra");
        int cantidad = teclado.nextInt();
        String palabraRamdom = "";

        for (int i = 0; i < cantidad; i++) {

            int ordenAleatoria = (int) (Math.random() * 26);
            palabraRamdom += palabras[ordenAleatoria];

        }
        System.out.println(palabraRamdom);
    }
}
