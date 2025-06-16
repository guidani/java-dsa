package basic.URI;

public class Distance {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        int distanceInKm = scanner.nextInt(); // Distance in km
        int time = distanceInKm * 2; // Total time in hours (2 hours for both cars)

        System.out.printf("%d minutos\n", time);
        scanner.close();
    }
}
