
/**
 *  Clase que dibuja una figura 
 * 
 * @author - CATARINA GONÇALVES ALMEIDA
 *  
 */
public class PintorFiguras
{
    private static final int ANCHO_BLOQUE = 4;
    private static final char ESPACIO = ' ';
    private static final char CAR1 = 'B';
    private static final char CAR2 = '=';

    /**
     * Dibuja una figura (ver enunciado) de altura
     * indicada (se asume la altura un valor correcto)
     * 
     * (usa bucles for)
     */
    public void dibujarFigura(int altura) {
        int dbj = altura - 1;
        int jbd = 1;
        for (int fila = 0; fila <= altura; fila++){
            System.out.print("B");
            escribirEspacios(ESPACIO,(altura - fila) * ANCHO_BLOQUE);
            for(int col = 1; col <= 2 * fila - 1; col++){
                escribirEspacios(CAR1,ANCHO_BLOQUE);
            }
        }
        System.out.println();
     
    }

    /**
     * Método privado de ayuda que escribe n espacios en la misma línea
     */
    private  void escribirEspacios(char caracter, int n) {
        for(int  espa= 1; espa <= n; espa++){
            System.out.println(caracter);
        }
    }
}