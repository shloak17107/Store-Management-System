package model;

import java.io.Serializable;
import java.util.*;

/**
 * 
 */
public class Warehouse extends room implements Serializable{
	
	/** Generated serial version ID */
	private static final long serialVersionUID = -6126848837759993505L;
	
	/** the list of all store */
	private LinkedList<Store> stores;

	/**
	 * Default constructor
	 */
	public Warehouse(String room_Name, String room_ID, String admin_name, String admin_ID, String admin_pswd) {
		super(room_Name, room_ID, admin_name, admin_ID, admin_pswd);
		stores = new LinkedList<Store>();
	}

	/** adds provided store to the list of all stores */
	public void linkStore(Store store) {
		this.stores.add(store);
	}
	
	/**
	 * sends ordered products to provided store
	 * 
	 * @param store 
	 * @param records
	 */
	public void sendProducts(Store store, Record records) {
		// TODO implement here
	}

	/**
	 * searches for the product matching the product name
	 * 
	 * @param productName 
	 * @return
	 */
	public Product search(String productName) {
		// TODO implement here
		return null;
	}

	/**
	 * orders more stock of products
	 */
	public void orderInventory() {
		// TODO implement here
	}

	/**
	 * chooses most appropriate warehouse for requesting help to fulfill an order
	 * 
	 * @param warehouses
	 * @param product
	 * @return
	 */
	public Warehouse chooseWarehouse(Collection<Warehouse> warehouses, Product product) {
		// TODO implement here
		return null;
	}

	/**
	 * order products from alternate warehouse
	 * 
	 * @param warehouse 
	 * @param product
	 */
	public void orderInventoryFromOtherWarehouse(Warehouse warehouse, Product product) {
		// TODO implement here
	}

	/**
	 * updates the fixed cost
	 */
	public void updateFixedCost() {
		// TODO implement here
	}

	/**
	 * generates alert
	 */
	public void generateAlert() {
		// TODO implement here
	}

}