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
public class Ejercicio16_Cuenta_Regresiva {
    private Scanner scanner = new Scanner(System.in);

    public Ejercicio16_Cuenta_Regresiva() {
        ejecutarProceso();
    }

    private String solicitarNombre() {
        System.out.print("Ingrese su nombre: ");
        return scanner.nextLine();
    }

    private void mostrarSaludo(String nombre) {
        System.out.println("Bienvenido Sr(a) " + nombre);
    }

    private void mostrarCuentaRegresiva() {
        System.out.print("Para comenzar la cuenta atras, ingrese un numero mayor a 1: ");
        int numero = scanner.nextInt();

        if (numero <= 1) {
            System.out.println("Error");
            return;
        }

        while (numero > 1) {
            numero--;
            System.out.println(numero);
        }

        System.out.println("Tiempo cumplido");
    }

    private void ejecutarProceso() {
        String nombre = solicitarNombre();
        mostrarSaludo(nombre);
        mostrarCuentaRegresiva();
    }
}
