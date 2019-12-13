/*
 Crear un programa que mediante un menú permita:
Crear un array de números enteros con n posiciones pedidas.
Rellenar el array creado con números aleatorios.
Rellenar el array creado con números pedidos por consola.
Ordenar el array de mayor a menor
Clonar el array con una una mayor longitud. Para ello pedir al usuario 
la nueva longitud (si esta es inferior a la que la existe continuar pidiendo)
Mover todas las posiciones (pedir al usuario que seleccione la orientación)
Mostrar por pantalla el array según está

 */
package EjerciciosT4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class MenuArrays {

    static Scanner teclado = new Scanner(System.in);
    static int[] array;
    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("DIME LA OPCION QUE DESEA HACER:");
            System.out.println("*******************************");
            System.out.println("1-Crear un array de números enteros con n posiciones pedidas.");
            System.out.println("2-Rellenar el array creado con números aleatorios.");
            System.out.println("3-Rellenar el array creado con números pedidos por consola.");
            System.out.println("4-Ordenar el array de mayor a menor");
            System.out.println("5-Clonar el array con una una mayor longitud. Para ello pedir al usuario la nueva longitud");
            System.out.println("6-Mover todas las posiciones ");
            System.out.println("7-Mostrar por pantalla el array según está");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    crearArray();
                    break;
                case 2:
                    rellenarAleatorios();
                    break;
                case 3:
                    rellenarNumerosPedidos();
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                default:
                    System.out.println("");
                    System.out.println("OPCION INCORRECTA");
                    System.out.println("*****************");
                    System.out.println(""); 
                    
            }
        }while (opcion > 7 | opcion < 1);
        
    }
    
    public static void crearArray(){
        System.out.println("Dime cuantas posiciones quieres para tu ARRAY");
        int tamanio = teclado.nextInt();
        array =new int[tamanio];
    }
    
    public static void rellenarAleatorios(){
        for (int i = 0; i < array.length; i++) {
            int aleatorio = (int) (Math.random()*100);
            array[i]=aleatorio;
        }
    }
    
    public static void rellenarNumerosPedidos(){
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Dime un numero para la posicion %d: %n",i);
            array[i] = teclado.nextInt();
        }
    }
    
    public static void ordenar(){
        Arrays.sort(array);
        for (int i = array.length-1; i >= 0; i--) {
        }
    }
    
    public static void clonar(){
        System.out.println("Cual es la nueva logintud que le quieres dar al array:");
        int longitud = teclado.nextInt();
        //sirve para copiar los datos del array y aumentar la longitud de l array
        array = Arrays.copyOf(array,longitud);
    }
    
    
    
    
    
    
    
    
    
    

}
