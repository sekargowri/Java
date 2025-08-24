package javaoopsinheritance;

class User {
	void login(String username, String password) {
		System.out.println("User logged in");
	}
}

class Customer extends User {
	void browseProducts() {
		System.out.println("Customer is browsing products");
	}

	void placeOrder() {
		System.out.println("Customer placed order");
	}
}

interface LoyaltyProgram {
	void applyDiscount();
}

class PremiumCustomer extends Customer implements LoyaltyProgram {
	public void applyDiscount() {
		System.out.println("Applied discount for premium customer");
	}
}

public class HybridInheritance {

	public static void main(String[] args) {

		PremiumCustomer customer = new PremiumCustomer();
		customer.login("customer1", "Cusomter1_123");
		customer.browseProducts();
		customer.placeOrder();
		customer.applyDiscount();

	}

}
