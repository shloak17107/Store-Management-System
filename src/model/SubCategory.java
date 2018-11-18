package model;

import java.util.Iterator;
import java.util.List;

public class SubCategory {
	
	/**
	 * Default constructor
	 */
	public SubCategory(String subCategoryName, Category parentCategory, Facility parentFacility) {
		this.subCategoryName = subCategoryName;
		this.parentCategory = parentCategory;
		this.parentFacility = parentFacility;
		
		if (parentFacility instanceof Warehouse) {
			subCategoryID = "CW" + ++subCategoryCount;
		}
		else if (parentFacility instanceof Store) {
			subCategoryID = "CS" + ++subCategoryCount;
		}
		else {
			subCategoryID = null;
		}
	}
	
	
	/**
	 * 
	 */
	private String subCategoryName;
	
	/**
	 * 
	 */
	private final String subCategoryID;

	/**
	 * 
	 */
	private static int subCategoryCount;
	
	/**
	 * 
	 */
	private List<Product> products;
	
	/**
	 * 
	 */
	private final Facility parentFacility;
	
	/**
	 * 
	 */
	private final Category parentCategory;
	
	
	/**
	 * 
	 */
	public void addProduct(Product p) {
		products.add(p);
	}
	
	/**
	 * 
	 * @param productName
	 */
	public void updateProduct(String productName) {
		Iterator<Product> itr = products.iterator();
		while (itr.hasNext()) {
			if (itr.next().getProductName().equals(productName)) {
				//TODO implement updateProduct
			}
		}
	}

	/**
	 * 
	 * @param productName
	 */
	public void deleteProduct(String productName) {
		Iterator<Product> itr = products.iterator();
		while (itr.hasNext()) {
			if (itr.next().getProductName().equals(productName)) {
				itr.remove();
			}
		}
	}

	/**
	 * @return the subCategoryName
	 */
	public String getSubCategoryName() {
		return subCategoryName;
	}

	/**
	 * @param subCategoryName the subCategoryName to set
	 */
	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

	/**
	 * @return the subCategoryID
	 */
	public String getSubCategoryID() {
		return subCategoryID;
	}

	/**
	 * @return the products
	 */
	public List<Product> getProducts() {
		return products;
	}
	
	/**
	 * @return the parentFacility
	 */
	public Facility getParentFacility() {
		return parentFacility;
	}
	
	/**
	 * @return the parentCategory
	 */
	public Category getParentCategory() {
		return parentCategory;
	}

}