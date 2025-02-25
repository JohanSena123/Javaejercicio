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
public class Ejercicio22_Gestion_Tareas {
    private Scanner scanner = new Scanner(System.in);
    private ArrayList<String> tareas = new ArrayList<>();
    private ArrayList<String> fechas = new ArrayList<>();

    public Ejercicio22_Gestion_Tareas() {
        ejecutarRegistro();
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
        System.out.println("Bienvenido al registro de tareas.");
        
        while (true) {
            System.out.print("Ingrese el nombre de la tarea: ");
            String nombreTarea = scanner.nextLine();
            System.out.print("Ingrese la fecha de vencimiento de la tarea: ");
            String vencimiento = scanner.nextLine();
            
            tareas.add(nombreTarea);
            fechas.add(vencimiento);
            
            System.out.print("¿Desea ingresar otra tarea? (Sí=1, No=0): ");
            int resultado = scanner.nextInt();
            scanner.nextLine();
            
            if (resultado == 0) {
                break;
            }
        }
        
        mostrarResumen();
    }

    private void mostrarResumen() {
        System.out.println("**Tareas Registradas:**");
        for (int i = 0; i < tareas.size(); i++) {
            System.out.println(" Tarea: " + tareas.get(i) + " | Fecha de Vencimiento: " + fechas.get(i));
        }
    }

    private void ejecutarRegistro() {
        String nombre = obtenerNombre();
        mostrarSaludo(nombre);
    }
}
