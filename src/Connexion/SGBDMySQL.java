package Connexion;

import Connexion.Connexion;

public class SGBDMySQL extends SGBD {
    @Override
    protected Connexion creeConnexion(String util, String mdp){
        return new ConnexionMySQL(util,mdp);
    }
}
