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
	public void addCategory(String name, String Description) {
		Category new_category = new Category(name, Description, this.myRoom);
		this.myRoom.add_category(new_category);
	};

	/**
	 * 
	 */
	public void updateCategory(Category category, String name, String Description) {
		this.myRoom.update_category(category, name, Description);
	};

	/**
	 * 
	 */
	public void deleteCategory(Category category) {
		this.myRoom.delete_category(category);
	};
	
	public void addSubCategory(String name, String Description, Category parent) {
		subCategory new_subCategory = new subCategory(name, Description, parent);
		this.myRoom.add_subCategory(parent, new_subCategory);
	}

	public void updateSubCategory(subCategory SubCategory, String name, String Description) {
		this.myRoom.update_subCategory(SubCategory, name, Description);
	}
	
	public void deleteSubCategory(Category parent, subCategory SubCategory) {
		parent.deleteSubCategory(SubCategory);
	}
	
	/**
	 * 
	 */
	public void addProduct(String Name, String Description, int Units, int fixedCost, int carryingCost, int Demand, int price, subCategory parent) {
		Product new_product = new Product(Name, Description, Units, fixedCost, carryingCost, Demand, price, parent);
		this.myRoom.add_product(parent, new_product);
	};


	/**
	 * 
	 */
	public void updateProduct(Product product, String Name, String Description, int Units, int fixedCost, int carryingCost, int Demand, int price) {
		this.myRoom.update_product(product, Name, Description, Units, fixedCost, carryingCost, Demand, price);
	};

	/**
	 * 
	 */
	public void deleteProduct(subCategory parent, Product product) {
		this.myRoom.delete_product(parent, product);
	};

}