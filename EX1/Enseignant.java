package EX1;


/**
 * @author Karim ElHou
 *
 */
public class Enseignant extends Personne {
	private String specialite;
	private static int nbEnseignants = 0;

	/**
	 * @param nom
	 * @param prenom
	 * @param rue
	 * @param ville
	 * @param specialite
	 */
	Enseignant(String nom, String prenom, String rue, String ville, String specialite) {
		super(nom, prenom, rue, ville);
		this.specialite = specialite;
		nbEnseignants++;
	}

	public String toString() {
		return super.toString() + "\n spécialité : " + specialite;
	}

	void ecrirePersonne() {
		System.out.println("Enseignant : " + toString());
	}

	static int nbEnseignants() {
		return nbEnseignants;
	}
}
