package model;

/**
 * 
 */
public class User {

	/**
	 * Default constructor
	 * @param type 
	 */
	public User(String username, String password) {
		this.setUsername(username);
		this.setPassword(password);
	}

	
	/**
	 * 
	 */
	private String username;

	/**
	 * 
	 */
	private String password;
	
	
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}