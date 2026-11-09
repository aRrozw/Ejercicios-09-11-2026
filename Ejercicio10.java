
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nombre, continuar;
        double precio, monto, total = 0;
        int cantidad, totalProductos = 0;

        do {
            entrada.nextLine();

            System.out.print("Nombre del producto: ");
            nombre = entrada.nextLine();

            System.out.print("Precio del producto: ");
            precio = entrada.nextDouble();

            System.out.print("Cantidad vendida: ");
            cantidad = entrada.nextInt();

            if (precio > 0 && cantidad > 0) {

                monto = precio * cantidad;
                total = total + monto;
                totalProductos = totalProductos + cantidad;

                System.out.println("Producto: " + nombre);
                System.out.println("Monto de venta: S/ " + monto);

            } else {
                System.out.println("Precio o cantidad no validos");
            }

            System.out.print("¿Desea registrar otra venta? (S/N): ");
            continuar = entrada.next();

        } while (continuar.equalsIgnoreCase("S"));

        System.out.println("\n===== RESUMEN DE VENTAS =====");
        System.out.println("Monto total vendido: S/ " + total);
        System.out.println("Cantidad de productos vendidos: " + totalProductos);

        if (totalProductos > 0) {
            System.out.printf("Promedio por producto: S/ %.2f%n",
                    total / totalProductos);
        } else {
            System.out.println("No hay productos vendidos");
        }

        entrada.close();
    }
}
