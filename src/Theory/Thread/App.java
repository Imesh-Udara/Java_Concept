package Theory.Thread;

//class MyTask{
//    void excuteTask(){
//        for(int doc=1; doc<=10; doc++){
//            System.out.println("@@Printing Documents #" + doc + "Printer 2");
//        }
//
//    }
//}

//class MyTask extends Thread{
//    @Override
//    public void run(){
//        for(int doc=1; doc<=10; doc++){
//            System.out.println("@@Printing Documents #" + doc + "Printer 2");
//        }
//
//    }
//}
class CA{

}
class MyTask extends CA implements Runnable{
    @Override
    public void run(){
        for(int doc=1; doc<=10; doc++){
            System.out.println("@@Printing Documents #" + doc + "Printer 2");
        }

    }
}
public class App {
    public static void main(String[] args) {
        //Job1
        System.out.println("--Application Started--");
        //Job2
//        MyTask task = new MyTask();
//        task.excuteTask();
//        task.start(); //start exute run method
        Runnable r = new MyTask();
        Thread task = new Thread(r);
        task.start();
        //Job3
        for(int doc=1;doc<=10;doc++){
            System.out.println("^^Printing Documents #" + doc + "Printer 1");
        }
        //Job4
        System.out.println("--Application Finished--");
    }
}
