import java.util.Scanner;
/**
 *   Clase de utilidades
 *   Incluye métodos estáticos
 *   
 *   @author - CATARINA GONÇALVES ALMEIDA
 */
public class Utilidades
{
    
    /**
     * Dado un número n (asumimos positivo)
     * devueve true si está en octal false en otro caso
     * Un nº está en octal si cada una de sus cifras
     * es un valor entre 0 y 7
     * 
     * (usa bucles while)
     */
    public static boolean estaEnOctal(int n) {
        int numero = 0;
        int cifra = numero / 10;
        int m = numero % 10;
        while(cifra != 0){
            if (m <= 7){
                return false;
            }
            m = cifra % 10;
            cifra /= 10;
            }
        if (m >= 8){
            return false;
        }
        return true;
    }

    /**
     * Dado un número n (asumimos positivo)
     * devuelve la cantidad de cifras que tiene
     * 
     * (usa bucles while)
     */
    public static int contarCifras(int n) {  
        int cifras = 0;
        while (n != 0) {
            cifras++;
            n = n / 10;
        }   
        return cifras;
    }

}
