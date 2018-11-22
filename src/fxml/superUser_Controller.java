package fxml;

import java.awt.Font;
import java.util.LinkedList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.FontWeight;
import model.Main;
import model.Store;
import model.Warehouse;
import model.room;

public class superUser_Controller {
	
	private Main application;
	
	private LinkedList<Store> allStores;
	
	private LinkedList<Warehouse> allWarehouses;
	
	@FXML
	private Button btnNewWarehouse;
	       
	@FXML
	private Button btnNewStore;
	       
	@FXML
	private Button btnUpdateLink;
	
	@FXML
	private VBox VBoxStore;
	
	@FXML
	private VBox VBoxWarehouse;
	       

	public void setApp(Main application) {
    	this.application = application;
    	allWarehouses = this.application.getSystem().getDatabase().getWarehouses();
    	allStores = this.application.getSystem().getDatabase().getStores();
    	this.defaultSetup();
 	}
	
	public superUser_Controller() {
		VBoxStore = new VBox();
    	VBoxWarehouse = new VBox();
    	VBoxStore.setSpacing(10);
    	VBoxWarehouse.setSpacing(10);
	}
	       
	public void newWarehouse_button(ActionEvent event) {
		this.application.newWarehouse(this.application.getSystem().getDatabase().getSuperUser(), this);
	}
		       
	public void newStore_button(ActionEvent event) {
		this.application.newStore(this.application.getSystem().getDatabase().getSuperUser(), this);
	}
		       
	public void updateLink_button(ActionEvent event) {
		this.application.updateLink(this.application.getSystem().getDatabase().getSuperUser());
	}
	
	public void Store_button(String btnID) {
		int Store_pointer = Integer.parseInt(btnID.substring(6));
		Store store = this.allStores.get(Store_pointer);
		this.application.Room(store);
	}

	public void Warehouse_button(String btnID) {
		int Warehouse_pointer = Integer.parseInt(btnID.substring(10));
		Warehouse warehouse = this.allWarehouses.get(Warehouse_pointer);
		this.application.Room(warehouse);
	}
	
	public void defaultSetup() {
		for (int i=0; i<allStores.size(); i++) {
			Store store = allStores.get(i);
			this.add_Store(store, i);
		}
		
		for (int i=0; i<allWarehouses.size(); i++) {
			Warehouse warehouse = allWarehouses.get(i);
			this.add_Warehouse(warehouse, i);
		}
	}
	
	public void add_Store(Store store, int position) {
		Button newStore = new Button(store.getRoomName());
		newStore.setId("Store_" + position);
		newStore.setPrefWidth(VBoxStore.getPrefWidth());
		newStore.setOnAction((click) -> {
			  this.Store_button(newStore.getId());
			  System.out.println();
		});
		VBoxStore.getChildren().add(newStore);
	}
	
	
	
	public void add_Warehouse(Warehouse warehouse, int position) {
		Button newWarehouse = new Button(warehouse.getRoomName());
		newWarehouse.setId("Warehouse_" + position);
		newWarehouse.setPrefWidth(VBoxWarehouse.getPrefWidth());
		newWarehouse.setOnAction((click) -> {
			this.Warehouse_button(newWarehouse.getId());
			System.out.println();
		});
		VBoxWarehouse.getChildren().add(newWarehouse);
	}
	
		       
}
