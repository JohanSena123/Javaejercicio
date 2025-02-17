/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Datos();
    }  
    public static void Datos ( ){
        int cantidad="";
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
        
        System.out.print("Que tipo de cliente es 1.Normal 2.Premiun 3.Estudiante");
        int tipo = TomarDatos.nextInt();
        TomarDatos.close();
        
        if (estudiante==1){
            System.out.println("Es estudiante");   
        }
        else {
            System.out.println("No es un estudiante");
        }
        
        if (tipo==1){
            System.out.println("Es un cliente A (normal)");
        }
        else if (tipo==2){
            System.out.println("Es un cliente B (Premiun)");
        }
        else if (tipo==3){
            System.out.println("Es un cliente C (Estudiante)");
        }
        else {
            System.out.println("No esta registrado como ningun cliente en alguna categoria especifica");
        }
        
        int subtotal = cantidad*producto;
    }
}

