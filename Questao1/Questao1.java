import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite um número:");
        try {
            int numero = scanner.nextInt();

            // Tenta obter o caractere na posição informada
            char caractere = nome.charAt(numero);
            System.out.println("O caractere na posição " + numero + " é: " + caractere);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Posição Inválida");
        } catch (Exception e) {
            System.out.println("Erro: Entrada inválida");
        }

        scanner.close();
    }
}
