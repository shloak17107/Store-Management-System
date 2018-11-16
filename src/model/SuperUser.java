package model;

/**
 * The superuser has the highest authority over a database.<p>
 * 
 * There can be <i>one and only one</i> superuser per database.
 * 
 * @see	Database
 */
public final class SuperUser extends User {

	/**
	 * Default constructor
	 * 
	 * @param db		the database that superuser will manage
	 * @param username	username of the superuser
	 * @param password	password of the superuser
	 */
	public SuperUser(Database db, String username, String password) {
		super(username, password);
		this.db = db;
	}
	
	
	/**
	 * 
	 */
	private final Database db;
	
	
	/**
	 * 
	 * @param warehouseName
	 * @param adminUsername
	 * @param adminPassword
	 */
	public void createWarehouse(String warehouseName, String adminUsername, String adminPassword) {
		WarehouseAdministrator newWarehouseAdmin = createWarehouseAdmin(adminUsername, adminPassword);
		Warehouse newWarehouse = new Warehouse(warehouseName, newWarehouseAdmin);
		newWarehouseAdmin.setMyWarehouse(newWarehouse);
		db.addFacility(newWarehouse);
	}

	/**
	 * 
	 * @param storeName
	 * @param adminUsername
	 * @param adminPassword
	 */
	public void createStore(String storeName, String adminUsername, String adminPassword) {
		StoreAdministrator newStoreAdmin = createStoreAdmin(adminUsername, adminPassword);
		Store newStore = new Store(storeName, newStoreAdmin);
		db.addFacility(newStore);
	}

	/**
	 * @param username 
	 * @param password 
	 * @return 
	 */
	public WarehouseAdministrator createWarehouseAdmin(String username, String password) {
		WarehouseAdministrator newWarehouseAdmin = new WarehouseAdministrator(username, password);
		db.addAdmin(newWarehouseAdmin);
		return newWarehouseAdmin;
	}

	/**
	 * @param username 
	 * @param password 
	 * @param store
	 * @return 
	 */
	public StoreAdministrator createStoreAdmin(String username, String password) {
		StoreAdministrator newStoreAdmin = new StoreAdministrator(username, password);
		db.addAdmin(newStoreAdmin);
		return newStoreAdmin;
	}
	
	/**
	 * Adds a connection between a warehouse and a store.
	 * 
	 * @param warehouse 
	 * @param store
	 */
	public void link(Warehouse warehouse, Store store) {
		warehouse.linkStore(store);
		store.linkWarehouse(warehouse);
	}

}