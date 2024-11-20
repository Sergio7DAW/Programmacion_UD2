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
public class Ejercicio20b {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        int a = sc.nextInt();
        

        String notas = switch (a) {

            case 0, 1, 2, 3, 4 ->"suspenso";
            case 5 ->"suficiente";
            case 6 ->"bien";
            case 7,8 ->"notable";
            case 9,10->"sobresaliente";
            default ->"no";
           
        };
        
         System.out.println("La nota es: "+notas);
        
    }
}
