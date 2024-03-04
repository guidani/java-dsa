package basic;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(soma(1,2));
        System.out.println(soma(1,2, 3));
    }
    static int soma(int a, int b){
        return a + b;
    }

    static int soma(int a, int b, int c){
        return a + b + c;
    }
}
