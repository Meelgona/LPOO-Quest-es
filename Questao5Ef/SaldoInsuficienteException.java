// Exceção checada para saldo insuficiente
public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(String message) {
        super(message);  // Passa a mensagem para a classe pai (Exception)
    }
}
