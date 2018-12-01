package fxml;

import org.controlsfx.control.textfield.TextFields;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import model.Category;
import model.EndUser;
import model.Main;
import model.Product;
import model.room;
import model.subCategory;

public class categoriesDisplay_Controller {

	private room Room;
	
	private Main application;
	
	private String userType;
	
	private String labelCategories;
	
	private Category parent_category;
	
	private subCategory parent_subCategory;
	
	private EndUser endUser;
	
	private ObservableList<Category> allCategories;
	
	private ObservableList<subCategory> allSubCategories;
	
	private ObservableList<Product> allProducts;
	
	@FXML
	private Label lblCategory;
	
	@FXML
	private Label lblRoomName;
	
	@FXML
	private Text txtUserType;
	
	@FXML
	private ListView lsvGeneral;
	
	@FXML
	private Label lblDescription;
	
	@FXML
	private Button btnOpen;
	
	@FXML
	private VBox vboxSort;
	
	@FXML
	private Button btnCart;
	
	@FXML
	private AnchorPane apBar;
	
	@FXML
	private Button btnSort;
	
	@FXML
	private TextField txtSearch;
	
	public void setApp(room Room, Main application, String userType, String labelCategories, Category parent_category, subCategory parent_subCategory, EndUser endUser) {
		this.Room = Room;
		this.application = application;
		this.userType = userType;
		this.labelCategories = labelCategories;
		this.parent_category = parent_category;
		this.parent_subCategory = parent_subCategory;
		this.endUser = endUser;
		lblCategory.setText(labelCategories);
		lblRoomName.setText(Room.getRoomName());
		txtUserType.setText(userType);
		this.defaultSetup();
		if (this.userType.equals("endUser") && this.labelCategories.equals("Products")) {
			btnSort = new Button("Sort");
			vboxSort.getChildren().add(btnSort);
			TextFields.
			btnSort.setOnAction(new EventHandler<ActionEvent>() {
			    @Override public void handle(ActionEvent e) {
					lsvGeneral.setItems(allProducts.sorted());
			    }
			});
		}
		if (!this.userType.equals("endUser"))
			this.apBar.getChildren().remove(btnCart);
	}
	
	public categoriesDisplay_Controller() {
		this.lsvGeneral = new ListView();
		vboxSort = new VBox();	
	}
	
//	@FXML public void initialize() {
//		lsvGeneral.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Category>() {
//
//			@Override
//			public void changed(ObservableValue<? extends Category> arg0, Category arg1, Category arg2) {
//				// TODO Auto-generated method stub
//				lblDescription.setText(arg2.getDescription());
//				
//			}
//			
//		});
//	}
	
	public void defaultSetup() {
		if (this.labelCategories.equals("Categories")) {
			allCategories = FXCollections.observableList(this.Room.getCategories());
			lsvGeneral.setItems(allCategories);
		}
		
		else if (this.labelCategories.equals("subCategories")) {
			allSubCategories = FXCollections.observableList(parent_category.getSubCategories());
			lsvGeneral.setItems(allSubCategories);
		}
		
		else {
			allProducts = FXCollections.observableList(parent_subCategory.getProducts());
			lsvGeneral.setItems(allProducts);
		}
	}
	
	public void openButton() {
		if (lsvGeneral.getSelectionModel().getSelectedItem() != null) {
			if (this.labelCategories.equals("Categories")) {
				Category toOpen = (Category) lsvGeneral.getSelectionModel().getSelectedItem();
				this.application.categoriesDisplay(Room, userType, "subCategories", toOpen, null, this.endUser);
			}
			else if (this.labelCategories.equals("subCategories")) {
				subCategory toOpen = (subCategory) lsvGeneral.getSelectionModel().getSelectedItem();
				this.application.categoriesDisplay(Room, userType, "Products", parent_category, toOpen, this.endUser);
			}
			else {
				Product toOpen = (Product) lsvGeneral.getSelectionModel().getSelectedItem();
				if (this.userType.equals("SuperUser") || this.userType.equals("warehouseAdmin"))
					this.application.productView(toOpen);
				else
					this.application.productOrder(toOpen, Room, this.endUser);
			}
	}
}
	
	public void Cart_button() {
		this.application.Cart(endUser, null);
	}
	
//	public void setDescription() {
//		if (this.labelCategories.equals("Categories"))
//	}

}
