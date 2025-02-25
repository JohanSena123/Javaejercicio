/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;


import java.util.Scanner;

/**
 *
 * @author Johan
 */

public class Ejercicio28_Proceso_Ventas {
    private Scanner scanner = new Scanner(System.in);

    public Ejercicio28_Proceso_Ventas() {
        ejecutarPrograma();
    }

    private String solicitarNombre() {
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
            System.out.print("Ingrese la cantidad de productos a registrar: ");
            try {
                cantidadProductos = Integer.parseInt(scanner.nextLine());
                if (cantidadProductos > 0) {
                    break;
                } else {
                    System.out.println("Error: Debe registrar al menos 1 producto.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número válido.");
            }
        }

        StringBuilder nombresProductos = new StringBuilder();
        double totalPagar = 0;

        for (int i = 1; i <= cantidadProductos; i++) {
            System.out.print("Ingrese el nombre del producto " + i + ": ");
            String nombreProducto = scanner.nextLine();
            nombresProductos.append(nombreProducto).append(", ");

            double precio;
            while (true) {
                System.out.print("Ingrese el precio del producto: ");
                try {
                    precio = Double.parseDouble(scanner.nextLine());
                    if (precio > 0) break;
                    System.out.println("Error: El precio debe ser mayor a 0.");
                } catch (NumberFormatException e) {
                    System.out.println("Error: Ingrese un precio válido.");
                }
            }

            int cantidad;
            while (true) {
                System.out.print("Ingrese la cantidad del producto: ");
                try {
                    cantidad = Integer.parseInt(scanner.nextLine());
                    if (cantidad > 0) break;
                    System.out.println("Error: La cantidad debe ser mayor a 0.");
                } catch (NumberFormatException e) {
                    System.out.println("Error: Ingrese una cantidad válida.");
                }
            }

            totalPagar += precio * cantidad;
        }

        System.out.println("Los productos comprados son: " + nombresProductos);
        System.out.println("El total a pagar es de: $" + totalPagar);
    }

    private void ejecutarPrograma() {
        String nombre = solicitarNombre();
        mostrarSaludo(nombre);
    }
}
