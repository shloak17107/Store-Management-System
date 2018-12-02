
package model;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

/**
 * The {@code system} class handles the database externally
 * and takes care of its serialization and deserialization.
 */
public class MainSystem {
	
	/**
	 * reference to the database
	 */
	private Database db;
	
	/**
	 * reference to the superuser
	 */
	private SuperUser super_user;

	/**
	 * Default constructor
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public MainSystem() throws ClassNotFoundException, IOException {
		db = this.deserialize();
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
	 * Serializes the database.
	 * @throws IOException
	 */
	public void serialize() throws IOException{
		ObjectOutputStream out = null;
		
		try {
			out = new ObjectOutputStream(new FileOutputStream("db.txt"));
			out.writeObject(this.db);
		}
		finally {
			if (out!=null)
			out.close();
		}
	}

	/**
	 * Deserializes the database
	 * 
	 * @return the database
	 * @throws IOException
	 * @throws ClassNotFoundException
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

}