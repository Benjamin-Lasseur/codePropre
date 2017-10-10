package ex4;

public abstract class Comportement {
	protected String nom;

	public abstract void manger();

	public String toString() {
		return nom;
	}
}
