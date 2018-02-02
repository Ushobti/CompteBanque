package Banque;

public class Compte {
	
	private float Solde;
	
	public Compte() {
		// TODO Auto-generated constructor stub
		Solde = (float) 0.0;
	}
	
	public void deposer(float somme) {
		Solde += somme;
	}
	
	public float retirer(float somme) {
		Solde -= somme;
		return Solde ;
	}
	
	public float virer(float somme, Compte compteDestination) {
		this.retirer(somme);
		compteDestination.deposer(somme);
		return somme;
	}
	
	@Override
	public String toString()
	{
		return "« Solde : »" + Solde ;
	}

}
