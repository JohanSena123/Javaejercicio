/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Johan
 */

public class Ejercicio25_Tienda_Virtual {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<String> productos = new ArrayList<>();
    private double totalCompra = 0;

    public Ejercicio25_Tienda_Virtual() {
        ejecutarCompra();
    }

    private String obtenerNombre() {
        System.out.print("Por favor, ingrese su nombre estimado usuario: ");
        return scanner.nextLine().trim();
    }

    private void mostrarSaludo(String nombre) {
        System.out.println("Bienvenido estimado usuario(a) " + nombre);
        procesarCompra();
    }

    private void procesarCompra() {
        int cantidadProductos;
        
        while (true) {
            System.out.print("¿Cuántos productos desea comprar?: ");
            try {
                cantidadProductos = Integer.parseInt(scanner.nextLine());
                if (cantidadProductos > 0) {
                    break;
                } else {
                    System.out.println("Ingrese una cantidad válida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número entero válido.");
            }
        }

        for (int i = 1; i <= cantidadProductos; i++) {
            System.out.print("Ingrese el nombre del producto " + i + ": ");
            String nombreProducto = scanner.nextLine().trim();
            productos.add(nombreProducto);

            double precio;
            while (true) {
                System.out.print("Ingrese el precio del producto " + i + ": ");
                try {
                    precio = Double.parseDouble(scanner.nextLine());
                    if (precio > 0) {
                        break;
                    } else {
                        System.out.println("Ingrese un precio válido.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error: Ingrese un precio numérico válido.");
                }
            }

            totalCompra += precio;
        }

        mostrarResumen();
    }

    private void mostrarResumen() {
        System.out.println("️ **Resumen de Compra:**");
        System.out.println("Productos comprados: " + String.join(", ", productos));
        System.out.println("Costo total de los productos: $" + totalCompra);
    }

    private void ejecutarCompra() {
        String nombre = obtenerNombre();
        mostrarSaludo(nombre);
    }
}
