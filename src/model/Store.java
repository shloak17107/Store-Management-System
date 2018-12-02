package model;


import java.io.Serializable;
import java.util.*;

/**
 * 
 */
public class Store extends room implements Serializable{
	

	
	/**
	 * 
	 */
	private Warehouse warehouse;
	
	/**
	 * 
	 */
	private static int storeCount=1;

	/**
	 * 
	 */
	private float fixedCost_D;

	
	/**
	 * Default constructor
	 */
	public Store(String room_Name, String room_ID, String admin_name, String admin_ID, String admin_pswd) {
		super(room_Name, room_ID, admin_name, admin_ID, admin_pswd);
		storeCount+=1;
	}
	
	public void linkWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}
	
	/**
	 * 
	 */
	public void orderProducts() {
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
	public void updateFixedCost() {
		// TODO implement here
	}

	/**
	 * 
	 */
	public void generateAlert() {
		// TODO implement here
	}

	@Override
	public String orderProducts(Product product) {
		// TODO Auto-generated method stub
		String response = this.warehouse.orderProducts(product);
		if (response.equals("successful")) {
		product.incUnits();}
		return "successful";
	}

}