package aufgabenblatt1;

public class Anwendungen {

	static ArrayListe<Integer> zahlen = new ArrayListe<Integer>();
	static ArrayListe<String> worte = new ArrayListe<String>();
	
	public Anwendungen() {
		
		for (int index = 0; index <= 10; index++) {
			zahlen.hinzufuegen(new Integer(index));
			}
		
		worte.hinzufuegen("Hallo");
		worte.hinzufuegen("du");
		worte.hinzufuegen("große");
		worte.hinzufuegen("weite");
		worte.hinzufuegen("Welt!");
	}
	
	public static boolean istErstesElementZahl(ArrayListe<?> list){
		if(list.get(0) instanceof Number){
			return true;
		} else {
			return false;
		}	
	}
	
	public static int summiere(ArrayListe<Integer> list){
		int result = 0;
		for(int index = 0; index<list.getAnzahlElemente(); index++){
			result = result + list.get(index).intValue();
		}
				
		return result;
	}
	public static void main(String[] args) {
		new Anwendungen();
		System.out.println(istErstesElementZahl(worte));
		System.out.println(summiere(zahlen));
		
	}
}
