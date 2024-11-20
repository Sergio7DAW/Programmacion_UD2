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
public class Ejercicio7 {
    
     public static void main(String[] args) {
     
       Scanner sc = new Scanner(System.in);
       System.out.println("Introduce tu edad");
        int a = sc.nextInt();
       System.out.println("Introduce su edad");
        int b = sc.nextInt();
     
         if  (a > b) {
           System.out.println(a+" es mayor que "+ b);  
         } else {
             if (a < b) {
              System.out.println(b+" es mayor que "+ a);  
                } else {
                System.out.println(a+" es igual que "+ b); 
                }
         }  
       
        System.out.println(a>b );
        System.out.println(a<b);
        System.out.println(a==b);
    }
}

