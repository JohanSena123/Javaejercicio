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
public class Ejercicio23_Registro_Ventas {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<String> productos = new ArrayList<>();
    private double total = 0.0;

    public Ejercicio23_Registro_Ventas() {
        ejecutarRegistro();
    }

    private String obtenerNombre() {
        String nombre;
        do {
            System.out.print("Ingrese su nombre distinguido usuario(a): ");
            nombre = scanner.nextLine().trim();
        } while (nombre.isEmpty());
        return nombre;
    }

    private void mostrarSaludo(String nombre) {
        System.out.println("Bienvenido distinguido usuario(a) " + nombre);
        mostrarProceso();
    }

    private void mostrarProceso() {
        System.out.println("Bienvenido al registro de productos.");

        while (true) {
            System.out.print("Ingrese el nombre del producto: ");
            String producto = scanner.nextLine();
            
            double precio;
            while (true) {
                System.out.print("Ingrese el precio del producto: ");
                try {
                    precio = Double.parseDouble(scanner.nextLine());
                    if (precio > 0) {
                        break;
                    } else {
                        System.out.println("Ingrese un precio válido.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error: Ingrese un número válido.");
                }
            }

            productos.add(producto + " ($" + precio + ")");
            total += precio;

            System.out.print("¿Desea agregar más productos? (Sí=1, No=0): ");
            int resultado = scanner.nextInt();
            scanner.nextLine(); 

            if (resultado == 0) {
                break;
            }
        }

        mostrarResumen();
    }

    private void mostrarResumen() {
        System.out.println("️ **Productos Registrados:**");
        for (String producto : productos) {
            System.out.println(" " + producto);
        }
        System.out.println("? **Costo Total:**" + total);
    }

    private void ejecutarRegistro() {
        String nombre = obtenerNombre();
        mostrarSaludo(nombre);
    }
}
