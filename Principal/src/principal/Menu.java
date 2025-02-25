/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner OpcionValor = new Scanner (System.in);
        System.out.println("Ingrese de la opcion 1-6 para acceder a ejercicios de IF-ELSE");
        System.out.println("Ingrese de la opcion 7-11 para acceder a ejercicios de SWITCH");
        System.out.println("Ingrese de la opcion 12-17 para acceder a ejercicios de WHILE");
        System.out.println("Ingrese de la opcion 18-23 para acceder a ejercicios de DO-WHILE");
        System.out.println("Ingrese de la opcion 24-28 para acceder a ejercicios de FOR");
        int opcion = OpcionValor.nextInt();
        switch (opcion){
            case 1:
                Ejercicio1_Factura objEjercicio1=new Ejercicio1_Factura ();
                break;
            case 2:
                Ejercicio2_Ascensor objEjercicio2=new Ejercicio2_Ascensor();
                break;
            case 3:
                Ejercicio3_Peso_Ascensor objEjercicio3=new Ejercicio3_Peso_Ascensor();
                break;
            case 4:
                Ejercicio4_Temperatura objEjercicio4=new Ejercicio4_Temperatura();
                break;
            case 5:
                Ejercicio5_Umbral objEjercicio5=new Ejercicio5_Umbral ();
                break;
            case 6:
                Ejercicio6_Ascensor_Temperatura objEjercicio6=new Ejercicio6_Ascensor_Temperatura();
                break;
            case 7:
                Ejercicio7_Tienda_De_Productos objEjercicio7=new Ejercicio7_Tienda_De_Productos();
                break;
            case 8:
                Ejercicio8_Asistente_Nutricional_IMC objEjercicio8=new Ejercicio8_Asistente_Nutricional_IMC();
                break;
            case 9:
                Ejercicio9_Asistente_Virtual_Cine objEjercicio9=new Ejercicio9_Asistente_Virtual_Cine();
                break;
            case 10:
                Ejercicio10_Campeonato_Deportivo objEjercicio10=new Ejercicio10_Campeonato_Deportivo();
                break;
            case 11:
                Ejercicio11_Restaurante objEjercicio11=new Ejercicio11_Restaurante();
                break;
            case 12:
                Ejercicio12_Cajero_Automatico objEjercicio12= new Ejercicio12_Cajero_Automatico();
                break;
            case 13:
                Ejercicio13_Tienda_Online objEjercicio13= new Ejercicio13_Tienda_Online();
                break;
            case 14:
                Ejercicio14_Impresora objEjercicio14= new Ejercicio14_Impresora();
                break;
            case 15:
                Ejercicio15_Coche objEjercicio15= new Ejercicio15_Coche();
                break;
            case 16:
                Ejercicio16_Cuenta_Regresiva objEjercicio16=new Ejercicio16_Cuenta_Regresiva();
                break;
            case 17:
                Ejercicio17_Adivinar_Numero objEjercicio17=new Ejercicio17_Adivinar_Numero();
                break;
            case 18:
                Ejercicio18_Bibliotecas objEjercicio18=new Ejercicio18_Bibliotecas();
                break;
            case 19:
                Ejercicio19_Menu_de_Comidas_Rapidas objEjercicio19=new Ejercicio19_Menu_de_Comidas_Rapidas();
                break;
            case 20:
                Ejercicio20_Sensor_Temperatura objEjercicio20=new Ejercicio20_Sensor_Temperatura();
                break;
            case 21:
                Ejercicio21_Resultado_Examenes objEjercicio21=new Ejercicio21_Resultado_Examenes();
                break;
            case 22:
                Ejercicio22_Gestion_Tareas objEjercicio22=new Ejercicio22_Gestion_Tareas();
                break;
            case 23:
                Ejercicio23_Registro_Ventas objEjercicio23=new Ejercicio23_Registro_Ventas();
                break;
            case 24:
                Ejercicio24_Registro_Vehiculo objEjercicio24=new Ejercicio24_Registro_Vehiculo();
                break;
            case 25:
                Ejercicio25_Tienda_Virtual objEjercicio25=new Ejercicio25_Tienda_Virtual();
                break;
            case 26:
                Ejercicio26_Agenda_Contactos objEjercicio26=new Ejercicio26_Agenda_Contactos();
                break;
            case 27:
                Ejercicio_27_Lista_Numeros objEjercicio27= new Ejercicio_27_Lista_Numeros();
                break;
            case 28:
                Ejercicio28_Proceso_Ventas objEjercicio28=new Ejercicio28_Proceso_Ventas();
                break;
            default:
                System.out.println("Opcion no valida");
                break;
                
        }
        
        
    }  

}