package application.view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Mainapp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ChangeScreen implements Initializable {
	@FXML
	private TextField rep1;
	private Text faux;
	
	public void LienAtelier(ActionEvent event) throws IOException{
	
	Parent tableViewParent=FXMLLoader.load(getClass().getResource("Atelier.fxml"));
	Scene tableViewScene =new  Scene(tableViewParent);
	Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

	window.setScene(tableViewScene);
	window.show();
	}
	public void LienMagazine(ActionEvent event) throws IOException{
		
		Parent tableViewParent=FXMLLoader.load(getClass().getResource("Magazine.fxml"));
		Scene tableViewScene =new  Scene(tableViewParent);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

		window.setScene(tableViewScene);
		window.show();
		}
	public void RetourArriereAccueil(ActionEvent event) throws IOException{
		
		Parent tableViewParent=FXMLLoader.load(getClass().getResource("Accueil.fxml"));
		Scene tableViewScene =new  Scene(tableViewParent);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

		window.setScene(tableViewScene);
		window.show();
		}
		public void LienExercisesFacile(ActionEvent event) throws IOException{
		
		Parent tableViewParent=FXMLLoader.load(getClass().getResource("ExercisesFacile.fxml"));
		Scene tableViewScene =new  Scene(tableViewParent);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

		window.setScene(tableViewScene);
		window.show();
		}
		
		public void LienSuiteExercisesF(ActionEvent event) throws IOException{
			
			Parent tableViewParent=FXMLLoader.load(getClass().getResource("SuiteExercicesF.fxml"));
			Scene tableViewScene =new  Scene(tableViewParent);
			
			Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

			window.setScene(tableViewScene);
			window.show();
			}
	public void LienApplicationExoNombre(ActionEvent event) throws IOException{
			
			Parent tableViewParent=FXMLLoader.load(getClass().getResource("ApplicationExoNombre.fxml"));
			Scene tableViewScene =new  Scene(tableViewParent);
			
			Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

			window.setScene(tableViewScene);
			window.show();
			}
	public void RetourArriereAtelier(ActionEvent event) throws IOException{
		
		Parent tableViewParent=FXMLLoader.load(getClass().getResource("Atelier.fxml"));
		Scene tableViewScene =new  Scene(tableViewParent);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

		window.setScene(tableViewScene);
		window.show();
		}
	/*public void Correction(ActionEvent event) throws IOException{
		System.out.println(rep1.getText());
			if(rep1.getText()=="1") {
				System.out.println("coucou");
				System.out.println(rep1.getText());
			}
		}*/
	public void Quitter(ActionEvent event) throws IOException{
		
		Stage popupwindow=new Stage();
	      
		popupwindow.initModality(Modality.APPLICATION_MODAL);
		popupwindow.setTitle("Quitter l'application");
      
		Label label1= new Label("Voulez vous vraiment quitter l'application ?");
  
		Button button1= new Button("Fermer");
   
		button1.setOnAction(e -> popupwindow.close());

		VBox layout= new VBox(10);
   
		layout.getChildren().addAll(label1, button1);
		      
		layout.setAlignment(Pos.CENTER);
		      
		Scene scene1= new Scene(layout, 300, 250);
		      
		popupwindow.setScene(scene1);
		      
		popupwindow.showAndWait();
		       
		}
		public void AfficherLexique() throws IOException{
			
			FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Mainapp.class.getResource("./view/Accueil.fxml"));
            AnchorPane lexique = (AnchorPane) loader.load();
            
			Scene scene = new Scene(lexique,900,600);
			Stage stage = new Stage();
			stage.setScene(scene);
			stage.setTitle("Lexique");
			stage.setResizable(false);
			stage.show();
		}
		
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
}