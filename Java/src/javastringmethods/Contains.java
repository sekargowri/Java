package javastringmethods;

public class Contains {

	public static void main(String[] args) {

		String myFullName = new String("Gowri Sekar");

		// public boolean contains(CharSequence s);

		System.out.println(myFullName.contains(myFullName)); // true
		System.out.println(myFullName.contains(" ")); // true
		System.out.println(myFullName.contains("Gowri")); // true
		System.out.println(myFullName.contains("Sekar")); // true
		System.out.println(myFullName.contains("Se")); // true
		System.out.println(myFullName.contains("ar")); // true
		System.out.println(myFullName.contains("i")); // true

		System.out.println(myFullName.contains("IA")); // false
		System.out.println(myFullName.contains("Di")); // false
		System.out.println(myFullName.contains("I")); // false
		System.out.println(myFullName.contains("#")); // false
		System.out.println(myFullName.contains("$")); // false
		System.out.println(myFullName.contains("1")); // false

	}

}
