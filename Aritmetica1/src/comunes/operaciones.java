/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comunes;

import java.util.Scanner;

/**
 *
 * @author Alumno Mañana
 */
public class operaciones {
   
  int num1;
  int num2;
//getter amd setter
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
//contructo
    public operaciones(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public operaciones() {
    }
    
//to String

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("operaciones{num1=").append(num1);
        sb.append(", num2=").append(num2);
        sb.append('}');
        return sb.toString();
    }
    
    public void suma(int num1,int num2){
        int sumas = num1 + num2;
        System.out.println("la suma de "+num1+" y "+num2+" es = "+sumas);
        
    }
    public void resta(int num1,int num2){
         int restas = num1 - num2;
        System.out.println("la resta de "+num1+" y "+num2+" es = "+restas);
    }
    public void multi(int num1,int num2){
        int multii = num1 * num2;
        System.out.println("la mulrtiplicacion de "+num1+" por "+num2+" es = "+multii);
    }
    public void divi(int num1,int num2){
         int divii = num1 / num2;
        System.out.println("la dicvision de "+num1+" entre "+num2+" es = "+divii);
    }
    
    
  
  
        
}
