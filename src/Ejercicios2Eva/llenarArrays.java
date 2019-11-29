package Ejercicios2Eva;

/* 
(LlenarArrays) Crear un array de int que tenga 
5 posiciones y rellenarla con números aleatorios del 10 al 50.
Mostrar por pantalla todos los números generados.
 */

/**
 *
 * @author Usuario DAM 1
 */
public class llenarArrays {

    public static void main(String[] args) {

        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            //te genera 5 numeros de 10 a 40
            
                                      //Math.random() --> desde donde empieza "0"
                                      //* 40 --> donde acaba "0 - 40"
                                      //+ 10 --> suma 10  a los dos "10 - 50"
                                            
                                            
            int numeroAleatorio = (int) (Math.random() * 40) + 10;
            array[i] = numeroAleatorio;
            System.out.println(array[i]);
        }
    }
}
