package javaoopsabstraction;

public class Login implements ILogin {

	@Override
	public void enterUsername(String username) {
		System.out.println("User entered username successfully: " + username);

	}

	@Override
	public void enterPassword(String password) {
		System.out.println("User entered password successfully: " + password);

	}

	@Override
	public void clickLogin() {
		System.out.println("User clicked login: User navigated to dashboard page successfully");

	}

}
