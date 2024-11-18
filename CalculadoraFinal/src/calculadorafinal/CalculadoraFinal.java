/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadorafinal;

import java.util.Scanner;

public class CalculadoraFinal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = 0, b = 0, resultado = 0;
        String opciones;

        System.out.println("Por favor introduce números positivos, que no sean 0");
        System.out.println();
        System.out.println("Operaciones disponibles:");
        System.out.println("+, -, *, /, raiz");
        System.out.println("valorabs, logaritmo, funcionexp, seno, coseno");
        System.out.println("tangente, arcosen, arcotang, redondeo");
        System.out.println("acumulador, Fibonacci, Mayor");
        System.out.println("SALIR -> pulse s");
        System.out.println();

        do {
            System.out.print("¿Qué deseas calcular? ");
            opciones = sc.nextLine();

            if (opciones.equalsIgnoreCase("s")) {
                System.out.println("fin");
                break;
            }

            if ("+-*/Mayor".contains(opciones)) {
                System.out.print("Introduce un número: ");
                a = sc.nextDouble();
                System.out.print("Introduce otro número: ");
                b = sc.nextDouble();
                sc.nextLine(); // Consumir salto de línea
            } else {
                System.out.print("Introduce un número: ");
                a = sc.nextDouble();
                sc.nextLine(); // Consumir salto de línea
            }

            switch (opciones) {
                case "+" -> resultado = suma(a, b);
                case "-" -> resultado = resta(a, b);
                case "*" -> resultado = multiplica(a, b);
                case "/" -> resultado = division(a, b);
                case "raiz" -> resultado = Math.sqrt(a);
                case "valorabs" -> resultado = Math.abs(a);
                case "logaritmo" -> resultado = Math.log(a);
                case "funcionexp" -> resultado = Math.exp(a);
                case "seno" -> resultado = Math.sin(a);
                case "coseno" -> resultado = Math.cos(a);
                case "tangente" -> resultado = Math.tan(a);
                case "arcosen" -> resultado = Math.asin(a);
                case "arcotang" -> resultado = Math.atan(a);
                case "redondeo" -> resultado = Math.round(a);
                case "acumulador" -> resultado = acumulador(a);
                case "Fibonacci" -> {
                    hastaFibonacci((int) a);
                    resultado = 0;
                }
                case "Mayor" -> {
                    boolean esMayor = esMayor(a, b);
                    System.out.println("Es mayor: " + esMayor);
                    resultado = 0;
                }
                default -> resultado = 0;
            }

            if (resultado != 0) {
                System.out.println("Resultado: " + resultado);
            }

        } while (!opciones.equalsIgnoreCase("s"));

        sc.close();
    }

    public static double suma(double a, double b) {
        return a + b;
    }

    public static double resta(double a, double b) {
        return a - b;
    }

    public static double multiplica(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        if (a != 0 && b != 0) {
            return a / b;
        }
        System.out.println("Error: División por cero.");
        return 0;
    }

    public static double acumulador(double a) {
        double sumador = 0;
        final double EULER = Math.E;
        for (double i = 0; i <= 10; i += 0.87) {
            sumador += EULER * a;
        }
        return sumador;
    }

    public static void hastaFibonacci(int a) {
        int elPrimero = 0, elSegundo = 1, siguiente;
        System.out.println("Los números de la serie Fibonacci hasta " + a + " son: ");
        while (elPrimero < a) {
            System.out.print(elPrimero + " ");
            siguiente = elPrimero + elSegundo;
            elPrimero = elSegundo;
            elSegundo = siguiente;
        }
        System.out.println();
    }

    public static boolean esMayor(double a, double b) {
        return a > b;
    }
}
