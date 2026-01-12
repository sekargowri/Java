package javascannerclass;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String myName = scanner.next();
		System.out.println("My Name is: " + myName);

	}

}
