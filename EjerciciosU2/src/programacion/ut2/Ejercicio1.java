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
public class Ejercicio1 {
    
     public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("Hola Mundo");
    
        System.out.println("introduce tu edad");
        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();
        edad++;
        System.out.println("Tu edad el año que viene es: "+ edad);
    }   
}
