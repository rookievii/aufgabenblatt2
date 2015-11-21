package aufgabenblatt2;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Rennauto extends Thread {

	long startTime = System.currentTimeMillis();
	String name;
	long avSpeed;

	public Rennauto(String name) {
		super(name);
		this.name = name;
	}

	public void run() {
		int track = 10;
		int meter = 0;

		while ((meter < track) && !isInterrupted()) {

			try {
				TimeUnit.MILLISECONDS.sleep(ThreadLocalRandom.current()
						.nextInt(800, 1201));
			} catch (InterruptedException e) {

				e.printStackTrace();

				avSpeed = avSpeed + (System.currentTimeMillis() - startTime);
				meter++;
				System.err.println(name + ": " + meter + "\\" + track);
			}
		}

	}
}
