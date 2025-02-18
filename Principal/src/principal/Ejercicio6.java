/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author SENA
 */
public class Ejercicio6 {
    public Ejercicio6 (){
        Scanner TomarDatos = new Scanner(System.in);
        System.out.println("Ingrese su temperatura actual: ");
        int temperatura = TomarDatos.nextInt();
        
        System.out.println("Ingrese el piso al que desea ir: 1 2 3 4 5 6 7 8 9 ");
        int piso = TomarDatos.nextInt();
        
        if (temperatura<30 && temperatura>0 && piso>0 && piso<10){
            System.out.println("La temperatura ambiente es la adecuada puede ir al piso " +piso);
        }
        else{
            System.out.println("La temperatura ambiente no es la adecuada no puede ir al piso " +piso);
        }
        
            
    }
}
