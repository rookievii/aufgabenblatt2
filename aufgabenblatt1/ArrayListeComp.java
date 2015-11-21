package aufgabenblatt1;

import java.util.Arrays;

public class ArrayListeComp<T extends Comparable<T>> {

	int anzahlElemente;
	private Object[] elemente;

	
	public ArrayListeComp() {
		elemente = new Object[10];
	}// TODO Auto-generated constructor stub
	

	public void hinzufuegen(T element) {
		if ((elemente.length - anzahlElemente) <= 0) {
			elemente = Arrays.copyOf(elemente, elemente.length * 2);
		}
		anzahlElemente++;
		elemente[anzahlElemente - 1] = element;
		
	}

	public T get(int index) {
		if (index > anzahlElemente) {
			throw new IndexOutOfBoundsException();
		} else {
			return (T) elemente[index];
		}

	}

	public void entferne(T element) {
		for (int index = 0; index < elemente.length; index++) {
			if (this.get(index).equals(element)) {
				int datVersch = anzahlElemente - index - 1;
				// die Anzahl der Elemente die verschoben werden sollen.
				System.arraycopy(elemente, index + 1, elemente, index,
						datVersch);
				anzahlElemente = anzahlElemente - 1;
				elemente[anzahlElemente] = null;
			}
		}

	}

	public void entferneElementAnIndex(int index) {
		int datVersch = anzahlElemente - index - 1;
		System.arraycopy(elemente, index + 1, elemente, index, datVersch);
		anzahlElemente = anzahlElemente - 1;
		elemente[anzahlElemente] = null;
	}

	public int getAnzahlElemente() {
		return anzahlElemente;
	}

	public String toString() {

		return Arrays.toString(elemente);
	}

	public T getKleinstesElement() {
		
		Object[] elementeSort = Arrays.copyOf(elemente, anzahlElemente); 
		Arrays.sort(elementeSort);
		
		return (T) elementeSort[0];
	}

}
