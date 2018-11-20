package model;

import java.util.Iterator;
import java.util.List;

/**
 * 
 */
public class WarehouseAdministrator extends User implements Admin {

	/**
	 * Default constructor
	 */
	public WarehouseAdministrator(String username, String password) {
		super(username, password);
	}

	
	/**
	 * The warehouse that this administrator is assigned to.
	 */
	private Facility myWarehouse;


	/**
	 * 
	 */
	public Facility getMyFacility() {
		return this.myWarehouse;
	}
	
	/**
	 * @return
	 */
	public String sendAlertMessage() {
		// TODO implement sendAlertMessage
		return "";
	}

	/**
	 * 
	 */
	public void checkInventoryLevels() {
		// TODO implement here
	}

	/**
	 * 
	 */
	public void orderInventory() {
		// TODO implement here
	}

	@Override
	public void addCategory(Category e) {
		List<Category> list = myWarehouse.getAllCategories();
		list.add(e);
		myWarehouse.setAllCategories(list);
	}

	@Override
	public void updateCategory(String categoryName) {
		List<Category> list = myWarehouse.getAllCategories();
		Iterator<Category> itr = list.iterator();
		while (itr.hasNext()) {
			if (itr.next().getCategoryName().equals(categoryName)) {
				//TODO implement updateCategory
			}
		}
	}

	@Override
	public void deleteCategory(String categoryName) {
		List<Category> list = myWarehouse.getAllCategories();
		Iterator<Category> itr = list.iterator();
		while (itr.hasNext()) {
			if (itr.next().getCategoryName().equals(categoryName)) {
				itr.remove();
			}
		}
	}

	@Override
	public void addProduct(Product e) {
		List<Product> list = myWarehouse.getAllProducts();
		list.add(e);
		myWarehouse.setAllProducts(list);
	}

	@Override
	public void updateProduct(String productName) {
		List<Product> list = myWarehouse.getAllProducts();
		Iterator<Product> itr = list.iterator();
		while (itr.hasNext()) {
			if (itr.next().getProductName().equals(productName)) {
				//TODO implement updateProduct
			}
		}
	}
	
	@Override
	public void deleteProduct(String productName) {
		List<Product> list = myWarehouse.getAllProducts();
		Iterator<Product> itr = list.iterator();
		while (itr.hasNext()) {
			if (itr.next().getProductName().equals(productName)) {
				itr.remove();
			}
		}
	}

	/**
	 * 
	 * @param myWarehouse
	 */
	public void setMyWarehouse(Warehouse myWarehouse) {
		this.myWarehouse = myWarehouse;
	}

}