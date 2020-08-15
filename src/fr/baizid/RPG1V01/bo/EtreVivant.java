package fr.baizid.RPG1V01.bo;

public abstract class EtreVivant {
	protected Nom nom;
	protected int pv;
	protected int degat;
	protected final int pvMax;
	
	/**
	 * parametres possibles:
	 * 1)Nom nom
	 * 2)int pv
	 */ 
	public EtreVivant() {
		this(1);
		}
	
	public EtreVivant(int pvMax) {
		this(new Nom(),pvMax);
	}
	
	public EtreVivant(Nom nom,int pvMax) {
		this(nom,pvMax,10);
	}
	public EtreVivant (Nom nom, int pvMax, int degat) {
		this.pvMax=pvMax;
		setPv(pvMax);
		setNom(nom);
		setDegat(degat);
	}
	
	
	public int getPvMax() {
		return pvMax;
	}

	public Nom getNom() {
		return nom;
	}

	public void setNom(Nom nom) {
		this.nom = nom;
	}

	public int getPv() {
		return pv;
	}
	public void setPv(int pv) {
		this.pv = pv;
		if (pv<=0) {
			this.pv=0;
		}
	}
	public boolean isAlive() {
		if (this.pv<=0) {
			return false;
		}
		else {
			return true;
		}
	}
	public int getDegat() {
		return degat;
	}

	public void setDegat(int degat) {
		this.degat = degat;
	}

	@Override
	public String toString() {
		return nom+ ", pv=" + pv+", dégat="+degat;
	}
	public abstract void attaquer(EtreVivant ennemi)	;
	
	public void subitDegats(int degat) {
		setPv(this.pv-degat);
		System.out.println(this.getNom()+" est touché! il subit: "+degat+" dégats et il lui reste :"+this.pv+" pv");
	}
	public abstract boolean defendre();
	

}
