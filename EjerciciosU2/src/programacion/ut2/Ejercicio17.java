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
public class Ejercicio17 {
    
     public static void main(String[] args) {
     
         Scanner sc = new Scanner(System.in);
  
         System.out.println("dime un entero");
         int a = sc.nextInt();
         int b = sc.nextInt();
       
        if (a==b) {
             System.out.println("son iguales");
        } else {
            if (a>b) {
                 System.out.println(a +" es mayor");
            } else {
                 System.out.println(b +" es mayor");
            }
        }
    }
}


