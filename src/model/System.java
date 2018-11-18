
package model;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 
 */
public class System {
	
	/**
	 * The database storing all the company's data.
	 */
	private static Database db;
	
	/**
	 * TODO will the currentUser be in System.java or Database.java??? Do we even need this variable here???
	 * 
	 */
	private User currentUser;
	
	
	/**
	 * The main method.
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		
		// deserializes if db file exists, else initializes a new database
		try {
			db = deserialize("db.txt");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			db = new Database();
		}
		
	}

	/**
	 * Serializes database to a file.
	 * 
	 * @param db		database that will be stored in a file
	 * @param filename	name of file in which database will be stored
	 * @throws IOException
	 */
	private static void serialize(Database db, String filename) throws IOException {
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream (new FileOutputStream(filename));
			out.writeObject(db);
		} finally {
			out.close();
		}
	}

	/**
	 * Deserializes database from a file.
	 * 
	 * @param filename	file from which database will be loaded
	 * @return			the database if found
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	private static Database deserialize(String filename) throws IOException, ClassNotFoundException {
		ObjectInputStream in = null;
	    try {
	        in =  new ObjectInputStream (new FileInputStream(filename));
			Database p = (Database) in.readObject();
	        return p;
	    } finally {
	        in.close();
	    }
	}

	/**
	 * Changes username and password of the super user.
	 * 
	 * @return
	 */
	private String[] resetSuperUser() {
		// TODO implement resetSuperUser
		return null;
	}

}