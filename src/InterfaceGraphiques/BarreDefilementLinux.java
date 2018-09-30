package InterfaceGraphiques;

public class BarreDefilementLinux extends BarreDefilement{
    public BarreDefilementLinux(String couleur, int hauteur){
        super(couleur,hauteur);
    }

    @Override
    public void afficheCarateristiques() {
        System.out.println("BarreDefilement de Linux de couleur: "+couleur+" hauteur: "+hauteur);
    }
}
