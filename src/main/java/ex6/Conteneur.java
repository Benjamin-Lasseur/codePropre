package ex6;

public class Conteneur {

	/** canWrite : boolean */
	private boolean canWrite;

	/** elements : Object[] */
	private Object[] elements;
	/** size : int */
	private int size;

	/**
	 * Constructeur
	 */
	public Conteneur() {
		this.size = 0;
		this.canWrite = true;
	}

	/**
	 * Constructeur
	 * 
	 * @param objects
	 */
	public Conteneur(Object... objects) {
		this();
		for (Object o : objects) {
			add(o);
		}
	}

	/**
	 * Ajoute un element au tableau si possible et l'agrandit si nécessaire
	 * 
	 * @param element
	 */
	public void add(Object element) {
		if (canWrite) {
			agrandirTableau();
			elements[size++] = element;
		}

	}

	/**
	 * Agrandit le tableau
	 */
	private void agrandirTableau() {
		int newSize = size + 1;
		if (newSize > size) {
			Object[] newElements = new Object[size + 10];
			for (int i = 0; i < size; i++) {
				newElements[i] = elements[i];
			}
			elements = newElements;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		StringBuilder str = new StringBuilder();
		for (Object o : elements) {
			if (o != null) {
				str.append(o.toString()).append(" ");
			}
		}
		return str.toString();
	}

}
