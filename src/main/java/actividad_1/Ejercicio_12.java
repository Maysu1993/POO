package actividad_1;

import java.util.Scanner;

public class Ejercicio_12 {
    public static void main(String[] args) {
        int horas, Valor_Horas;
        double retencion; 
        try (Scanner leer_teclado = new Scanner(System.in)) {
            System.out.println("Ingrese las horas de trabajo a la semana : ");
            horas = leer_teclado.nextInt();

            System.out.println("Ingrese el valor por hora : ");
            Valor_Horas = leer_teclado.nextInt();

            System.out.println("Ingrese el valor de retencion : ");
            retencion = leer_teclado.nextDouble();

        }
        
        float salario_bruto = horas * Valor_Horas;
        float Retencion_fuente =(float) (salario_bruto * (retencion/100));
        float  salario_neto = salario_bruto - Retencion_fuente;

        System.out.println("El salario bruto es:"+ salario_bruto);
        System.out.println("La Retención a la fuente es:"+ Retencion_fuente);
        System.out.println("El salario neto es:"+ salario_neto);

   }


}




    

