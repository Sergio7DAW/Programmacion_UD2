/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.ut2;

import java.util.Scanner;



public class Ejercicio23 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un número");
        int a = sc.nextInt();
        int max = a;
        int min = a;

        while (a != -1) {
            if (max<a) {
                max=a;
            }
            if (min>a) {
                min=a;
            }
           System.out.println("Dime otro número"); 
           a = sc.nextInt();
        }
        
        System.out.println("["+min+","+max+"]");


    }
}
