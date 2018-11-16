package model;


import fxml.endUser_Controller;
import fxml.loginController;
import fxml.storeAdmin_Controller;
import fxml.superUser_Controller;
import fxml.warehouseAdmin_Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	
	private static Main mainInstance;
	private Parent root;
	private System APP;
	
    public Main() {
        mainInstance = this;
        APP = new System();
    }
    
    public static Main getInstance() {
        return mainInstance;
    }
    
    public System getSystem() {
    	return this.APP;
    }
    
	@Override
	public void start(Stage primaryStage) {
		try {
			Login();
		} catch(Exception e) {
			e.printStackTrace();
		}		
	}
	
	public void Login() {
		FXMLLoader loader;
		try {
			loader = new_stage("/fxml/loginPage.fxml");
			loginController login = loader.getController();
			login.setApp(this);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void SuperUser() {
		FXMLLoader loader;
		try {
			loader = new_stage("/fxml/superuserMainPage.fxml");
			superUser_Controller superUser = loader.getController();
			superUser.setApp(this);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void storeAdmin(Facility myStore) {
		FXMLLoader loader;
		try {
			loader = new_stage("/fxml/storeAdmin.fxml");
			storeAdmin_Controller storeAdmin = loader.getController();
			storeAdmin.setApp(myStore);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void warehouseAdmin(Facility myWarehouse) {
		FXMLLoader loader;
		try {
			loader = new_stage("/fxml/warehouseAdmin.fxml");
			warehouseAdmin_Controller warehouseAdmin = loader.getController();
			warehouseAdmin.setApp(myWarehouse);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void endUser() {
		FXMLLoader loader;
		try {
			loader = new_stage("/fxml/enduserStoresDisplay.fxml");
			endUser_Controller endUser = loader.getController();
			endUser.setApp(this.APP.getDatabase().getStores());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public FXMLLoader new_stage(String fxml) throws Exception {
		Stage stage = new Stage();
		stage.setTitle("SuperStore");
		FXMLLoader loader = new FXMLLoader(getClass().getResource(fxml));
		root = (Parent) loader.load();
		stage.setScene(new Scene(root));
		stage.show();
		return loader;
	}
	
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
