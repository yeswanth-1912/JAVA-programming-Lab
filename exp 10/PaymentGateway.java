class Payment implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Payment Processing...");
        }
    }
}

public class PaymentGateway {
    public static void main(String[] args) {
        Payment p = new Payment();
        Thread t = new Thread(p);

        t.start();
    }
}