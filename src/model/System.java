
package model;


import java.util.*;

/**
 * 
 */
public class System {
	
	/**
	 * 
	 */
	private Database db;
	
	private SuperUser super_user;

	/**
	 * Default constructor
	 */
	public System() {
		db = new Database();
		super_user = new SuperUser();
	}

	/**
	 * 
	 */
	private User currentUser;



	/**
	 * @param db 
	 * @param filename
	 */
	private void serialize(Database db, String filename) {
		// TODO implement here
	}

	/**
	 * @param filename 
	 * @return
	 */
	private Database deserialize(String filename) {
		// TODO implement here
		return null;
	}

	/**
	 * @return
	 */
	private String[] resetSuperUser() {
		// TODO implement here
		return null;
	}

}