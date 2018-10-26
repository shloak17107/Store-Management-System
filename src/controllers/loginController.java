package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class loginController {
	
	@FXML
	private Label lblUser;
	
	@FXML
	private TextField txLogin;
	
	@FXML
	private TextField txPswd;
	
//	@FXML
//	private TextField btnSuper;
	
	
	
	public void Users_button(ActionEvent event) {
		txLogin.setDisable(false);
		txPswd.setDisable(false);
		
		lblUser.setText(((Control) event.getSource()).getId());
		}

}
