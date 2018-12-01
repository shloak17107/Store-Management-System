package model;

import java.io.Serializable;
import java.util.*;

/**
 * 
 */
public class WarehouseAdministrator extends Admin implements Serializable{

	public WarehouseAdministrator(String name, String ID, String pswd, room myRoom) {
		super(name, ID, pswd, myRoom);
	}

	/**
	 * 
	 */
	private Warehouse myWarehouse;




	/**
	 * @return
	 */
	public String alert_message() {
		// TODO implement here
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

}