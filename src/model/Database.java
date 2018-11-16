package model;

import java.util.Collection;
import java.util.LinkedList;

/**
 * 
 */
public class Database {

	/**
	 * Default constructor
	 */
	public Database() {
		warehouses = new LinkedList<Warehouse>();
		stores = new LinkedList<Store>();
		superUser = generateSuperUser();
		allWarehouseAdmins = new LinkedList<WarehouseAdministrator>();
		allStoreAdmins = new LinkedList<StoreAdministrator>();
	}

	/**
	 * 
	 */
	private Collection<Warehouse> warehouses;

	/**
	 * 
	 */
	private Collection<Store> stores;

	/**
	 * 
	 */
	private User superUser;

	/**
	 * 
	 */
	private Collection<User> allEndUsers;

	/**
	 * 
	 */
	private Collection<WarehouseAdministrator> allWarehouseAdmins;

	/**
	 * 
	 */
	private Collection<StoreAdministrator> allStoreAdmins;
	
	/**
	 * 
	 * @param e
	 */
	public void addAdmin (User e) {
		if (e instanceof WarehouseAdministrator) {
			allWarehouseAdmins.add((WarehouseAdministrator) e);
		}
		else if (e instanceof StoreAdministrator) {
			allStoreAdmins.add((StoreAdministrator) e);
		}
	}
	
	/**
	 * 
	 * @param e
	 */
	public void addFacility (Facility e) {
		if (e instanceof Warehouse) {
			warehouses.add((Warehouse) e);
		}
		else if (e instanceof Store) {
			stores.add((Store) e);
		}
	}
	
	/**
	 * 
	 * @return
	 */
	private SuperUser generateSuperUser() {
		//TODO implement here
		return null;
	}
	
}