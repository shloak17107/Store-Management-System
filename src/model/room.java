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
	
	public void add_category(Category category) {
		this.Categories.add(category);
	}
	
	public void delete_category(Category category) {
		this.Categories.remove(category);
	}
	
	public void update_category(Category category, String name, String Description) {
		category.update(name, Description);
	}
	
	public void add_subCategory(Category parent, subCategory SubCategory) {
		parent.addSubCategory(SubCategory);
	}
	
	public void delete_subCategory(Category parent, subCategory SubCategory) {
		parent.deleteSubCategory(SubCategory);
	}
	
	public void update_subCategory(subCategory SubCategory, String name, String Description) {
		SubCategory.update(name, Description);
	}
	
	public void add_product(subCategory parent, Product product) {
		parent.addProduct(product);
	}
	
	public void update_product(Product product, String Name, String Description, int Units, int fixedCost, int carryingCost, int Demand, int price) {
		product.update(Name, Description, Units, fixedCost, carryingCost, Demand, price);
	}
	
	public void delete_product(subCategory parent, Product product) {
		parent.deleteProduct(product);
	}

	public Admin getAdmin() {
		return this.admin;
	}

	public String getRoomName() {
		return this.Name;
	}
	
	public String toString() {
		return this.Name;
	}
	
	public LinkedList<Category> getCategories() {
		return this.Categories;
	}
}
