package ex4;

public class Carnivore extends Comportement {

	@Override
	public void manger() {
		System.out.println("Manger de la viande");
	}

	public Carnivore() {
		this.nom = "Carnivore";
	}

}
