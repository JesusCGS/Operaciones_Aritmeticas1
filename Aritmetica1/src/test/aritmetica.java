/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import comunes.operaciones;
import java.util.Scanner;

/**
 *
 * @author Alumno Mañana
 */
public class aritmetica {
    static operaciones op = new operaciones();
    static Scanner ent = new Scanner(System.in);
    static int num1;
    static int num2;
    
    public static void main(String[] args) {
        System.out.println("OPERACIONES COMUNES");
        System.out.println("===================");
        menu();
        
    }
    public static void menu(){
        int opcion=-1;
        boolean sw1=false;
        boolean sw2=false;
        boolean sw3=false;
        while(opcion!=0){
        System.out.println("CLASE 2ªDERECHA");
        System.out.println("===================\n");
        System.out.println("MENU\n");
        System.out.println("(1) [CUESTION 1] Resta ");
        System.out.println("(2) [CUESTION 2] Suma");
        System.out.println("(3) [CUESTION 3] Multiplicar");
        System.out.println("(4) [CUESTION 4] Dividir");
        System.out.println("\t\t\t\t\t\t\t(0) [SALIR]");
        System.out.print("Seleccione la opcion a elegir: ");
        opcion=ent.nextInt();
        switch(opcion){
            case 1:
                System.out.println("introduzca el primer numero");
                num1=ent.nextInt();
                
                System.out.println("introduzca el segundo numero");
                num2=ent.nextInt();
                op.resta(num1, num2);
               
                break;
            case 2:
               System.out.println("introduzca el primer numero");
                num1=ent.nextInt();
                
                System.out.println("introduzca el segundo numero");
                num2=ent.nextInt();
                op.suma(num1, num2);
                break;
            case 3:
                System.out.println("introduzca el primer numero");
                num1=ent.nextInt();
                
                System.out.println("introduzca el segundo numero");
                num2=ent.nextInt();
                op.multi(num1, num2);
                break;
            case 4:
                System.out.println("introduzca el primer numero");
                num1=ent.nextInt();
                
                System.out.println("introduzca el segundo numero");
                num2=ent.nextInt();
                op.divi(num1, num2);
                break;
            case 0:
                break;
            default:
                System.out.println("Elija entre las opcines 1 y 10");
                break;
        }
        for(int i=0;i<2;i++){
            System.out.println("");
        }
        }
    }
    
    public static void resta(){
    
    }
    public static void suma(){
    
    }
    public static void multi(){
    
    }
    public static void divi(){
    
    }
    
    
    
}
