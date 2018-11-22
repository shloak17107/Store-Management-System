package model;


import fxml.categoriesDisplay_Controller;
import fxml.endUser_Controller;
import fxml.loginController;
import fxml.newStore_Controller;
import fxml.newWarehouse_Controller;
import fxml.storeAdmin_Controller;
import fxml.superUser_Controller;
import fxml.updateLink_Controller;
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
	private system APP;
	
    public Main() {
        mainInstance = this;
        APP = new system();
    }
    
    public static Main getInstance() {
        return mainInstance;
    }
    
    public system getSystem() {
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
	
	public void newWarehouse(SuperUser SUser, superUser_Controller SuperController) {
		FXMLLoader loader;
		try {
			loader = new_stage("/fxml/newWarehouse.fxml");
		    newWarehouse_Controller newWarehouse = loader.getController();
		    newWarehouse.setApp(SUser, SuperController);
		  }
		  catch (Exception e) {
		  e.printStackTrace();
		   }
		 }
		       
		public void newStore(SuperUser SUser, superUser_Controller SuperController) {
		 FXMLLoader loader;
		 try {
		    loader = new_stage("/fxml/newStore.fxml");
		    newStore_Controller newStore = loader.getController();
		    newStore.setApp(SUser, SuperController);
		   }
		 catch (Exception e) {
		      e.printStackTrace();
		   }
		       }
		 
		public void Room(room Room) {
			FXMLLoader loader;
			try {
				loader = new_stage("/fxml/categoriesDisplay.fxml");
				categoriesDisplay_Controller categoriesDisplay = loader.getController();
				categoriesDisplay.setApp(Room);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		 public void updateLink(SuperUser SUser) {
		 FXMLLoader loader;
		 try {
		 loader = new_stage("/fxml/updateLink.fxml");
		 updateLink_Controller UpdateLink = loader.getController();
		 UpdateLink.setApp(SUser);
		  }
		 catch (Exception e) {
		 e.printStackTrace();
		 }
		}

	public void storeAdmin(room myStore) {
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
	
	public void warehouseAdmin(room myWarehouse) {
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
