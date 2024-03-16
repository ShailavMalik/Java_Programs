class myThread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("Hey how are you!");
            i++;
        }
        System.out.println();
    }

}

class myThread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("Fine");
            i++;
        }

    }
}

public class prm1_ThreadClass {

    public static void main(String[] args) {
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();
        t1.start();
        t2.start();

    }

}