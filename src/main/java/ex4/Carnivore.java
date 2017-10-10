package ex4;

public class Carnivore extends Comportement {

	/*
	 * (non-Javadoc)
	 * 
	 * @see ex4.Comportement#manger()
	 */
	@Override
	public void manger() {
		System.out.println("Manger de la viande");
	}

	/**
	 * Constructeur
	 */
	public Carnivore() {
		this.nom = "Carnivore";
	}

}
