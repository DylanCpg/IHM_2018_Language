package application.view.atelier;

import java.net.URL;

public class ControllerAtelierConf extends ControllerAtelierLecon {
	@Override
	protected URL determinerPageExo(int numLecon, boolean skipLecon) {
		switch (numLecon){
			case 1: {
				if(skipLecon){
					return ControllerAtelierConf.class.getResource("AtelierConfNombreExo.fxml");
				}else{
					return ControllerAtelierConf.class.getResource("AtelierConfNombreLecon.fxml");
				}
			}
			default:{
				throw new UnsupportedOperationException("La leçon/Application demandé n'est pas disponible");
			}
		}
	}
}
