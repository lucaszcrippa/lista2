
package ex6;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        // Solicita o nome completo
        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine().toLowerCase().trim();

        // Divide o nome por palavras
        String[] palavras = nomeCompleto.split("\\s+");

        // Capitaliza cada palavra
        StringBuilder nomeFormatado = new StringBuilder();
        for (String palavra : palavras) {
            if (!palavra.isEmpty()) {
                nomeFormatado.append(Character.toUpperCase(palavra.charAt(0)))
                             .append(palavra.substring(1))
                             .append(" ");
            }
        }

        // Imprime o nome formatado
        System.out.println("Nome formatado: " + nomeFormatado.toString().trim());

        scanner.close();
    }
}
