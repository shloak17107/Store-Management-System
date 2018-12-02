package model;

import java.io.Serializable;
import java.util.*;

/**
 * 
 */
public class SuperUser implements Serializable{

	/**
	 * Default constructor
	 */
	
	private Database db;

	private String Name;
	private String ID;
	private String pswd;
	
	public SuperUser(Database db, String Name, String ID, String pswd) {
		this.db = db;
		this.Name = Name;
		this.ID = ID;
		this.pswd = pswd;
	}

	public String getName() {
		return Name;
	}



	public String getID() {
		return ID;
	}



	public String getPswd() {
		return pswd;
	}

	public Database getDatabase() {
		return this.db;
	}
	
	/**
	 * @return
	 */
	public void createWarehouse(String room_Name, String room_ID, String admin_name, String admin_ID, String admin_pswd) {
		// TODO implement here
		Warehouse new_warehouse = new Warehouse(room_Name, room_ID, admin_name, admin_ID, admin_pswd, this.getDatabase());
		db.add_warehouse(new_warehouse);
	}

	/**
	 * @return
	 */
	public void createStore(String room_Name, String room_ID, String admin_name, String admin_ID, String admin_pswd) {
		// check ID already created , throw exception.
		Store new_store = new Store(room_Name, room_ID, admin_name, admin_ID, admin_pswd);
		db.add_store(new_store);
	}

	/**
	 * @param warehouse 
	 * @param store
	 */
	public void updateLink(Warehouse warehouse, Store store) {
		store.linkWarehouse(warehouse);
		warehouse.linkStore(store);
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