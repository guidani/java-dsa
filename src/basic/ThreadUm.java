package basic;

public class ThreadUm extends Thread{
    public static int counter = 0;
    @Override
    public void run() {
        System.out.println("Thread um: " + counter);
        counter++;
        super.run();
    }
}
