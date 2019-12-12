/*
(SumaArrays) Crear una aplicación que:
pida la longitud de dos arrays de enteros
crea los array de enteros con las longitudes introducidas
crea un tercer array de la misma longitud que los dos anteriores
rellena el tercer array con la suma de las posiciones 
(Array1.posicion1 + array2.posicion = array3.posicion)
 */
package EjerciciosT4;
import java.util.Scanner;
/**
 *
 * @author Dieguito
 */
public class sumaArrayRepaso {
   static Scanner teclado = new Scanner(System.in);
   
    public static void main(String[] args) {
        System.out.println("Dime la longitud del primer ARRAY");
        int tamanio1 = teclado.nextInt();
        System.out.println("Dime la longitud del segundo ARRAY");
        int tamanio2 = teclado.nextInt();
        
        int[] arrayUno = new int[tamanio1];
        int[] arrayDos = new int[tamanio2]; 
        int[] arrayTres = new int[tamanio2];
        
        for (int i = 0; i < arrayUno.length; i++) {
            System.out.println("Rellena el ARRAY UNO:");
            arrayUno[i] = teclado.nextInt();
        }
        for (int i = 0; i < arrayDos.length; i++) {
            System.out.println("Rellena el ARRAY DOS:");
            arrayDos[i] = teclado.nextInt();
        }
        for (int i = 0; i < arrayTres.length; i++) {
            arrayTres[i] = arrayUno[i] + arrayDos[i];
        }
        for (int arrayTre : arrayTres) {
            System.out.println("ARRAY TRES");
            System.out.println("----------");
            System.out.println(arrayTre);
        }
        
        
    }
}
