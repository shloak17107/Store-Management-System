package model;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

/**
 * 
 */
public class EndUser extends User {

	/**
	 * Default constructor
	 */
	public EndUser(String username, String password) {
		super(username, password);
		carts = new LinkedList<Cart>();
	}

	/**
	 * 
	 */
	private float funds;

	/**
	 * 
	 */
	private List<Cart> carts;

	/**
	 * @param additionalFunds
	 */
	public void addFunds(int additionalFunds) {
		funds += additionalFunds;
	}

	/**
	 * Adds selected product to the customer's cart.<p>
	 * 
	 * Only a reference to the product object is passed to the method 
	 * along with its desired quantity. The actual object exists in an 
	 * object of type {@link Facility}. The {@code HashMap} of products 
	 * and their quantities is fetched from the {@code cart} object of 
	 * type {@link Cart}, and the reference of the new product and its
	 * desired quantity is added to the HashMap. In case the product
	 * already exists in the cart, the quantity of that product is 
	 * incremented by the desired quantity.
	 * 
	 * @param product 
	 * @param quantity
	 */
	public void addToCart(Product product, int quantity) {
		
		Cart cart = findCart(product.getLocation());
		
		// if no cart exists for the product's facility, generate a new one
		if (cart == null) {
			cart = new Cart(this, product.getLocation());
		}
		
		// fetch products HashMap from the cart
		AbstractMap<Product, Integer> cartProducts = cart.getProducts();
		
		// add to cart if the store has sufficient stock of the product, else thrown an error
		if (product.getQuantity() >= quantity) {
			cartProducts.put(product, quantity);
			cart.setProducts(cartProducts);
			cart.setTotalCost(cart.getTotalCost() + product.getCost() * quantity);
		}
		else {
			//TODO throw error
		}
		
	}
	
	/**
	 * Updates or deletes a product's desired quantity.<p>
	 * 
	 * First finds cart corresponding to the provided facility. Then, 
	 * searches for a product with the same name as the one provided. 
	 * If found, the product will be deleted from the cart if the specified
	 * quantity is 0, otherwise it will update the desired quantity with
	 * the amount specified. If product is not found in cart, an error
	 * will be thrown.
	 * 
	 * @param facility
	 * @param productName
	 * @param quantity
	 */
	public void updateCart(Facility facility, String productName, int quantity) {
		Cart cart = findCart(facility);
		// fetch the HashMap from cart and create its iterator
		AbstractMap<Product, Integer> products = (HashMap<Product, Integer>) cart.getProducts();
		Iterator<Entry<Product, Integer>> itr = products.entrySet().iterator();
		while (itr.hasNext()) {
			Entry<Product, Integer> p = itr.next();
			if (p.getKey().getProductName().equals(productName)) {
				if (quantity == 0) {
					itr.remove();
				}
				else {
					p.setValue(quantity);
				}
				cart.setProducts(products);
				break;
			}
		}
		
	}

	/**
	 * 
	 * @param facility
	 * @return
	 */
	public AbstractMap<Product, Integer> showCart(Facility facility) {
		return findCart(facility).getProducts();
	}

	/**
	 * 
	 * @param facility
	 */
	public void checkOut(Facility facility) {
		
		Cart cart = findCart(facility);
		
		// throw error if total cost of the order is greater than funds available, else continue
		if (cart.getTotalCost() > funds) {
			//TODO throw error
		}

		// fetch the HashMap from cart and create its iterator
		AbstractMap<Product, Integer> products = (HashMap<Product, Integer>) cart.getProducts();
		Iterator<Entry<Product, Integer>> itr = products.entrySet().iterator();
		
		// throw error if stock is not sufficient for a product's desired quantity, else continue
		while (itr.hasNext()) {
			Entry<Product, Integer> e = itr.next();
			if (e.getKey().getQuantity() < e.getValue()) {
				//TODO throw error
			}
		}
		
		// decrement the product's quantity in the store
		itr = products.entrySet().iterator();
		while (itr.hasNext()) {
			Entry<Product, Integer> e = itr.next();
			e.getKey().setQuantity(e.getKey().getQuantity() - e.getValue());
		}

		// decrement the cost of the order from the customer's funds and reset total cost
		funds -= cart.getTotalCost();
		cart.setTotalCost(0);
		
		// clear cart
		products.clear();
		cart.setProducts(products);
	}

	/**
	 * Returns the cart whose facility is the same as the parameter.<p>
	 * 
	 * @param facility
	 * @return
	 */
	private Cart findCart(Facility facility) {
		Iterator<Cart> itr = carts.iterator();
		while (itr.hasNext()){
			Cart t = itr.next();
			if (t.getFacility().equals(facility)) {
				return t;
			}
		}
		return null;
		//TODO throw error instead of null
	}

}