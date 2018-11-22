
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
		super_user.createStore("store1", "store1", "storeAdmin1", "storeAdmin1", "storeAdmin1");
		super_user.createStore("store2", "store2", "storeAdmin2", "storeAdmin2", "storeAdmin2");
		super_user.createStore("store3", "store3", "storeAdmin3", "storeAdmin3", "storeAdmin3");
		super_user.createWarehouse("warehouse1", "warehouse1", "warehouseAdmin1", "warehouseAdmin1", "warehouseAdmin1");
		super_user.createWarehouse("warehouse2", "warehouse2", "warehouseAdmin2", "warehouseAdmin2", "warehouseAdmin2");
		super_user.createWarehouse("warehouse3", "warehouse3", "warehouseAdmin3", "warehouseAdmin3", "warehouseAdmin3");
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