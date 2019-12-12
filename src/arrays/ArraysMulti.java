package arrays;

import java.util.Scanner;

/**
 *
 * @author Dieguito
 */
public class ArraysMulti {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
                            //  I = filas &  X = columnas
        int[][] numeros ={{11,12,13},{21,22,23},{31,32,33}};
        System.out.println(numeros[0][2]);
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("********");
            for (int x = 0; x < numeros[i].length; x++) {
                System.out.print(numeros[i][x] );
            }            
        }
        System.out.println("");
        
        //Pedir por consola cuantos datos quiero introducir(filas)
        //y cuantas columnas tiene cada dato
        //llenar de forma aleatoria las posiciones
        
        int filas,columnas;
        
        do {
            System.out.println("Dime las filas que quieres:");
            filas = teclado.nextInt(); 
        } while (filas < 1);
             
        do {
            System.out.println("Dime las comunas que quieres:");
            columnas = teclado.nextInt();
        } while (columnas < 1);
         
        int[][] array = new int[filas][columnas];
        
        rellenar(array);
        recorrerArray(array);
    }
    
    public static int generarAleatorio(){
        int aleatorio= (int) (Math.random()*100);
        return aleatorio;
    }
    public static void rellenar(int[][] colecciones){
    
        for (int i = 0; i < colecciones.length; i++) {
            for (int x = 0; x < colecciones[i].length; x++) {
                colecciones[i][x] = generarAleatorio();
            }
        }
    }
    public static void recorrerArray(int[][] colecciones){
        for (int[] coleccione : colecciones) {
            for (int i : coleccione) {
                System.out.print(i+" ");
            }
            System.out.println("\n********");
        }
    }
    
    
}
