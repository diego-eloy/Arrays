package EjerciciosT4;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Diego-Eloy DAM 1
 */
public class loteria {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int aciertos = 0;
        int[] boleto = new int[7];
        int[] loteria = new int[7];

        System.out.println("DAME 7 NUMEROS");
        System.out.println("----------------------");

        //El bucle te pide 7 numeros 
        for (int i = 0; i < boleto.length; i++) {

            System.out.println("Dame un Numero");
            int numero = teclado.nextInt();
            //Aqui decimos que numero se guarde en boleto en cada posicion de i
            boleto[i] = numero;
        }
        for (int i = 0; i < loteria.length; i++) {
            //forma de crear un numero aleatorio, 
            //tenemos que castearlo a Entero (INT) 
            int numeroAleatorio = (int) (Math.random() * loteria.length);
            loteria[i] = numeroAleatorio;
        }
        //Aqui hemos ordenamos los numeros de Boleto y Loteria De Menor a Mayor
        Arrays.sort(boleto);
        Arrays.sort(loteria);

        for (int i = 0; i < boleto.length; i++) {

            if (boleto[i] != loteria[i]) {
                System.out.println("Has perdido");
                break;
            } else {
                aciertos ++;
            }
        }
        
        System.out.println("Has ganado");
        
        
        
        
        
        
        
    
    }
}
