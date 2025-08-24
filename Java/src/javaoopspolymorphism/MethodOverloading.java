package javaoopspolymorphism;

class LoginOverloading {

	public void login(long mobileNumber, String password) {
		System.out.println("User logged in using mobile number and password");
	}

	public void login(long mobileNumber, int OTP) {
		System.out.println("User logged in using mobile number and OTP");
	}

	public void login(String emaill, String password) {
		System.out.println("User logged in using email and password");
	}

	public void login(String email, int OTP) {
		System.out.println("User logged in using email and OTP");
	}

}

public class MethodOverloading {

	public static void main(String[] args) {

		LoginOverloading login = new LoginOverloading();
		login.login(9876543210L, "user1$789");
		login.login(9632587401L, 897654);
		login.login("user1@gmail.com", "user1$87954");
		login.login("user2@gmail.com", 879654);

	}

}
