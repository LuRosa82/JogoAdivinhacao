import java.util.Random;
import java.util.Scanner;
public class JogoAdivinhacao {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(101); // Gera um número entre 0 e 100
        Scanner scanner = new Scanner(System.in);
        int tentativas = 5;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número entre 0 e 100. Você tem " + tentativas + " tentativas.");

        for (int i = 1; i <= tentativas; i++) {
            System.out.print("Tentativa " + i + ": ");
            int palpite = scanner.nextInt();

            if (palpite == numeroAleatorio) {
                System.out.println("Parabéns! Você adivinhou o número.");
                break;
            } else if (palpite > numeroAleatorio) {
                System.out.println("O número é menor que " + palpite + ".");
            } else {
                System.out.println("O número é maior que " + palpite + ".");
            }

            if (i == tentativas) {
                System.out.println("Você esgotou suas tentativas. O número era " + numeroAleatorio + ".");
            }
        }

        scanner.close();
    }
}
