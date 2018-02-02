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
	
	@Override
	public float virer(float somme, Compte compteDestination) {
		this.retirer(somme);
		compteDestination.deposer(somme);
		return somme;		
	}
	
	public static void main(String[] args) {
		LivretA LivretA1 = new LivretA();
		LivretA LivretA2 = new LivretA();
		
		LivretA1.deposer(1000);
		LivretA2.retirer(200);
		
		System.out.println(LivretA2);
		System.out.println(LivretA1);
		
		LivretA1.virer(300,LivretA2);		

		System.out.println(LivretA2);
		System.out.println(LivretA1);
		
		System.out.println(LivretA2.retirer(400));
		
		System.out.println(LivretA2);
	}
	
}
