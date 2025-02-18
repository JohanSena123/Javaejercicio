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
public class Ejercicio5 {
    public Ejercicio5(){
        Scanner TomarDatos = new Scanner(System.in);
        System.out.println("Ingrese su temperatura actual: ");
        int temperatura = TomarDatos.nextInt();
        
        if (temperatura>0 && temperatura<26){
            System.out.println("Su temperatura es normal");
        }
        else{
            System.out.println("¡ALERTA! Su temperatura no es normal");
        }
    }
}
