
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
		
		Admin warehouse_admin1 = db.getWarehouseAdmins().get(0);
		warehouse_admin1.addCategory("category1", "Description for category 1");
		warehouse_admin1.addSubCategory("subCategory1", "Description for subCategory 1", warehouse_admin1.getMyRoom().getCategories().get(0));
		warehouse_admin1.addProduct("Product1", "Description for product1", 2, 10, 20, 30, 40, warehouse_admin1.getMyRoom().getCategories().get(0).getSubCategories().get(0));
		warehouse_admin1.addProduct("Product2", "Description for product2", 2, 10, 20, 30, 40, warehouse_admin1.getMyRoom().getCategories().get(0).getSubCategories().get(0));
		
		Admin store_admin1 = db.getStoreAdmins().get(0);
		store_admin1.addCategory("category1", "Description for category 1");
		store_admin1.addSubCategory("subCategory1", "Description for subCategory 1", store_admin1.getMyRoom().getCategories().get(0));
		store_admin1.addProduct("Product1", "Description for product1", 2, 10, 20, 30, 40, store_admin1.getMyRoom().getCategories().get(0).getSubCategories().get(0));
		store_admin1.addProduct("Product2", "Description for product2", 2, 10, 20, 30, 40, store_admin1.getMyRoom().getCategories().get(0).getSubCategories().get(0));
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