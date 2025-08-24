package javaoopsinheritance;

class EUsers {
	void login(String username, String password) {
		System.out.println("User logged in");
	}
}

class Seller extends EUsers {
	void listProduct() {
		System.out.println("Seller listed products");
	}
}

class PremiumSeller extends Seller {
	void accessAnalyticsDashboard() {
		System.out.println("Premium seller accesses analytics dashboard");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {

		EUsers users = new EUsers();
		users.login("user1", "user_789");

		Seller seller = new Seller();
		seller.listProduct();

		PremiumSeller premiumseller = new PremiumSeller();
		premiumseller.accessAnalyticsDashboard();
	}

}
