package InterfaceGraphiques;

public class BoutonWindows extends Bouton {
    public BoutonWindows(String couleur, int largeur, int hauteur){
        super(couleur,largeur,hauteur);
    }

    @Override
    public void afficheCarateristiques(){
        System.out.println("Bouton de Windows de couleur "+couleur+" de largeur: "+largeur+" de hauteur: "+hauteur);
    }
}
