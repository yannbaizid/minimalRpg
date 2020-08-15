package fr.baizid.RPG1V01;

import java.util.Scanner;

import fr.baizid.RPG1V01.bo.*;

public class Launcher {
	public static Scanner sc = new Scanner(System.in);
	public static Dice de6 = new Dice();
	public static int xpTotal = 0;

	public static void main(String[] args) {
		Joueur joueur = inistialisationJoueur();
		
		System.out.println("A quel mode de jeu veux tu jouer?");
		int choixMode=0;
		do {
			
			System.out.println("1) Mode normal");
			System.out.println("2) Affronter Boss");
			try {
				choixMode=new Scanner(System.in).nextInt();
				
			}catch (Exception e) {
				
			}
			
		} while (choixMode!=1 && choixMode!=2);
		
		if (choixMode==1) {
			modeDeJeuNormal(joueur);			
		}
		else {
			modeDeJeuBoss(joueur);
		}


	}

	private static void modeDeJeuBoss(Joueur joueur) {
		
		
	}

	private static void modeDeJeuNormal(Joueur joueur) {
		// tour de jeu:
		do {
			Monstre monstre = de6.generateMonstreAleatoire();
			presentationMonstre(monstre);
			affronteMonstre(monstre, joueur);
			recompenseVictoire( joueur, monstre);

		} while (joueur.isAlive());

		showScore(joueur);
	}

	private static void presentationMonstre(Monstre monstre) {
		System.out.print("********\nNouvel ennemi!!! ");
		if (monstre instanceof MonstreDifficile) {
			System.out.println("Pas de chance, tu rencontre un monstre difficile!!!");
		}
		System.out.println(monstre);
		sc.nextLine();
	}

	private static void showScore(Joueur joueur) {
		System.out.println("Oh non! Tu es mort!");
		System.out.print(
				"Avant de succomber, tu as tué :" + MonstreFacile.getNbreMonstreFacileTue() + " monstres faciles");
		System.out.println(" et" + MonstreDifficile.getNbreMonsteDifficileTue() + " monstres difficiles.");
		System.out.println("Ca te fait :" + joueur.getXp() + "points.");
		System.out.println("autant dire que ce n'est pas ça qui va payer la pierre tombale.");
	}

	private static void recompenseVictoire(Joueur joueur, Monstre monstre) {
		if (joueur.isAlive()) {
			joueur.setXp(joueur.getXp() + monstre.getXpReward());
		}
	}

	private static Joueur affronteMonstre(Monstre monstre, Joueur joueur) {
		do {
			System.out.println(joueur.getNom().getNom()+" attaque!");
			joueur.attaquer(monstre);
			sc.nextLine();
			if (monstre.isAlive()) {
				System.out.println(monstre.getNom().getNom()+" attaque!");
				monstre.attaquer(joueur);
				sc.nextLine();
			}

		} while (monstre.isAlive() && joueur.isAlive());
		return joueur;
	}

	private static Joueur inistialisationJoueur() {
		int pvJoueur = 150;
		int degatJoueur = 10;
		System.out.println("Bonjour héro! Ça biche?\nComment t'appelles tu?");
		Joueur joueur = new Joueur(sc.nextLine(), pvJoueur, degatJoueur);
		System.out.println("Tu es:" + joueur);
		System.out.println("quelle belle journée pour aller tuer du monstre, " + joueur.getNom().getNom() + "!");
		sc.nextLine();
		return joueur;
	}

}
