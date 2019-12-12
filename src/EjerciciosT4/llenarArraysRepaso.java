/*
 (LlenarArrays) Crear un array de int que tenga 5 posiciones 
y rellenarla con números aleatorios del 10 al 50. 
Mostrar por pantalla todos los números generados.
 */
package EjerciciosT4;
import java.util.Scanner;

/**
 *
 * @author Dieguito
 */
public class llenarArraysRepaso {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int[] aleatorio = new int[5];
        
        for (int i = 0; i < aleatorio.length; i++) {
            aleatorio[i] = (int) (Math.random()*40)+10;
        }
        for (int array : aleatorio) {
            System.out.println(array);
        }
    }
            
}
