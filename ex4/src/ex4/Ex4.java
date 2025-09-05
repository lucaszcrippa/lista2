
package ex4;

import java.util.Scanner;

public class Ex4 {

 
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê a palavra do usuário
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        // Remove espaços e coloca em minúsculas para garantir comparação correta
        String palavraFormatada = palavra.replaceAll("\\s+", "").toLowerCase();

        // Inverte a palavra
        String palavraInvertida = new StringBuilder(palavraFormatada).reverse().toString();

        // Verifica se é palíndromo
        if (palavraFormatada.equals(palavraInvertida)) {
            System.out.println("É um palíndromo!");
        } else {
            System.out.println("Não é um palíndromo.");
        }

        scanner.close();
    }
}