package InterfaceGraphiques;

public class MenuLinux extends Menu {
    public MenuLinux(String couleur, int largeur){
        super(couleur,largeur);
    }

    @Override
    public void afficheCarateristiques(){
        System.out.println("Menu de Linux de couleur: "+couleur+" de largeur: "+largeur);
    }
}
