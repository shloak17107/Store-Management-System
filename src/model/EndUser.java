package model;

import java.io.Serializable;
import java.util.*;

/**
 * 
 */
public class EndUser implements Serializable{
	
	private String Name;
	
	private String Password;
	
	private Cart cart;
	
	

	/**
	 * Default constructor
	 */
	public EndUser() {
		this.Name = "EndUser";
		this.Password = "Password";
		this.cart = new Cart();
		
	}
	
	public Cart getCart() {
		return this.cart;
	}
	
	/**
	 * 
	 */
	public void checkOut() {
		this.cart.checkOut();
		this.cart = new Cart();
	}


	/**
	 * 
	 */
	private void searchItem() {
		// TODO implement here
	}

	/**
	 * 
	 */
	private void sortItems() {
		// TODO implement here
	}

	/**
	 * @param store 
	 * @param product 
	 * @param quantity
	 */
	public void addToCart(Product product, int Units) {
		// TODO implement here
		this.cart.add(product, Units);
	}

	/**
	 * @return
	 */
	public Collection<Product> showCart() {
		// TODO implement here
		return null;
	}


}