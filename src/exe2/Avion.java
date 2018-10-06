package exe2;

public class Avion extends Thread{
	private String nom;
	private Aeroport a;
	public Avion(String s){
	    nom=s;
	}
	public void run(){
		a=Aeroport.getInstance();
        try{
    	    Thread.sleep((int)(Math.random()*500));
        }
        catch(Exception e){}
		while(!a.autoriserAdecoller()) {
            try{
        	    Thread.sleep((int)(Math.random()*1200));
            }
            catch(Exception e){}
        }
        System.out.println("Je suis avion "+nom+" "
    			+ "sur aeroport "+a);
        a.decoller();
        try{
    	    Thread.sleep(500);
        }
        catch(Exception e){}
        System.out.println("l'avion "+nom+" decolle");
        a.liberer_piste();
       
	}

}
