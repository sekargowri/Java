package javadatatypes;

public class PrimitiveDatatypes {

	public static void main(String[] args) {

		byte rating = 4; // Customer rating out of 5
		short discountPercentage = 10; // Discount percentage

		int productId = 1001; // Unique identifier for the product
		long inventoryCount = 1500L; // Total units available in warehouse

		float weightInKg = 0.25f; // Product weight in kilograms
		double price = 799.99; // Price of the product

		char currencySymbol = '₹';
		boolean inStock = true; // Availability status

		System.out.println("Rating: " + rating + " out of 5");
		System.out.println("Discount: " + discountPercentage + "%");
		System.out.println("Product ID: " + productId);
		System.out.println("Inventory Count: " + inventoryCount + " units");
		System.out.println("Weight: " + weightInKg + " kg");
		System.out.println("Price: " + currencySymbol + price);
		System.out.println("Currency Symbol: " + currencySymbol);
		System.out.println("In Stock: " + inStock);

	}

}
