package javaoopsinheritance;

class EUser {
	void login(String username, String password) {
		System.out.println("User logged in");
	}
}

class ECustomers extends EUser {
	void addToCart() {
		System.out.println("Customer add product to cart");
	}
}

class ESellers extends EUser {
	void manageInventory() {
		System.out.println("Seller manage inventory");
	}
}

class EAdmin extends EUser {
	void manageUsers() {
		System.out.println("Admin manage eusers");
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {

		ECustomers customers = new ECustomers();
		customers.login("customer1", "customer1_7852");
		customers.addToCart();

		ESellers sellers = new ESellers();
		sellers.login("seller1", "seller_1_897");
		sellers.manageInventory();

		EAdmin admin = new EAdmin();
		admin.login("admin", "admin123");
		admin.manageUsers();

	}

}
