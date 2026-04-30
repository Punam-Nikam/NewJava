class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd: " + i);
            }
        }
    }
}

class EvenThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            }
        }
    }
}

public class ThreadEvenOdd {
public static void main(String[] args) {


    OddThread t1 = new OddThread();
    EvenThread t2 = new EvenThread();

    t1.start();
    t2.start();
}

}
