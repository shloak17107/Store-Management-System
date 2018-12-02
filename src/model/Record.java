package model;

import java.io.Serializable;
import java.util.*;

/**
 * 
 */
public class Record implements Serializable{

	/** Generated serial version ID */
	private static final long serialVersionUID = 9010640150579566409L;

	/**
	 * Default constructor
	 */
	public Record() {
	}

	/** The name of the product. */
	String productName;

	/** The ID of the product. */
	public String productID;

	/** The quantity of the product */
	public int quantity;

	/** expected arrival date of the product */
	public Date expectedArrival;


}