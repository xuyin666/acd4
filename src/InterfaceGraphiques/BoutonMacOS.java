package InterfaceGraphiques;

public class BoutonMacOS extends Bouton{
    public BoutonMacOS(String couleur, int largeur, int hauteur){
        super(couleur,largeur,hauteur);
    }

    @Override
    public void afficheCarateristiques(){
        System.out.println("Bouton de MacOS de couleur "+couleur+" de largeur: "+largeur+" de hauteur: "+hauteur);
    }
}
