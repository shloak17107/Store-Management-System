package model;

import java.util.LinkedList;
import java.util.List;

public class Facility {
	
	/**
	 * Default constructor
	 * 
	 * @param facilityName
	 * @param facilityAdmin
	 */
	public Facility (String facilityName, User facilityAdmin) {
		this.facilityName = facilityName;
		this.facilityAdmin = facilityAdmin;
		setAllCategories(new LinkedList<Category>());
	}
	
	
	/**
	 * 
	 */
	private String facilityName;
	
	/**
	 * 
	 */
	private User facilityAdmin;
	
	/**
	 * 
	 */
	private List<Category> allCategories;
	
	/**
	 * 
	 */
	private List<Product> allProducts;
	
	/**
	 * 
	 */
	private float D;
	
	
	/**
	 * @return the facilityName
	 */
	public String getFacilityName() {
		return facilityName;
	}

	/**
	 * @param facilityName the facilityName to set
	 */
	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}

	/**
	 * @return the facilityAdmin
	 */
	public User getFacilityAdmin() {
		return facilityAdmin;
	}

	/**
	 * @param facilityAdmin the facilityAdmin to set
	 */
	public void setFacilityAdmin(User facilityAdmin) {
		this.facilityAdmin = facilityAdmin;
	}

	/**
	 * @return the allCategories
	 */
	public List<Category> getAllCategories() {
		return allCategories;
	}

	/**
	 * @param allCategories the allCategories to set
	 */
	public void setAllCategories(List<Category> allCategories) {
		this.allCategories = allCategories;
	}

	/**
	 * @return the allProducts
	 */
	public List<Product> getAllProducts() {
		return allProducts;
	}

	/**
	 * @param allProducts the allProducts to set
	 */
	public void setAllProducts(List<Product> allProducts) {
		this.allProducts = allProducts;
	}

	/**
	 * @return the fixedCost_D
	 */
	public float getD() {
		return D;
	}

	/**
	 * @param fixedCost_D the fixedCost_D to set
	 */
	public void setD(float D) {
		this.D = D;
	}
	
}
