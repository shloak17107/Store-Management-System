package model;


import java.util.*;

/**
 * 
 */
public class Store extends room{
	

	
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
	public Store(String Name, Admin admin) {
		super(Name, "store_" + Integer.toString(storeCount), admin);
		storeCount+=1;
	}
	
	public void add_category(Category category) {
		this.Categories.add(category);
	}
	
	public void delete_category(Category category) {
		this.Categories.remove(category);
	}
	
	public void set_current(Category category) {
		this.Current_Category = category;
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

}