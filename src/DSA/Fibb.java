package DSA;

public class Fibb {
    public static void main(String[] args) {
        long a = 0;
        long b = 1;
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        for (long i = 0; i < 99; i++){
            long c = a + b;
            a = b;
            b = c;
            System.out.println(i + " - C: " + c);
        }
    }
}
