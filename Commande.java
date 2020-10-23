package ex2;

public class Commande {

	public void add(Produit add_prd)
	{
		this.add(add_prd);
	}
	
	public void retire(Produit ret_prd)
	{
		this.retire(ret_prd);
	}
	
	public void efface()
	{
		
	}
	
	
private StateCommande etatCommande;
	
    public void setState(StateCommande newState) {
        this.etatCommande = newState;
    }

    public void action() {
    	etatCommande.action(this);
    }


}