package model;

import java.util.*;

/**
 * 
 */
public class Product {
	
	/**
	 * 
	 */
	private String productName;
	private subCategory parent;
	
public class Product {

	/**
	 * Default constructor
	 */
	public Product(String Name, subCategory parent) {
		this.parent = parent;
	}

	/**
	 * 
	 */
	private String productID;

	/**
	 * 
	 */
	private static int productCount;


	/**
	 * 
	 */
	private float carryingCost_H;

	/**
	 * 
	 */
	private int demand_K;

	/**
	 * 
	 */
	private float EOQ;


	/**
	 * 
	 */
	private <T> location;

	/**
	 * 
	 */
	private int quantity;

	/**
	 * 
	 */
	private float cost;

	/**
	 * 
	 */
	private String description;




	/**
	 * 
	 */
	public void calculateEOQ() {
		// TODO implement here
	}

	/**
	 * 
	 */
	public void updateCarryingCost() {
		// TODO implement here
	}

	/**
	 * 
	 */
	public void updateDemand() {
		// TODO implement here
	}

}