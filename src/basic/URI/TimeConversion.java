package basic.URI;

import java.util.Scanner;

public class TimeConversion {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int totalSeconds = sc.nextInt();

        int hours = totalSeconds / 3600;
        totalSeconds = totalSeconds % 3600;
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;

        System.out.printf("%d:%d:%d\n", hours, minutes, seconds);

        sc.close();
    }
}
