package basic.URI;

import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius = scanner.nextDouble();
        double pi = 3.14159;
        double volume = (4 / 3.0) * pi * Math.pow(radius, 3);

        System.out.printf("VOLUME = %.3f\n", volume);

        scanner.close();
    }
}
