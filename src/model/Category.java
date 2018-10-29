package model;


import java.util.*;

/**
 * 
 */
public class Category {
	
	/**
	 * 
	 */
	private String categoryName;
	
	/**
	 * 
	 */
	private LinkedList<subCategory> subCategories;
	
	private subCategory current_subCategory;
	
	

	/**
	 * Default constructor
	 */
	public Category(String Name) {
		this.categoryName = Name;
	}
	
	public void update(String name) {
		this.categoryName = name;
	}
	
	public void add_sub(subCategory sub) {
		this.subCategories.add(sub);
	}

	public void set_sub(subCategory sub) {
		this.current_subCategory = sub;
	}
	
	
	/**
	 * 
	 */
	private String categoryID;

	/**
	 * 
	 */
	private static int categoryCount;

	

	/**
	 * 
	 */
	private Category parentCategory;

	/**
	 * 
	 */
	private Collection<Product> products;






	/**
	 * 
	 */
	public void addSubCategory() {
		// TODO implement here
	}

	/**
	 * 
	 */
	public void deleteSubCategory() {
		// TODO implement here
	}

	/**
	 * 
	 */
	public void addProduct() {
		// TODO implement here
	}

	/**
	 * 
	 */
	public void deleteProduct() {
		// TODO implement here
	}

}