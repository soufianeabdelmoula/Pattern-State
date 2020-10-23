package ex2;

public class CommandeLivree implements StateCommande{

	@Override
	public void action(Commande context) {
		// TODO Auto-generated method stub
		System.out.println("La Commande est Livrée");
	}

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
	
}
