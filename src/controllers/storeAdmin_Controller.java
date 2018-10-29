package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class storeAdmin_Controller {
	
	@FXML
	private ListView<GridPane> lsvCategory;
	
	@FXML
	private TextField txtName;
	
	@FXML
	private GridPane top_bar;
	
	public storeAdmin_Controller() {
		lsvCategory = new ListView();
		lsvCategory.setEditable(true);
	}
 	
	
	public GridPane create_object(String name) {
		GridPane obj = new GridPane();
		obj.setMinWidth(lsvCategory.getWidth());
		
		Button Name = new Button(name);
		Button Delete = new Button("Delete");
		Button Update = new Button("Update");
		
		Name.setPrefWidth(650);
		
		obj.add(Name,0,0);
		obj.add(Delete,1,0);
		obj.add(Update,2,0);
		
		return obj;
	}
	
	public void Create_button(ActionEvent event) {
		String name = txtName.getText();
		if (name!="") {
			GridPane List_item = create_object(name);
			lsvCategory.getItems().add(List_item);
			txtName.setText("");
		}
	}

}
