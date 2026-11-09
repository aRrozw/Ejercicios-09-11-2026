
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int base, exponente, contador = 1;
        long resultado = 1;

        System.out.print("Ingrese la base: ");
        base = entrada.nextInt();

        do {
            System.out.print("Ingrese un exponente positivo: ");
            exponente = entrada.nextInt();

            if (exponente <= 0) {
                System.out.println("El exponente debe ser positivo");
            }

        } while (exponente <= 0);

        do {
            resultado = resultado * base;
            contador++;

        } while (contador <= exponente);

        System.out.println("Resultado: " + resultado);

        entrada.close();
    }
}
