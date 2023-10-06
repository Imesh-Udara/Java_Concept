package Theory.Thread;

public class RunnableInterface implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread is running Successfully");
    }

    public static void main(String[] args) {
        RunnableInterface g1 = new RunnableInterface();
        //initializing thread object
        Thread t1 = new Thread(g1);
        t1.start();
    }
}
