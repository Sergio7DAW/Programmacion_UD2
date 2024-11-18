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
public class Ejercicio3 {
    
     public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println("Hola Mundo");
    
        System.out.println("¿Cuando naciste?");
        Scanner sc = new Scanner(System.in);
        int cuando = sc.nextInt();
        System.out.println("¿Qué año es?");

        int anno = sc.nextInt();
        int finalnum = (anno - cuando);
        int siguiente = ++finalnum;
        System.out.println("Tu edad es: "+siguiente );
    }   
}
