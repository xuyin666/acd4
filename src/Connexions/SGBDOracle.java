package Connexions;

import Connexions.Connexion;
import Connexions.ConnexionOracle;
import Connexions.SGBD;

public class SGBDOracle extends SGBD {
    @Override
    protected Connexion creeConnexion(String util, String mdp){
        return new ConnexionOracle(util,mdp);
    }
}
