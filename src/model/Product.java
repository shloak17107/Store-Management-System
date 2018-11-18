package model;

/**
 * 
 */
public class Product {

	/**
	 * 
	 * @param productName	Name of the product
	 * @param H
	 * @param K
	 * @param location
	 * @param cost
	 * @param description
	 * @param imagePath
	 */
	public Product(String productName, float H, int K, Facility location, float cost, String description, String imagePath) {
		this.productName = productName;
		this.H = H;
		this.K = K;
		this.location = location;
		this.cost = cost;
		this.description = description;
		this.imagePath = imagePath;
		productID = "P" + ++productCount;
	}

	/**
	 * 
	 */
	private String productID;

	/**
	 * 
	 */
	private static int productCount;

	/**
	 * 
	 */
	private String productName;

	/**
	 * Carrying cost per unit per quarter.
	 */
	private float H;

	/**
	 * Demand of item in units per quarter.
	 */
	private int K;

	/**
	 * 
	 */
	private float EOQ;

	/**
	 * 
	 */
	private Facility location;

	/**
	 * 
	 */
	private int quantity;

	/**
	 * Selling price of the product.
	 */
	private float cost;

	/**
	 * Description for the product.
	 */
	private String description;

	/**
	 * 
	 */
	private String imagePath;

	/**
	 * 
	 */
	public void calculateEOQ() {
		EOQ = (float) Math.sqrt(2 * H * K / location.getD());
	}

	/**
	 * @return the productID
	 */
	public String getProductID() {
		return productID;
	}

	/**
	 * @param productID the productID to set
	 */
	public void setProductID(String productID) {
		this.productID = productID;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * 
	 * @return
	 */
	public float getH() {
		return H;
	}

	/**
	 * 
	 * @param H
	 */
	public void setH(float H) {
		this.H = H;
	}

	/**
	 * 
	 * @return
	 */
	public int getK() {
		return K;
	}

	/**
	 * 
	 * @param K
	 */
	public void setK(int K) {
		this.K = K;
	}

	/**
	 * 
	 * @return
	 */
	public float getEOQ() {
		return EOQ;
	}

	/**
	 * @return the location
	 */
	public Facility getLocation() {
		return location;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the cost
	 */
	public float getCost() {
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(float cost) {
		this.cost = cost;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the imagePath
	 */
	public String getImagePath() {
		return imagePath;
	}

	/**
	 * @param imagePath the imagePath to set
	 */
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

}