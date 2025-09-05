
package ex3;

import java.util.Scanner;

public class Ex3 {

       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a palavra do usuário
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        // Inverte a palavra
        String palavraInvertida = new StringBuilder(palavra).reverse().toString();

        // Exibe a palavra invertida
        System.out.println("Palavra invertida: " + palavraInvertida);

        scanner.close();
    }
}