package basic.URI;

import java.util.Scanner;

public class BankNotes {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int N = scanner.nextInt();
        int original = N;

        int[] notes = {100, 50, 20, 10, 5, 2, 1};
        int[] count = new int[notes.length];

        for (int i = 0; i < notes.length; i++) {
            count[i] = N / notes[i];
            N = N % notes[i];
        }

        System.out.println(original);
        for (int i = 0; i < notes.length; i++) {
            System.out.printf("%d nota(s) de R$ %d,00\n", count[i], notes[i]);
        }

        scanner.close();
    }
}
