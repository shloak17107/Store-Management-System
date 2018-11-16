package model;

import java.util.*;

/**
 * 
 */
public class Cart {

	/**
	 * Default constructor
	 */
	public Cart(EndUser endUser, Facility facility) {
		setProducts(new HashMap<Product, Integer>());
		this.endUser = endUser;
		this.facility = facility;
		cartID = "cart" + ++countCart;
	}


	/**
	 * 
	 */
	private final String cartID;
	
	/**
	 * 
	 */
	private static int countCart;
	
	/**
	 * 
	 */
	private final EndUser endUser;
	
	/**
	 * 
	 */
	private final Facility facility;

	/**
	 * 
	 */
	private AbstractMap<Product, Integer> products;
	
	/**
	 * 
	 */
	private float totalCost;

	
	/**
	 * @return the cartID
	 */
	public String getCartID() {
		return cartID;
	}
	
	/**
	 * @return the endUser
	 */
	public EndUser getEndUser() {
		return endUser;
	}

	/**
	 * @return the facility
	 */
	public Facility getFacility() {
		return facility;
	}

	/**
	 * @return the products
	 */
	public AbstractMap<Product, Integer> getProducts() {
		return products;
	}

	/**
	 * @param products the products to set
	 */
	public void setProducts(AbstractMap<Product, Integer> products) {
		this.products = products;
	}

	/**
	 * @return the totalCost
	 */
	public float getTotalCost() {
		return totalCost;
	}

	/**
	 * @param totalCost the totalCost to set
	 */
	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}
}