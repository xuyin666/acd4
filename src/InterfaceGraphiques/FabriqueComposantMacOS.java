package InterfaceGraphiques;

public class FabriqueComposantMacOS implements FabriqueComposant {
    @Override
    public Bouton creeBouton(String couleur, int largeur, int hauteur) {
        return new BoutonMacOS(couleur,largeur,hauteur);
    }

    @Override
    public Menu creeMenu(String couleur, int largeur) {
        return new MenuMacOS(couleur,largeur);
    }

    @Override
    public BarreDefilement BarreDefilement(String couleur, int hauteur) {
        return new BarreDefilementMacOS(couleur,hauteur);
    }
}
