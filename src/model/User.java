package model;

import java.io.Serializable;

/**
 * The {@code User} class superclasses many other classes.
 */
public class User implements Serializable{

	/** Generated serial version ID */
	private static final long serialVersionUID = 6196157717658377266L;

	/**
	 * Default constructor
	 */
	public User() {
	}

	/**
	 * username of the user
	 */
	private String username;

	/**
	 * password of the uesr
	 */
	private String password;

	/**
	 * userID of the user
	 */
	private String userID;

}