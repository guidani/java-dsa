package basic;

public class ThreadDois extends Thread{
    public static int counter = 0;
    @Override
    public void run() {
        System.out.println("Thread dois: " + counter);
        counter++;
        super.run();
    }
}
