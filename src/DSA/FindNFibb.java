package DSA;

public class FindNFibb {
    public static void main(String[] args) {
        System.out.println(calc(50));
    }

    public static long calc(long v){
        if (v <= 1){
            return v;
        } else {
            return calc(v - 1) + calc(v - 2);
        }
    }
}
