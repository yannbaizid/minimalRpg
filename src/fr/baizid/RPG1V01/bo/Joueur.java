package fr.baizid.RPG1V01.bo;

public class Joueur extends EtreVivant {
	
	private int xp;
	
	public Joueur() {
		this("Mighty Max");
	}

	public Joueur(String nom) {
		this(nom, 150);
	}

	public Joueur(String nom, int pv) {
		this(nom, pv, 10);
	}

	public Joueur(String nom, int pv, int degat) {
		super(new Nom(nom, "le héros"), pv, degat);
		setXp(0);
	}

	public int getXp() {
		return xp;
	}

	public void setXp(int xp) {
		this.xp = xp;
	}


	@Override
	public void attaquer(EtreVivant ennemi) {
		Dice de=new Dice(6);
		if (de.roll()>=de.roll()) {
			ennemi.subitDegats(this.getDegat());
		}
		else {
		}

	}
	
	public boolean defendre() {
		Dice de6=new Dice(6);
		if (de6.roll()>2) {
			return false;
		}
		else {
			return true;
		}
	}
	
}
