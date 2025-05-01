
class thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Thread1");

        }
    }
}

class thread2 extends Thread {

    public void run() {

        for (int i = 0; i < 50; i++) {
            System.out.println("Thread2");

        }

    }
}

public class S1 {

    public static void main(String[] args) {

        thread1 t1 = new thread1();
        t1.run();

        thread2 t2 = new thread2();
        t2.run();

    }

}