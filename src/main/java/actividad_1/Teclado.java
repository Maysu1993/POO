/*
 * 
 * 
 * Intanta leer por teclado un valor 
 * entero (inputInt) o double (inputDouble) valido
 * mostrando el mensaje de error e intentando de nuevo
 * hasta que esto suceda
 */
package actividad_1;

import java.util.Scanner;

public class Teclado {
    public static int inputInt(String mensaje) {
        Scanner leer_teclado = new Scanner(System.in);
        while (true) {
            System.out.println(mensaje);
            try {
                int value = leer_teclado.nextInt();
                return value;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Dato entero invalido");
                leer_teclado.nextLine();
                continue;
            }
        }
    }

    public static double inputDouble(String mensaje) {
        Scanner leer_teclado = new Scanner(System.in);
        while (true) {
            System.out.println(mensaje);
            try {
                double value = leer_teclado.nextDouble();
                return value;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Dato invalido");
                leer_teclado.nextLine();
                continue;
            }
        }
    }
}
