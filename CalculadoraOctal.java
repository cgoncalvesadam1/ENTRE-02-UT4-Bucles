
/**
 *  Representa a una calcualdora que hace sumas octales
 * 
 * @author - CATARINA GONÇALVES ALMEIDA
 * 
 */
public class CalculadoraOctal
{
    /**
     * sumar dos nºs supuestos en base 8 y con el mismo
     * nº de cifras
     * Asumimos positivos
     */
    public int sumarEnOctal(int n1, int n2) {
        int suma = 0;
        int cifras = 0;
        int contador = 0;
        int resultadoFinal = 0;           
        while(n1 != 0 || n2 != 0){
            int cifras1 = n1 % 10;
            int cifras2 = n2 % 10;
            suma = cifras1 + cifras2 + cifras;
            cifras = 0;
            if (suma > 7){
                suma -= 8;
                resultadoFinal = resultadoFinal + ((int) Math.pow(10, contador) * (suma));
                cifras = 1;
            }
            else {
                resultadoFinal += ((int) Math.pow(10, contador) *1);
            }
            n1 /= 10;
            n2 /= 10;
            contador++;
        }
        return resultadoFinal;
    }
}


