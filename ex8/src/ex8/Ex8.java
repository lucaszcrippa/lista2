
package ex8;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

        // Solicita o número do cartão
        System.out.print("Digite o número do cartão de crédito: ");
        String numeroCartao = scanner.nextLine().trim();

        // Verifica se o número tem pelo menos 4 dígitos
        if (numeroCartao.length() < 4) {
            System.out.println("Número de cartão inválido. Deve conter pelo menos 4 dígitos.");
        } else {
            int tamanho = numeroCartao.length();
            String ultimos4 = numeroCartao.substring(tamanho - 4);
            String asteriscos = "*".repeat(tamanho - 4);
            String resultado = asteriscos + ultimos4;

            System.out.println("Cartão mascarado: " + resultado);
        }

        scanner.close();
    }
}

