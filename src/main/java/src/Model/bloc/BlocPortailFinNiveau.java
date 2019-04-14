package Model.bloc;

import Utils.helper.ResourcesPaths;
import Model.jeu.Coordonnees;

public class BlocPortailFinNiveau extends Bloc {
	
	public BlocPortailFinNiveau(Coordonnees position) {
		super(position, ResourcesPaths.ANIM_BLOCK_PORTAL_PATH + "bloc_portail1.png");
		this.setConcret(false);
		//this.getSprite().playSequence(Images.gate, true);
	}

	@Override
	public void destruction() {
            /* rien pour l'instant */
	}

}