package EX1;

/**
 * @author Karim ElHou
 *
 */
abstract class Personne {
	protected String nom;
	protected String prenom;
	protected String rue;
	protected String ville;
	protected static int nbPersonnes = 0;

	Personne(String nom, String prenom, String rue, String ville) {
		this.nom = nom;
		this.prenom = prenom;
		this.rue = rue;
		this.ville = ville;
		nbPersonnes++;
	}

	public String toString() {
		return nom + ", " + prenom + ", " + rue + ", " + ville;
	}

	abstract void ecrirePersonne();

	static void nbPersonnes() {
		System.out.println("\n Nombre d�employ�s : " + nbPersonnes + "\n Nombre de secr�taires : "
				+ Secretaire.nbSecretaires() + "\n Nombred�enseignants : " + Enseignant.nbEnseignants()
				+ "\n Nombre d��tudiants : " + Etudiant.nbEtudiants());
	}

	void modifierPersonne(String rue, String ville) {
		this.rue = rue;
		this.ville = ville;
		ecrirePersonne();
	}
}
