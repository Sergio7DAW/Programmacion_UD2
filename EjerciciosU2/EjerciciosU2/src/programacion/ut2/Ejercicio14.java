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
public class Ejercicio14 {
    
     public static void main(String[] args) {
     
         Scanner sc = new Scanner(System.in);
  
         System.out.println("Primer Trismetre");
         float notaP = sc.nextFloat();
         System.out.println("Segundo Trismetre");
         float notaS = sc.nextFloat();
         System.out.println("Tercer Trismetre");
         float notaT = sc.nextFloat();
         
         float media = (notaP+notaS+notaT)/3;
         System.out.println(media);
         int mediaInt = (int)media;
         System.out.println(mediaInt);
         
         
   
    }
}


