// Classe que representa a Conta Corrente
import java.util.Scanner;

public class ContaCorrente {
    private String numeroConta;
    private double saldo;

    // Construtor da conta corrente
    public ContaCorrente(String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    // Método para realizar um saque
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para saque de " + valor);
        }
        saldo -= valor;
    }

    // Método para realizar um depósito
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    // Método para mostrar o saldo da conta
    public double getSaldo() {
        return saldo;
    }

    // Método para obter o número da conta
    public String getNumeroConta() {
        return numeroConta;
    }
}
