package actividad_1;

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {
        double X,Y,SUMA;
        try (Scanner leer_teclado = new Scanner(System.in)) {
            System.out.println("Ingrese el valor de X: ");
            X = leer_teclado.nextDouble();

            System.out.println("Ingrese el valor de Y: ");
            Y = leer_teclado.nextDouble();
        }
        SUMA = 0; 
        SUMA = SUMA+ X;
        X = X + Math.pow(Y,2);
        SUMA = SUMA + (X/Y);   
        System.out.println("EL VALOR DE LA SUMA ES:" + SUMA);
       
   
       
  }
   
 }
 
    