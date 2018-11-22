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
	
	public room(String room_Name, String room_ID, String admin_name, String admin_ID, String admin_pswd) {
		this.Name = room_Name;
		this.ID = room_ID;
		admin = new Admin(admin_name, admin_ID, admin_pswd, this);
		this.Categories = new LinkedList<Category>();
	}
	
	public Admin getAdmin() {
		return this.admin;
	}

	public String getRoomName() {
		return this.Name;
	}
}
