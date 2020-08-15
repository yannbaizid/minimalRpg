package fr.baizid.RPG1V01.bo;

public class Monstre extends EtreVivant {
	protected int xpReward;

	/**
	 * arguments possibles: 1)int pv 2)int xpreward 3)Nom nom
	 */
	public Monstre() {
		this(1, 1);
	}

	/**
	 * 
	 * @param 1) pv
	 * @param 2) xpReward
	 */
	public Monstre(int pv, int xpReward) {
		this(new NomMonstre(), pv, xpReward);
	}

	/**
	 * 
	 * @param pv
	 * @param nom
	 * @param xpReward
	 */
	public Monstre(Nom nom, int pv, int xpReward) {
		super(nom, pv);
		setXpReward(xpReward);
	}

	@Override
	public String toString() {
		return super.toString() + ", XpReward=" + getXpReward();
	}

	public int getXpReward() {
		return xpReward;
	}

	public void setXpReward(int xpReward) {
		this.xpReward = xpReward;
	}

	@Override
	public void attaquer(EtreVivant ennemi) {
		Dice de=new Dice(6);
		if (de.roll() > de.roll() && !ennemi.defendre()) {
			ennemi.subitDegats(this.getDegat());
		} 
	}
	@Override
	public boolean defendre() {
		// TODO Auto-generated method stub
		return false;
	}

}
