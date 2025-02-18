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
public class Ejercicio3 {
    public Ejercicio3 (){
        Scanner TomarDatos= new Scanner (System.in);
        System.out.println("Ingrese su peso: ");
        int peso = TomarDatos.nextInt();
        
        System.out.println("Ingrese el piso al que desea ir: ");
        int piso = TomarDatos.nextInt();
        
        if (peso< 100){
            System.out.println("Su peso es " +peso+ " es el adecuado. Moviendo... al piso " +piso);
        }
        else{
            System.out.println("Su peso es " +peso+ " no es el adecuado. Lo siento no podemos moverlo al piso asignado");
        }
    }
    
}
