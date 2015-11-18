package aufgabenblatt2;


import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Rennauto extends Thread {

	ThreadLocalRandom speed = ThreadLocalRandom.current();
	long startTime = System.currentTimeMillis();
	String name = this.name;
	public Rennauto(String name) {
		super(name);
	}

	public void run() {
		int track = 10;
		int step = 0;
		while (step < track) {
			try {
				TimeUnit.MILLISECONDS.sleep(speed.nextInt(800,1201));
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			step++;
			System.err.println(this.name+": "+step+"\\"+track);
		}
	}

}
