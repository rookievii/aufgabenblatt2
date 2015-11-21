package aufgabenblatt1;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayListe<T extends Comparable<T>> {

	int anzahlElemente;
	private Object[] elemente;

	public ArrayListe() {

		elemente = new Object[10];
	}

	/*
	 * Fügt ein Element in die Liste am letzten Index ein.
	 */
	public void hinzufuegen(T element) {
		if ((elemente.length - anzahlElemente) <= 0) {
			elemente = Arrays.copyOf(elemente, elemente.length * 2);
		}
		anzahlElemente++;
		elemente[anzahlElemente - 1] = element;

	}

	/*
	 * Gibt ein Element am gewünschten Index aus. Wirft
	 * IndexOutOfBoundsException wenn der Index ausserhalb der Listenlänge,
	 * nicht außerhalb des intern verwendeten Arrays, ist.
	 */
	public T get(int index) {
		if (index > anzahlElemente) {
			throw new IndexOutOfBoundsException();
		} else {
			return (T) elemente[index];
		}

	}

	/*
	 * Entfernt das gewünschte Element aus der Liste.
	 */
	public void entferne(T element) {
		for (int index = 0; index < anzahlElemente; index++) {
			if (get(index).equals(element)) {
				int datVersch = anzahlElemente - index - 1;
				// berechnet den Index an den die elemente verschoben werden
				// sollen
				System.arraycopy(elemente, index + 1, elemente, index,
						datVersch);
				anzahlElemente = anzahlElemente - 1;
				elemente[anzahlElemente] = null;
			}
		}

	}

	/*
	 * Entfernt das gewünschte Element an dem angegebenen Index.
	 */
	public void entferneElementAnIndex(int index) {
		int datVersch = anzahlElemente - index - 1;
		System.arraycopy(elemente, index + 1, elemente, index, datVersch);
		anzahlElemente = anzahlElemente - 1;
		elemente[anzahlElemente] = null;

	}

	/*
	 * Getter für die Anzahl der in der Liste enthaltenen Elemente.
	 */
	public int getAnzahlElemente() {
		return anzahlElemente;
	}

	/*
	 * Erstellt einen String aus den in der Liste enthaltenen Elementen.
	 * Verwendet intern einen StringBuilder.
	 * 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		StringBuilder textBuffer = new StringBuilder();
		for (Object element : elemente) {
			if (element != null) {
				textBuffer.append(element).append(" ");
			}
		}
		String text = textBuffer.toString();
		return text;
	}

	/*
	 * Gibt das kleinste Element in der Liste aus.
	 */
	public T getKleinstesElement() {

		Object[] elementeSort = Arrays.copyOf(elemente, anzahlElemente);
		Arrays.sort(elementeSort);

		return (T) elementeSort[0];
	}

}
