package javaoopsabstraction;

public class LoginMain {

	public static void main(String[] args) {

		ILogin login = new Login();
		login.enterUsername("ADMIN");
		login.enterPassword("admin123");
		login.clickLogin();
	}

}
