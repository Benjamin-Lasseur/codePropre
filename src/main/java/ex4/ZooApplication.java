package ex4;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");

		zoo.addAnimal(new Mammifere("Zèbre", new Herbivore(), ZoneZoo.SAVANE_AFRICAINE));
		zoo.addAnimal(new Mammifere("Lion", new Carnivore(), ZoneZoo.SAVANE_AFRICAINE));
		zoo.addAnimal(new Mammifere("Panthère", new Carnivore(), ZoneZoo.SAVANE_AFRICAINE));
		zoo.addAnimal(new Poisson("Requin blanc", new Carnivore(), ZoneZoo.AQUARIUM));
		zoo.addAnimal(new Poisson("Truite dorée", new Herbivore(), ZoneZoo.AQUARIUM));
		zoo.addAnimal(new Reptile("Boa constrictor", new Carnivore(), ZoneZoo.FERME_REPTILE));
		zoo.addAnimal(new Reptile("Python", new Carnivore(), ZoneZoo.FERME_REPTILE));

		zoo.afficherListeAnimaux();
	}

}
