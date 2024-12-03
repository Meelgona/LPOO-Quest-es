import java.util.Scanner;

public class TestTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Criando um triângulo com lados predefinidos
            Triangle triangle = new Triangle(3.0, 4.0, 5.0);
            triangle.setLadoA(10.0);  // Alterando um dos lados

            // Solicitar ao usuário os valores para um novo triângulo
            System.out.println("Informe os três lados do triângulo:");
            double ladoA = scanner.nextDouble();
            double ladoB = scanner.nextDouble();
            double ladoC = scanner.nextDouble();

            // Criando um novo triângulo com os valores informados
            Triangle triangle2 = new Triangle(ladoA, ladoB, ladoC);

        } catch (DimensoesInvalidasException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
