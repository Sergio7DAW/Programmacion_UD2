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
public class Ejercicio19 {
    
     public static void main(String[] args) {
     
         Scanner sc = new Scanner(System.in);
  
         System.out.println("dime tres numeros");
         int a = sc.nextInt();
         int b = sc.nextInt();
         int c = sc.nextInt();
 
       
        if (a>= b && b>=c) {
             System.out.println(a);
             System.out.println(b);
             System.out.println(c);
        } else {
            if (a>=b && b<=c && a>=c) {
             System.out.println(a);
             System.out.println(c);
             System.out.println(b);  
            } else {
                if (a<=b && a>=c) {
             System.out.println(b);
             System.out.println(a);
             System.out.println(c);  
            } else {
                  if (a<=b && a<=c && b>=c) {
             System.out.println(b);
             System.out.println(c);
             System.out.println(a);  
            } else {
                  if (a>=b && a<=c) {
             System.out.println(c);
             System.out.println(a);
             System.out.println(b);  
            } else {
                   if (a<=b && a<=c) {
             System.out.println(c);
             System.out.println(b);
             System.out.println(a);  
            } else {     
            }      
            } 
            } 
            } 
            }
        }
    }
}


