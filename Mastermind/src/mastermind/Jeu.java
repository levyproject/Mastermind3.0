package mastermind;

public class Jeu {
	
	
	public Jeu () {
	}
	
	public static void main(String[] args) {
		Combinaison c = new Combinaison();
		Deroulement d = new Deroulement();
		c.init_combinaison();
		d.lancementPartie();
		
		

	}
}
