package ex4;

import java.util.ArrayList;
import java.util.List;

public abstract class Zone {
	protected List<Animal> animaux = new ArrayList<>();

	public void addAnimal(Animal animal) {
		animaux.add(animal);
	}

	public void afficherListeAnimaux() {
		animaux.stream().forEach(Animal::toString);
	}

	public int compterAnimaux() {
		return animaux.size();
	}

	public abstract double calculerKgsNourritureParJour();
}
