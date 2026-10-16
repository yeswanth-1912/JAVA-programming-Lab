class Counter extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}

public class TaskManager {
    public static void main(String[] args) {
        Counter t = new Counter();
        t.start();
    }
}