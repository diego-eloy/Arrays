/*
PosicionesArray) Crea una aplicación que:

pida por teclado la longitud de un array
cree el array de enteros de la longitud introducida
pida al usuario que introduzca todos los datos del array
mueva una posición todos los elementos. el elemento de 
la posición 0 pasa a la posición 1 y así sucesivamente. 
El elemento que está en la última posición pasa a la primera
realizar la tarea anterior pero al contrario. El elemento que está en 
la primera posición pasa a la última y así sucesivamente
 */
package EjerciciosT4;
import java.util.Scanner;
/**
 *
 * @author Dieguito
 */
public class posicionesArrayRepaso {
    static Scanner teclado = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Dime la longitud del ARRAY");
        int tamanio = teclado.nextInt();
        
        int[] array = new int[tamanio];
         for (int i = 0; i < array.length; i++) {
             System.out.println("Dime Un numero para ir rellenando el ARRAY:");
             array[i] = teclado.nextInt();
        }
        int primero = array[0];
        for (int i = 0; i < array.length; i++) {
            if (i == array.length-1) {
                array[i] = primero;
            }else{
                array[i] = array[0+1];
            }
            System.out.println(array[i]);
        }
        
                
                
         
    }
}
