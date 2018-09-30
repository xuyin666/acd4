package InterfaceGraphiques;

public abstract class Bouton {
    protected String couleur;
    protected int largeur;
    protected int hauteur;

    public Bouton(String couleur, int largeur, int hauteur){
        this.couleur=couleur;
        this.largeur=largeur;
        this.hauteur=hauteur;
    }

    public abstract void afficheCarateristiques();
}
