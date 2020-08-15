package fr.baizid.RPG1V01.bo;

public class Dice {
	int nbreFace;
	
	public Dice() {
		this(6);
	}

	public Dice(int nbreFace) {
		setNbreFace(nbreFace);
	}

	public int getNbreFace() {
		return nbreFace;
	}

	public void setNbreFace(int nbreFace) {
		this.nbreFace = nbreFace;
	}
	
	public int roll() {
		return (int)(Math.random()*nbreFace)+1;
	}
	
	public Monstre generateMonstreAleatoire() {
		if (new Dice(2).roll()==1) {
			return new MonstreFacile();
		}
		else {
			return new MonstreDifficile();
		}
	}
}
