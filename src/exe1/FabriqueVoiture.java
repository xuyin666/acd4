package exe1;

public class FabriqueVoiture implements FabriqueVehicule{
    Voiture v1;
	
    @Override
	public Vehicule creerVehicule() {
       v1=new Voiture();
       return v1;
	}

}
