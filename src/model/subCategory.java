package model;

import java.util.LinkedList;

public class subCategory {
	
	/**
	 * 
	 */
	private String subCategoryName;
	
	/**
	 * 
	 */
	private LinkedList<Product> products;
	
	private Product current_product;
	
	private Category parent;

	/**
	 * Default constructor
	 */
	public subCategory(String Name, Category parent) {
		this.subCategoryName = Name;
		this.parent = parent;
	}
	
	public void update(String name) {
		this.subCategoryName = name;
	}
	
	public void add_product(Product product) {
		this.products.add(product);
	}

	public void set_product(Product product) {
		this.current_product = product;
	}

}
