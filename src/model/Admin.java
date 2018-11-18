package model;

/**
 * 
 */
public interface Admin {
	
	/**
	 * 
	 */
	public void addCategory(Category e);

	/**
	 * 
	 */
	public void updateCategory(String categoryName);

	/**
	 * 
	 */
	public void deleteCategory(String categoryName);

	/**
	 * 
	 */
	public void addProduct(Product e);

	/**
	 * 
	 */
	public void updateProduct(String productName);

	/**
	 * 
	 */
	public void deleteProduct(String productName);

}