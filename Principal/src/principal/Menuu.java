/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import java.util.Scanner;

public class Menuu {
    public static void main(String[] args) {
        Scanner OpcionValor = new Scanner (System.in);
        System.out.println("Ingrese de la opcion 1-6 para acceder a ejercicios de IF-ELSE");
        System.out.println("Ingrese de la opcion 7-11 para acceder a ejercicios de SWITCH");
        int opcion = OpcionValor.nextInt();
        switch (opcion){
            case 1:
                Ejercicio1 objEjercicio1=new Ejercicio1 ();
                break;
            case 2:
                Ejercicio2 objEjercicio2=new Ejercicio2();
                break;
            case 3:
                Ejercicio3 objEjercicio3=new Ejercicio3();
                break;
            case 4:
                Ejercicio4 objEjercicio4=new Ejercicio4();
                break;
            case 5:
                Ejercicio5 objEjercicio5=new Ejercicio5 ();
                break;
            case 6:
                Ejercicio6 objEjercicio6=new Ejercicio6();
                break;
            case 7:
                Ejercicio7 objEjercicio7=new Ejercicio7();
                break;
            case 8:
                Ejercicio8 objEjercicio8=new Ejercicio8();
                break;
            default:
                System.out.println("Opcion no valida");
        
        
        }
        
        
    }  

}