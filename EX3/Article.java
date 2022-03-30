package EX3;

public class Article {
	protected double prixAchat;
	protected double prixVente;
	private String Nom;
	private String Fournisseur;

	public Article(double pA, double pV, String n, String f) {
		prixAchat = pA;
		prixVente = pV;
		Nom = n;
		Fournisseur = f;
	}

	public double rendement() {
		return (prixVente - prixAchat) / prixAchat;
	}

	public void info() {
		System.out.println("Nom du produit:" + Nom);
		System.out.println("Fournisseur: " + Fournisseur);
		System.out.println("Prix d'achat: " + prixAchat);
		System.out.println("Prix de vente: " + prixVente);
	}
}