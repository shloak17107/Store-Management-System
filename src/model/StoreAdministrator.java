package model;

import java.io.Serializable;
import java.util.*;

/**
 * 
 */
public class StoreAdministrator extends Admin implements Serializable{

	/**
	 * Default constructor
	 */
	public StoreAdministrator(String name, String ID, String pswd, room myRoom) {
		super(name, ID, pswd, myRoom);
	}

	/**
	 * 
	 */
	private Store myStore;




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
	public void sendMessage(Warehouse warehouse, Collection<Record> records) {
		// TODO implement here
	}

}