package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Mainapp extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Mainapp.class.getResource("view/Accueil.fxml"));
            AnchorPane rootLayout = loader.load();
            
			Scene scene = new Scene(rootLayout,900,600);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Accueil");
			primaryStage.setResizable(false);
			primaryStage.show();
			/*Button but = (Button) scene.lookup("Button");  // cherche un bouton
			if(but != null) {  // si le bouton est trouvé
				but.setOnAction(new EventHandler<ActionEvent>() {
					
					@Override
					public void handle(ActionEvent event) { // récuper la valeur 
						loader.setLocation(Mainapp.class.getResource("view/AtelierFacileNombreExo.fxml"));
						
					}
				});
			}*/
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
