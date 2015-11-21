package aufgabenblatt1;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayListeTest {

	/*
	 * Testet die hinzufuegen()-Methode.
	 */
	@Test
	public void hinzufuegenTest() {
		ArrayListe<Integer> zahlen = new ArrayListe<Integer>();
		ArrayListe<String> worte = new ArrayListe<String>();

		for (int index = 0; index <= 20; index++) {
			zahlen.hinzufuegen(new Integer(index));
			assertEquals("Stimmt nicht überein!", index, zahlen.get(index)
					.intValue());
		}

		worte.hinzufuegen("hallo");
		worte.hinzufuegen("welt");
		assertEquals("Stimmt nicht überein!", "hallo", worte.get(0));
		assertEquals("Stimmt nicht überein!", "welt", worte.get(1));
	}

	/*
	 * Testet die get()-Methode.
	 */
	@Test
	public void getTest() {
		ArrayListe<Integer> zahlen = new ArrayListe<Integer>();
		ArrayListe<String> worte = new ArrayListe<String>();

		worte.hinzufuegen("hallo");
		worte.hinzufuegen("welt");
		assertEquals("Stimmt nicht überein!", "hallo", worte.get(0));
		assertEquals("Stimmt nicht überein!", "welt", worte.get(1));
	}

	/*
	 * Testet ob die get()-Methode die gewünschte IndexOutOfBoundsExeption
	 * wirft.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void getIndexOutOfBoundsTest() {
		ArrayListe<Integer> zahlen = new ArrayListe<Integer>();
		zahlen.hinzufuegen(2);
		zahlen.get(2);

	}

	/*
	 * Testet ob das gewünschte Element korrekt entfernt wurde.
	 */
	@Test
	public void entferneTest() {
		ArrayListe<String> worte = new ArrayListe<String>();
		worte.hinzufuegen("Hallo ");
		worte.hinzufuegen("du ");
		worte.hinzufuegen("große ");
		worte.hinzufuegen("weite ");
		worte.hinzufuegen("Welt!");

		worte.entferne("du ");
		worte.entferne("große ");
		worte.entferne("weite ");
		assertEquals("Hallo ", worte.get(0));
		assertEquals("Welt!", worte.get(1));
	}

	/*
	 * Testet ob das Element am gewünschten Index korrekt entfernt wurde.
	 */
	@Test
	public void entferneElementAnIndex() {
		ArrayListe<String> worte = new ArrayListe<String>();
		worte.hinzufuegen("Hallo");
		worte.hinzufuegen("du");
		worte.hinzufuegen("große");
		worte.hinzufuegen("weite");
		worte.hinzufuegen("Welt!");
		worte.entferneElementAnIndex(1);
		worte.entferneElementAnIndex(1);
		worte.entferneElementAnIndex(1);

		assertEquals("Hallo", worte.get(0));
		assertEquals("Welt!", worte.get(1));
	}

	/*
	 * Testet ob die korrekte Anzahl der Elemente in der Liste ausgegeben wird.
	 */
	@Test
	public void getAnzahlElementeTest() {
		ArrayListe<Integer> zahlen = new ArrayListe<Integer>();
		for (int index = 0; index == 20; index++) {
			zahlen.hinzufuegen(new Integer(index));
			assertEquals("Stimmt nicht überein!", index + 1,
					zahlen.getAnzahlElemente());
		}
	}

	/*
	 * Testet ob die toString()-Methode korrekt funktioniert.
	 */
	@Test
	public void toStringTest() {
		ArrayListe<String> worte = new ArrayListe<String>();
		worte.hinzufuegen("Hallo");
		worte.hinzufuegen("du");
		worte.hinzufuegen("große");
		worte.hinzufuegen("weite");
		worte.hinzufuegen("Welt!");
		assertEquals("Hallo du große weite Welt! ", worte.toString());
	}

	/*
	 * Testet ob die getKleinstesElement()-Methode korrekt funktioniert.
	 */
	@Test
	public void getKleinstesElementTest() {
		ArrayListe<Integer> zahlen = new ArrayListe<Integer>();
		for (int index = 20; index >= 0; index = index - 1) {
			zahlen.hinzufuegen(new Integer(index));

		}

		assertEquals(0, (int) zahlen.getKleinstesElement());

		ArrayListe<String> worte = new ArrayListe<String>();

		worte.hinzufuegen("bcd");
		worte.hinzufuegen("def");
		worte.hinzufuegen("cde");
		worte.hinzufuegen("abc");

		assertEquals("abc", worte.getKleinstesElement());

	}

}
