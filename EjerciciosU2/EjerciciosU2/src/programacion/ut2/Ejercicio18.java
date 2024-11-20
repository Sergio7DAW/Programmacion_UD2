/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.ut2;
import java.util.Scanner;

/**
 *
 * @author 1DAW2425-09
 */
public class Ejercicio18 {
    
     public static void main(String[] args) {
     
         Scanner sc = new Scanner(System.in);
  
         System.out.println("dime un entero");
       
                 double a = sc.nextDouble();
         
         
         double test1 =(Math.pow(1.01, -5));
         System.out.println(test1);
         double test2 =-(Math.pow(1.01, -5));
                
                
       
        if (a> 0 && a<test1 && a!=0) {
             System.out.println(a+" es casi cero");
        } else {
            if (a<0 && a>test2) {
                 System.out.println(a +" es casi cero");
            } else {
                 System.out.println(a +" no");
            }
        }
    }
}


