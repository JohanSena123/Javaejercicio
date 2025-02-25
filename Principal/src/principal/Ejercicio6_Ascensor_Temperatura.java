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
public class Ejercicio6_Ascensor_Temperatura {
    public Ejercicio6_Ascensor_Temperatura (){
        Scanner TomarDatos = new Scanner(System.in);
        System.out.println("Ingrese su temperatura actual: ");
        int temperatura = TomarDatos.nextInt();
        
        
        if (temperatura<30 && temperatura>0){
            System.out.println("La temperatura ambiente es la adecuada");
            System.out.println("Ingrese el piso al que desea ir: ");
            int piso = TomarDatos.nextInt();
            System.out.println ("Subiendo... Has subido al piso seleccionado");
        }
        else{
            System.out.println("La temperatura ambiente no es la adecuada no puede ir al piso que desea");
        }    
    }
}
