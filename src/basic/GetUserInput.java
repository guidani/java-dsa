package basic;

import java.util.Scanner;

public class GetUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        String idade;

        System.out.println("Digite seu nome: ");
        name = scanner.nextLine();

        System.out.println("Qual sua idade? ");
        idade = scanner.nextLine();

        int idadeN = Integer.parseInt(idade);

        System.out.println("Hello " + name + "!!!");
        System.out.println("You is " + idadeN + " old!!!");

        scanner.close();
    }
}
