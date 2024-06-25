package game;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JuegoAdivinar game = new JuegoAdivinar(1, 100); // Rango del juego, del 1 al 100
        
        System.out.println("----------------------------------------------------------");
        System.out.println("Bienvenido al juego de adivinar el número!");
        System.out.println("El número a adivinar se encuentra entre el 1 y el 100");
        System.out.println("Tienes " + game.getMaximosIntentos() + " intentos para adivinar el número.");
        System.out.println("----------------------------------------------------------");

        boolean adivinoCorrectamente = false;
        while (!adivinoCorrectamente && game.getIntentosRestantes() > 0) {
        	System.out.println();
            System.out.print("Intenta adivinar el número: ");
            int adivinar = scanner.nextInt();

            if (game.adivino(adivinar)) {
            	System.out.println();
            	System.out.println("----------------------------------------------------------");
                System.out.println("¡Felicidades! Has adivinado el número.");
                adivinoCorrectamente = true;
            } else {
                if (adivinar < game.getNumeroObjetivo()) {
                	System.out.println("----------------------------------------------------------");
                    System.out.println("El número a adivinar es mayor.");
                } else {
                	System.out.println("----------------------------------------------------------");
                    System.out.println("El número a adivinar es menor.");
                }
                System.out.println("Intentos restantes: " + game.getIntentosRestantes());
            }
        }

        if (!adivinoCorrectamente) {
        	System.out.println();
        	System.out.println("----------------------------------------------------------");
            System.out.println("¡Oh no! Has agotado tus intentos. El número era: " + game.getNumeroObjetivo());
        }

        scanner.close();
        System.out.println("Gracias por jugar.");
    }
}