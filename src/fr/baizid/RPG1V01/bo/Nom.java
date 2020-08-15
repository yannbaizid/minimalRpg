package fr.baizid.RPG1V01.bo;

public  class Nom {
	String nom;
	String type;
	
	public Nom() {
		this("john","doe");
	}

	public Nom(String nom, String type) {
		super();
		setType(type);
		setNom(nom);
		this.type = type;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return getNom() + " " + getType();
	}
	

}
