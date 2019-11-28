package arrays;

//

/**
 *
 * @author Usuario DAM 1
 */
public class EjerciciosPrueba {

    public static void main(String[] args) {
        
        //sacar los numeros pares de la coleccion NUMEROS
        
        /*int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
            16, 17, 18, 19, 20};

        int multiplosCero = 0;
        for (int numerosPares : numeros) {

            if (numerosPares == 12){
                break;      //esto sirve para romper la lectura del for
            }
            if (numerosPares%2 == 0) {
                multiplosCero ++;
            }
        }
        System.out.printf("El numero de multiplos es %d \n",multiplosCero);

        //Variables Array de ejemplo --> 
        
        boolean[] condiciones = {true, false, true};
        char[] letras = {'H', 'J', 'L'};*/
        
        //Sacar el numero de tipos de variables Complejas -->
        //Tenemos que fijarnos en el valor e igualar la clase del valor a la clase que queremos comparar
        
        /*
        Object[] cosas = {"palabras", 1, 5, 4.60, "hjg", "jsiherhehpb", true, false, 'V', 'F'};
        

        int acumuladorS = 0;
        int acumuladorD = 0;
        int acumuladorC = 0;
        int acumuladorI = 0;
        int acumuladorB = 0;

        for (Object cosa : cosas) {

            if (String.class == cosa.getClass()) {
                acumuladorS++;
            } else if (Double.class == cosa.getClass()) {
                acumuladorD ++;
            } else if (Character.class == cosa.getClass()){
                acumuladorC ++;
            } else if (Integer.class == cosa.getClass()){
                acumuladorI ++;
            } else if (Boolean.class == cosa.getClass()){
                acumuladorB ++;
            }
        }
        
        System.out.printf("El numero de String es %d \n",acumuladorS);
        System.out.printf("El numero de Double es %d \n",acumuladorD);
        System.out.printf("El numero de Character es %d \n",acumuladorC);
        System.out.printf("El numero de Integer es %d \n",acumuladorI);
        System.out.printf("El numero de Boolean es %d \n",acumuladorB);
        
        */
        
        //Generar 200 numeros aleatorios y guardarlos en la posicion 0-199
        int[] numeros = new int[200];
                
        for (int i = 0; i < numeros.length; i++) {
            int numeroAlt = (int) (Math.random() * 20);
            numeros[i] = numeroAlt;
            System.out.println(numeros[i]);
        }
        
        
    }
     
}
