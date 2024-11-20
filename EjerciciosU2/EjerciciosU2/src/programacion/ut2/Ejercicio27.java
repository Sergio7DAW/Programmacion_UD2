/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.ut2;

import java.util.Scanner;

public class Ejercicio27 {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
      
       int a = sc.nextInt();

       for (int i=1;a*i<100;i++) {
       
        System.out.println(a*i);
       }
    }
}
    