package InterfaceGraphiques;

public class MenuMacOS extends Menu{
    public MenuMacOS(String couleur, int largeur){
        super(couleur,largeur);
    }

    @Override
    public void afficheCarateristiques(){
        System.out.println("Menu de MacOS de couleur: "+couleur+" de largeur: "+largeur);
    }
}
