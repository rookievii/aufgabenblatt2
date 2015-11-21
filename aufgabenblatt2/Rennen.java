package aufgabenblatt2;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Rennen implements Runnable {

	List<Rennauto> wagenList;
	int anzWagen;
	DecimalFormat formatter = new DecimalFormat("#0.00");
	boolean abgebrochen;

	public Rennen() {
		wagenList = new ArrayList<Rennauto>();
	}

	public void startFeld(int anzWagen) {
		this.anzWagen = anzWagen - 1;
		for (int index = 0; index <= anzWagen; index++) {
			wagenList.add(new Rennauto("Wagen" + (index + 1)));
		}

	}

	private void rennenStart() {

		for (Rennauto wagen : wagenList) {
			wagen.start();
		}

	}

	private void rennenEnde() {
		
			for (Rennauto wagen : wagenList) {
				try {
					wagen.join();
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
			}
		
		System.out.println("Rennen Ende!\nErgebnisse:");
	}

	private void anzeigeTafel() {
		
		Stream<Rennauto> wagenStream = wagenList.stream();
		wagenStream.sorted((x, y) -> Long.compare(x.avSpeed, y.avSpeed))
				.forEach(
						x -> System.out.println(x.name + ": "
								+ formatter.format((x.avSpeed / 1000.0) / 10)
								+ " sek."));

	}

	public void run() {
		if (ThreadLocalRandom.current().nextInt(0, 3) == 1) {
			for (Rennauto wagen : wagenList) {
				wagen.interrupt();
			}
			System.out.println("Abbruch wegen Unfall");
			
			rennenEnde();
		}
	}

	public static void main(String[] args) throws InterruptedException {

		Rennen x = new Rennen();

		x.startFeld(3);
		x.rennenStart();
		x.run();
		x.rennenEnde();
		x.anzeigeTafel();

	}

}
