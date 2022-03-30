package EX2;
/**
 * @author Karim ElHou
 *
 */
public class Cercle extends ObjetGraphique {
	private double rayon;

	public Cercle() {
		super();
		this.rayon = 0;
	}

	public Cercle(int x, int y, double rayon) {
		super(x, y);
		this.rayon = rayon;
	}

	public Cercle(Cercle cercle) {
		x = cercle.x;
		y = cercle.y;
		rayon = cercle.rayon;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	public void afficher() {
		System.out.println("Ce Cercle de rayon : " + getRayon() + ", se trouve a la position : " + super.getX() + " , "
				+ super.getY());

	}
}
