package model;

import java.io.Serializable;
import java.util.*;

/**
 * 
 */
public class Record implements Serializable{

	/**
	 * Default constructor
	 */
	public Record() {
	}

	/**
	 * 
	 */
	String productName;

	/**
	 * 
	 */
	public String productID;

	/**
	 * 
	 */
	public int quantity;

	/**
	 * 
	 */
	public Date expectedArrival;


}