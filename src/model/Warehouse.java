package model;

import java.util.*;

/**
 * 
 */
public class Warehouse extends Facility {

	/**
	 * Default constructor
	 */
	public Warehouse(String warehouseName, WarehouseAdministrator admin) {
		super(warehouseName, admin);
		warehouseID = "W" + ++warehouseCount;
	}

	/**
	 * 
	 */
	private final String warehouseID;

	/**
	 * 
	 */
	private static int warehouseCount;

	/**
	 * 
	 */
	private Collection<Store> stores;


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

	public void linkStore(Facility store) {
		stores.add((Store) store);
	}

	/**
	 * @return the warehouseID
	 */
	public String getWarehouseID() {
		return warehouseID;
	}

}