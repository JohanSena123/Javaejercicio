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
public class Ejercicio24_Registro_Vehiculo {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<String> placas = new ArrayList<>();
    private ArrayList<String> horas = new ArrayList<>();

    public Ejercicio24_Registro_Vehiculo() {
        ejecutarRegistro();
    }

    private String obtenerNombre() {
        System.out.print("Por favor, introduzca su nombre distinguido usuario: ");
        return scanner.nextLine().trim();
    }

    private void mostrarSaludo(String nombre) {
        System.out.println("Bienvenido distinguido usuario(a) " + nombre);
        procesarRegistro();
    }

    private void procesarRegistro() {
        int cantidadVehiculos;

        while (true) {
            System.out.print("Ingrese la cantidad de vehiculos que están ingresando: ");
            try {
                cantidadVehiculos = Integer.parseInt(scanner.nextLine());
                if (cantidadVehiculos > 0) {
                    break;
                } else {
                    System.out.println("Ingrese un número válido de vehículos.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número válido.");
            }
        }

        for (int i = 1; i <= cantidadVehiculos; i++) {
            System.out.print("Ingrese la placa del vehiculo " + i + ": ");
            String placa = scanner.nextLine().trim();
            placas.add(placa);

            String hora;
            while (true) {
                System.out.print("Ingrese la hora de ingreso en formato de 24 horas (HH:mm): ");
                hora = scanner.nextLine().trim();
                if (hora.matches("([01]\\d|2[0-3]):[0-5]\\d")) {
                    break;
                } else {
                    System.out.println("Formato incorrecto. Ingrese la hora en formato HH:mm.");
                }
            }
            horas.add(hora);
        }

        mostrarResumen();
    }

    private void mostrarResumen() {
        System.out.println("**Vehículos Registrados:**");
        for (int i = 0; i < placas.size(); i++) {
            System.out.println("Placa: " + placas.get(i) + " Hora de ingreso: " + horas.get(i));
        }
    }

    private void ejecutarRegistro() {
        String nombre = obtenerNombre();
        mostrarSaludo(nombre);
    }
}
