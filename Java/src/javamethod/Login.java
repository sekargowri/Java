package javamethod;

public class Login {

	String username;
	String password;

	public void enterUsername(String username) {
		System.out.println("User entered username: " + username);
	}

	public void enterPassword(String password) {
		System.out.println("User entered password: " + password);
	}

	public void clickLogin() {
		System.out.println("User logged in succesfully");
	}

}
