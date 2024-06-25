package game;

import java.util.Random;

public class JuegoAdivinar {
    private int numeroObjetivo;
    private final int maximosIntentos;
    private int intentosRestantes;

    public JuegoAdivinar(int minRange, int maxRange) {
        Random random = new Random();
        this.numeroObjetivo = random.nextInt(maxRange - minRange + 1) + minRange;
        this.maximosIntentos = 5; // Número máximo de intentos
        this.intentosRestantes = this.maximosIntentos;
    }

    public boolean adivino(int adivinar) {
        intentosRestantes--;
        return adivinar == numeroObjetivo;
    }

    public int getNumeroObjetivo() {
        return numeroObjetivo;
    }

    public int getMaximosIntentos() {
        return maximosIntentos;
    }

    public int getIntentosRestantes() {
        return intentosRestantes;
    }
}