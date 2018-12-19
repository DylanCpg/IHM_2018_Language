package application.view.atelier;

import java.net.URL;

public class ControllerAtelierInter extends ControllerChoixLecon {
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
				throw new UnsupportedOperationException("Seul les lecon 2 et 3 sont implémenté");
			}
		}
	}
}
