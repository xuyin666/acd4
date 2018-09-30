package InterfaceGraphiques;

public class FabriqueComposantLinux implements FabriqueComposant {
    @Override
    public Bouton creeBouton(String couleur, int largeur, int hauteur) {
        return new BoutonLinux(couleur,largeur,hauteur);
    }

    @Override
    public Menu creeMenu(String couleur, int largeur) {
        return new MenuLinux(couleur,largeur);
    }

    @Override
    public BarreDefilement BarreDefilement(String couleur, int hauteur) {
        return new BarreDefilementLinux(couleur,hauteur);
    }
}
