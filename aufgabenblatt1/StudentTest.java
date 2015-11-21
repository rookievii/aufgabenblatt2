package aufgabenblatt1;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTest {

	/*
	 * Testet ob das Student-Objekt korrekt initialisiert wurde.
	 */
	@Test
	public void testStudent() {

		Student x = new Student(123, "Christoph", "Haeberle");

		assertEquals("invalid matNum", 123, x.getMatNum());
		assertEquals("invalid vName", "Christoph", x.getVName());
		assertEquals("invalid nName", "Haeberle", x.getNName());
	}

	/*
	 * Testet alle Getter.
	 */
	@Test
	public void getterTest() {
		Student x = new Student(123, "Christoph", "Haeberle");

		assertEquals(123, x.getMatNum());
		assertEquals("Christoph", x.getVName());
		assertEquals("Haeberle", x.getNName());
	}

	/*
	 * Testet die compareTo()-Methode auf alle möglichen Ergebnisse.
	 */
	@Test
	public void compareToTest() {

		Student x = new Student(131, "Christoph", "Haeberle");
		Student y = new Student(122, "Sela", "Topselvi");
		Student z = new Student(111, "Erwin", "Meier");

		assertTrue(0 > y.compareTo(x));
		assertTrue(0 == y.compareTo(y));
		assertTrue(0 < x.compareTo(y));
	}
	
	/*
	 * Testet die compare()-Methode auf alle möglichen Ergebnisse.
	 */
	@Test
	public void compareTest() {
		Student x = new Student(131, "Christoph", "Haeberle");
		Student y = new Student(122, "Sela", "Topselvi");
		Student z = new Student(111, "Erwin", "Meier");

		assertTrue(0 > z.compare(x, y));
		assertTrue(0 == x.compare(y, y));
		assertTrue(0 < y.compare(z, x));
	}

}
