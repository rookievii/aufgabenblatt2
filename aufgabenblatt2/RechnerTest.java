package aufgabenblatt2;

import static org.junit.Assert.*;

import org.junit.Test;
import aufgabenblatt2.DoubleDoubleZuDouble;

import aufgabenblatt2.Rechner.Operation;

public class RechnerTest {

	@Test
	public void berechneTest() {
		

		Rechner rechner = new Rechner();
		assertEquals(5.0, rechner.berechne(Operation.ADDITION, 2.0, 3.0), 0.0f);
		
		assertEquals(1.0, rechner.berechne(Operation.SUBTRAKTION, 3.0, 2.0),
				0.0f);
		
		assertEquals(6.0, rechner.berechne(Operation.MULTIPLIKATION, 2.0, 3.0),
				0.0f);
		
		assertEquals(1.0, rechner.berechne(Operation.DIVISION, 3.0, 3.0), 0.0f);
		
		assertEquals(-1.0, rechner.auswerten(rechner.getNullstelle(), 2.0 , 2.0), 0.0f);
		assertEquals(4.0, rechner.auswerten(rechner.getMulti(), 2.0, 2.0), 0.0f);
		
	}

}
