package exe1;

public class FabriqueIntersection {

	private double probaVoiture;
	private double probaBus;
	private double probaByc;
	private double probaPieton;
	
	public FabriqueIntersection() {
		this.probaVoiture=0.8;
		this.probaPieton=0.1;
		this.probaBus=0.05;
		this.probaByc=0.05;
	}
	
	public FabriqueIntersection(double probaVoiture,
			double probaBus, double probaByc, double probaPieton) {
		this.probaVoiture=probaVoiture;
		this.probaBus=probaBus;
		this.probaByc=probaByc;
		this.probaPieton=probaPieton;
	}
	
	public Vehicule creerVehicule() {
		Vehicule v1;
		double pro=Math.random();
		
		if(pro<=probaByc) 
            v1=new Bicyclette();
		else if(pro<=probaByc+probaBus) 
			v1=new Bus();
		else if(pro<=probaByc+probaBus+probaPieton) 
            v1=new Pieton();
		else 
			v1=new Voiture();
		
		return v1;
	
		
	    
		
	} 
	
}
