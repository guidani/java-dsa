package basic;

public class Factorial {
    static long Fact(int n){
        return (n == 1) ? n : n * Fact(n - 1);
    }

    public static void main(String[] args) {
        long f = Fact(5);
        System.out.println("Valor: " + f);
    }
}
