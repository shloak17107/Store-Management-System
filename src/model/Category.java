package model;

import java.io.Serializable;
import java.util.*;

/**
 * 
 */
public class Category implements Serializable{
	
	/**
	 * 
	 */
	private String categoryName;
	
	private String Description;
	
	private room parent;
	
	/**
	 * 
	 */
	private LinkedList<subCategory> subCategories;
	
	private subCategory current_subCategory;
	
	

	/**
	 * Default constructor
	 */
	public Category(String Name, String Description, room parent) {
		this.categoryName = Name;
		this.Description = Description;
		this.parent = parent;
		subCategories = new LinkedList<subCategory>();
	}
	
	public void update(String name, String Description) {
		this.categoryName = name;
		this.Description = Description;
	}

	/**
	 * 
	 */
	public void addSubCategory(subCategory SubCategory) {
		// TODO implement here
		this.subCategories.add(SubCategory);
	}

	/**
	 * 
	 */
	public void deleteSubCategory(subCategory subCategory) {
		// TODO implement here
		this.subCategories.remove(subCategory);
	}

	public LinkedList<subCategory> getSubCategories() {
		return this.subCategories;
	}
	
	public String toString() {
		return this.categoryName;
	}
	
	public String getName() {
		return this.categoryName;
	}
	
	public String getDescription() {
		return this.Description;
	}
	
	public room getParent() {
		return this.parent;
	}
	
}