/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.ut2;

import java.util.Scanner;

public class Ejercicio31 {

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        variosSaludos(sumas(2,3));
        System.out.println(sumas(2,3));
    }

    public static void  variosSaludos(int n) {
        for (int i=0; i<n;i++){
        System.out.println("Hola");
       }
    }
    public static int sumas(int a,int b) {
      
        int resultado;
        resultado=a+b;
        return resultado;
       
    }
}
