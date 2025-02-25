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
public class Ejercicio12_Cajero_Automatico {
    private String nombre;
    private double saldo;
    private Scanner scanner = new Scanner(System.in);

    public Ejercicio12_Cajero_Automatico() {
        System.out.println("Bienvenido al cajero automatico");
        this.nombre = pedirNombre();
        this.saldo = guardarSaldo();
        mostrarInfo();
    }

    private String pedirNombre() {
        System.out.print("Introduzca su nombre: ");
        return scanner.nextLine();
    }

    private double guardarSaldo() {
        return 1000000; 
    }

    private void mostrarInfo() {
        boolean operacionExitosa = false;
        while (!operacionExitosa) {
            try {
                System.out.print("¿Cuanto desea retirar, " + nombre + "? ");
                double monto = scanner.nextDouble();

                if (monto > 0 && monto <= saldo) {
                    saldo -= monto;
                    System.out.println(nombre + ", usted retiro " + monto);
                    System.out.println(nombre + ", su balance actual es " + saldo);
                    operacionExitosa = true;
                } else {
                    System.out.println("Error: El monto debe ser mayor a 0 y menor o igual a su saldo.");
                    System.out.print("¿Desea repetir la operacion? (0: si, 1: no): ");
                    int repetir = scanner.nextInt();
                    if (repetir == 1) {
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println("Error: Debe ingresar un numero valido.");
                scanner.nextLine(); // Limpiar el buffer
            }
        }
    }
}

