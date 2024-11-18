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
public class Ejercicio13 {
    
     public static void main(String[] args) {
     
         //Scanner sc = new Scanner(System.in);
         System.out.println("dime a");
         int x = 5;
         boolean b=false ;
         double a = 3.4;
         int y = (int)a;
         System.out.println(y);
         
         // false -> false y true
         System.out.println(10+5*2>20&&4==4);
         //true -> false o true
         System.out.println(!(7+3>10)||3*2<=6);
         //false -> false y true
         System.out.println(10/2+3*5==19&&true);
         //11
         System.out.println(x+=3*2 );
         //true -> true o false
         System.out.println(!b || 7%2 == 1);
   
    }
}


