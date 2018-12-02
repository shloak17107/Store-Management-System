package model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

/**
 * 
 */
public class Database implements Serializable{

	/**
	 * Default constructor
	 */
	private SuperUser SUser;
	
	private EndUser endUser;
	
	/**
	 * 
	 */
	private LinkedList<Warehouse> warehouses;

	/**
	 * 
	 */
	private LinkedList<Store> stores;

	/**
	 * 
	 */
	private LinkedList<Admin> WarehouseAdmins;

	/**
	 * 
	 */
	private LinkedList<Admin> StoreAdmins;
	
	public Database() {
		this.SUser = new SuperUser(this, "SUser", "SUser", "SUser");
		warehouses = new LinkedList<Warehouse>();
		stores = new LinkedList<Store>();
		WarehouseAdmins = new LinkedList<Admin>();
		StoreAdmins = new LinkedList<Admin>();
	}
		
	

	
	public void add_store(Store store) {
		stores.add(store);
		StoreAdmins.add(store.getAdmin());
	}
	
	public void add_warehouse(Warehouse warehouse) {
		warehouses.add(warehouse);
		WarehouseAdmins.add(warehouse.getAdmin());
	}
	
	public Store getStore(String S_ID) {
//		iterate through stores and
//		return the store with S_ID
		return null;
	}
	
	public Warehouse getWarehouse(String W_ID) {
	//		iterate through warehouses and
	//		return the warehouse with W_ID
			return null;
	}
	
	public LinkedList<Store> getStores() {
		return this.stores;
	}
	
	public LinkedList<Warehouse> getWarehouses() {
		return this.warehouses;
	}
	
	public SuperUser getSuperUser() {
		return this.SUser;
	}
	
	public LinkedList<Admin> getStoreAdmins() {
		return this.StoreAdmins;
	}
	
	public LinkedList<Admin> getWarehouseAdmins() {
		return this.WarehouseAdmins;
	}
	
	public EndUser getEndUser() {
		this.endUser = new EndUser();
		return this.endUser;
	}
	
}