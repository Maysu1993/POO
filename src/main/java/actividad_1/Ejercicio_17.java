package actividad_1;

public class Ejercicio_17 {
    public static void main(String[] args) {
        double radio, areacirculo, longitud_circunferencias;

        radio = Teclado.inputDouble("Ingrese el valor del radio: ");

        areacirculo = Math.PI * Math.pow(radio, 2);
        longitud_circunferencias = 2 * Math.PI * radio;

        System.out.println("El area del circulo: " + areacirculo);
        System.out.println("La longitud de la circunferencia es: " + longitud_circunferencias);

    }

}
