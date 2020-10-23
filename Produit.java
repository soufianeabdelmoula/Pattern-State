package ex2;

public class Produit {

	
	public static void main(String args[]){
		Commande cm = new Commande();

		cm.setState(new CommandeEnCours());
		cm.action();
		cm.setState(new CommandeLivree());
		cm.action();
		cm.setState(new CommandeValidee());
		cm.action();
	}
}
