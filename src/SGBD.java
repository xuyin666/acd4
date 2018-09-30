import java.util.ArrayList;
import java.util.List;

public abstract class SGBD {

    protected List<Connexion> connexions=new ArrayList<Connexion>();

    protected abstract Connexion creeConnexion(String util, String mdp);

    public Connexion nouvelleConnexion(String util,String mdp){
        Connexion connexion=this.creeConnexion(util,mdp);
        connexions.add(connexion);
        return connexion;
    }



}
