// Hecho por Lexter Abe

import java.util.Scanner;

public class codigoErroresFix {
    static void main() {
        // Declaración de Scanner y el booleano principal
        Scanner src = new Scanner(System.in);
        boolean activo = true;

        // Bucle principal del programa
        while (activo) {
            // Muestra las opciones al usuario
            System.out.println("1. Celsius a Kelvin");
            System.out.println("2. Celsius a Fahrenheit");
            System.out.println("3. Fahrenheit a Celsius");
            System.out.println("4. Salir");
            System.out.print("Opción: ");

            // Declaración de variables resultado y valor
            double resultado = 0;
            double valor;

            // Pregunta al usuario qué opción elige
            int opcion = src.nextInt();
            switch (opcion) {

                // Celsius a Kelvin
                case 1:
                    System.out.print("Introduce el valor de ºC: ");
                    valor = src.nextDouble(); // Lee el valor inicial de Celsius
                    resultado = (valor + 273.15); // Conversión Celsius a Kelvin
                    System.out.println(valor + " °C = " + resultado + " K");
                    break;

                // Celsius a Fahrenheit
                case 2:
                    System.out.print("Introduce el valor de ºC: ");
                    valor = src.nextDouble(); // Lee el valor inicial de Celsius
                    resultado = valor * 9 / 5 + 32; // Conversión Celsius a Fahrenheit
                    System.out.println(valor + " °C = " + resultado + " °F");
                    break;

                // Fahrenheit a Celsius
                case 3:
                    System.out.print("Introduce °F: ");
                    valor = src.nextDouble(); // Lee el valor inicial de Fahrenheit
                    resultado = (valor - 32) * 5 / 9; // conversión Celsius a Fahrenheit
                    System.out.println(valor + " °F = " + resultado + " °C");
                    break;

                // Ninguno, sale del programa
                case 4:
                    System.out.println("Adiós!");
                    activo = false; // Pone en false el booleano y acaba el programa
                    break;
            }

        }
    }
}
