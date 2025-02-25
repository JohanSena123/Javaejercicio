/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;


import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author Johan
 */

public class Ejercicio26_Agenda_Contactos {
    private Scanner scanner = new Scanner(System.in);
    private HashMap<String, String> contactos = new HashMap<>();

    public Ejercicio26_Agenda_Contactos() {
        ejecutarRegistro();
    }

    private String solicitarNombre() {
        System.out.print("Ingrese su nombre distinguido usuario: ");
        return scanner.nextLine().trim();
    }

    private void mostrarSaludo(String nombre) {
        System.out.println("Bienvenido distinguido usuario(a) " + nombre);
        mostrarProceso();
    }

    private void mostrarProceso() {
        System.out.println("? Bienvenido a la lista de contactos.");
        
        int cantidadContactos;
        while (true) {
            System.out.print("Ingrese la cantidad de números a agregar en la lista de contactos: ");
            try {
                cantidadContactos = Integer.parseInt(scanner.nextLine());
                if (cantidadContactos > 0) {
                    break;
                } else {
                    System.out.println("Error: Ingrese un número mayor a 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número entero válido.");
            }
        }

        for (int i = 1; i <= cantidadContactos; i++) {
            System.out.print("Ingrese el nombre del contacto " + i + ": ");
            String nombreContacto = scanner.nextLine().trim();
            
            String numeroTelefono;
            while (true) {
                System.out.print("Ingrese el número de teléfono: ");
                numeroTelefono = scanner.nextLine().trim();
                if (numeroTelefono.matches("\\d{7,15}")) { 
                    break;
                } else {
                    System.out.println("Error: Ingrese un número de teléfono válido (7-15 dígitos).");
                }
            }

            contactos.put(nombreContacto, numeroTelefono);
        }

        mostrarLista();
    }

    private void mostrarLista() {
        System.out.println("**Lista de Contactos:**");
        for (var contacto : contactos.entrySet()) {
            System.out.println(" " + contacto.getKey() + " " + contacto.getValue());
        }
    }

    private void ejecutarRegistro() {
        String nombre = solicitarNombre();
        mostrarSaludo(nombre);
    }
}
