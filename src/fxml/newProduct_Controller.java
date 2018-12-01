package fxml;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Admin;
import model.Category;
import model.subCategory;

public class newProduct_Controller {

	private Admin admin;
	
	private subCategory SubCategory;
	
	@FXML
	private TextField txtName;
	
	@FXML
	private TextField txtDescription;
	
	@FXML
	private TextField txtPrice;
	
	@FXML
	private TextField txtQuantity;
	
	@FXML
	private TextField txtFixedCost;
	
	@FXML
	private TextField txtCarryingCost;
	
	@FXML
	private TextField txtDemand;
	
	@FXML
	private Button btnCancel;
	
	@FXML
	private Button btnCreate;
	
	
	public void setApp(Admin admin, subCategory SubCategory) {
		this.admin = admin;
		this.SubCategory = SubCategory;
	}
	
	public void Cancel_button() {
	 	   Stage stage = (Stage) btnCancel.getScene().getWindow();
	 	   
	 	   stage.close();
	 }
	
	public void Create_button() {
		String Name = txtName.getText();
		String Description = txtDescription.getText();
		String Price = txtPrice.getText();
		String Quantity = txtQuantity.getText();
		String FixedCost = txtFixedCost.getText();
		String CarryingCost = txtCarryingCost.getText();
		String Demand = txtDemand.getText();
		
		if(!(Name.equals("") || Description.equals("") || Price.equals("") || Quantity.equals("") || Quantity.equals("") || FixedCost.equals("") || CarryingCost.equals("") || Demand.equals(""))) {
			this.admin.addProduct(Name, Description, Integer.parseInt(Quantity), Integer.parseInt(FixedCost), Integer.parseInt(CarryingCost), Integer.parseInt(Demand), Integer.parseInt(Price), SubCategory);
		}
		this.Cancel_button();
	}
	
}
