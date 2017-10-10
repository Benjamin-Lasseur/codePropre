package ex4;

public class Herbivore extends Comportement {

	@Override
	public void manger() {
		System.out.println("Manger des végétaux !");
	}

	public Herbivore() {
		this.nom = "Herbivore";
	}

}
