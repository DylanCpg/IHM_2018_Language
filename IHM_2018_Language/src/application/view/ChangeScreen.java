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
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ChangeScreen implements Initializable {
	public RadioButton L1;
	public RadioButton L2;
	public RadioButton L3;
	public CheckBox directExo;
	@FXML
	private TextField rep1;
	
	@FXML
	private Text faux;
	
	@FXML
	private Text faux1;

	
	public void LienAtelier(ActionEvent event) throws IOException{
		
		Parent tableViewParent=FXMLLoader.load(getClass().getResource("atelier/Atelier.fxml"));
		Scene tableViewScene =new  Scene(tableViewParent);
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setTitle("OuiLangue");
		
		window.setScene(tableViewScene);
		window.show();
	}
	
	public void LienMagazine(ActionEvent event) throws IOException{
		
		Parent tableViewParent=FXMLLoader.load(getClass().getResource("magazine/Magazine.fxml"));
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
	public void LienAtelierFacile(ActionEvent event) throws IOException{
		
		Parent tableViewParent=FXMLLoader.load(getClass().getResource("atelier/AtelierFacile.fxml"));
		Scene tableViewScene =new  Scene(tableViewParent);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

		
		window.setScene(tableViewScene);
		window.show();
	}
	
	public void LienAtelierLeconF(ActionEvent event) throws IOException{
		Parent tableViewParent=FXMLLoader.load(getClass().getResource("atelier/AtelierFacileNombreLecon.fxml"));
		Scene tableViewScene =new  Scene(tableViewParent);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

		
		window.setScene(tableViewScene);
		window.show();
	}
	
	public void LienApplicationExoNombre(ActionEvent event) throws IOException{
		
		Parent tableViewParent=FXMLLoader.load(getClass().getResource("atelier/AtelierFacileNombreExo.fxml"));
		Scene tableViewScene =new  Scene(tableViewParent);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

		
		window.setScene(tableViewScene);
		window.show();
	}
	
	public void RetourArriereAtelier(ActionEvent event) throws IOException{
		
		Parent tableViewParent=FXMLLoader.load(getClass().getResource("atelier/Atelier.fxml"));
		Scene tableViewScene =new  Scene(tableViewParent);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setTitle("Atelier");
		window.setScene(tableViewScene);
		window.show();
	}
	
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
		loader.setLocation(Mainapp.class.getResource("view/lexique/Lexique.fxml"));
		AnchorPane lexique = (AnchorPane) loader.load();
		
		Scene scene = new Scene(lexique,900,600);
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.setTitle("Lexique");
		stage.setResizable(false);
		stage.show();
	}
	
	public void LienExoIntermediaire(ActionEvent event) throws IOException{
		
		Parent tableViewParent=FXMLLoader.load(getClass().getResource("atelier/AtelierInter.fxml"));
		Scene tableViewScene =new  Scene(tableViewParent);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setScene(tableViewScene);
		window.show();
	}
	
	public void RetourExo(ActionEvent event) throws IOException{
		
		Parent tableViewParent=FXMLLoader.load(getClass().getResource("atelier/AtelierFacile.fxml"));
		Scene tableViewScene =new  Scene(tableViewParent);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		window.setTitle("Exercises");
		
		window.setScene(tableViewScene);
		window.show();
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
	public void LienExoIntermediaireLeçon(ActionEvent event) throws IOException{
		
		Parent tableViewParent=FXMLLoader.load(getClass().getResource("atelier/AtelierInterNombreLecon.fxml"));
		Scene tableViewScene =new  Scene(tableViewParent);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		
		window.setScene(tableViewScene);
		window.show();
	}
	
	public void RetourExoIntermediaire(ActionEvent event) throws IOException{
		
		Parent tableViewParent=FXMLLoader.load(getClass().getResource("atelier/AtelierInter.fxml"));
		Scene tableViewScene =new  Scene(tableViewParent);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
	
		
		window.setScene(tableViewScene);
		window.show();
	}
	public void LienExoApplicationIntermdiaire(ActionEvent event) throws IOException{
		
		Parent tableViewParent=FXMLLoader.load(getClass().getResource("atelier/AtelierInterNombreExo.fxml"));
		Scene tableViewScene =new  Scene(tableViewParent);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

		
		window.setScene(tableViewScene);
		window.show();
	}
	public void LienExoConfirme(ActionEvent event) throws IOException{
		
		Parent tableViewParent=FXMLLoader.load(getClass().getResource("atelier/AtelierConf.fxml"));
		Scene tableViewScene =new  Scene(tableViewParent);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

		
		window.setScene(tableViewScene);
		window.show();
	}
	public void LienExoConfirmeLecon(ActionEvent event) throws IOException{
		boolean sauteLecon = false;
		
		
		Scene scene = ((Node)event.getSource()).getScene();
		Node n = scene.lookup("#Yolow");
		if(n instanceof RadioButton){
			RadioButton btn = (RadioButton) n;
			sauteLecon = btn.isSelected();
		}
		
		String page;
		if(sauteLecon){
			page = "atelier/AtelierConfNombreExo.fxml";
		} else {
			page = "atelier/AtelierConfNombreLecon.fxml";
		}
		Parent tableViewParent=FXMLLoader.load(getClass().getResource(page));
		Scene tableViewScene =new  Scene(tableViewParent);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

		
		window.setScene(tableViewScene);
		window.show();
	}
	public void LienExoConfirmeApplication(ActionEvent event) throws IOException{
		
		Parent tableViewParent=FXMLLoader.load(getClass().getResource("atelier/AtelierConfNombreExo.fxml"));
		Scene tableViewScene =new  Scene(tableViewParent);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		
		window.setScene(tableViewScene);
		window.show();
	}
	public void RetourExoConfirme(ActionEvent event) throws IOException{
		
		Parent tableViewParent=FXMLLoader.load(getClass().getResource("atelier/AtelierConf.fxml"));
		Scene tableViewScene =new  Scene(tableViewParent);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		
		window.setScene(tableViewScene);
		window.show();
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
}