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
public class Ejercicio21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el número del mes");
        int a = sc.nextInt();
        

        String mes = switch (a) {

            case 1 ->"Enero: 30";
            case 2 ->"Febrero: 28";
            case 3 ->"Marzo: 31";
            case 4 ->"Abril: 30";
            case 5->"Mayo: 31";
            case 6->"Junio: 30";
            case 7->"Julio: 31";
            case 8->"Agosto: 31";
            case 9->"Septiembre: 30";
            case 10->"Octubre: 31";
            case 11->"Noviembre: 30";
            case 12->"Diciembre: 31";
            default ->"no";
           
        };
        
         System.out.println("El mes es -> "+mes+" días");
        
    }
}
