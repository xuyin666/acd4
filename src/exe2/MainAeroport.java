package exe2;

public class MainAeroport {
	public static void main(String[] args){
		Avion v1 = new Avion("Avion 1");

		Avion v2 = new Avion("Avion 2");
		Avion v3 = new Avion("Avion 3");
		Avion v4 = new Avion("Avion 4");
		v1.start();
		v2.start();
		v3.start();
		v4.start();
	}

}
