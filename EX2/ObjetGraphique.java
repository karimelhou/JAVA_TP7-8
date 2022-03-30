package EX2;

/**
 * @author Karim ElHou
 *
 */
abstract public class ObjetGraphique {
	protected int x;
	protected int y;

	public ObjetGraphique() {
		x = 0;
		y = 0;
	}

	public ObjetGraphique(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public ObjetGraphique(ObjetGraphique objet) {
		x = objet.x;
		y = objet.y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void deplacer(int a, int b) {
		x += a;
		y += b;
	}

	abstract public void afficher();
}