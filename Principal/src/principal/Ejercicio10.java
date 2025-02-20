/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author AdminSena
 */
public class Ejercicio10 {
    
    public Ejercicio10(){
        procesar();
    }
    
    public static void procesar(){
     Scanner TomarDatos=new Scanner(System.in);
        System.out.println("Ingrese el nombre del primer equipo");
        String equipo1=TomarDatos.nextLine();
        
        System.out.println("Ingrese el nombre del segundo equipo");
        String equipo2=TomarDatos.nextLine();
        
        System.out.println("Ingrese el resultado del primer equipo (Ganador/Empatado/Perdido)");
        String resultado1=TomarDatos.nextLine();
        
        System.out.println("Ingrese el resultado del primer equipo (Ganador/Empatado/Perdido)");
        String resultado2=TomarDatos.nextLine();
                
        Ejercicio10.rango(equipo1,resultado1);
        Ejercicio10.rango(equipo2,resultado2);
    }
    
    public static void rango(String equipo,String resultado){
        int puntuacion=0;
        switch (resultado){
            case "Ganador":
                System.out.println(equipo+" ya que el resultado es ganador, se sumaran 3 puntos en la tabla");
                puntuacion=3;
                break;
            case "Empatado":
                System.out.println(equipo+" ya que el resultado es empate, se sumará 1 punto a la tabla de clasificaciones");
                puntuacion=1;
                break;
            case "Perdido":
                System.out.println(equipo+" ya que el resultado es perdido, no se sumarán puntos a la tabla de clasificaciones");
                puntuacion=0;
                break;
            default:
                System.out.println("Opcion no valida");
                break;
                
        }
        System.out.println("La puntuación es: " +puntuacion);
    }
     
}
