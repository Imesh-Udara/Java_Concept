package Theory.Thread;

class Printer{
//    synchronized void printerDocuments(int numOfCopies,String docName){
 void printerDocuments(int numOfCopies,String docName){
        for (int i =1; i<= numOfCopies; i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(">> Printing Documents" + docName + " " + i);
        }
    }
}

class MyThread extends Thread{
    Printer pRef;
    MyThread(Printer p){
        pRef = p;
    }
    @Override
    public void run(){
        synchronized (pRef){
            pRef.printerDocuments(10,"John's Profile");
        }

    }
}

class YourThread extends Thread{
    Printer pRef;
    YourThread(Printer p){
        pRef = p;
    }
    @Override
    public void run(){
        synchronized (pRef){
            pRef.printerDocuments(10,"Fionnas's Profile");
        }

    }
}
public class SyncApp {
    public static void main(String[] args) {
        System.out.println("-- Application Started--");

        Printer printer = new Printer();
//        printer.printerDocuments(10, "IshantsProfiles.pdf");

        MyThread mRef = new MyThread(printer);
        YourThread yRef = new YourThread(printer);

        mRef.start();
//        try{
//            mRef.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        yRef.start();

        System.out.println("-- Application Finished--");
    }
}
