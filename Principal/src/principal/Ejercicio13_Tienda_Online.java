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
public class Ejercicio13_Tienda_Online {
    private String nombre;
    private Scanner scanner = new Scanner(System.in);

    public Ejercicio13_Tienda_Online() {
        this.nombre = solicitarNombre();
        mostrarSaludo();
        mostrarInfo();
    }

    private String solicitarNombre() {
        System.out.print("Ingresa tu nombre: ");
        return scanner.nextLine();
    }

    private void mostrarSaludo() {
        System.out.println("Bienvenido a la tienda virtual, " + nombre);
    }

    private void mostrarInfo() {
        double precio, acumulador = 0.0;
        int cantidad, resultado = 0;
        StringBuilder productos = new StringBuilder();

        while (resultado == 0) {
            System.out.print("Introduzca el nombre del producto: ");
            String nombreProducto = scanner.nextLine();

            System.out.print("Ingrese el valor del producto: ");
            precio = scanner.nextDouble();

            System.out.print("Ingrese la cantidad de productos: ");
            cantidad = scanner.nextInt();
            scanner.nextLine(); 

            productos.append(nombreProducto).append(" ");
            acumulador += precio * cantidad;

            System.out.print("¿Desea agregar mas productos? (Si=0, No=1): ");
            resultado = scanner.nextInt();
            scanner.nextLine(); 
        }

        System.out.println(nombre + ", sus productos son: " + productos);
        System.out.println("El precio total es: " + acumulador);
    }
}
