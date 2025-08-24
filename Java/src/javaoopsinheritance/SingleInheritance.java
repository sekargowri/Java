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

public class SingleInheritance {
	public static void main(String[] args) {

		User user = new User();
		user.login("user1", "user_123");

		Customer customer = new Customer();
		customer.login("user2", "user123");
		customer.browseProducts();

	}

}
