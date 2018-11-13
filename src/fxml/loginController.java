package fxml;

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Admin;
import model.Main;
import model.SuperUser;
import java.util.concurrent.TimeUnit;

public class loginController {
	
	@FXML
	private Label lblUser;
	
	@FXML
	private Label lblWarning;
	
	@FXML
	private TextField txLogin;
	
	@FXML
	private TextField txPswd;
	
	@FXML
	private Button btnEnd;
	
	@FXML
	private Button btnStore;
	
	@FXML
	private Button btnWarehouse;
	
	@FXML
	private Button btnSuper;
	
	@FXML
	private Button btnLogin;
	
	private String UserType;
	
	private Main application; 
	
	private SuperUser SUser;
	
	private LinkedList<Admin> StoreAdmins;
	
	private LinkedList<Admin> WarehouseAdmins;
	    
	public void setApp(Main application) {
	    	this.application = application;
	    	SUser = this.application.getSystem().getDatabase().getSuperUser();
	    	StoreAdmins = this.application.getSystem().getDatabase().getStoreAdmins();
	    	WarehouseAdmins = this.application.getSystem().getDatabase().getWarehouseAdmins();
	 	}
	
	public void default_setUp() {
		lblWarning.setText("");
		txLogin.setText("");
		txPswd.setText("");
		txLogin.setEditable(false);
		txLogin.setEditable(false);
	}
	
	public void Users_button(ActionEvent event) {
			txLogin.setEditable(true);
			txPswd.setEditable(true);
			txLogin.setText("");
			txPswd.setText("");
			UserType = ((Button)event.getSource()).getText();
			lblWarning.setText("");
		}
	
	public void login_button(ActionEvent event) throws InterruptedException {
		if (!txLogin.isEditable()) {
			lblWarning.setText("Please Select A User");
		}
		else if (UserType.equals("End User")) {
			txLogin.setText("EndUser");
			txPswd.setText("endUser");
			TimeUnit.SECONDS.sleep(1);
			this.application.endUser();
			this.default_setUp();
		}
		else if (txLogin.getText().equals("") || txPswd.getText().equals("")) {
			lblWarning.setText("Please Enter Credentials");
		}
		else {
			lblWarning.setText("");
			String UserID = txLogin.getText();
			String Pswd = txPswd.getText();
			
			if (UserType.equals("Super User")) {
				if (!UserID.equals(SUser.getID()) || !Pswd.equals(SUser.getPswd())) {
					lblWarning.setText("Invalid UserName or Password");
				}
				else {
					this.application.SuperUser();
					this.default_setUp();
				}
			}
			
			else if (UserType.equals("Store Admin")) {
				for (int i=0;i<StoreAdmins.size();i++) {
					Admin current = StoreAdmins.get(i);
					if (UserID.equals(current.getID()) && Pswd.equals(current.getPswd())) {
						this.application.storeAdmin(current.getMyRoom());
						this.default_setUp();
					}
					else if (i == StoreAdmins.size()-1) {
						lblWarning.setText("Invalid UserName or Password");
					}
				}
			}
			
			else {
				for (int i=0;i<WarehouseAdmins.size();i++) {
					Admin current = WarehouseAdmins.get(i);
					if (UserID.equals(current.getID()) && Pswd.equals(current.getPswd())) {
						this.application.warehouseAdmin(current.getMyRoom());
						this.default_setUp();
					}
					else if (i == WarehouseAdmins.size()-1) {
						lblWarning.setText("Invalid UserName or Password");
					}
				}
			}
		}
	}

}
