
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero, contador = 1;

        System.out.print("Ingrese un numero: ");
        numero = entrada.nextInt();

        do {
            System.out.println(numero + " x " + contador
                    + " = " + (numero * contador));

            contador++;

        } while (contador <= 12);

        entrada.close();
    }
}
