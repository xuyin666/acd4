package exe2;

public class Aeroport {
	private boolean piste_libre;
	private volatile static Aeroport instance;
	
	private Aeroport(){
	    piste_libre=true;
	}
    
	public static synchronized Aeroport getInstance() {
		if(instance==null)
		{
			synchronized(Aeroport.class) {
				if(instance==null)
			    instance=new Aeroport();
			}
		}
		return instance;
	}
	
	public synchronized boolean autoriserAdecoller() {
		return piste_libre;
	}
	
	public boolean liberer_piste() {
		piste_libre=true;
		return piste_libre;
	}
	
	public void decoller() {
		piste_libre=false;
	}
}
