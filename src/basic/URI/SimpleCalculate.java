// URI 1010
package basic.URI;

import java.util.Scanner;

public class SimpleCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p1 = sc.nextLine();
        String p2 = sc.nextLine();

        String[] p1Split = p1.split(" ");
        String[] p2Split = p2.split(" ");

        int num1 = Integer.parseInt(p1Split[1].trim()); // Quantity
        double price1 = Double.parseDouble(p1Split[2].trim()); // Price per unit

        int num2 = Integer.parseInt(p2Split[1].trim()); // Quantity
        double price2 = Double.parseDouble(p2Split[2].trim()); // Price per unit

        double total = (num1 * price1) + (num2 * price2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", total);
        System.out.println("");

        sc.close();
    }
}
