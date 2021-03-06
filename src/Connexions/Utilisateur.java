package Connexions;

import Connexions.Connexion;
import Connexions.SGBD;
import Connexions.SGBDMySQL;
import Connexions.SGBDOracle;

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
