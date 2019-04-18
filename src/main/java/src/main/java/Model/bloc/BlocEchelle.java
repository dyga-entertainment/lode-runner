package Model.bloc;

import Utils.helper.ResourcesPaths;
import Model.jeu.Coordonnees;

public class BlocEchelle extends Bloc {
	
    public BlocEchelle(Coordonnees position){
        super(position, ResourcesPaths.SPRITE_BLOCS_PATH + "bloc_echelle.png");
        this.setConcret(false);
    }
	
    /* Ne se reconstruit jamais */
    public void reconstruction(){ }

}