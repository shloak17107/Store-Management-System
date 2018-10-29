package model;

import java.util.*;

/**
 * 
 */
public class SuperUser extends User {

	/**
	 * Default constructor
	 */
	public SuperUser() {
	}






	/**
	 * @return
	 */
	private Warehouse createWarehouse() {
		// TODO implement here
		return null;
	}

	/**
	 * @return
	 */
	private Warehouse createStore() {
		// TODO implement here
		return null;
	}

	/**
	 * @param warehouse 
	 * @param store
	 */
	private void link(Warehouse warehouse, Store store) {
		// TODO implement here
	}

	/**
	 * @param username 
	 * @param password 
	 * @param warehouse
	 */
	public void createWarehouseAdmin(String username, String password, Warehouse warehouse) {
		// TODO implement here
	}

	/**
	 * @param username 
	 * @param password 
	 * @param store
	 */
	public void createStoreAdmin(String username, String password, Store store) {
		// TODO implement here
	}

}