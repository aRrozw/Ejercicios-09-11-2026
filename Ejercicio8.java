
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcion;
        double temperatura, resultado;

        do {
            System.out.println("\n===== CONVERSION DE TEMPERATURA =====");
            System.out.println("1. Celsius a Fahrenheit");
            System.out.println("2. Fahrenheit a Celsius");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = entrada.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese temperatura en Celsius: ");
                    temperatura = entrada.nextDouble();

                    resultado = (temperatura * 9 / 5) + 32;

                    System.out.println("Fahrenheit: " + resultado);
                    break;

                case 2:
                    System.out.print("Ingrese temperatura en Fahrenheit: ");
                    temperatura = entrada.nextDouble();

                    resultado = (temperatura - 32) * 5 / 9;

                    System.out.println("Celsius: " + resultado);
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion incorrecta");
            }

        } while (opcion != 3);

        entrada.close();
    }
}
