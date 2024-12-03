import java.util.Scanner;

public class TestBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Passo 1: Ler do usuário o número da conta e saldo inicial
        System.out.print("Digite o número da conta: ");
        String numeroConta = scanner.nextLine();
        
        System.out.print("Digite o saldo inicial da conta: ");
        double saldoInicial = scanner.nextDouble();

        // Passo 2: Instanciar a ContaCorrente com os dados informados
        ContaCorrente conta = new ContaCorrente(numeroConta, saldoInicial);

        // Passo 3: Solicitar 10 saques
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o valor do saque " + i + ": ");
            double valorSaque = scanner.nextDouble();

            try {
                conta.sacar(valorSaque);
                System.out.println("Saque realizado com sucesso! Saldo atual: " + conta.getSaldo());
            } catch (SaldoInsuficienteException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        // Fechar o scanner
        scanner.close();
    }
}
