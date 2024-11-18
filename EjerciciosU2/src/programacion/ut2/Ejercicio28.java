/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.ut2;

import java.util.Scanner;

public class Ejercicio28 {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
      
       int a = sc.nextInt();
       int facto =1;

       for (int i=a;i>1;i--) {
           
           facto= i*facto;
                   
       }
        System.out.println(facto);
    }
}
    