/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.ut2;

import java.util.Scanner;

public class Ejercicio29 {

    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
      
      

       for (int i=1;i<10;i++) {
      
        System.out.println("Tabla del :"+i);
            for (int j=0;j<=10;j++) {
       
        System.out.println(i+"x"+j+"="+i*j);
       }
       }
    }
}
    