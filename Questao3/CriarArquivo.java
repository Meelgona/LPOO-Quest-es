import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CriarArquivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o caminho para criar o arquivo:");
        String caminho = scanner.nextLine();

        File arquivo = new File(caminho);
        
        try {
            if (arquivo.createNewFile()) {
                System.out.println("Arquivo criado com sucesso: " + arquivo.getAbsolutePath());
            } else {
                System.out.println("O arquivo já existe.");
            }
        } catch (IOException e) {
            System.out.println("Caminho inválido");
        }

        scanner.close();
    }
}
