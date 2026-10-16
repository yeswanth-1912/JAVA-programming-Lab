class OrderPlacement extends Thread {
    public void run() {
        System.out.println("Order Placement Started");
        System.out.println("Order Placed Successfully");
    }
}

class OrderDelivery extends Thread {
    public void run() {
        System.out.println("Order Delivery Started");
        System.out.println("Order Delivered Successfully");
    }
}

public class FoodDelivery {
    public static void main(String[] args) {
        OrderPlacement t1 = new OrderPlacement();
        OrderDelivery t2 = new OrderDelivery();

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }

        t2.start();
    }
}