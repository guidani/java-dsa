package basic;

public class with_threads {
    public static void main(String[] args) {
        ThreadUm tu = new ThreadUm();
        ThreadDois td =  new ThreadDois();

        tu.start();

        int c = 0;
        while (tu.isAlive()){
            System.out.println("tu is alive");
            c++;
            System.out.println("C: " + c);
        }
        td.start();
    }


}

