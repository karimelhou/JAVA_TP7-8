package EX1;
/**
 * @author Karim ElHou
 *
 */
public class Secretaire extends Personne {
	private String numeroBureau;
	private static int nbSecretaires = 0;

	Secretaire(String nom, String prenom, String rue, String ville, String numeroBureau) {
		super(nom, prenom, rue, ville);
		this.numeroBureau = numeroBureau;
		nbSecretaires++;
	}

	public String toString() {
		return super.toString() + "\n Numero Bureau : " + numeroBureau;
	}

	void ecrirePersonne() {
		System.out.println("Secrétaire : " + toString());
	}

	static int nbSecretaires() {
		return nbSecretaires;
	}
}
