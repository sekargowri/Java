package javaconstructor;

public class Login {

	String username;
	String password;

	Login(String username, String password) {
		this.username = username;
		this.password = password;
	}

	public void login() {
		System.out.println("User entered username: " + username);
		System.out.println("User entered password: " + password);
	}
}
