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
public class Ejercicio14_Impresora {
    private String nombre;
    private Scanner scanner = new Scanner(System.in);

    public Ejercicio14_Impresora() {
        this.nombre = solicitarNombre();
        mostrarSaludo();
        mostrarProceso();
    }

    private String solicitarNombre() {
        System.out.print("Ingrese su nombre: ");
        return scanner.nextLine();
    }

    private void mostrarSaludo() {
        String saludo = "Bienvenido(a) señor(a)";
        System.out.println(saludo + " " + nombre);
    }

    private void mostrarProceso() {
        int capacidadHojas, capacidadPaginas, papelRestante, cantidadPaginas;

        System.out.println("Capacidad maxima: 50 hojas");
        System.out.print("Ingrese la cantidad de hojas en la impresora: ");
        capacidadHojas = scanner.nextInt();

        if (capacidadHojas > 100 || capacidadHojas < 1) {
            System.out.println("ERROR");
            return;
        }

        capacidadPaginas = capacidadHojas * 2;
        papelRestante = capacidadPaginas;

        while (papelRestante > 1 && papelRestante <= 100) {
            System.out.println("Paginas disponibles para imprimir: " + papelRestante);
            System.out.print("Ingrese la cantidad de paginas que desea imprimir (0 para salir): ");
            cantidadPaginas = scanner.nextInt();

            if (cantidadPaginas > papelRestante || cantidadPaginas < 1) {
                System.out.println("No hay suficiente papel o numero invalido");
                papelRestante = 0;
            } else {
                System.out.println("Imprimiendo " + cantidadPaginas + " paginas.");
                papelRestante -= cantidadPaginas;
                System.out.println("Quedan: " + papelRestante + " paginas restantes");
            }

            if (papelRestante < 1) {
                System.out.println("Llene la bandeja de papel.");
                papelRestante = 0;
            }
        }
    }
}
