package actividad_1;

import java.util.Scanner;

public class Ejercicio_17 {
    public static void main(String[] args) {
        double radio, areacirculo, longitud_circunferencias;
        try (Scanner leer_teclado = new Scanner(System.in)) {
            System.out.println("Ingrese el valor del radio: ");
            radio = leer_teclado.nextDouble();
        }


        areacirculo = Math.PI * Math.pow(radio,2);
        longitud_circunferencias = 2 * Math.PI * radio;
        
        System.out.println("El area del circulo" + areacirculo);
        System.out.println("La longitud de la circunferencia es:" + longitud_circunferencias);


        




        
    
    
    }
    
}
