package ex6;

public class Conteneur {

	private boolean canWrite;

	private Object[] elements;
	private int size;

	public Conteneur() {
		this.size = 0;
		this.canWrite = true;
	}

	public Conteneur(Object... objects) {
		this();
		for (Object o : objects) {
			add(o);
		}
	}

	public void add(Object element) {
		if (canWrite) {
			agrandirTableau();
			elements[size++] = element;
		}

	}

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

	public String toString() {
		StringBuilder str = new StringBuilder();
		for (Object o : elements) {
			if (o != null) {
				str.append(o.toString()).append(" ");
			}
		}
		return str.toString();
	}

	public Object getContent(int i) {
		return elements[i];
	}

	public int getSize() {
		return size;
	}
}
