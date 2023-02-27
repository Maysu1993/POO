package actividad_1;

public class Ejercicio_4 {

    public static void main(String[] args) {
        int edjuan, edana, edalber, edmama;

        edjuan = Teclado.inputInt("Ingrese la edad de juan ");

        edalber = 2 * (edjuan / 3);
        edana = 4 * (edjuan / 3);
        edmama = edjuan + edalber + edana;

        System.out.println("La edad de Juan es: " + edjuan);
        System.out.println("La edad de Alberto es: " + edalber);
        System.out.println("La edad de Ana es: " + edana);
        System.out.println("La edad de mama es: " + edmama);

    }

}
