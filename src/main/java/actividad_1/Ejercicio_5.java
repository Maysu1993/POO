package actividad_1;

public class Ejercicio_5 {
    public static void main(String[] args) {
        double X, Y, SUMA = 0;

        X = Teclado.inputDouble("Ingrese el valor de X: ");
        Y = Teclado.inputDouble("Ingrese el valor de Y: ");

        SUMA = SUMA + X;
        X = X + Math.pow(Y, 2);
        SUMA = SUMA + (X / Y);
        System.out.println("EL VALOR DE LA SUMA ES: " + SUMA);

    }

}
