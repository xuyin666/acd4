package InterfaceGraphiques;

public class BarreDefilementMacOS extends BarreDefilement{
    public BarreDefilementMacOS(String couleur, int hauteur){
        super(couleur,hauteur);
    }

    @Override
    public void afficheCarateristiques() {
        System.out.println("BarreDefilement de MacOS de couleur: "+couleur+" hauteur: "+hauteur);
    }
}
