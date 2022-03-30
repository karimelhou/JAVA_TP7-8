package EX2;

public class Test2 {
	public static void main(String[] args) {
		ListeObjetGraphique L = new ListeObjetGraphique(4);
		L.ajouter(new Cercle(2, 3, 7.23));
		L.ajouter(new Rectangle(1, 4, 2, 4));
		L.ajouter(new Rectangle(2, 4, 4, 6));
		L.ajouter(new Bouton(1, 4, 2, 4, "test"));
		L.afficheObjetsGraphique();
	}
}
