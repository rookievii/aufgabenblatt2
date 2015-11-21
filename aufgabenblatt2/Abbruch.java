package aufgabenblatt2;

import java.util.concurrent.ThreadLocalRandom;

public class Abbruch extends Thread{

	public Abbruch() {
		// TODO Auto-generated constructor stub
	}
	public void run() {
		if (ThreadLocalRandom.current().nextInt(0, 3) == 2) {
			for (Rennauto wagen : wagenList) {
				wagen.interrupt();
			}
			System.out.println("Abbruch wegen Unfall");
			abgebrochen = true;
			rennenEnde();
		}
	}

}
