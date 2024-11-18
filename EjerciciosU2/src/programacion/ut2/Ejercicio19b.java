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
public class Ejercicio19b {
    
     public static void main(String[] args) {
     
         Scanner sc = new Scanner(System.in);
  
         System.out.println("dime tres numeros");
         int a = sc.nextInt();
         int b = sc.nextInt();
         int c = sc.nextInt();
 
       //combinatoria 3 elementos es 3! -> 6 posibilidades
        if (a>= b && b>=c) {
             System.out.println(a+">="+b+">="+c);
             
            } else if(a>=b && b<=c && a>=c) {
             System.out.println(a+">="+c+">="+b);
            
            } else if (a<=b && a>=c) {
             System.out.println(b+">="+a+">="+c);
             
            } else if (a<=b && a<=c && b>=c) {
              System.out.println(b+">="+c+">="+a);
             
            } else if (a>=b && a<=c) {
              System.out.println(c+">="+a+">="+b);
               
            } else if (a<=b && a<=c) {
              System.out.println(c+">="+b+">="+a);         
        }
    }
}


