package basic;

public class Loops {

    static  void DoWhile(){
        System.out.println("#### DO WHILE ####");
        int n = 0;
        do {
            int randomNum = (int)(Math.random() * 101);
            System.out.println("Valor: " + n);
            System.out.println(randomNum);
            n++;
        } while (n < 25);
    }
    static void WhileLoops(){
        System.out.println("#### WHILE LOOPS ####");
        int n = 0;
        while (n < 10){
            System.out.println("Valor: " + n);
            n++;
        }
    }
    static void ForLoops(){
        System.out.println("#### FOR LOOPS ####");
        for (int i = 0; i < 10; i++){
            System.out.println("Valor: " + i);
        }
    }
    public static void main(String[] args) {
        ForLoops();
        WhileLoops();
        DoWhile();
    }
}
