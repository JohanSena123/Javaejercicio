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
public class Ejercicio8 {
    public Ejercicio8 (){
    Scanner TomarDatos=new Scanner (System.in);
    System.out.println("Ingrese su peso en kg: ");
    int peso=TomarDatos.nextInt();
    
    System.out.println("Ingrese su altura en metros: ");
    int altura=TomarDatos.nextInt();
    
    while (peso <= 0) {
            System.out.println("Por favor, ingrese una cantidad positiva: ");
            peso = TomarDatos.nextInt();}
    while (altura <= 0) {
            System.out.println("Por favor, ingrese una cantidad positiva: ");
            altura = TomarDatos.nextInt();}
      
    
    int IMC=peso*altura^2;
    
    System.out.println("Su IMC es: "+IMC);
    System.out.println("Selecciona 1 si su peso fue menor menor a 18.5");
    System.out.println("Selecciona 2 si su peso fue menor a 24.9");
    System.out.println("Selecciona 3 si su peso fue menor a 29.9");
    System.out.println("Selecciona 4 si su peso fue mayor o igual a 30");
    int bajopeso=TomarDatos.nextInt();
    
    TomarDatos.close();
    switch(bajopeso){
        case 1:
            System.out.println("Usted tiene bajo peso");
            break;
        case 2:
            System.out.println("Usted tiene peso normal");
            break;
        case 3:
            System.out.println("Usted tiene sobrepeso");
            break;
        case 4:
            System.out.println("Usted tiene Obesidad");
            break;
        default:
            System.out.println("Opcion no valida");
            break;
    }
    }
    
}
