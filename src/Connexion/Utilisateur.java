package Connexion;

import Connexion.Connexion;

public class Utilisateur {
    public static void main(String[] args){
        SGBD sgbd;
        Connexion connexion;

        sgbd=new SGBDMySQL();
        connexion=sgbd.creeConnexion("admin","oracle");
        connexion.getDescription();

        sgbd=new SGBDOracle();
        connexion=sgbd.creeConnexion("root@localhost","mysql");
        connexion.getDescription();

    }

}
