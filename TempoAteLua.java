import java.util.Scanner;

public class TempoAteLua {
    public static void main(String[] args) {
        final double DISTANCIA_LUA_KM = 384400; // distância média Terra-Lua

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a velocidade média (em km/h): ");
        double velocidade = scanner.nextDouble();

        double tempoHoras = DISTANCIA_LUA_KM / velocidade;
        double tempoDias = tempoHoras / 24;

        System.out.printf("Tempo de viagem: %.2f horas (%.2f dias)%n", tempoHoras, tempoDias);

        scanner.close();
    }
}
