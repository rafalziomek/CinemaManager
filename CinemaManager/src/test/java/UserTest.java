import org.junit.*;

import users.User;
public class UserTest {
	private String firstname = "firstname";
	private String lastname = "lastname";
	User user;
	
	@BeforeClass
	public void createUserTest() {
		user = new User(firstname, lastname);
	}
	
	
}
