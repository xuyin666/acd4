public abstract class Connexion  {
    protected String utilisateur;
    protected String motdepass;

    public Connexion(String utilisateur, String motdepass){
        this.utilisateur=utilisateur;
        this.motdepass=motdepass;
    }

    public abstract void getDescription();

}
