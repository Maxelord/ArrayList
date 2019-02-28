package Personen_Liste;

import java.util.ArrayList;

public class Liste {
	
	protected ArrayList<Personen> list = new ArrayList<Personen>();
	
	
	public void addPerson(Personen p) {
		list.add(p);
	}
	
	public void remPerson(int index) {
		list.remove(index);
	}
	
	public int getSize() {
		int anzahl = list.size();
		return anzahl;
	}
	
	public Personen getPerson(int index) {
		return list.get(index);
	}
	
	public void showPerson() {
		for(int i = 0; i < list.size(); i++) {
			list.get(i).printl();
		}
	}
	
	public void sortPerson(){
		
	}
}
