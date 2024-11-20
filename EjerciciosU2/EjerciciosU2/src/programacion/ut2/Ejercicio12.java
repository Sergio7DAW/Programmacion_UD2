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
public class Ejercicio12 {
    
     public static void main(String[] args) {
     
         Scanner sc = new Scanner(System.in);
         System.out.println("dime a");
         float a = sc.nextFloat();
         
         System.out.println((a > 0 ? a : -a));
         System.out.println((Math.abs(a))); 
    }
}


