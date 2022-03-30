package EX2;
/**
 * @author Karim ElHou
 *
 */
public class Bouton extends Rectangle {
	protected String text;

	public Bouton() {
		super();
		this.text = "text";
	}

	public Bouton(int x, int y, double largeur, double hauteur, String text) {
		super(x, y, largeur, hauteur);
		this.text = text;
	}

	public Bouton(Bouton bouton) {
		x = bouton.x;
		y = bouton.y;
		largeur = bouton.largeur;
		hauteur = bouton.hauteur;
		text = bouton.text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void afficher() {
		System.out.println("Ce bouton est " + getText() + " de largeur : " + getLargeur() + " et d'hauteur : "
				+ getHauteur() + ", se trouve a la position : " + super.getX() + " , " + super.getY());
	}

}
