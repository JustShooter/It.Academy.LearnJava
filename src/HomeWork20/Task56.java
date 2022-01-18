package HomeWork20;

public class Task56 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        Thread thread1 = new Thread(() -> {
            a.taskA(b);
            a.last();
        });
        Thread thread2 = new Thread(() -> {
            b.taskB(c);
            b.last();
        });
                Thread thread3 = new Thread(() -> {
            c.taskC(a);
            c.last();
        });

        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println("Working?");
    }
}

class A {
    synchronized void taskA(B b) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " A.taskA()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Exception at A");
        }

        System.out.println(name + " B.last()");
        b.last();
        System.out.println("Finished");
    }

    synchronized void last() {
        System.out.println(" A.last() ");
    }
}

class B {
    synchronized void taskB(C c) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " B.taskB()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Exception at B");
        }
        System.out.println(name + " C.last()");
        c.last();
        System.out.println("Finished");
    }

    synchronized void last() {
        System.out.println(" B.last() ");
    }
}
class C {
    synchronized void taskC(A a) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " C.taskC()");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Exception at C");
        }
        System.out.println(name + " A.last()");
        a.last();
        System.out.println("Finished");
    }

    synchronized void last() {
        System.out.println(" C.last() ");
    }
}