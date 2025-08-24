package javaoopsinheritance;

interface Payment {
	void processPayment();
}

interface Notification {
	void sendNotification();
}

class Order implements Payment, Notification {
	public void processPayment() {
		System.out.println("Processed Payment");
	}

	public void sendNotification() {
		System.out.println("Sent Notification");
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {

		Order order = new Order();
		order.processPayment();
		order.sendNotification();

	}

}
