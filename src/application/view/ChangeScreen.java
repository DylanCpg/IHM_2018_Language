package application.view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ChangeScreen implements Initializable {
	@FXML
	private TextField rep1;
	
	@FXML
	private Text faux;
	
	@FXML
	private Text faux1;

	
	public void LienAtelier(ActionEvent event) throws IOException{
		ChangeScreen.setScene(event, ChangeScreen.class.getResource("atelier/Atelier.fxml"));
	}
	
	public void LienMagazine(ActionEvent event) throws IOException{
		ChangeScreen.setScene(event, ChangeScreen.class.getResource("magazine/Magazine.fxml"));
	}
	
	public void RetourArriereAccueil(ActionEvent event) throws IOException{
		ChangeScreen.setScene(event, ChangeScreen.class.getResource("Accueil.fxml"));
	}
	public void LienAtelierFacile(ActionEvent event) throws IOException{
		ChangeScreen.setScene(event, ChangeScreen.class.getResource("atelier/AtelierFacile.fxml"));
	}
	
	public void LienAtelierLeconF(ActionEvent event) throws IOException{
		ChangeScreen.setScene(event, ChangeScreen.class.getResource("atelier/AtelierFacileNombreLecon.fxml"));
	}
	
	public void LienApplicationExoNombre(ActionEvent event) throws IOException{
		ChangeScreen.setScene(event, ChangeScreen.class.getResource("atelier/AtelierFacileNombreExo.fxml"));
	}
	
	public void RetourArriereAtelier(ActionEvent event) throws IOException{
		ChangeScreen.setScene(event, ChangeScreen.class.getResource("atelier/Atelier.fxml"));
	}
	
	// in progress => proper subclass to handle this
	public void Correction(ActionEvent event) throws IOException{
		if(rep1.getText().equals("one")) {

			faux.setOpacity(0);
			faux1.setOpacity(1);
		}else {
			faux.setOpacity(1);
			faux1.setOpacity(0);
		}
	}
	public void Quitter(ActionEvent event) throws IOException{
		
		Stage popupwindow=new Stage();
		
		popupwindow.initModality(Modality.APPLICATION_MODAL);
		popupwindow.setTitle("Quitter l'application");
		
		Label label1= new Label("Voulez vous vraiment quitter l'application ?");
		
		Button button1= new Button("Quitter");
		Button button2= new Button("Rester");
		
		button1.setOnAction(e -> popupwindow.close());
		button2.setOnAction(e -> popupwindow.close());
		VBox layout= new VBox(10);
		
		layout.getChildren().addAll(label1, button1, button2);
		
		layout.setAlignment(Pos.CENTER);
		
		Scene scene1= new Scene(layout, 300, 250);
		
		popupwindow.setScene(scene1);
		
		popupwindow.showAndWait();
		
	}
	
	public void AfficherLexique() throws IOException{
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ChangeScreen.class.getResource("lexique/Lexique.fxml"));
		AnchorPane lexique = (AnchorPane) loader.load();
		
		Scene scene = new Scene(lexique,800,800);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.setTitle("Lexique");
		stage.setResizable(false);
		stage.show();
	}
	
	public void LienExoIntermediaire(ActionEvent event) throws IOException{
		ChangeScreen.setScene(event, ChangeScreen.class.getResource("atelier/AtelierInter.fxml"));
	}
	
	public void RetourExo(ActionEvent event) throws IOException{
		ChangeScreen.setScene(event, ChangeScreen.class.getResource("atelier/AtelierFacile.fxml"));
	}
	public void Help(ActionEvent event) throws IOException{
		
		Stage popupwindow=new Stage();
		
		popupwindow.initModality(Modality.APPLICATION_MODAL);
		popupwindow.setTitle("Aide");
		
		Label label1= new Label("Pour choisir votre niveau sachez que le niveau débutant est réservé pour les personnes n'ayant jamais fais d'anglais  ");
		Label label2= new Label("Pour le niveau intermédiaire il est plus réservé au personne ayant déjà eu des cours et ayant un niveau A2(collège)");
		Label label3= new Label("Pour le dernier il est pour ceux qui veulent approfondire le niveau précédent");
		Button button1= new Button("Fermer");
		
		button1.setOnAction(e -> popupwindow.close());
		
		VBox layout= new VBox(10);
		
		layout.getChildren().addAll(label1,label2,label3,button1);
		
		layout.setAlignment(Pos.CENTER);
		
		Scene scene1= new Scene(layout, 800, 300);
		
		popupwindow.setScene(scene1);
		
		popupwindow.showAndWait();
		
	}
	
	public void RetourExoIntermediaire(ActionEvent event) throws IOException{
		ChangeScreen.setScene(event, ChangeScreen.class.getResource("atelier/AtelierInter.fxml"));
	}
	public void LienExoApplicationIntermdiaire(ActionEvent event) throws IOException{
		ChangeScreen.setScene(event, ChangeScreen.class.getResource("atelier/AtelierInterNombreExo.fxml"));
	}
	public void LienExoConfirme(ActionEvent event) throws IOException{
		ChangeScreen.setScene(event, ChangeScreen.class.getResource("atelier/AtelierConf.fxml"));
	}
	public void LienExoConfirmeApplication(ActionEvent event) throws IOException{
		ChangeScreen.setScene(event, ChangeScreen.class.getResource("atelier/AtelierConfNombreExo.fxml"));
	}
	public void RetourExoConfirme(ActionEvent event) throws IOException{
		ChangeScreen.setScene(event, ChangeScreen.class.getResource("atelier/AtelierConf.fxml"));
	}
	
	/**
	 * Replace the scene where a given event took place.
	 * The source MUST me a node
	 */
	public static void setScene(Event evt, URL pathFXML) throws IOException{
		setScene((Stage) ((Node)evt.getSource()).getScene().getWindow(), pathFXML);
	}
	public static void setScene(Stage stage, URL pathFxml) throws IOException{
		Parent root = FXMLLoader.load(pathFxml);
		Scene scene = new Scene(root);
		
		stage.setScene(scene);
		stage.show();
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
}