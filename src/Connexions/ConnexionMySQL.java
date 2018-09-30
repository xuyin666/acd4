package Connexions;

import Connexions.Connexion;

public class ConnexionMySQL extends Connexion {
    public ConnexionMySQL(String util,String mdp){
        super(util,mdp);
    }

    @Override
    public void getDescription(){
        System.out.println(utilisateur+" est en train de se connecter");
    }
}
