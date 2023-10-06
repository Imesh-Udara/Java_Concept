package Theory.Thread;

public class ThreadsByExtending extends Thread{
    //initiated run method for Thread
    public void run(){
        System.out.println("Thread Started Running ...");
    }

    public static void main(String[] args) {
        ThreadsByExtending g1 = new ThreadsByExtending();

        g1.start();
    }
}
