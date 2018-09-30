package InterfaceGraphiques;

public class Interface {
    public static void main(String[] args){
        FabriqueComposant fabrique=new FabriqueComposantMacOS();
        Bouton bouton=fabrique.creeBouton("rouge",3,4);
        bouton.afficheCarateristiques();

        fabrique = new FabriqueComposantLinux();
        Menu menu = fabrique.creeMenu("rouge", 7);
        menu.afficheCarateristiques();

    }
}
