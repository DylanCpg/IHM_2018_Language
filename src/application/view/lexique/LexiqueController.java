package application.view.lexique;

import application.model.LexiqueVocabulaire;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class LexiqueController implements Initializable {
	@FXML
	protected TableView<LexiqueVocabulaire> tableMot;
	@FXML
	public TableColumn colMot;
	@FXML
	public TableColumn colDef;
	
	// Alternative a une methodeStatic pour generer les valeurs
	
	@Override
	public void initialize(URL url, ResourceBundle resourceBundle){
		this.colMot.setCellValueFactory(new PropertyValueFactory<LexiqueVocabulaire, String>("mot"));
		this.colDef.setCellValueFactory(new PropertyValueFactory<LexiqueVocabulaire, String>("trad"));
		
		this.resetTableau();
	}
	
	public void resetTableau(){
		this.tableMot.setItems(LexiqueVocabulaire.getVocaNombre());
	}
}
