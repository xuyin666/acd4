package InterfaceGraphiques;

public class MenuWindows extends Menu{
    public MenuWindows(String couleur, int largeur){
        super(couleur,largeur);
    }

    @Override
    public void afficheCarateristiques(){
        System.out.println("Menu de Windows de couleur: "+couleur+" de largeur: "+largeur);
    }
}
