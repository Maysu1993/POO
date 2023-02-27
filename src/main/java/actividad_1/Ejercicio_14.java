package actividad_1;

import java.util.Scanner;

public class Ejercicio_14 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        double numero;
        try (Scanner leer_teclado = new Scanner(System.in)) {
            System.out.println("Ingrese un numero para hallar su raiz cuadrada y cubica respectivamente: ");
            numero= leer_teclado.nextDouble();
        }
        double Cuadrado = Math.sqrt(numero);
        double Cubo = Math.cbrt(numero);

        System.out.println("El cuadrado de  este numero es:" +Cuadrado);
        System.out.println("El cubo de este numero es:" + Cubo);


    
    }

    
}
