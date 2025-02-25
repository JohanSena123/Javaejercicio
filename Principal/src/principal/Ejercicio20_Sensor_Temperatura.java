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
public class Ejercicio20_Sensor_Temperatura {
    private Scanner scanner = new Scanner(System.in);

    public Ejercicio20_Sensor_Temperatura() {
        ejecutarMedicion();
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
        double resultado;
        System.out.println("Bienvenido al medidor de temperatura.");

        while (true) {
            System.out.print("Por favor, ingrese la temperatura actual: ");
            resultado = scanner.nextDouble();

            if (resultado < 18 || resultado > 25) {
                System.out.println("¡Alerta! Temperatura no adecuada.");
            } else {
                System.out.println("Temperatura adecuada.");
                break; 
            }
        }
    }

    private void ejecutarMedicion() {
        String nombre = obtenerNombre();
        mostrarSaludo(nombre);
    }
}
