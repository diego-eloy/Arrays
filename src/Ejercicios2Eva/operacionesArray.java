/*
(OperacionesArray) Crear un array con 10 posiciones y asígnale 
números enteros entre 0 y 9, ambos inclusive (de forma automática). Se mostrarán 
los datos separados por una coma y un espacio. Una vez hecho esto se modificará 
el array del de la manera indicada en cada apartado, y se mostrará de nuevo.
Incrementar en 1 los valores pares y en -1 los impares.
Duplicar los valores positivos menores que 5
Sumar a cada valor un valor entero aleatorio entre -5 y 5.
Mover los datos una posición hacia la derecha (el primero pasa al segundo, 
el segundo al tercero, ..., y el último al primero).
Intercambiar el primero con el segundo, el tercero con el cuarto, ..., 
el penúltimo con el último.
Invertir el array
Mostrar la posición del primer par y del último impar.
 */
package Ejercicios2Eva;

import java.util.Scanner;

/**
 *
 * @author Usuario DAM 1
 */
public class operacionesArray {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 10);
        }

        //Incrementar en 1 los valores pares y en -1 los impares.
        int[] incrementoNumeros = numeros.clone();

        imprimirArray(numeros);
        System.out.println("Incremento +1 (PAR) y -1 (IMPAR)");
        System.out.println("--------------------------------");
        for (int i = 0; i < numeros.length; i++) {

            if (incrementoNumeros[i] % 2 == 0) {
                incrementoNumeros[i]++;
            } else {
                incrementoNumeros[i]--;
            }
        }
        imprimirArray(incrementoNumeros);

        //Duplicar los valores positivos menores que 5
        int[] duplicarValor = numeros.clone();

        System.out.println("Duplicar valor < 5 por 2");
        System.out.println("------------------------");

        for (int i = 0; i < numeros.length; i++) {
            if (duplicarValor[i] < 5) {
                duplicarValor[i] = duplicarValor[i] * 2;
            }
        }
        imprimirArray(duplicarValor);

        //Sumar a cada valor un valor entero aleatorio entre -5 y 5.
        int[] sumarNumAleatorio = numeros.clone();
        System.out.println("Sumar a cada valor un numero entre -5 y 5");
        System.out.println("-----------------------------------------");
        for (int i = 0; i < numeros.length; i++) {

            int aleatorio1 = (int) (Math.random() + 5);
            int aleatorio2 = (int) (Math.random() + 10);
            int aletorioFinal = (int) aleatorio1 - aleatorio2;
            sumarNumAleatorio[i] += aletorioFinal;
        }
        imprimirArray(sumarNumAleatorio);

        //Intercambiar el primero con el segundo, el tercero con el cuarto
        //, ..., el penúltimo con el último
        
        //Invertir el array
        System.out.println("Invertir el array");
        System.out.println("-----------------");
        int contador = 0;
        int[] cadenaNumeros = new int[10];
        int[] invertirArray = numeros.clone();

        for (int i = numeros.length - 1; i >= 0; i--) {
            cadenaNumeros[i] = invertirArray[contador];
            contador++;
        }
        imprimirArray(cadenaNumeros);

        //Mostrar la posición del primer par y del último impar.
        int posPar = 0;
        int posImpar = 0;
        boolean encontradoPar = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                if (!encontradoPar) {
                    posPar = i;
                    encontradoPar = true;
                }
            }
            if (numeros[i] % 2 != 0) {
                posImpar = i;
            }
        }
    }

    // accesso (public / protected / private)
    // tipo de acceso (directo o no)
    // tipo de retorno (dato que me retorna el metodo)
    //si pongo tipo de retorno, la ultima linea del metodo es un return
    // optativo argumentos: tipo y nombre
    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.printf("%d, ", array[i]);
            } else {
                System.out.printf("%d %n", array[i]);
            }
        }
    }
}
