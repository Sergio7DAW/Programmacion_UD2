/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.ut2;

import java.util.Scanner;



public class Ejercicio22 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un número");
        int a = sc.nextInt();

        while (a != 0) {
            if (a % 2 == 0) {
                System.out.println(a + " es par");
            } else {
                System.out.println(a + " no es par");
            }
            double b = Math.pow(a, 2);
            System.out.println(b);

           /* if (a > 2) {

                float i = 2;
                double z = Math.sqrt(a);
                while (i < z) {
                    if (a % i == 0) {
                        System.out.println(a + "no es primo");
                        
                    } else {
                        System.out.println(a + "es primo");
                      
                    }
                    i++;
                }
            }*/

            System.out.println("Dime otro número");
            a = sc.nextByte();
        }

        System.out.println("Fin");

    }
}
