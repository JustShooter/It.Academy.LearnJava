package main.java.HomeWork20;

public class Task55 {

    public static final int THREADS = 10;

    public static void main(String[] args) throws Exception {

        for (int i = 0; i < THREADS; i++) {
            new MyThread("Поток-", i).start();
        }
        System.out.println("Main finished");
    }
}

class MyThread extends Thread {
    public static final int MILLIS = 2000;
    private final String locker;


    public MyThread(String locker, int number) {
        super(locker + number);
        this.locker = locker;
    }

    @Override
    public void run() {
        synchronized (locker) {
            System.out.println(getName() + " начал работу");
            try {
                Thread.sleep(MILLIS);
            } catch (InterruptedException e) {
                System.out.println("Поток был прерван!");
            }
            System.out.println(getName() + " закончил работу");
        }
    }
}
