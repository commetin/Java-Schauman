
/**
 * PETICIÓN DE VALORES PRIMITIVOS AL USUAIRO
 * 
 * Ejemplo 1.7 Programa Java que pide al usuario los datos del radio y altura de
 * un cilindo y calcular su volumen
 */
import java.util.Scanner;

public class PedirDatos {
    public static void main(String[] args) {
        // Valor de PI
        final double PI = 3.1415926536;
        double radio;
        double altura;

        // se importa la libreria de Scanner
        Scanner teclado = new Scanner(System.in);

        System.out.println("Intoruzca datos del cilindo\n");
        System.out.println("Radio: ");
        radio = teclado.nextDouble();
        System.out.println("Altura: ");
        altura = teclado.nextDouble();

        double area = PI * Math.sqrt(radio) * altura;
        System.out.println("El área del cilindo es: " + area);
    }
}
