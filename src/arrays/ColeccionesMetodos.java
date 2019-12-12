package arrays;

import java.util.Scanner;

/**
 *
 * @author Dieguito
 */
public class ColeccionesMetodos {

    public static void main(String[] args) {

        String[] nombres = {"Diego", "Nacho", "Jorge", "Alvaro", "Borja", "Manuel"};
        String[] asignaturas = {"Matematicas", "Sistemas", "Programacion", "Lenguaje de Marcas", "FOL", "Base de datos"};

        //En que posicion esta el nombre Borja
        
        //encontrar("borja", nombres);
        //encontrar("diego", nombres);
        //encontrar("programacion", asignaturas);
        
        Scanner teclado = new Scanner(System.in);
        String nombreEncontrar;
        do {
            nombreEncontrar = teclado.next();
            
        } while (encontrarVerdaderoFalso(nombreEncontrar, nombres));
        
    }

    //acceso retorno nombreNombre (parametro){
    //lo que quiero ejecutar
    //}
    public static void encontrar(String nombre, String[] coleccion) {
        for (int i = 0; i < coleccion.length; i++) {
            if (nombre.equals(coleccion[i].toLowerCase())) {
                System.out.println("Nombre encontrado en la posicion " + i);
            }
        }
    }

    public static boolean encontrarVerdaderoFalso(String n, String[] coleccion) {
        
        boolean encontrado = false;
        for (int i = 0; i < coleccion.length; i++) {
            if (n.equals(coleccion[i].toLowerCase())) {
                encontrado = true;
                System.out.println("Nombre encontrado en la posicion " + i);
                break;
            }
        } 
        return encontrado;
    }

}
