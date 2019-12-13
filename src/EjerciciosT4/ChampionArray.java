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
        
        int[] generadosBombo1 = {10,10,10,10,10,10,10,10};
        int[] generadosBombo2 = {10,10,10,10,10,10,10,10};

        for (int i = 0; i < bombo1.length; i++) {

            int aleatorio;
            
            do{
                aleatorio = bomboAleatorio(bombo1.length);
            }while(encontrar(aleatorio, generadosBombo1));
                generadosBombo1[i] = aleatorio;
        }
        
        for (int i = 0; i < bombo2.length; i++) {

            int aleatorio;
            
            do{
                aleatorio = bomboAleatorio(bombo1.length);
            }while(encontrar(aleatorio, generadosBombo2));
                generadosBombo2[i] = aleatorio;
        }
        
        listarArray(generadosBombo1,bombo1, generadosBombo2,bombo2);
    }
    
    public static int bomboAleatorio(int longitud) {
        int aleatorio1 = (int) (Math.random() * longitud);
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
    
    public static void listarArray(int[] coleccion,String[] equipos1,int[] coleccion2,String[] equipos2){
        for (int i = 0; i < coleccion.length; i++) {
            System.out.println(equipos1[coleccion[i]] +" - "+equipos2[coleccion2[i]]);
        }
    }

}
