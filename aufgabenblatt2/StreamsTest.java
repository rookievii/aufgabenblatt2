package aufgabenblatt2;

import static org.junit.Assert.*;

import org.junit.Test;

public class StreamsTest {

	@Test
	public void stringStreamsVerarbeitungTest() {
		Streams x = new Streams();
		assertEquals("[EINGABE, AEUSSERE, STRASSEN, EIN HAUS]", x.stringStreamsVerarbeitung(x.getArray()));
		
		}

}
