package ExamenT4;

import java.util.Scanner;

/**
 *
 * @author Diego-Eloy DAM 1
 */
public class EjercicioTres {

    static Scanner teclado = new Scanner(System.in);
    static Object[][] array = new Object[10][3];
    static int filas = 0;
    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("");
            System.out.println("1-Registrar Coche:");
            System.out.println("2-Listar Coche:");
            System.out.println("3-Buscar Coche:");
            System.out.println("4-Calcular Arreglos:");
            System.out.println("5-Salir");
            System.out.println("**********************************");
            System.out.println("¿Que opcion eliges?");
            System.out.println("");
            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    registrarCoche(); 
                    break;
                case 2:
                    listarCoches();
                    break;

                case 3:
                    buscarCoches();
                    break;
                    
                case 4:
                    calcularArreglos();
                    break;
            }

        } while (opcion < 6 && opcion > 0);
    }

    public static void registrarCoche() {
        System.out.println("Dime el nombre del coche:");
        array[filas][0] = teclado.next();
        System.out.println("Dime los caballos del coche:");
        array[filas][1] = teclado.nextInt();
        System.out.println("Dime el precio del coche:");
        array[filas][2] = teclado.nextDouble();
        
        filas++;
    }
    
    public static void listarCoches(){  
        for (int i = 0; i < array.length; i++) {
            for (int x = 0; x < array[i].length; x++) {
                System.out.println(array[i][x]);
                System.out.println("***********");
            }
        }
    }
    
    public static void buscarCoches(){
        System.out.println("Dime la marca del coche");
        String marca = teclado.next();
        for (int i = 0; i < 10; i++) {
        if (array[i][0].toString().equals(marca) ) {
            System.out.printf("El coche %s tiene %d y su precio es %.2f",marca,array[i][1],array[i][2]);
        }
        }
    }
    
    public static void calcularArreglos(){
        for (int i = 0; i < array.length; i++) {
            System.out.printf("El precio del coche %d es %.2f",i,array[i][2]);
        }
    }
}
