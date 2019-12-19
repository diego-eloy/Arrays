package ExamenT4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Diego-Eloy DAM 1
 */
public class EjercicioDos {

    static Scanner teclado = new Scanner(System.in);
    static int[] array = new int[20];

    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("1-Rellenar posicion");
            System.out.println("2-Obtener elemento de una posicion");
            System.out.println("3-Mostrar el array completo");
            System.out.println("4-mostrar el array ordenado");
            System.out.println("5-Rotar el array");
            System.out.println("6-Salir");
            System.out.println("**********************************");
            System.out.println("¿Que opcion eliges?");
            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    rellenarArray();
                    break;
                case 2:
                    System.out.println("Dime la posicion que quieres: ");
                    int posicionDos = teclado.nextInt();
                    obtenerElemento(posicionDos);

                    break;

                case 3:
                    mostrarArray();
                    break;

                case 4:
                    mostrarArrayOrdenado();
                    break;

                case 5:
                    System.out.println("Dime que en que direccion quieres que rote");
                    int posicion = teclado.nextInt();
                    if (posicion == 0) {
                        System.out.println("El array rotara a la izquierda");

                    } else if (posicion == 1) {
                        System.out.println("El array rotara a la derecha");

                    }

                    rotarArray(posicion);
                    break;

            }
        } while (opcion < 7 && opcion > 0);

    }

    public static void rellenarArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Dime un numero para la poscion %d:  ", i);
            array[i] = teclado.nextInt();
        }
        System.out.println("");
    }

    public static int obtenerElemento(int posicion) {
        System.out.printf("El numero es : %d %n", array[posicion]);
        return array[posicion];
    }

    public static void mostrarArray() {
        for (int mostrar : array) {
            System.out.print(" " + mostrar);
        }
        System.out.println("");
    }

    public static void mostrarArrayOrdenado() {
        Arrays.sort(array);
        for (int mostrar : array) {
            System.out.print(" " + mostrar);
        }
        System.out.println("");
    }

    public static void rotarArray(int posicion) {
        if (posicion == 0) {
            for (int i = array.length-1; i < 0; i--) {
                
            }
        } else if (posicion == 1) {
            System.out.println("El array rotara a la derecha");

        }

    }
}
