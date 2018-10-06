package exe1;

public class Test {
    public static void main(String[] args) {
    	Bus b1=new Bus();
    	Bicyclette bic1=new Bicyclette();
    	Voiture v1=new Voiture();
    	Pieton p1=new Pieton();
    	System.out.println(b1.getType());
    	System.out.println(bic1.getType());
    	System.out.println(v1.getType());
    	System.out.println(p1.getType());
    	
    	FabriquePieton fp1=new FabriquePieton(); 
    	Pieton p2=(Pieton)fp1.creerVehicule();
    	System.out.println(p2.getType());
    	
    	FabriqueVoiture fv1=new FabriqueVoiture();
    	Voiture v2=(Voiture)fv1.creerVehicule();
    	System.out.println(v2.getType());
    	System.out.println();
    	
    	FabriqueIntersection fi=new FabriqueIntersection();
    	for(int i=0; i<=100;i++) {
    		Vehicule vi=fi.creerVehicule();
    	    System.out.println(vi.getType());
    	}
    	    
    	
    }
}
