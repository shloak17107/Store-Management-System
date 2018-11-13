
package model;


import java.util.*;

/**
 * 
 */
public class system {
	
	/**
	 * 
	 */
	private Database db;
	
	private SuperUser super_user;

	/**
	 * Default constructor
	 */
	public system() {
		db = new Database();
		super_user = db.getSuperUser();
		super_user.createStore("store_name", "store_ID", "storeAdmin_name", "storeAdmin_ID", "storeAdmin_pswd");
		super_user.createWarehouse("warehouse_name", "warehouse_ID", "warehouseAdmin_name", "warehouseAdmin_ID", "warehouseAdmin_pswd");
	}

	public Database getDatabase() {
		return this.db;
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