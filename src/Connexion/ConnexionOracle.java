package Connexion;

import Connexion.Connexion;

public class ConnexionOracle extends Connexion {
    public ConnexionOracle(String util,String mdp){
        super(util,mdp);
    }

    public void getDescription(){
        System.out.println(utilisateur+" est en train de se connecter!");
    }
}
