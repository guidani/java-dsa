package basic.URI;

public class Consumption {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        int distance = scanner.nextInt();
        double fuel = scanner.nextDouble();
        
        double consumption = distance / fuel;
        
        System.out.printf("%.3f km/l\n", consumption);
        
        scanner.close();
    }
}
