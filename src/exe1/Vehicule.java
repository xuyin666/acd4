package exe1;

public abstract class Vehicule {
    protected double vitesse;
    protected double vitesseMax;
    protected String type;
    
    public Vehicule(double vitesseMax, String type) {
    	this.vitesseMax=vitesseMax;
    	this.type=type;
    }
    
    public double getVitesse() {
    	return this.vitesse;
    }
    
    public String getType() {
    	return this.type;
    }
    
    public void accelerer(double v) {
    	if(this.vitesse+v>this.vitesseMax)
    		this.vitesse=this.vitesseMax;
    	else
    		this.vitesse=this.vitesse+v;
    }
    
    public void decelerer(double v) {
    	if(this.vitesse-v<0)
    		this.vitesse=0;
    	else
    		this.vitesse=this.vitesse-v;
    }
    
}
