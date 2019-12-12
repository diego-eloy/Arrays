/*
Temario) Crear un array de Strings llamado 
temario que tendrá de forma inicial los siguientes valores:
 */
package EjerciciosT4;

/**
 *
 * @author Dieguito
 */
public class temarioRepaso {
    static String menus[] = {"Tema 1: Introducción", "Tema 2: Estructuras de datos",
        "Tema 3: Estructuras", "Tema 4: Colecciones", "Tema 5: Orientación a objetos",
        "Tema 6: Clases y Objetos", "Tema 7; Abstracción , Herencia y Polimorfismo",
        "Tema 8: Ficheros y Excepciones", "Tema 9: Bases de datos", "Tema 10: Interfaces"};
    public static void main(String[] args) {
            System.out.println("SALIDA");
            System.out.println("------");
        for (String menu : menus) { 
            System.out.println(menu);
        }
    }
}
