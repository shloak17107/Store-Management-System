package model;

import java.util.Iterator;
import java.util.List;

/**
 * 
 */
public class StoreAdministrator extends User implements Admin {

	/**
	 * Default constructor
	 */
	public StoreAdministrator(String username, String password, Facility store) {
		super(username, password);
		this.myStore = store;
	}

	/**
	 * 
	 */
	private Facility myStore;


	/**
	 * 
	 */
	public Facility getMyFacility() {
		return this.myStore;
	}

	/**
	 * @return
	 */
	public List<Record> order_items() {
		// TODO implement here
		return null;
	}

	/**
	 * @param warehouse 
	 * @param records
	 */
	public void sendMessage(Warehouse warehouse, List<Record> records) {
		// TODO implement here
	}

	@Override
	public void addCategory(Category e) {
		List<Category> list = myStore.getAllCategories();
		list.add(e);
		myStore.setAllCategories(list);
	}

	@Override
	public void updateCategory(String categoryName) {
		List<Category> list = myStore.getAllCategories();
		Iterator<Category> itr = list.iterator();
		while (itr.hasNext()) {
			if (itr.next().getCategoryName().equals(categoryName)) {
				//TODO implement updateCategory
			}
		}
	}

	@Override
	public void deleteCategory(String categoryName) {
		List<Category> list = myStore.getAllCategories();
		Iterator<Category> itr = list.iterator();
		while (itr.hasNext()) {
			if (itr.next().getCategoryName().equals(categoryName)) {
				itr.remove();
			}
		}
	}

	@Override
	public void addProduct(Product e) {
		List<Product> list = myStore.getAllProducts();
		list.add(e);
		myStore.setAllProducts(list);
	}

	@Override
	public void updateProduct(String productName) {
		List<Product> list = myStore.getAllProducts();
		Iterator<Product> itr = list.iterator();
		while (itr.hasNext()) {
			if (itr.next().getProductName().equals(productName)) {
				//TODO implement updateProduct
			}
		}
	}
	
	@Override
	public void deleteProduct(String productName) {
		List<Product> list = myStore.getAllProducts();
		Iterator<Product> itr = list.iterator();
		while (itr.hasNext()) {
			if (itr.next().getProductName().equals(productName)) {
				itr.remove();
			}
		}
	}

}