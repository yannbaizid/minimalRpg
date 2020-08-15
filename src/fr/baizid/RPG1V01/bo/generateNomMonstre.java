package fr.baizid.RPG1V01.bo;

public class generateNomMonstre {
	String[] noms= {"Gorki","Marduk","Zemmour","Ramutcho","Groku","Paulo","Günter","Trouloulou","Maxime-andré","Bertrand","Ramoufle","Ramuntcho","Marcello Vomitroiani","Johnny Hallyday","Kev'","Baragorn","Mortädell","Barbitürik","Egghead"};
	String[] types= {" le Courageux","le Troll","le félon","le Péruvien","l'ogre","l'alcoloo violent","le terroriste","le premier de classe","le zombie","le rat","le squelette","le fieffé connard","l'anus de satan","le croissant à la merde","la tartine de lait ribot","le mort vivant","le petit con"};
	
	public generateNomMonstre() {
		// TODO Auto-generated constructor stub
	}
	public String getNom() {
		return noms[(int)(Math.random()*noms.length)];
	}
	
	public String getType() {
		return types[(int)(Math.random()*types.length)];
	}

}
