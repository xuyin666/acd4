package exe1;

public class FabriquePieton implements FabriqueVehicule {
    Pieton p1;
    
	@Override
	public Vehicule creerVehicule() {
		// TODO Auto-generated method stub
		p1=new Pieton();
		return p1;
	}

}
