package EX2;

public class Test {
	public static void main(String[] args) {
		ObjetGraphique[] Objets = new ObjetGraphique[4];
		Objets[0] = new Cercle(2, 3, 7.23);
		Objets[1] = new Rectangle(1, 4, 2, 4);
		Objets[2] = new Rectangle(2, 4, 4, 6);
		Objets[3] = new Bouton(1, 4, 2, 4, "test");

		for (ObjetGraphique i : Objets) {
			i.afficher();
		}
	}
}
