package javaoopsinheritance;

class EUser {
	void login(String username, String password) {
		System.out.println("User logged in");
	}
}

class Customers extends EUser {
	void addToCart() {
		System.out.println("Customer add product to cart");
	}
}

class Sellers extends EUser {
	void manageInventory() {
		System.out.println("Seller manage inventory");
	}
}

class Admin extends EUser {
	void manageUsers() {
		System.out.println("Admin manage eusers");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {

		Customers customers = new Customers();
		customers.login("customer1", "customer1_7852");
		customers.addToCart();

		Sellers sellers = new Sellers();
		sellers.login("seller1", "seller_1_897");
		sellers.manageInventory();

		Admin admin = new Admin();
		admin.login("admin", "admin123");
		admin.manageUsers();

	}

}
