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
public class ref29 {
    //FINALIZARRRRRR!

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Intro n:");
        int n = sc.nextInt();
        int alturaMayor = n;
        int etiquetaArbolMayor = 0;
        int j = 0;
        while (n != -1) {
            if (n > alturaMayor) {
                alturaMayor = n;
                etiquetaArbolMayor = j;
            }
            System.out.println("Intro n:");
            n = sc.nextInt();
            j++;
        }
        System.out.println("El mayor es el: " + etiquetaArbolMayor + " que mide: " + alturaMayor);

        for (int i = 0; n != -1; i++) {
            if (n > alturaMayor) {
                alturaMayor = n;
                etiquetaArbolMayor = i;
            }
            System.out.println("Intro n:");
            n = sc.nextInt();
        }
        System.out.println("El mayor es el: " + etiquetaArbolMayor + " que mide: " + alturaMayor);
    }
}
