package principal;

import java.util.Scanner;
/**
 *
 * @author Johan
 */
public class Ejercicio1_Factura {
    public Ejercicio1_Factura( ){
        Scanner TomarDatos = new Scanner (System.in);
        System.out.print("Por favor Ingresa tu nombre: ");
        String  nombre = TomarDatos.nextLine(); 
        
        System.out.print("Ingrese un producto: ");
        String producto = TomarDatos.nextLine();
        
        System.out.print("Ingrese la cantidad de productos: ");
        int cantidad = TomarDatos.nextInt();
        
        System.out.print("Ingrese el precio del producto: ");
        int precio = TomarDatos.nextInt();
        
        System.out.print("Usted es estudiante 1.Si/2.No: ");
        int estudiante = TomarDatos.nextInt();
        
        System.out.print("Que tipo de cliente es 1.Normal 2.Premiun 3.Estudiante: ");
        int tipo = TomarDatos.nextInt();
        TomarDatos.close();
        int subtotal = cantidad*precio;
        if (estudiante==1){
            System.out.println("Es estudiante");   
        }
        else {
            System.out.println("No es un estudiante");
        }
        
        if (tipo==1){
            System.out.println("Es un cliente A (normal)");
            int impuesto = (int) (subtotal*0.13);
            System.out.println("Su subtotal es "+ subtotal+ " y su impuesto es del 13% " + impuesto);
            int total = subtotal+impuesto;
            System.out.println("Su total es: " +total);
        }
        else if (tipo==2){
            System.out.println("Es un cliente B (Premiun)");
            int impuesto = (int) (subtotal*0.13);
            System.out.println("Su subtotal es "+ subtotal+ " y su impuesto es del 13% " + impuesto);
            int total = subtotal+impuesto;
            System.out.println("Su total es: " +total);
        }
        else if (tipo==3){
            System.out.println("Es un cliente C (Estudiante)");
            int impuesto2 = (int) (subtotal*0.05);
            System.out.println("Su subtotal es: "+ subtotal +"y su impuesto es del 5%" + impuesto2);
            int total = subtotal+impuesto2;
            System.out.println("Su total es: " +total);
        }
        else {
            System.out.println("No esta registrado como ningun cliente en alguna categoria especifica");
        }
    }
}

