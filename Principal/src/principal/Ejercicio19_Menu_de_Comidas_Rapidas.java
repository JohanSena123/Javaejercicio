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
public class Ejercicio19_Menu_de_Comidas_Rapidas {
    private Scanner scanner = new Scanner(System.in);
    
    public Ejercicio19_Menu_de_Comidas_Rapidas() {
        ejecutarPedido();
    }

    private String obtenerNombre() {
        String nombre;
        do {
            System.out.print("Ingrese su nombre señor usuario(a): ");
            nombre = scanner.nextLine().trim();
        } while (nombre.isEmpty());
        return nombre;
    }

    private void mostrarSaludo(String nombre) {
        System.out.println("Bienvenido señor usuario(a) " + nombre);
        mostrarProceso();
    }

    private void mostrarProceso() {
        int total = 0;
        int subtotalPlatos = 0;
        int subtotalBebidas = 0;

        System.out.println("¡Bienvenido al establecimiento gastronomico!");
        System.out.println("Por favor, elija sus platillos y bebidas.");

        // Pedir platillos
        while (true) {
            System.out.println("Elija un platillo (1: pastas, 2: milanesa, 3: carne a la plancha, 4: sopa, 0: Terminar pedido): ");
            int plato = scanner.nextInt();

            if (plato == 1) {
                subtotalPlatos += 20000;
            } else if (plato == 2) {
                subtotalPlatos += 30000;
            } else if (plato == 3) {
                subtotalPlatos += 24000;
            } else if (plato == 4) {
                subtotalPlatos += 18000;
            } else if (plato == 0) {
                System.out.println("Ha decidido terminar su pedido de platillos.");
                break;
            } else {
                System.out.println("Error, seleccione una opcion válida.");
            }
        }
        total += subtotalPlatos;

      
        while (true) {
            System.out.println("Elija una bebida (1: cocacola, 2: malteada, 3: jugo de fresa, 4: agua, 0: Terminar pedido): ");
            int bebida = scanner.nextInt();

            if (bebida == 1) {
                subtotalBebidas += 2500;
            } else if (bebida == 2) {
                subtotalBebidas += 5000;
            } else if (bebida == 3) {
                subtotalBebidas += 6000;
            } else if (bebida == 4) {
                subtotalBebidas += 1200;
            } else if (bebida == 0) {
                System.out.println("Ha decidido terminar su pedido de bebidas.");
                break;
            } else {
                System.out.println("Bebida no valida, seleccione una opcion valida.");
            }
        }
        total += subtotalBebidas;

        System.out.println("Gracias por su compra. El monto total a pagar es: " + total);
    }

    private void ejecutarPedido() {
        String nombre = obtenerNombre();
        mostrarSaludo(nombre);
    }
}
