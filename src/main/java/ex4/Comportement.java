package ex4;

/**
 * Comportement
 * 
 * @author ETY5
 *
 */
public abstract class Comportement {
	/** nom : String */
	protected String nom;

	/**
	 * Méthode à redéfinir
	 */
	public abstract void manger();

	/*
	 * Donne le nom du comportement
	 */
	public String toString() {
		return nom;
	}
}
