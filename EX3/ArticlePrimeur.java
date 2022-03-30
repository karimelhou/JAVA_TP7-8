package EX3;

public class ArticlePrimeur extends Article implements VendableKilo {
	public double stock;

	public ArticlePrimeur(double pA, double pV, String n, String f) {
		super(pA, pV, n, f);
		stock = 0.0;
	}

	public double RemplirStock(double qte) {
		stock = stock + qte;
		return prixAchat * qte;
	}

	public void info() {
		super.info();
		System.out.println("Le stock du produit est " + stock + "kilogrammes.");
	}

	public double vendre(double qte) {
		if (qte < stock) {
			stock = stock - qte;
			return qte * prixVente;
		} else {
			System.out.println("Stock insuffisant.");
			return 0;
		}
	}

}
