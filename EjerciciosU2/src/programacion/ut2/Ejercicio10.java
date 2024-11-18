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
public class Ejercicio10 {
    
     public static void main(String[] args) {
     
         
  
         
     Scanner sc = new Scanner(System.in);
     final float PrecioManzana = 2.35f;   
     final float PrecioPera = 1.95f; 
    
     System.out.println("Cuantos kg vendistes de manzanas primer semestre?");
        float manzanasP = sc.nextFloat();
     System.out.println("Cuantos kg vendistes de peras primer semestre?");
        float perasP = sc.nextFloat();
     System.out.println("Cuantos kg vendistes de manzanas segundo semestre?");
        float manzanasS = sc.nextFloat();
     System.out.println("Cuantos kg vendistes de peras segundo semestre?");
        float perasS = sc.nextFloat();
        
   float total = manzanasP*PrecioManzana + perasP*PrecioPera ;
   total += manzanasS*PrecioManzana + perasS*PrecioPera;
     System.out.println("El total de beneficio es: "+(total)+"€");
     
    }
    
             
}

