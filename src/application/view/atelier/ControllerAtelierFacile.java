package application.view.atelier;

import java.net.URL;

public class ControllerAtelierFacile extends ControllerAtelierLecon {
	@Override
	protected URL determinerPageExo(int numLecon, boolean skipLecon) {
		switch (numLecon){
			case 1: {
				if(skipLecon){
					return ControllerAtelierFacile.class.getResource("AtelierFacileNombreExo.fxml");
				}else{
					return ControllerAtelierFacile.class.getResource("AtelierFacileNombreLecon.fxml");
				}
			}
			default:{
				throw new UnsupportedOperationException("La leçon/Application demandé n'est pas disponible");
			}
		}
	}
}
