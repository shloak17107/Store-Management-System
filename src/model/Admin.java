package model;


import java.util.*;

/**
 * 
 */
public class Admin {
	
	private String name;
	private String ID;
	private String pswd;
	private room myRoom;
	
	public Admin(String name, String ID, String pswd, room myRoom) {
		this.name = name;
		this.ID = ID;
		this.pswd = pswd;
		this.myRoom = myRoom;
	}

	public String getName() {
		return name;
	}

	public String getID() {
		return ID;
	}

	public String getPswd() {
		return pswd;
	}

	public room getMyRoom() {
		return myRoom;
	}
	
	/**
	 * 
	 */
	public void addCategory() {};

	/**
	 * 
	 */
	public void updateCategory() {};

	/**
	 * 
	 */
	public void deleteCategory() {};

	/**
	 * 
	 */
	public void addProduct() {};

	/**
	 * 
	 */
	public void updateProduct() {};

	/**
	 * 
	 */
	public void deleteProduct() {};

}