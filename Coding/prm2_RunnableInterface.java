class MyThread1 implements Runnable {
    @Override
    public void run() {
        System.out.println("Studying");
                                                                         
    }
}

class MyThread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Listening Song");

    }
}

public class prm2_RunnableInterface {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();
           Thread thread1=new Thread(t1);           
           Thread thread2=new Thread(t2);   
           thread1.start();        
           thread2.start();

    }
}
