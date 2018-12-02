package model;

import java.io.Serializable;
import java.util.LinkedList;

public class subCategory implements Serializable{
	
	/**
	 * 
	 */
	private String subCategoryName;
	
	private String Description;
	
	private Category parent;
	
	/**
	 * 
	 */
	private LinkedList<Product> products;
	

	/**
	 * Default constructor
	 */
	public subCategory(String Name, String Description, Category parent) {
		this.subCategoryName = Name;
		this.Description = Description;
		this.parent = parent;
		this.products = new LinkedList<Product>();
	}
	
	public void update(String name, String Description) {
		this.subCategoryName = name;
		this.Description = Description;
	}
	
	public void addProduct(Product product) {
		this.products.add(product);
	}

	public void deleteProduct(Product product) {
		this.products.remove(product);
	}
	
	public String toString() {
		return this.subCategoryName;
	}
	
	public LinkedList<Product> getProducts() {
		return this.products;
	}
	
	public String getName() {
		return this.subCategoryName;
	}

	public String getDescription() {
		return this.Description;
	}
	
	public Category getParent() {
		return this.parent;
	}
}
