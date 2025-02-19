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
public class Ejercicio2 {
    public Ejercicio2 () {
        Scanner TomarDatos = new Scanner (System.in);
        System.out.println("Por favor Ingrese al piso que desea subir: 1 2 3 4 5 6 7 8 9 10");
        int piso = TomarDatos.nextInt();
        TomarDatos.close();
        
        if (piso>0 && piso<11){
            System.out.println("Llego al piso " +piso);  
    }
        else{
            System.out.println("El piso " +piso+ " no esta disponible");
        }
    }
    
}
