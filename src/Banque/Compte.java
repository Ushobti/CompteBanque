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
	
	public static void main(String[] args) {
		Compte Compte1 = new Compte();
		Compte Compte2 = new Compte();
		
		Compte1.deposer(1000);
		Compte2.retirer(200);
		
		System.out.println(Compte2);
		System.out.println(Compte1);
		
		Compte1.virer(300,Compte2);		

		System.out.println(Compte2);
		System.out.println(Compte1);

	}

}
