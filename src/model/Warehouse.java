
import java.util.*;

/**
 * 
 */
public class Warehouse {

	/**
	 * Default constructor
	 */
	public Warehouse() {
	}

	/**
	 * 
	 */
	private String warehouseID;

	/**
	 * 
	 */
	private static int warehouseCount;

	/**
	 * 
	 */
	private String warehouseName;

	/**
	 * 
	 */
	private Collection<Store> stores;

	/**
	 * 
	 */
	private WarehouseAdministrator admin;

	/**
	 * 
	 */
	private Category topCategory;

	/**
	 * 
	 */
	private Collection<Product> allProducts;

	/**
	 * 
	 */
	private float fixedCost_D;







	/**
	 * @param store 
	 * @param records
	 */
	public void sendProducts(Store store, record records) {
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
	public void orderInventory() {
		// TODO implement here
	}

	/**
	 * @param warehouses 
	 * @param product 
	 * @return
	 */
	public Warehouse chooseWarehouse(Collection<Warehouse> warehouses, Product product) {
		// TODO implement here
		return null;
	}

	/**
	 * @param warehouse 
	 * @param product
	 */
	public void orderInventoryFromOtherWarehouse(Warehouse warehouse, Product product) {
		// TODO implement here
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

}