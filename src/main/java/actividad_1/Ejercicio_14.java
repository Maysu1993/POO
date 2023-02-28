package actividad_1;

public class Ejercicio_14 {

    public static void main(String[] args) {
        double numero;

        numero = Teclado.inputDouble("Ingrese un numero para hallar su raiz cuadrada y cubica respectivamente: ");

        double Cuadrado = Math.sqrt(numero);
        double Cubo = Math.cbrt(numero);

        System.out.println("El cuadrado de  este numero es: " + Cuadrado);
        System.out.println("El cubo de este numero es: " + Cubo);

    }

}
