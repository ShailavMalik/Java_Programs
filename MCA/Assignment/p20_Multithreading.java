//* program that demonstrates multithreading using both the Thread class 
//* and the Runnable interface

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread class: " + (i + 1));
        }
    }
}

class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Runnable interface: " + (i + 1));
        }
    }
}

public class p20_Multithreading {
    public static void main(String[] args) {
        // Create and start a thread using the Thread class
        MyThread thread1 = new MyThread();
        thread1.start();

        // Create and start a thread using the Runnable interface
        MyRunnable myRunnable = new MyRunnable();
        Thread thread2 = new Thread(myRunnable);
        thread2.start();
    }
}
