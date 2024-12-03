import java.util.ArrayList;
import java.util.Scanner;

public class LerIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> idades = new ArrayList<>();

        // Leitura das idades
        System.out.println("Digite as idades de 10 pessoas:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Idade " + (i + 1) + ": ");
            try {
                int idade = scanner.nextInt();
                idades.add(idade);
            } catch (Exception e) {
                System.out.println("Entrada inválida. Tente novamente.");
                scanner.next(); // Limpa o buffer do scanner
                i--; // Volta o índice para repetir a entrada
            }
        }

        // Exibe a lista de idades
        System.out.println("Lista de idades: " + idades);

        // Remoção da idade na posição informada
        System.out.println("Digite uma posição para remover:");
        try {
            int posicao = scanner.nextInt();
            int idadeRemovida = idades.remove(posicao);
            System.out.println("Idade removida: " + idadeRemovida);
            System.out.println("Lista atualizada: " + idades);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Posição Inválida");
        } catch (Exception e) {
            System.out.println("Erro: Entrada inválida");
        }

        scanner.close();
    }
}
