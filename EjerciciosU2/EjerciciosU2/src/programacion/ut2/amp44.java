/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.ut2;

import java.util.Scanner;

public class amp44 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            System.out.println(i+"");
            primos(i);
        }
    }

    
       
    public static void primos(int x) {
        int num = x;
        if (x > 2) {

            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    // Ejemplo de salida anticipada break
                    System.out.println("no es primo");
                    break;
                } else {
                    System.out.println("es primo");
                    break;
                }
            }
        }
    }
    }

