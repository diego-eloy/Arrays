package EjerciciosT4;
import java.util.Scanner;
/**
 *
 * @author Diego-Eloy DAM 1
 */
public class multiplicarArray {
    
    static int numeros[] = new int [5];
    static Scanner teclado= new Scanner(System.in);
    
    public static void main(String[] args) {
        
        int suma = 0;
        int media= 0;
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("DIME UN NUMERO");
            int numero = teclado.nextInt();
            numeros[i] = numero; 
        }
         for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numeros[i] *2;
        }
         for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
         for (int i = 0; i < numeros.length; i++) {
            media = suma / numeros.length;
        }
         System.out.printf("La suma es: %d %n",suma);
         System.out.printf("La media es: %.2f %n",(double)suma/(double)numeros.length);
         System.out.printf("La media es: %d %n",media);
         
    }
}
