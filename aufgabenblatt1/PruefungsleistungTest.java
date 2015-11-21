package aufgabenblatt1;

import static org.junit.Assert.*;

import org.junit.Test;

public class PruefungsleistungTest {
	/*
	 * Testet ob das Objekt Pruefungsleistung korrekt initialisiert wurde.
	 */
	@Test
	public void testPruefungsleistung() {
		Pruefungsleistung x = new Pruefungsleistung("PM2", 8);
		assertEquals("PM", x.getModulName());
		assertEquals(8, x.getNote());
	}

}
