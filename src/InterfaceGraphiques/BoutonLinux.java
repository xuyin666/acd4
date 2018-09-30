package InterfaceGraphiques;

public class BoutonLinux extends Bouton{
    public BoutonLinux(String couleur, int largeur, int hauteur){
        super(couleur,largeur,hauteur);
    }

    @Override
    public void afficheCarateristiques(){
        System.out.println("Bouton de Linux de couleur: "+couleur+" de largeur: "+largeur+" de hauteur: "+hauteur);
    }
}
