package application.view.atelier;

import application.view.ChangeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public abstract class ControllerChoixLecon extends ChangeScreen {
	@FXML
	public RadioButton L1;
	@FXML
	public RadioButton L2;
	@FXML
	public RadioButton L3;
	@FXML
	public CheckBox directExo;
	
	@FXML
	protected void LienLecon(ActionEvent event) throws IOException{
		int lecon = 0;
		if(L1.isSelected()){
			lecon = 1;
		}else if(L2.isSelected()){
			lecon = 2;
		}else if(L3.isSelected()){
			lecon = 3;
		}
		
		URL page = determinerPageExo(lecon, directExo.isSelected());
		
		Parent tableViewParent= FXMLLoader.load(page);
		Scene tableViewScene = new Scene(tableViewParent);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(tableViewScene);
		window.show();
	}
	
	abstract protected URL determinerPageExo(int numLecon, boolean skipLecon) /* throws UnsupportedOperationException */;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		super.initialize(location, resources);
		if(L1 == null || L2 == null || L3 == null || directExo == null){
			System.err.println("Mauvais format de FXML");
		}
	}
}
