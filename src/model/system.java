
package model;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

/**
 * 
 */
public class system implements Serializable{
	
	/**
	 * 
	 */
	private Database db;
	
	private SuperUser super_user;

	/**
	 * Default constructor
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public system() throws ClassNotFoundException, IOException {
		db = this.deserialize();
		LinkedList<Warehouse> allWarehouses = db.getWarehouses();
		for (int i=0; i<allWarehouses.size();i++) {
			Warehouse w = allWarehouses.get(i);
			String city = w.getCity();
			if (city.equals("Delhi")) {
				Warehouse.Delhi.add(w);
			}
			else if (city.equals("Banglore")) {
				Warehouse.Banglore.add(w);
			}
			else {
				Warehouse.Patna.add(w);
			}
			Warehouse.all_cities.add(Warehouse.Delhi);
			Warehouse.all_cities.add(Warehouse.Patna);
			Warehouse.all_cities.add(Warehouse.Banglore);
			
		}
		super_user = db.getSuperUser();
	}

	public Database getDatabase() {
		return this.db;
	}
	/**
	 * 
	 */
	private User currentUser;



	/**
	 * @param db 
	 * @param filename
	 */
	public void serialize() throws IOException{
		ObjectOutputStream out = null;
		
		try {
			out = new ObjectOutputStream(new FileOutputStream("db"));
			out.writeObject(this.db);
		}
		finally {
			if (out!=null)
			out.close();
		}
	}

	/**
	 * @param filename 
	 * @return
	 */
	public Database deserialize() throws IOException, ClassNotFoundException{
		ObjectInputStream in = null;
		
		try {
			FileInputStream fis = new FileInputStream("db");
			in = new ObjectInputStream(fis);
			db = (Database) in.readObject();
			in.close();
			fis.close();	
			if (db==null) return new Database();
			return db;
		}
		catch (IOException ex) { 
            System.out.println("IOException is caught"); 
            return new Database();
        } 
  
        catch (ClassNotFoundException ex) { 
            System.out.println("ClassNotFoundException" + 
                                " is caught"); 
            return null;
        }
		
	}
	
	

	/**
	 * @return
	 */
	private String[] resetSuperUser() {
		// TODO implement here
		return null;
	}

}