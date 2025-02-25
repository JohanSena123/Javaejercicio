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
public class Ejercicio9_Asistente_Virtual_Cine {
    public Ejercicio9_Asistente_Virtual_Cine(){
        Scanner TomarDatos=new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edad =TomarDatos.nextInt();
        Ejercicio9_Asistente_Virtual_Cine.rango(edad);
    }
    public static void rango (int edad){
        String categoria = null;
        String resultado = null;
        
        if (edad<7){
            categoria="Niños";
        }
        else if(edad>7 && edad<17){
            categoria="Adolescentes";
        }
        else if(edad>18 && edad<30){
            categoria="Adultos";
        }
        else if(edad>31){
            categoria="Mayores";
        }   
    switch (categoria){
        case "Niños":
            resultado="Entra en la categoria de pelicula para niños";
            break;
        case "Adolescentes":
            resultado="Entra en la categoeria de pelicula para niños y adolescentes";
            break;
        case "Adultos":
            resultado="Entra en la categoria de pelicu  las para adultos";
            break;
        case "Mayores":
            resultado="Entra en la categoria de peliculas para adultos mayores";
            break;
        default:
            System.out.println("no hay opcion disponible");
            break;
    }
    Ejercicio9_Asistente_Virtual_Cine.imprimir(resultado);
    }   
     public static void imprimir(String resultado){
     System.out.println("resultado:"+resultado);}
}
