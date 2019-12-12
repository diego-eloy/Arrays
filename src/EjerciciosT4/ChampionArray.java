/*
 (ChampionArray) Desarrolla un programa que simule los cruzes del sorteo de la champion. 
Para ello debes saber que eisten dos bombos:

bombo1: Barcelona, PSG, Bayern, Manchester City, Juventus, RB Leizpzig, Valencia
bombo2: Real Madrid, Tottenham, Nápoles, B. Dortmund, O. Lyon, Chelsea, Atalanta, 
Atético de Madrid 
El programa debe empajerar un equipo del bombo1 con un equipo del bombo2 sin repetir 
posibilidades y mostrarlo por pantalla con el siguiente formato:
 */
package EjerciciosT4;

/**
 *
 * @author Dieguito
 */
public class ChampionArray {

    public static void main(String[] args) {

        String[] bombo1 = {"Barcelona", "PSG", "Machester City", "Bayern", "Juventus",
            "RB Leizpzig", "Valencia", "Liverpool"};
        String[] bombo2 = {"Real Madrid", "Tottenham", "Napoles", "B.Dortmund", "O.Lyon",
            "Chelsea", "Atalanta", "Atletico de Madrid"};
        
        int[] generardosBombo1 = new int[bombo1.length];
        int[] generardosBombo2 = new int[bombo2.length];

        for (int i = 0; i < bombo1.length; i++) {
            System.out.println(bombo1[bomboAleatorio(bombo1.length)]);
            System.out.println(bombo2[bomboAleatorio(bombo2.length)]);
            System.out.println("******");
            
            int aleatorio;
            
            do{
                aleatorio = bomboAleatorio(bombo1.length);
            }while(encontrar(aleatorio, generardosBombo1));
            generardosBombo1[i] = aleatorio;
        }
        
    }
    public static int bomboAleatorio(int longitud) {
        int aleatorio1 = (int) (Math.random() * longitud - 1);
        return aleatorio1;
    }
    
    public static boolean encontrar(int n,int[] colecciones){
        boolean encontrado = false;
        for (int x = 0; x < colecciones.length; x++) {
            if (colecciones[x] == n) {
               encontrado = true;
               break;
            }
        }
    return encontrado;
    }

}
