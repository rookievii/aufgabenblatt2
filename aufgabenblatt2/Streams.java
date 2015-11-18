package aufgabenblatt2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.*;
import java.util.List;

public class Streams {

	private String[] stringArr = { "Eingabe ", "Äußeres ", null,
			"Strassen-Feger", " ein Haus" };
	private Function<String, String> umlautRep = (String s) -> s
			.replace("Ä", "AE").replace("Ö", "OE").replace("Ü", "UE")
			.replace("ß", "SS");

	public Streams() {

	}

	public String stringStreamsVerarbeitung(String[] arr) {

		Stream<String> stringStream = Arrays.stream(arr);
		List<String> verarbStringStream = (ArrayList<String>) stringStream
				.filter(p -> p != null).map(String::toUpperCase)
				.map(String::trim).map(umlautRep)
				.map((String s) -> s.length() <= 8 ? s : s.substring(0, 8))
				.collect(Collectors.toList());

		return verarbStringStream.toString();

	}

	public String[] getArray() {
		return stringArr;
	}
}
