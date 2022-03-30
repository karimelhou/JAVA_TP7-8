package EX3;

public class Interfaces {
	public static void main(String[] args) {
		Magasin Magasin = new Magasin();

		Magasin.Ae[0] = new ArticleElectromenager(5000, 2300, "PS5", "Sony");
		Magasin.Ae[1] = new ArticleElectromenager(6030, 2130, "TV", "Samsung");
		Magasin.Ap[0] = new ArticlePrimeur(602, 800, "Neve", "Ukraine");
		Magasin.Ap[1] = new ArticlePrimeur(20, 100, "Tendg", "PAUL");

		for (int i = 0; i < Magasin.choixE; i++)
			Magasin.Depense += Magasin.Ae[i].RemplirStock(50);
		for (int i = 0; i < Magasin.choixP; i++)
			Magasin.Depense += Magasin.Ap[i].RemplirStock(100);

		Magasin.info();
		try {
			System.in.read();
		} catch (java.io.IOException e) {
		}
	}
}
