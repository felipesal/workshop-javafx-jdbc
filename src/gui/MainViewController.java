package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable {

	@FXML
	private MenuItem menuItemSeller;
	
	@FXML
	private MenuItem menuItemDepartment;
	
	@FXML
	private MenuItem menuItemAbout;
	
	@FXML
	private void onMenuSellerAction() {
		System.out.println("On menu item seller action!");
	}
	
	@FXML
	private void onMenuDepartmentAction() {
		System.out.println("On menu item department action!");
	}
	
	@FXML
	private void onMenuAboutAction() {
		System.out.println("On menu item about action!");
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
	}

	
	
}
