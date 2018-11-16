package model;

import java.util.Iterator;
import java.util.List;

/**
 * 
 */
public class Category {

	/**
	 * Default constructor
	 */
	public Category(String categoryName, Category parentCategory, Facility parentFacility) {
		this.setCategoryName(categoryName);
		this.parentCategory = parentCategory;
		this.parentFacility = parentFacility;
		
		if (parentFacility instanceof Warehouse) {
			categoryID = "CW" + ++categoryCount;
		}
		else if (parentFacility instanceof Store) {
			categoryID = "CS" + ++categoryCount;
		}
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
	private String categoryName;
	
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
	private List<SubCategory> subCategories;


	/**
	 * 
	 */
	public void addSubCategory(SubCategory e) {
		subCategories.add(e);
	}
	
	/**
	 * 
	 */
	public void updateSubCategory(String subCategoryName) {
		Iterator<SubCategory> itr = subCategories.iterator();
		while (itr.hasNext()) {
			if (itr.next().getSubCategoryName().equals(subCategoryName)) {
				//TODO implement here
			}
		}
	}

	/**
	 * 
	 */
	public void deleteSubCategory(String subCategoryName) {
		Iterator<SubCategory> itr = subCategories.iterator();
		while (itr.hasNext()) {
			if (itr.next().getSubCategoryName().equals(subCategoryName)) {
				itr.remove();
			}
		}
	}

	
	/**
	 * @return the categoryID
	 */
	public String getCategoryID() {
		return categoryID;
	}

	/**
	 * @param categoryID the categoryID to set
	 */
	public void setCategoryID(String categoryID) {
		this.categoryID = categoryID;
	}

	/**
	 * @return the categoryName
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * @param categoryName the categoryName to set
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
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