package javaoopsinheritance;

class UserLogin {
	void login(String username, String password) {
		System.out.println("User logged in");
	}
}

class Customer extends UserLogin {
	void browseProducts() {
		System.out.println("Customer is browsing products");
	}
}

public class SingleInheritance {
	public static void main(String[] args) {

		UserLogin user = new UserLogin();
		user.login("user1", "user_123");

		Customer customer = new Customer();
		customer.login("user2", "user123");
		customer.browseProducts();

	}

}
