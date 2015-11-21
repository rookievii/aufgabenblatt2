package aufgabenblatt1;

import java.util.ArrayList;
import java.util.Comparator;

/*
 * Autor: Christoph Haeberle
 */

public class Student implements Comparable<Student>, Comparator<Student> {

	private int matNum;
	private String vName;
	private String nName;

	ArrayList<Pruefungsleistung> leistungsListe = new ArrayList<Pruefungsleistung>();

	public Student(int matNum, String vName, String nName) {

		this.matNum = matNum;
		this.vName = vName;
		this.nName = nName;

	}

	/*
	 * Getter für Matrikelnummer, Vorname und Nachname.
	 */

	public int getMatNum() {
		return matNum;
	}

	public String getVName() {
		return vName;
	}

	public String getNName() {
		return nName;
	}

	/*
	 * Fügt Pruefungsleistungen in eine ArrayList ein.
	 */

	public void addPruefung(String modulName, int note) {
		leistungsListe.add(new Pruefungsleistung(modulName, note));
	}

	/*
	 * Vergleicht Studenten anhand ihrer Matrikelnummer.
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */

	@Override
	public int compareTo(Student student) {
		int result = 0;
		if (getMatNum() == student.getMatNum()) {
			result = 0;
		}
		if (getMatNum() < student.getMatNum()) {
			result = -1;
		}
		if (getMatNum() > student.getMatNum()) {
			result = 1;
		}
		return result;

	}

	/*
	 * Gibt mit den entsprechenden gettern Vorname, Nachname und Matrikelnummer
	 * für einen Studenten aus.
	 * 
	 * @see java.lang.Object#toString()
	 */

	@Override
	public String toString() {
		String pruefung = " \n";
		String student = getVName() + ", " + getNName() + " Matrikelnummer: "
				+ getMatNum();
		for (Pruefungsleistung element : leistungsListe) {
			pruefung = pruefung + " " + element.toString() + " \n";
		}
		return student + pruefung;
	}

	/*
	 * Fügt Nachname und Vorname in reihenfolge zu einem String zusammen und
	 * vergleicht dann anhand dieser.
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(Student student1, Student student2) {
		String name1 = student1.getNName() + student1.getVName();
		String name2 = student2.getNName() + student2.getVName();

		name1.toLowerCase();
		name2.toLowerCase();

		System.out.println(name1);
		System.out.println(name2);

		return name1.compareTo(name2);
	}

	public static void main(String[] args) {

		Student x = new Student(131, "Christoph", "Haeberle");
		Student y = new Student(122, "Sela", "Topselvi");
		Student z = new Student(111, "Erwin", "Meier");
		x.addPruefung("PM2", 10);
		x.addPruefung("GS", 13);

		y.addPruefung("PM2", 15);
		y.addPruefung("GS", 13);

		
		System.out.println(x.compareTo(y));
		System.out.println(z.compare(x, y));

		System.out.println(x.getMatNum() + " " + x.getNName() + " "
				+ x.getVName());

	}

}
