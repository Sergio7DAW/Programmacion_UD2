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
public class Ejercicio20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      
        int a = sc.nextInt();

        switch (a) {

            case 0, 1, 2, 3, 4: {
                System.out.print("suspenso");
                break;
            }

            case 5: {
                System.out.print("suficiente");
                break;
            }
            case 6: {
                System.out.print("bien");
                break;
            }
            case 7, 8: {
                System.out.print("notable");
                break;
            }

            case 9, 10: {
                System.out.print("sobresaliente");
                break;
            }
            default: {
                System.out.print("incorrecto");

            }
        }
    }
}
