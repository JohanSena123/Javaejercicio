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
public class Ejercicio21_Resultado_Examenes {
    private Scanner scanner = new Scanner(System.in);

    public Ejercicio21_Resultado_Examenes() {
        ejecutarEvaluador();
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
        double acumulador = 0;
        int contador = 0;
        int resultado = 1;

        System.out.println("Bienvenido al evaluador de promedios");

        while (resultado == 1) {
            System.out.print("Ingrese su calificacion: ");
            double nota = scanner.nextDouble();

            if (nota < 1) {
                System.out.println("Número no valido");
            } else {
                acumulador += nota;
                contador++;

                System.out.print("¿Desea ingresar otra nota? (Si=1, No=0): ");
                resultado = scanner.nextInt();
            }
        }

        if (contador > 0) {
            double promedio = acumulador / contador;

            if (promedio > 3.5) {
                System.out.printf("¡Felicidades, aprobaste! Promedio: ", +promedio);
            } else {
                System.out.printf("No aprobaste. Promedio: ", +promedio);
            }
        } else {
            System.out.println("No se ingresaron calificaciones válidas.");
        }
    }

    private void ejecutarEvaluador() {
        String nombre = obtenerNombre();
        mostrarSaludo(nombre);
    }
}
