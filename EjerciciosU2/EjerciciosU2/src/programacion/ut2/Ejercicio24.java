/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.ut2;

import java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[] args) {

       

        int aciertos =-1;
        int sumaUsuario;
        int sum1;
        int sum2;
        
        do {
            sum1 = (int) (Math.random() * 100 + 1);
            sum2 = (int) (Math.random() * 100 + 1);
            System.out.println("¿Cuál es el resultado de: " + sum1+"+"+sum2+"?");
            Scanner sc = new Scanner(System.in);
            sumaUsuario = sc.nextInt();
            aciertos++;
        
        } while (sum1+sum2==sumaUsuario);
    
        System.out.println("Nº aciertos: " + aciertos);
    }
}
