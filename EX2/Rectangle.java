package EX2;
/**
 * @author Karim ElHou
 *
 */
public class Rectangle extends ObjetGraphique {
	protected double largeur;
	protected double hauteur;

	public Rectangle() {
		largeur = 0;
		hauteur = 0;
	}

	public Rectangle(int x, int y, double largeur, double hauteur) {
		super(x, y);
		this.largeur = largeur;
		this.hauteur = hauteur;
	}

	public Rectangle(Rectangle rectangle) {
		x = rectangle.x;
		y = rectangle.y;
		largeur = rectangle.largeur;
		hauteur = rectangle.hauteur;
	}

	public double getHauteur() {
		return hauteur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setTaille(double largeur, double hauteur) {
		this.largeur = largeur;
		this.hauteur = hauteur;
	}

	public void afficher() {
		System.out.println("Ce rectangle de largeur : " + getLargeur() + " et d'hauteur : " + getHauteur()
				+ ", se trouve a la position : " + super.getX() + " , " + super.getY());
	}
}