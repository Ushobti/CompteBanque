package Banque;

public class LivretA extends Compte {
	
	public LivretA() {
		// TODO Auto-generated constructor stub
		super();
	}
	
	@Override
	public float retirer(float somme) {
		
		if ((this.Solde > 0) && (this.Solde >= somme)) {
			Solde -= somme;
			return somme;
		}
		else {
			somme = Solde;
			Solde = (float) 0.0;
			return somme;
		}		
	}
	
	
}
