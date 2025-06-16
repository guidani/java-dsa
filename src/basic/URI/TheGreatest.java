package basic.URI;

public class TheGreatest {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        int greatest = a;
        
        if (b > greatest) {
            greatest = b;
        }
        
        if (c > greatest) {
            greatest = c;
        }
        
        System.out.printf("%d eh o maior\n", greatest);
        
        scanner.close();
    }
}
