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
public class Ejercicio15_Coche {
    private Scanner scanner = new Scanner(System.in);

    public Ejercicio15_Coche() {
        ejecutarProceso();
    }

    private String solicitarNombre() {
        System.out.print("Ingrese su nombre: ");
        return scanner.nextLine();
    }

    private void mostrarSaludo(String nombre) {
        System.out.println("Bienvenido señor(a) " + nombre);
    }

    private void mostrarDistanciaTiempo() {
        String distanciaTotal = "";
        String tiempoTotal = "";
        int repetir = 1;

        while (repetir == 1) {
            System.out.print("Destino deseado: ");
            String nombreDestino = scanner.nextLine();

            System.out.print("Introduzca la distancia en kilómetros: ");
            double distancia = scanner.nextDouble();

            System.out.print("Ingrese la rapidez del coche (km/h): ");
            double rapidez = scanner.nextDouble();
            scanner.nextLine(); // Limpiar buffer

            if (distancia < 1 || rapidez < 1) {
                System.out.println("Error");
                System.out.print("¿Desea repetir la operacion? (Si=1, No=0): ");
                repetir = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer
            } else {
                double tiempo = distancia / rapidez;
                distanciaTotal += distancia + " km ";
                tiempoTotal += tiempo + " horas ";
                System.out.println("Tardara: " + tiempo + " horas en llegar");

                System.out.print("¿Desea calcular nuevamente? (Si=1, No=0): ");
                repetir = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer
            }
        }

        System.out.println("Su distancia recorrida es de: " + distanciaTotal);
        System.out.println("Sus tiempos fueron: " + tiempoTotal);
    }

    private void ejecutarProceso() {
        int i = 0;
        while (i < 3) {
            String nombre = solicitarNombre();
            mostrarSaludo(nombre);
            mostrarDistanciaTiempo();
            System.out.print("¿Desea repetir el proceso? (Si=1, No=3): ");
            i = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
        }
    }
}
