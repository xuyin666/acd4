package exe1;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class MainSimulation {
    public static void main(String[] args) {
    	FabriqueIntersection fi=new FabriqueIntersection();
    	Simulateur sm=new Simulateur(fi);
    	sm.genererStats();
    	sm.EcrireStats();
    	sm.DessinerStats();
    }
}
