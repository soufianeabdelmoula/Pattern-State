package ex2;

public interface StateCommande {
	 void action(Commande context);
	 
	 public default void add(Produit add_prd)
		{
			this.add(add_prd);
		}
		
		public default void retire(Produit ret_prd)
		{
			this.retire(ret_prd);
		}
		
		public default void efface()
		{
			
		}
		
}
