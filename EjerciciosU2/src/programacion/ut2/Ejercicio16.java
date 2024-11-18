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
public class Ejercicio16 {
    
     public static void main(String[] args) {
     
         Scanner sc = new Scanner(System.in);
  
         System.out.println("dime un entero");
         int a = sc.nextInt();
         if (a%2 == 0){
             int testLocal =10;
             System.out.println(a +" es par");
         }
         else 
             System.out.println(a +" es impar");
        
        //contexto variales
        //System.out.println(testLocal +" es primo");
    }
}


