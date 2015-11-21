package aufgabenblatt1;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnwendungenTest {

	/*
	 * Testet ob das erste Element in der Liste ein Zahl ist.
	 */
	@Test
	public void istErstesElementZahlTest() {
		Anwendungen x = new Anwendungen();
		ArrayListe<Integer> zahlen = new ArrayListe<Integer>();
		ArrayListe<String> worte = new ArrayListe<String>();
		zahlen.hinzufuegen(new Integer(20));
		worte.hinzufuegen("Hallo!");
		assertTrue(x.istErstesElementZahl(zahlen));
		assertFalse(x.istErstesElementZahl(worte));
	}

	/*
	 * Testet ob die summiere()-Methode die erwartete Summme ausgibt.
	 */
	@Test
	public void summiereTest() {
		Anwendungen x = new Anwendungen();
		ArrayListe<Integer> zahlen = new ArrayListe<Integer>();
		for (int index = 0; index <= 10; index++) {
			zahlen.hinzufuegen(new Integer(index));
		}
		assertEquals(55, x.summiere(zahlen));
	}

}
