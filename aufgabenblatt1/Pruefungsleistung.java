package aufgabenblatt1;

/*
 * Autor: Christoph Haeberle
 */

public class Pruefungsleistung {

	public String modulName;
	public int note;
	
	public Pruefungsleistung(String modulName, int note) {
		this.modulName = modulName;
		this.note = note;
	}

	public int getNote() {
		return note;
	}
	
	public String getModulName() {
		return modulName;
	}
	
}
