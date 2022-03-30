package EX1;

public class TestPersonne 
{
	public static void main(String[] args) 
	{
		Secretaire s = new Secretaire ("faouziya", "bakal","Rue n21", "Tanger", "ET12");
		s.ecrirePersonne();

		Enseignant e = new Enseignant ("Omar", "samil", "Rue Infra", "Rabat", "Computer Science");
		e.ecrirePersonne();

		Etudiant e1 = new Etudiant ("Sara", "Pumpkin","Rue Ottawa", "Paris", "licence Art App");
		e1.ecrirePersonne();
		
		Etudiant e2 = new Etudiant ("Jamal", "samsu","Rue orange'", "Rabat", "Phd Machine learning");
		e2.ecrirePersonne();
		
		System.out.println ("\n\n******************");
		System.out.println ("Informations after edit :");
		e.modifierPersonne ("rue de Buroche", "Montoire sur le loir");
		s.modifierPersonne ("rue des ponts", "Nice");

		Personne.nbPersonnes();
	}
    
}
