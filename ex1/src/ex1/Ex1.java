
package ex1;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
      
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite uma palavra
        System.out.print("Por favor, digite uma palavra: ");
        String palavra = scanner.nextLine();

        // Obtém o número de caracteres da palavra
        int numeroDeLetras = palavra.length();

        // Imprime o resultado
        System.out.println("A palavra '" + palavra + "' tem " + numeroDeLetras + " letras.");

        // Fecha o objeto Scanner para liberar recursos
        scanner.close();
    }
}
