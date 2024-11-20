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
public class Ejercicio9 {
    
     public static void main(String[] args) {
     
       Scanner sc = new Scanner(System.in);
   
       
       System.out.println("Está lloviendo?");
        boolean lloviendo = sc.nextBoolean();
         System.out.println("Acabaste la tarea?");
        boolean tareaAcabada = sc.nextBoolean();
         System.out.println("Tiene que ir a la biblioteca?");
        boolean biblioteca = sc.nextBoolean();
        
     
         if  ((!lloviendo && tareaAcabada)|| biblioteca) {
         //if  ((lloviendo && !tarea)|| !biblioteca) {
           System.out.println("puedes salir");  
         } else {
              System.out.println("no puedes salir");       
         }       
    }
}

