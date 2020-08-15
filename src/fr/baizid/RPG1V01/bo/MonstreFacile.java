package fr.baizid.RPG1V01.bo;

public class MonstreFacile extends Monstre {
	public static int nbreMonstreFacileTue=0;
	
	public MonstreFacile() {
		super(1,1);;
	}
	
	@Override
	public boolean isAlive() {
		if(!super.isAlive()) {
			setNbreMonstreFacileTue(getNbreMonstreFacileTue()+1);
		}
		return super.isAlive();
	}

	public static int getNbreMonstreFacileTue() {
		return nbreMonstreFacileTue;
	}

	public static void setNbreMonstreFacileTue(int nbreMonstreFacileTue) {
		MonstreFacile.nbreMonstreFacileTue = nbreMonstreFacileTue;
	}
	
}
