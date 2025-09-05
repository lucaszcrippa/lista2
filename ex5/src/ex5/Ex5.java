
package ex5;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Solicita a frase do usuário
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine().trim();

        if (frase.isEmpty()) {
            System.out.println("A frase contém 0 palavras.");
        } else {
            // Divide a frase por espaços em branco
            String[] palavras = frase.split("\\s+");
            System.out.println("A frase contém " + palavras.length + " palavra(s).");
        }

        scanner.close();
    }
}