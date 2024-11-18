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
public class Ejercicio14b {
    
     public static void main(String[] args) {
     
         Scanner sc = new Scanner(System.in);
  
         System.out.println("Primer Trismetre");
         int notaP = sc.nextInt();
         System.out.println("Segundo Trismetre");
         int notaS = sc.nextInt();
         
         // 3f porque si no te coge un float
         float media = (notaP+notaS)/3f;
         System.out.println(media);
         int mediaInt = (int)media;
         System.out.println(mediaInt);
         
         
   
    }
}


