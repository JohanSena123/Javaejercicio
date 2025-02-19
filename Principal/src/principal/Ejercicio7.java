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
public class Ejercicio7 {
    public Ejercicio7(){
    Scanner TomarDatos = new Scanner(System.in);
    System.out.println("Escoga una opcion 1.(Alimentos) 2.(Vestimenta) 3.(Electronicos) ");
    int opcion=TomarDatos.nextInt();
    
    System.out.println("Indique la cantidad de productos que desea llevar: ");
    int cantidad=TomarDatos.nextInt();
    
    while (cantidad <= 0) {
            System.out.println("Por favor, ingrese una cantidad positiva de productos: ");
            cantidad = TomarDatos.nextInt();}
    TomarDatos.close();
    
    int A=5000;
    int V=10000;
    int E=15000;
    
    int total = cantidad*A;
    int total2 = cantidad*V;
    int total3 = cantidad*E;
    
    switch (opcion){
        case 1:
            System.out.println("Ha escogido un alimento");
            System.out.println("Su total sin descuento es "+total);
            int descuentoA = (int) (total*0.10);
            int descuentoA2= (int)(total-descuentoA);
            System.out.println("Su Total con descuento seria " +descuentoA2);
            break;
        case 2:
            System.out.println("Ha escogido vestimenta");
            System.out.println("Su total sin descuento es "+total2);
            int descuentoV = (int) (total2*0.05);
            int descuentoV2= (int)(total2-descuentoV);
            System.out.println("Su Total con descuento seria " +descuentoV2);
            break;
        case 3:
            System.out.println("Ha escogido Electronicos");
            System.out.println("Su total es "+total3+ ". No hay descuentos");
            break;
        default:
            System.out.println("Opcion no valida");
        
    }
    }
}
