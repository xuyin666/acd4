package exe1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class Simulateur {
	int vo=0;
  	int by=0;
   	int bu=0;
   	int pi=0;
	private FabriqueIntersection fi;
	HashMap<String,Integer> hm=new HashMap<String, Integer>();
	
    public Simulateur(FabriqueIntersection fi) {
    	this.fi=fi;
    } 
    
    public HashMap<String,Integer> genererStats(){

    	for(int i=0;i<=99;i++) {
    		Vehicule vi=fi.creerVehicule();
    	    if(vi.getType().equals("Voiture"))
    	    	vo++;
    	    else if(vi.getType().equals("Bicyclette"))
    	    	by++;
    	    else if(vi.getType().equals("Bus"))
    	    	bu++;
    	    else if(vi.getType().equals("Pieton"))
    	    	pi++;
    	}
    	hm.put("Voiture", vo);
    	hm.put("Bicyclette", by);
    	hm.put("Bus", bu);
    	hm.put("Pieton", pi);
		return hm;
    }
    
    public void EcrireStats() {
    	Set set=hm.entrySet();
    	Iterator iterator = set.iterator();
    	for(String s: hm.keySet() )
    		System.out.println(s+" "+hm.get(s));
    }
    
    public void DessinerStats() {
    	EventQueue.invokeLater(new Runnable() { 
			public void run() { 
				FrameSquelette f = new FrameSquelette("TP2");
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f.setSize(500,500);
				f.pack();
				f.setVisible(true);  
			}
		 }); 
    }
    
	class FrameSquelette extends JFrame {
		private Pan panneau;
		
		public FrameSquelette(String titre){
			super(titre);
			setPreferredSize(new Dimension(500,500));
            panneau=new Pan(vo,by,bu,pi);
            this.add(panneau);
		
		}
    }
	
	class Pan extends JPanel{
	    int vo;
		int by;
		int bu;
		int pi;
		
		public Pan(int vo, int by,int bu,int pi) {
	   		this.vo=vo*5;
	   		this.by=by*5;
	   		this.bu=bu*5;
	   		this.pi=pi*5;
		}
		

	    public void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        setBackground(Color.BLACK);
	        g.setColor(Color.BLUE);
	        g.fillRect(0, 0, vo, 500);
	        g.setColor(Color.WHITE);
	        g.fillRect(vo, 0,by,500);
	        g.setColor(Color.RED);
	        g.fillRect(vo+by, 0, bu, 500);
	        g.setColor(Color.GREEN);
	        g.fillRect(vo+by+bu, 0, pi, 500);
	    }
	}
}
