
package ex2;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
         // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite uma frase
        System.out.print("Por favor, digite uma frase: ");
        String frase = scanner.nextLine();

        // Usa o método replace() para substituir todas as ocorrências de 'a' por '*'
        // Note que o método replace retorna uma nova string
        String fraseModificada = frase.replace('a', '*');

        // Imprime a frase modificada
        System.out.println("A frase modificada é: " + fraseModificada);

        // Fecha o objeto Scanner
        scanner.close();
    }
}
