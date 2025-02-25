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
public class Ejercicio_27_Lista_Numeros {
    private Scanner scanner = new Scanner(System.in);

    public Ejercicio_27_Lista_Numeros() {
        ejecutarPrograma();
    }

    private String obtenerNombre() {
        System.out.print("Ingrese su nombre estimado usuario: ");
        return scanner.nextLine().trim();
    }

    private void mostrarSaludo(String nombre) {
        System.out.println("Bienvenido estimado usuario(a) " + nombre);
        procesarNumeros();
    }

    private void procesarNumeros() {
        int cantidad;

        while (true) {
            System.out.print("Ingrese la cantidad de números que desea sumar: ");
            try {
                cantidad = Integer.parseInt(scanner.nextLine());
                if (cantidad > 0) {
                    break;
                } else {
                    System.out.println("Error: Ingrese un número mayor a 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número entero válido.");
            }
        }

        int suma = 0;
        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            while (true) {
                try {
                    suma += Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException e) {
                    System.out.print("Error: Ingrese un número válido. Intente de nuevo: ");
                }
            }
        }

        System.out.println("La suma de los números es: " + suma);
    }

    private void ejecutarPrograma() {
        String nombre = obtenerNombre();
        mostrarSaludo(nombre);
    }
}
