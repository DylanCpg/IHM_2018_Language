package application.view.lexique;

import application.model.LexiqueVocabulaire;
import application.model.LexiqueVocabulaire.LexiqueMot;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LexiqueController implements Initializable {
	@FXML
	protected TableView<LexiqueMot> tableMot;
	@FXML
	public TableColumn colId;
	@FXML
	public TableColumn colMot;
	@FXML
	public TableColumn colDef;
	
	private LexiqueVocabulaire voca;
	
	// Alternative a une methodeStatic pour generer les valeurs
	
	@Override
	public void initialize(URL url, ResourceBundle resourceBundle){
		this.colId.setCellValueFactory(new PropertyValueFactory<LexiqueMot, Integer>("id"));
		this.colMot.setCellValueFactory(new PropertyValueFactory<LexiqueMot, String>("mot"));
		this.colDef.setCellValueFactory(new PropertyValueFactory<LexiqueMot, String>("trad"));
		
		try {
			this.voca = LexiqueVocabulaire.fromCSV(LexiqueVocabulaire.class.getResource("voca/adverbe.csv"));
		}catch (IOException err){
			throw new RuntimeException(err);
		}
		
		this.resetTableau();
	}
	
	public void resetTableau(){
		this.tableMot.setItems(this.voca.getVocab());
	}
}
