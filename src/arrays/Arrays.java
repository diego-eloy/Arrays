package arrays;

/**
 *
 * @author Diego_Eloy DAM 1
 */
public class Arrays {

    public static void main(String[] args) {
        // TODO code application logic here

        //longitud es = 9
        //pero la posicion empieza desde el 0
        //es decir que el "9" tendria una posicion de 8
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

        //longitud es = 3
        String[] palabras = new String[3];

        //acceso de lectura
        int valor = numeros[0];

        System.out.println(valor);
        System.out.println("-------------------");

        //de esta forma podemos sacar todos los numeros del array
        //utilizando la longitud de la variable "numeros"
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        //For Each : sirve para tratar la variable array y te saca todo
        //lo que tiene dentro la variable numeros
        //fore + (CONTROL + SCAPE)
        for (int item : numeros) {
            System.out.println("");
            System.out.println("-------------");
            
        }
    }

}
