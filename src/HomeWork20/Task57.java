package HomeWork20;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;

public class Task57 {
    private static final Random random = new Random();

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedBlockingQueue<>();

        for (int i = 0; i < 200; i++) {
            queue.add(random.nextInt(100) + 1);
        }

        List<Thread> threads = new ArrayList<>();

        WareHouse wareHouse = new WareHouse(queue);

        for (int i = 0; i < 3; i++) {
            threads.add(new Thread(new Producer(wareHouse), "Поставщик №" + i));
        }

        for (int i = 0; i < 2; i++) {
            threads.add(new Thread(new Consumer(wareHouse), "Покупатель №" + i));
        }

        for (Thread thread : threads) {
            thread.start();
        }
    }
}


class WareHouse {
    private final Object locker = new Object();
    private final Random random = new Random();

    private final Queue<Integer> queue;
    private volatile int iterationsCount;

    public WareHouse(Queue<Integer> queue) {
        this.queue = queue;
        this.iterationsCount = 0;
    }

    public int getIterationsCount() {
        return iterationsCount;
    }

    public boolean shipment() {

        synchronized (locker) {
            if (getIterationsCount() >= 10000) {
                return false;
            }
            while (queue.size() < 1) {
                try {
                    locker.wait();
                } catch (InterruptedException e) {
                    return false;
                }
            }
            Integer shipped = queue.poll();
            iterationsCount++;
            System.out.println(Thread.currentThread().getName()
                    + " отгружено " + shipped
                    + ", размер очереди = " + queue.size()
                    + ", операций выполнено = " + iterationsCount);
            if (queue.size() <= 80) {
                locker.notify();
            }
            return true;
        }
    }

    public boolean receipt() {

        synchronized (locker) {
            if (getIterationsCount() >= 10000) {
                return false;
            }

            while (queue.size() >= 100) {
                try {
                    locker.wait();
                } catch (InterruptedException e) {
                    return false;
                }
            }
            int add = random.nextInt(100) + 1;
            queue.add(add);
            iterationsCount++;
            System.out.println(Thread.currentThread().getName()
                    + " получено " + add
                    + ", размер очереди = " + queue.size()
                    + ", операций выполнено = " + iterationsCount);
            locker.notify();
            return true;
        }
    }
}

class Producer implements Runnable {

    private WareHouse wareHouse;

    Producer(WareHouse wareHouse) {
        this.wareHouse = wareHouse;
    }

    @Override
    public void run() {
        while (wareHouse.receipt()) {
            System.out.println("^^^ Приём товара на склад! ^^^");
        }
        System.out.println("Закончили работу!");
    }
}


class Consumer implements Runnable {

    private WareHouse wareHouse;

    public Consumer(WareHouse wareHouse) {
        this.wareHouse = wareHouse;
    }

    @Override
    public void run() {
        while (wareHouse.shipment()) {
            System.out.println("^^^ Отгрузка! ^^^");
        }
        System.out.println("Закончили работу!");
    }
}



