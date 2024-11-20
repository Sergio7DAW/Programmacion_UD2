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
public class Ejercicio6 {
    
     public static void main(String[] args) {
     
       Scanner sc = new Scanner(System.in);
       System.out.println("Introduce el radio");
        int r = sc.nextInt();
        // PI constante mayúscula
        //double PI = 3.141628;

        double longitud = 2*Math.PI*r;
        double area = Math.pow(Math.PI*r,2);
        
        area = Math.round(area);
        longitud = Math.round(longitud);
      
        System.out.println("La longitud del circulo es: "+ longitud );
        System.out.println("El area del círculo es: "+ area );
    }
}

