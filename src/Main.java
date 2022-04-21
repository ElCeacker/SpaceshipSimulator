import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cual es la velocidad?");
        float velocidad0 = teclado.nextFloat();
        System.out.println("¿Cúal es la aceleración?");
        float aceleracion0 = teclado.nextFloat();
        SpaceShip nave = new SpaceShip ("Gabrilactus", 12345, 2.3f);
    }
}
