
package ex7;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        // Solicita o email do usuário
        System.out.print("Digite seu endereço de email: ");
        String email = scanner.nextLine().trim();

        // Verifica se o email contém '@'
        int indiceArroba = email.indexOf('@');

        if (indiceArroba != -1 && indiceArroba < email.length() - 1) {
            // Extrai o domínio
            String dominio = email.substring(indiceArroba + 1);
            System.out.println("Domínio do email: " + dominio);
        } else {
            System.out.println("Endereço de email inválido.");
        }

        scanner.close();
    }
}
