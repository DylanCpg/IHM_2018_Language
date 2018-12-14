package application.view.magazine;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MagazineController implements Initializable {
	
	public void retourAccueil(ActionEvent event) throws IOException {
		Parent tableViewParent= FXMLLoader.load(getClass().getResource("../Accueil.fxml"));
		Scene tableViewScene =new  Scene(tableViewParent);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setTitle("Accueil");
		window.setScene(tableViewScene);
		window.show();
	}
	
	public void magDebCarnivore(ActionEvent event) throws IOException {
		Parent tableViewParent= FXMLLoader.load(getClass().getResource("MagazineDebCarnivore.fxml"));
		Scene tableViewScene =new  Scene(tableViewParent);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		// keep the title
		window.setScene(tableViewScene);
		window.show();
	}
	
	public void lienListMag(ActionEvent event) throws IOException {
		Parent tableViewParent= FXMLLoader.load(getClass().getResource("Magazine.fxml"));
		Scene tableViewScene =new  Scene(tableViewParent);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		// keep the title
		window.setScene(tableViewScene);
		window.show();
	}
	
	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		// NO-OP
	}
}
