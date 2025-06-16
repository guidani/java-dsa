package basic.URI;

public class Area {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        double pi = 3.14159;

        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        double a = Double.parseDouble(parts[0]);
        double b = Double.parseDouble(parts[1]);
        double c = Double.parseDouble(parts[2]);
        double triangleArea = (a * c) / 2.0;
        double circleArea = pi * Math.pow(c, 2);
        double trapeziumArea = ((a + b) * c) / 2.0;
        double squareArea = Math.pow(b, 2);
        double rectangleArea = a * b;

        System.out.printf("TRIANGULO: %.3f\n", triangleArea);
        System.out.printf("CIRCULO: %.3f\n", circleArea);
        System.out.printf("TRAPEZIO: %.3f\n", trapeziumArea);
        System.out.printf("QUADRADO: %.3f\n", squareArea);
        System.out.printf("RETANGULO: %.3f\n", rectangleArea);


        scanner.close();
    }
}
