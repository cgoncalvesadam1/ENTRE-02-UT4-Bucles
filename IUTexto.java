import java.util.Scanner;
/**
 * Modela el interfaz para interactuar con el usuario
 * @author - 
 */
public class IUTexto
{
    private Scanner teclado;
    private CalculadoraOctal calculadora;
    private PintorFiguras pintor;

    /**
     * Constructor  
     */
    public IUTexto(CalculadoraOctal calculadora, PintorFiguras pintor)
    {
        this.teclado = new Scanner(System.in);
        this.calculadora = calculadora;
        this.pintor = pintor;
    }

    /**
     * Controla la lógica de la aplicación
     */
    public void iniciar()
    {
        hacerSumasOctales();
        dibujarFiguras();

    }

    /**
     *  - borrar la pantalla
     *  - pedir al usuario un par de números
     *  - si los números no están en octal mostrar un mensaje
     *  - si los números no tienen el mismo número de cifras mostrar un mensaje
     *  - si son correctos calcular su suma octal y mostrar el resultado en pantalla
     *  - los pasos anteriores se repiten mientras el usuario quiera (pulsa 'S' o 's')
     *  
     */
    private void hacerSumasOctales()
    {
        char hacerSumas = 'S';
        while(hacerSumas == 'S' || hacerSumas == 's'){
            Pantalla.borrarPantalla();
            System.out.print("Escribe el primer numero: ");
            int n1 = teclado.nextInt();
            System.out.print("Escribe el segundo numero: ");
            int n2 = teclado.nextInt();
            if(!Utilidades.estaEnOctal(n1) || !Utilidades.estaEnOctal(n2)){
                System.out.println("Error falta octal");

            }
            else if (Utilidades.contarCifras(n1) != Utilidades.contarCifras(n2)){
                System.out.println("No tienen el mismo numero de cifras");
            }
        }
        teclado.nextLine();
        System.out.println("Hacer otra suma? (S / s)");
        hacerSumas = teclado.nextLine().charAt(0);
    }

    /**
     *  Pide al usuario un valor de altura, 
     *  valida que sea correcto (un valor entre 1 y 10)
     *  y muestra la figura en pantalla
     */

    private void dibujarFiguras()
    {
        System.out.println("Ahora dibujara una figura");
        int altura = 0;
        while (!(altura >= 1 && altura <= 10)){
            System.out.println("Altura de la figura ?(1-10)");
            altura = this.teclado.nextInt();
            if(altura >= 1 && altura <= 10){
                pintor.dibujarFigura(altura);  
            }
        }
    }

}
