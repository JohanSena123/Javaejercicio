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
public class Ejercicio18_Bibliotecas {
    private Scanner scanner = new Scanner(System.in);
    
    public Ejercicio18_Bibliotecas() {
        ejecutarRegistro();
    }

    private String obtenerNombre() {
        String nombre;
        do {
            System.out.print("Ingrese su nombre distinguido usuario: ");
            nombre = scanner.nextLine().trim();
        } while (nombre.isEmpty());
        return nombre;
    }

    private void mostrarSaludo(String nombre) {
        System.out.println("Bienvenido distinguido usuario(a) " + nombre);
    }

    private void mostrarProceso() {
        StringBuilder libros = new StringBuilder();
        StringBuilder autores = new StringBuilder();
        StringBuilder paginas = new StringBuilder();

        System.out.println("Bienvenido al registro de biblioteca");

        while (true) {
            System.out.print("¿Desea registrar algún libro? Si: 1 No: 0: ");
            int respuesta = scanner.nextInt();
            scanner.nextLine(); 

            if (respuesta == 1) {
                System.out.print("Ingrese el nombre del libro: ");
                String libro = scanner.nextLine();
                System.out.print("Ingrese el autor: ");
                String autor = scanner.nextLine();
                System.out.print("Ingrese la cantidad de hojas: ");
                int numPaginas = scanner.nextInt();
                scanner.nextLine(); 

                if (numPaginas < 1) {
                    System.out.println("Error: número de hojas no válido");
                } else {
                    libros.append(libro).append(", ");
                    autores.append(autor).append(", ");
                    paginas.append(numPaginas).append(", ");
                }
            } else if (respuesta == 0) {
                break;
            } else {
                System.out.println("Opción no válida");
            }
        }

        System.out.println("Los libros registrados son: " + libros);
        System.out.println("Los autores de estos libros son: " + autores);
        System.out.println("Las cantidades de hojas de estos libros son: " + paginas);
    }

    private void ejecutarRegistro() {
        String nombre = obtenerNombre();
        mostrarSaludo(nombre);
        mostrarProceso();
    }
}
