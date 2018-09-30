package InterfaceGraphiques;

public interface FabriqueComposant {
    Bouton creeBouton(String couleur, int largeur, int hauteur);
    Menu creeMenu(String couleur, int largeur);
    BarreDefilement BarreDefilement(String couleur, int hauteur);
}
