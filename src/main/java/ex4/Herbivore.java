package ex4;

/**
 * @author ETY5
 *
 */
public class Herbivore extends Comportement {

	/*
	 * (non-Javadoc)
	 * 
	 * @see ex4.Comportement#manger()
	 */
	@Override
	public void manger() {
		System.out.println("Manger des végétaux !");
	}

	/**
	 * Constructeur des herbivores
	 */
	public Herbivore() {
		this.nom = "Herbivore";
	}

}
