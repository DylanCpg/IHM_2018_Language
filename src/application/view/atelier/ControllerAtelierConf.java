package application.view.atelier;

import java.net.URL;

public class ControllerAtelierConf extends ControllerChoixLecon {
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
				throw new UnsupportedOperationException("La lecon demandé n'est pas encore implémenté");
			}
		}
	}
}
