class myThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("playing");

    }
}

class myThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("studying");
    }

}

public class pnew {

    public static void main(String[] args) {
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();
        t1.start();
        t2.start();
    }
}