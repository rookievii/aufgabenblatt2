package aufgabenblatt2;

import java.util.HashMap;
import java.util.Map;
import java.util.function.*;

public class Rechner {

	public enum Operation {
		ADDITION, SUBTRAKTION, MULTIPLIKATION, DIVISION
	}

	private Map<Operation, BinaryOperator<Double>> map;

	private BinaryOperator<Double> addition = (x, y) -> {
		return x + y;
	};
	private BinaryOperator<Double> subtraktion = (x, y) -> {
		return x - y;
	};
	private BinaryOperator<Double> multiplikation = (x, y) -> {
		return x * y;
	};
	private BinaryOperator<Double> division = (x, y) -> {
		return x / y;
	};

	DoubleDoubleZuDouble<Double> nullstelle = (a, b) -> {
		return (b * -1) / a;
	};

	private DoubleDoubleZuDouble<Double> multi = (x, y) -> {
		return x * y;
	};

	public Rechner() {
		map = new HashMap<Rechner.Operation, BinaryOperator<Double>>();
		map.put(Operation.ADDITION, addition);
		map.put(Operation.SUBTRAKTION, subtraktion);
		map.put(Operation.MULTIPLIKATION, multiplikation);
		map.put(Operation.DIVISION, division);
	}

	public double berechne(Operation sign, double x, double y) {

		return  map.get(sign).apply(x, y);
	}

	public double auswerten(DoubleDoubleZuDouble<Double> berechnung, double x, double y) {
		return berechnung.werteAus(x, y);
	}
	
	public DoubleDoubleZuDouble<Double> getMulti() {
		return multi;
	}
	
	public DoubleDoubleZuDouble<Double> getNullstelle() {
		return nullstelle;
	}

}
