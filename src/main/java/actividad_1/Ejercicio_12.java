package actividad_1;

public class Ejercicio_12 {
    public static void main(String[] args) {
        int horas = 0, valor_horas = 0;
        double retencion = 0;

        horas = Teclado.inputInt("Ingrese las horas de trabajo a la semana: ");
        valor_horas = Teclado.inputInt("Ingrese el valor por hora: ");
        retencion = Teclado.inputDouble("Ingrese el valor de retencion: 1 - 100");

        float salario_bruto = horas * valor_horas;
        float Retencion_fuente = (float) (salario_bruto * (retencion / 100));
        float salario_neto = salario_bruto - Retencion_fuente;

        System.out.println("El salario bruto es: " + salario_bruto);
        System.out.println("La Retención a la fuente es: " + Retencion_fuente);
        System.out.println("El salario neto es: " + salario_neto);

    }

}
