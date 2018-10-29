package model;

import java.util.LinkedList;

public class room {
	
	/**
	 * 
	 */
	private String Name;
	
	/**
	 * 
	 */
	private String ID;
	
	/**
	 * 
	 */
	private Admin admin;
	
	/**
	 * 
	 */
	protected LinkedList<Category> Categories;
	
	protected Category Current_Category;
	
	public room(String Name, String ID, Admin admin) {
		this.Name = Name;
		this.ID = ID;
		this.admin = admin;
		this.Categories = new LinkedList<Category>();
	}

}
