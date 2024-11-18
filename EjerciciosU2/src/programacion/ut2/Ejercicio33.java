/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.ut2;

public class Ejercicio33 {

    public static void main(String[] args) {

        System.out.println(mayor(2, -4));
        System.out.println(mayor(2, -4,7));
    }

    public static int mayor(int x, int y) {

        return x > y ? x : y;

    }
    public static int mayor(int x, int y,int z) {

        //int a = x > y ? x : y;
        int mayorXY = mayor(x,y);
        return mayor(mayorXY,z);

    }
}
