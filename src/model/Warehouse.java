package model;

import java.util.*;

/**
 * 
 */
public class Warehouse extends room{

	/**
	 * Default constructor
	 */
	public Warehouse(String room_Name, String room_ID, String admin_name, String admin_ID, String admin_pswd) {
		super(room_Name, room_ID, admin_name, admin_ID, admin_pswd);
	}

	/**
	 * 
	 */
	private String warehouseID;

	/**
	 * 
	 */
	private static int warehouseCount;

	/**
	 * 
	 */
	private String warehouseName;

	/**
	 * 
	 */
	private Collection<Store> stores;

	/**
	 * 
	 */
	private WarehouseAdministrator admin;

	/**
	 * 
	 */
	private Category topCategory;

	/**
	 * 
	 */
	private Collection<Product> allProducts;

	/**
	 * 
	 */
	private float fixedCost_D;







	/**
	 * @param store 
	 * @param records
	 */
	public void sendProducts(Store store, Record records) {
		// TODO implement here
	}

	/**
	 * @param productName 
	 * @return
	 */
	public Product search(String productName) {
		// TODO implement here
		return null;
	}

	/**
	 * 
	 */
	public void orderInventory() {
		// TODO implement here
	}

	/**
	 * @param warehouses 
	 * @param product 
	 * @return
	 */
	public Warehouse chooseWarehouse(Collection<Warehouse> warehouses, Product product) {
		// TODO implement here
		return null;
	}

	/**
	 * @param warehouse 
	 * @param product
	 */
	public void orderInventoryFromOtherWarehouse(Warehouse warehouse, Product product) {
		// TODO implement here
	}

	/**
	 * 
	 */
	public void updateFixedCost() {
		// TODO implement here
	}

	/**
	 * 
	 */
	public void generateAlert() {
		// TODO implement here
	}

}