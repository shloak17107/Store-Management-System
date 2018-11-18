package fxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import model.Main;

public class superUser_Controller {
	
	private Main application;
	
	@FXML
	private Button btnNewWarehouse;
	
	@FXML
	private Button btnNewStore;
	
	@FXML
	private Button btnUpdateLink;
	
	public void setApp(Main application) {
    	this.application = application;
 	}
	
	public void newWarehouse_button(ActionEvent event) {
		this.application.newWarehouse(this.application.getSystem().getDatabase().getSuperUser());
	}
	
	public void newStore_button(ActionEvent event) {
		this.application.newStore(this.application.getSystem().getDatabase().getSuperUser());
	}
	
	public void updateLink_button(ActionEvent event) {
		this.application.updateLink(this.application.getSystem().getDatabase().getSuperUser());
	}
	
}
