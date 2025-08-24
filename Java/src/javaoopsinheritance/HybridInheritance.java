package javaoopsinheritance;

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
