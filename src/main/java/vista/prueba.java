package vista;

public class prueba {

	public static void main(String[] args) {
		Player pepe = new Player();
		Player pepa = new Player();
		Player pipi = pepe;
		
		if(pepe == pepa) System.out.println("pepe/pepa");
		if(pepe == pepe) System.out.println("pepe/pepe");
		if(pepe == pipi) System.out.println("pepe/pipi");
	}

}
