package InterfaceGraphiques;

public class FabriqueComposantWindows implements FabriqueComposant{
    @Override
    public Bouton creeBouton(String couleur, int largeur, int hauteur) {
        return new BoutonWindows(couleur,largeur,hauteur);
    }

    @Override
    public Menu creeMenu(String couleur, int largeur) {
        return new MenuWindows(couleur,largeur);
    }

    @Override
    public BarreDefilement BarreDefilement(String couleur, int hauteur) {
        return new BarreDefilementWindows(couleur,hauteur);
    }
}
