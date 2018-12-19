package application.view.atelier;

import application.view.ChangeScreen;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public abstract class ControllerAtelierLecon extends ChangeScreen {
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
		
		ChangeScreen.setScene(event, determinerPageExo(lecon, directExo.isSelected()));
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
