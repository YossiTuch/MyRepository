package learning;

public class Pearson {

	private String username;
	private String password;

	public Pearson(String username, String password) { // the c-tor gets values to initiate the class variables
		this.username = username;
		this.password = password;
	}

	public String getPass() {
		return password;
	}

	public String getUser() {
		return username;
	}

	public boolean equals(String user, String pass) {

		if (this.username.equals(user) && this.password.equals(pass)) {
			return true;
		}

		return false;
	}

}
