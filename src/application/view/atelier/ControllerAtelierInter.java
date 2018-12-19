package application.view.atelier;

import java.net.URL;

public class ControllerAtelierInter extends ControllerAtelierLecon {
	@Override
	protected URL determinerPageExo(int numLecon, boolean skipLecon) {
		switch (numLecon){
			case 1: {
				if(skipLecon){
					return ControllerAtelierInter.class.getResource("AtelierInterNombreExo.fxml");
				}else{
					return ControllerAtelierInter.class.getResource("AtelierInterNombreLecon.fxml");
				}
			}
			default:{
				throw new UnsupportedOperationException("La leçon/Application demandé n'est pas disponible");
			}
		}
	}
}
