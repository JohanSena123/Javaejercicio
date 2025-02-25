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
public class Ejercicio11_Restaurante {
    private String nombre;
    private Scanner scanner = new Scanner(System.in);

    public Ejercicio11_Restaurante() {
        this.nombre = solicitarNombre();
        mostrarSaludo();
        procesarPedido();
    }

    private String solicitarNombre() {
        System.out.print("Ingrese su nombre: ");
        return scanner.nextLine();
    }

    private void mostrarSaludo() {
        System.out.println("¡Bienvenido al restaurante, " + nombre + "!");
    }

    private void mostrarMenu() {
        System.out.println("**Platos:**");
        System.out.println("1. Pastas (20.000 COP)");
        System.out.println("2. Milanesa (30.000 COP)");
        System.out.println("3. Carne a la plancha (24.000 COP)");
        System.out.println("4. Sopa (18.000 COP)");
    }

    private int seleccionarPlato() {
        int plato;
        do {
            System.out.print("Seleccione un plato (1-4): ");
            plato = scanner.nextInt();
        } while (plato < 1 || plato > 4);
        return plato;
    }

    private void mostrarBebidas() {
        System.out.println("**Bebidas:**");
        System.out.println("1. Coca-Cola (2.500 COP)");
        System.out.println("2. Malta (5.000 COP)");
        System.out.println("3. Jugo de fresa (6.000 COP)");
        System.out.println("4. Agua (1.200 COP)");
    }

    private int seleccionarBebida() {
        int bebida;
        do {
            System.out.print("Seleccione una bebida (1-4): ");
            bebida = scanner.nextInt();
        } while (bebida < 1 || bebida > 4);
        return bebida;
    }

    private int calcularCosto(int plato, int bebida) {
        int costoPlato = switch (plato) {
            case 1 -> 20000;
            case 2 -> 30000;
            case 3 -> 24000;
            case 4 -> 18000;
            default -> 0;
        };
        int costoBebida = switch (bebida) {
            case 1 -> 2500;
            case 2 -> 5000;
            case 3 -> 6000;
            case 4 -> 1200;
            default -> 0;
        };
        return costoPlato + costoBebida;
    }

    private double calcularDescuento(String metodoPago, int costoTotal) {
        double descuento = switch (metodoPago.toLowerCase()) {
            case "e" -> costoTotal * 0.1; 
            case "t" -> costoTotal * 0.05; 
            case "c" -> costoTotal * 0.03; 
            default -> 0;
        };
        return descuento;
    }

    private void procesarPedido() {
        boolean continuar = true;
        while (continuar) {
            mostrarMenu();
            int plato = seleccionarPlato();
            mostrarBebidas();
            int bebida = seleccionarBebida();

            int costoTotal = calcularCosto(plato, bebida);
            System.out.println("El costo total de su pedido es: " + costoTotal);

            System.out.print("Ingrese el metodo de pago (e: efectivo, t: tarjeta, c: cheque): ");
            String metodoPago = scanner.next().toLowerCase();
            double descuento = calcularDescuento(metodoPago, costoTotal);
            double totalPagar = costoTotal - descuento;

            System.out.println("El total a pagar es: " + totalPagar);

            System.out.print("¿Desea realizar otro pedido? (si/no): ");
            continuar = scanner.next().equalsIgnoreCase("si");
        }
        System.out.println("¡Gracias por su visita, " + nombre + "!");
    }
}
