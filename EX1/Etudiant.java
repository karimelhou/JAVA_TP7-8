package EX1;

/**
 * @author Karim ElHou
 *
 */
public class Etudiant extends Personne {
	private String diplomeEnCours;
	private static int nbEtudiants = 0;

	Etudiant(String nom, String prenom, String rue, String ville, String diplomeEnCours) {
		super(nom, prenom, rue, ville);
		this.diplomeEnCours = diplomeEnCours;
		nbEtudiants++;
	}

	public String toString() {
		return super.toString() + "\n Diplome en cours : " + diplomeEnCours;
	}

	void ecrirePersonne() {
		System.out.println("Etudiant : " + toString());
	}

	public String diplomeEnCours() {
		return diplomeEnCours;
	}

	static int nbEtudiants() {
		return nbEtudiants;
	}
}
