package fr.baizid.RPG1V01.bo;

public class MonstreDifficile extends Monstre {
	private int degatMagique=5;
	public static int nbreMonsteDifficileTue=0;
	
	public MonstreDifficile() {
		super(1,2);
	}
	
	public int getDegatMagique() {
		return degatMagique;
	}

	public void setDegatMagique(int degatMagique) {
		this.degatMagique = degatMagique;
	}

	public static int getNbreMonsteDifficileTue() {
		return nbreMonsteDifficileTue;
	}

	public static void setNbreMonsteDifficileTue(int nbreMonsteDifficileTue) {
		MonstreDifficile.nbreMonsteDifficileTue = nbreMonsteDifficileTue;
	}

	@Override
	public void attaquer(EtreVivant ennemi) {
		super.attaquer(ennemi);
		this.attaqueMagique(ennemi);
	}

	private void attaqueMagique(EtreVivant ennemi) {
		int lancer=new Dice(6).roll();
		if (lancer<6) {
			System.out.println("Abracadabra!!! attaque magique!");
			ennemi.subitDegats(degatMagique*lancer);
		}
		
		
	}
	
	@Override
	public boolean isAlive() {
		super.isAlive();
		if (!super.isAlive()) {
			setNbreMonsteDifficileTue(getNbreMonsteDifficileTue()+1);
		}
		return super.isAlive();
	}
}
