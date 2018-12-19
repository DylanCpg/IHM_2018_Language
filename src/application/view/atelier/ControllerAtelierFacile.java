package application.view.atelier;

import java.net.URL;

public class ControllerAtelierFacile extends ControllerChoixLecon {
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
				throw new UnsupportedOperationException("La lecon demandé n'est pas encore implémenté");
			}
		}
	}
}
