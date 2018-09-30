package InterfaceGraphiques;

public class BarreDefilementWindows extends BarreDefilement{
    public BarreDefilementWindows(String couleur, int hauteur){
        super(couleur,hauteur);
    }

    @Override
    public void afficheCarateristiques() {
        System.out.println("BarreDefilement de Windows de couleur: "+couleur+" hauteur: "+hauteur);
    }
}
