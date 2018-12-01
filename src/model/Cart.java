package model;

import java.io.Serializable;
import java.util.*;

/**
 * 
 */
public class Cart implements Serializable{
	
	private LinkedList<Product> products;
	
	private LinkedList<Integer> units;
	
	private LinkedList<Integer> prices;
	


	/**
	 * Default constructor
	 */
	public Cart() {
		this.products = new LinkedList<Product>();
		this.units = new LinkedList<Integer>();
		this.prices = new LinkedList<Integer>();
	}
	
	public void add(Product product, int Units) {
		this.products.add(product);
		this.units.add(Units);
		this.prices.add(product.getPrice());
	}

	public LinkedList<Product> getProducts() {
		return products;
	}

	public LinkedList<Integer> getUnits() {
		return units;
	}

	public LinkedList<Integer> getPrices() {
		return prices;
	}

	
	public void removeProduct(Product product) {
		products.remove(product);
	}
	
	public void removePrice(int ind) {
		prices.remove(ind);
	}
	
	public void removeUnit(int ind) {
		units.remove(ind);
	}
	
	public void checkOut() {
		for (int i=0; i<products.size(); i++) {
			Product product = products.get(i);
			product.reduceUnits(this.units.get(i));
		}
	}

}