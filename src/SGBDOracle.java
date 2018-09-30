public class SGBDOracle extends SGBD{
    @Override
    protected Connexion creeConnexion(String util, String mdp){
        return new ConnexionOracle(util,mdp);
    }
}
