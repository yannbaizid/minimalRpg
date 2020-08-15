package fr.baizid.RPG1V01.bo;

public class NomMonstre extends Nom {	
	
	public NomMonstre() {
		super(new generateNomMonstre().getNom(),new generateNomMonstre().getType());
	}
	

}
