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
public class Ejercicio4 {
    public Ejercicio4 (){
        Scanner TomarDatos = new Scanner(System.in);
        System.out.println("Ingrese su temperatura actual: ");
       int temperatura = TomarDatos.nextInt();
        TomarDatos.close();
       if (temperatura>17 && temperatura<26){
           System.out.println("Su temperatura " +temperatura+ " es la adecuada");
       }
       else{
           System.out.println("Su temperatura " +temperatura+ " no es la adecuada");
       }
                
    }
}
