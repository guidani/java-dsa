package basic.URI;

public class FuelSpent {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int kmPerLiter = 12;
        int spentTimeInTheTrip = scanner.nextInt();
        int avaregaSpeed = scanner.nextInt();
        double distance = spentTimeInTheTrip * avaregaSpeed;
        double fuelNeeded = distance / kmPerLiter;
        System.out.printf("%.3f\n", fuelNeeded);
        scanner.close();
    }
}
