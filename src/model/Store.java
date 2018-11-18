package model;


/**
 * 
 */
public class Store extends Facility {

	/**
	 * Default constructor
	 */
	public Store (String storeName, StoreAdministrator admin) {
		super(storeName, admin);
		storeID = "S" + ++storeCount;
	}

	/**
	 * 
	 */
	private final String storeID;

	/**
	 * 
	 */
	private static int storeCount;

	/**
	 * 
	 */
	private Warehouse warehouse;






	/**
	 * 
	 */
	public void orderProducts() {
		// TODO implement here
	}

	/**
	 * @param productName 
	 * @return
	 */
	public Product search(String productName) {
		// TODO implement here
		return null;
	}

	/**
	 * 
	 */
	public void updateFixedCost() {
		// TODO implement here
	}

	/**
	 * 
	 */
	public void generateAlert() {
		// TODO implement here
	}

	/**
	 * 
	 * @param warehouse
	 */
	public void linkWarehouse(Facility warehouse) {
		this.setWarehouse((Warehouse) warehouse);
	}

	/**
	 * @return the storeID
	 */
	public String getStoreID() {
		return storeID;
	}

	/**
	 * @return the warehouse
	 */
	public Warehouse getWarehouse() {
		return warehouse;
	}

	/**
	 * @param warehouse the warehouse to set
	 */
	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

}