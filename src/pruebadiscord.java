import java.io.*;
import java.util.*;

public class pruebadiscord {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int opcion = 0;

        System.out.println("Ingresa una opcion:");
        opcion = lector.nextInt();

        System.out.println(opcion);

        while (true) {
            System.out.println("1. Ciclo hasta un numero que tu dices.");
            System.out.println("2. Un simple mensaje.");
            System.out.println("3. A.");
            opcion = lector.nextInt();
            if (opcion != 1 || opcion != 2 || opcion != 3) {
                break;
            } else if (opcion == 1) {
                System.out.println("Ingresa el numero final");
                int opcionciclo = lector.nextInt();
                for (int i = 1; i < opcionciclo; i++) {
                    System.out.println(i);
                }
            } else if (opcion == 2) {

            } else if (opcion == 3) {
                break;
            } else {
                System.out.println("Ingrese una opcion valida,");
                continue;
            }
        }

    }
}
