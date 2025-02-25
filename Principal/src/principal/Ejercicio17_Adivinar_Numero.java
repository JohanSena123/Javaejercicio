/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Johan
 */
public class Ejercicio17_Adivinar_Numero {
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();

    public Ejercicio17_Adivinar_Numero() {
        ejecutarJuego();
    }

    private String solicitarNombre() {
        System.out.print("Ingrese su nombre: ");
        return scanner.nextLine();
    }

    private void mostrarSaludo(String nombre) {
        System.out.println("Bienvenido apreciado usuario(a) " + nombre + 
            ", a continuación intentaremos adivinar un número del 1 al 100.");
    }

    private void mostrarResultado() {
        int intentos = 0;
        int numeroSecreto = random.nextInt(100) + 1; 
        int numeroIngresado = -1;

        while (numeroIngresado != numeroSecreto) {
            System.out.print("Ingrese un número: ");
            numeroIngresado = scanner.nextInt();
            intentos++;

            if (numeroIngresado < 1 || numeroIngresado > 100) {
                System.out.println("Error, número no válido.");
            } else if (numeroIngresado < numeroSecreto) {
                System.out.println("El número que buscas es mayor.");
            } else if (numeroIngresado > numeroSecreto) {
                System.out.println("El número que buscas es menor.");
            }
        }

        System.out.println("¡Felicidades! Adivinaste el número " + numeroSecreto + 
            " en " + intentos + " intentos.");
    }

    private void ejecutarJuego() {
        String nombre = solicitarNombre();
        mostrarSaludo(nombre);
        mostrarResultado();
    }
}
